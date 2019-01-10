package tetris;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import static java.awt.Transparency.OPAQUE;
import static java.awt.Transparency.TRANSLUCENT;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;

public class Figura {

    double CPS; 
    double maxDegradadoLineal;
    double minDegradadoLineal;
    ParNum[] Franja = new ParNum[2];
    ParNum[] DifFranja = new ParNum[2];
    ColorRGB colorPrincipal;
    ColorRGB colorSecundario;
    boolean DegradadoActivado;
    boolean DegradadoMoviendose;
    long TInicio, TFin, Ttotal, DiferencialTransicion, dt;

    public Figura() {
        ReiniciarValores();
    }

    public void ReiniciarValores() {
        DegradadoActivado = true;
        DegradadoMoviendose = true;
        CPS = 30;
        maxDegradadoLineal = 3000;
        minDegradadoLineal = -3000;
        colorPrincipal = ColorRGB.aleatorio();
        colorSecundario = ColorRGB.Negro;
        colorSecundario.Detener();
        nuevasFranjasAleatorias();
    }

    public void RectanguloDegradadoDesactivable(Graphics2D g2d, ParNum Tamanyo) {
        if (DegradadoActivado) {
            Rectangulo_2Colores(g2d, Tamanyo);
        } else {
            Rectangulo_1Color(g2d, Tamanyo);
        }
        DesplazarDegradado();
        controlador_LimitesDegradado();
    }

    public void Rectangulo_1Color(Graphics2D g2d, ParNum Tamanyo) {
        g2d.setColor(colorPrincipal.Retornarse());
        g2d.fill(new Rectangle2D.Double(0, 0, Tamanyo.X, Tamanyo.Y));
    }

    public void Rectangulo_2Colores(Graphics2D g2d, ParNum Tamanyo) {
        calcularDegradado(g2d, Tamanyo);
        g2d.fill(new Rectangle2D.Double(0, 0, Tamanyo.X, Tamanyo.Y));
    }

    public void nuevasFranjasAleatorias() {
        nuevasFranjasAleatorias(1);
    }

    public void nuevasFranjasAleatorias(int rangoMaximoDelVectorVelocidad) {
        for (int i = 0; i < Franja.length; i++) {
            Franja[i] = new ParNum(aleatorio(maxDegradadoLineal), aleatorio(maxDegradadoLineal));
            DifFranja[i] = new ParNum(aleatorio(rangoMaximoDelVectorVelocidad), aleatorio(rangoMaximoDelVectorVelocidad));
        }
    }

    public void difDegradadoAleatorias() {
        difDegradadoAleatorias(1);
    }

 
    public void difDegradadoAleatorias(int n) {
        for (int i = 0; i < DifFranja.length; i++) {
            DifFranja[i] = new ParNum(aleatorio(n), aleatorio(n));
        }
    }

    public void diferencialesSombraAsignar(double A, double B, double C, double D) {
        DifFranja[0].sustituir(A, B);
        DifFranja[1].sustituir(C, D);
    }

    public void colorSecundario_Visible_Invisible() {
        DegradadoActivado = !DegradadoActivado;
    }

    public void Degradado_Mover_Detener() {
        DegradadoMoviendose = !DegradadoMoviendose;
    }

    private void DesplazarDegradado() {
        if (DegradadoMoviendose) {
            if (DegradadoRadial) {
                moverPosicionRadial();
                cambiarRadio();
            } else {
                for (int i = 0; i < Franja.length; i++) {
                    Franja[i].adicionar(DifFranja[i]);
                }
            }
        }
    }


    private void controlador_LimitesDegradado() {
        for (int i = 0; i < Franja.length; i++) {
            Franja[i].X = (Franja[i].X > maxDegradadoLineal) ? maxDegradadoLineal : Franja[i].X;
            Franja[i].Y = (Franja[i].Y > maxDegradadoLineal) ? maxDegradadoLineal : Franja[i].Y;

            DifFranja[i].X = (Franja[i].X + DifFranja[i].X > maxDegradadoLineal//Determina que no se salga del valor m�ximo
                    || Franja[i].X + DifFranja[i].X < minDegradadoLineal) ? //Determina que no se salga del valor m�nimo
                            -DifFranja[i].X : //Lo cambia de sentido
                            DifFranja[i].X; //No le hace nada

            DifFranja[i].Y = (Franja[i].Y + DifFranja[i].Y > maxDegradadoLineal//Determina que no se salga del valor m�ximo
                    || Franja[i].Y + DifFranja[i].Y < minDegradadoLineal) ? //Determina que no se salga del valor m�nimo
                            -DifFranja[i].Y : //Lo cambia de sentido
                            DifFranja[i].Y; //No le hace nada
        }
    }
    
    private void calcularDegradado(Graphics2D g2d, ParNum Tamanyo) {
        if (DegradadoRadial) {
            LimRadial = Tamanyo;
            DegradadoCircular roundGradient = new DegradadoCircular(PosRadial,
                    colorSecundario.Retornarse(), colorPrincipal.Retornarse(), (int) Radio);
            g2d.setPaint(roundGradient);
            moverPosicionRadial();
            cambiarRadio();
        } else {
            g2d.setPaint(new GradientPaint(Franja[0].intX(), Franja[0].intY(), colorSecundario.Retornarse(),
                    Franja[1].intX(), Franja[1].intY(), colorPrincipal.Retornarse(), true));
            g2d.fill(new Rectangle2D.Double(0, 0, Tamanyo.X, Tamanyo.Y));
        }
    }

    private double aleatorio2() {
        return Math.random();
    }

    private double aleatorio(double n) {
        return Math.random() * n;
    }

    private void ImpNuevaLinea() {
        System.out.println("\n");
    }

    private void msg(String msg) {
        System.out.println(msg);
    }

    private void imprimirRGB(Color color) {
        msg("Color = R:" + color.getRed() + " -  G:" + color.getGreen() + " - B: " + color.getBlue());
    }

    private ParNum PosRadial = new ParNum(0, 0);
  
    private boolean DegradadoRadial = false;
 
    private ParNum LimRadial = new ParNum(0, 0);
   
    private ParNum movRadial = new ParNum(Math.random() * 5, Math.random() * 5);
   
    private double Radio = aleatorio2() * 600;
  
    private double inflacionRadial = aleatorio(5);
  
    private double MaximaInflacion = Radio;
   
    private double MinimaInflacion = 50;

    private void modificar_MinimoRadial(double v) {
        if (v >= MaximaInflacion) {
            throw new Error("El valor m�nimo del radio debe ser menor al m�ximo valor");
        } else {
            if (v <= 1) {
                throw new Error("El valor m�nimo del radio debe ser mayor a 1");
            } else {
                MinimaInflacion = v;
            }
        }
    }

    private void modificar_MaximoRadial(double v) {
        if (v <= MinimaInflacion) {
            throw new Error("El valor m�ximo del radio debe ser mayor al m�nimo");
        } else {
            MaximaInflacion = v;
        }

    }

    private void moverPosicionRadial() {
        PosRadial.adicionar(movRadial);

        if (PosRadial.X > LimRadial.X) {
            movRadial.X = -movRadial.X;
            PosRadial.X = LimRadial.X + movRadial.X;
        }
        if (PosRadial.X < 0) {
            movRadial.X = -movRadial.X;
            PosRadial.X = 0;
        }
        if (PosRadial.Y > LimRadial.Y) {
            movRadial.Y = -movRadial.Y;
            PosRadial.Y = LimRadial.Y;
        }
        if (PosRadial.Y < 0) {
            movRadial.Y = -movRadial.Y;
            PosRadial.Y = 0;
        }
        Radio = Radio < MinimaInflacion ? MinimaInflacion : Radio;
        Radio = Radio > MaximaInflacion ? MaximaInflacion : Radio;
    }

    private void cambiarRadio() {
        if (Radio < MinimaInflacion || Radio > MaximaInflacion) {
            inflacionRadial = -inflacionRadial;
        }
        Radio += inflacionRadial;
    }

    private class DegradadoCircular implements Paint {

        protected Point2D posicion;
        protected Point2D Radio;
        protected Color ColorPrincipal, ColorSecundario;

        public DegradadoCircular(ParNum Posicion, Color ColorSecundario, Color ColorPrincipal, int radio) {
            Radio = new Point(radio, radio);
            if (Radio.distance(0, 0) <= 0) {
                throw new IllegalArgumentException("El Radio del degradado debe ser mayor a cero (0)");
            }
            posicion = new Point2D.Double(Posicion.X, Posicion.Y);
            this.ColorPrincipal = ColorPrincipal;
            this.ColorSecundario = ColorSecundario;
        }

        @Override
        public int getTransparency() {
            int a1 = ColorPrincipal.getAlpha();
            int a2 = ColorSecundario.getAlpha();
            return (((a1 & a2) == 0xff) ? OPAQUE : TRANSLUCENT);
        }

        @Override
        public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds,
                AffineTransform xform, RenderingHints hints) {
            Point2D transformedPoint = xform.transform(posicion, null);
            Point2D transformedRadius = xform.deltaTransform(Radio, null);
            return new RoundGradientContext(transformedPoint, ColorPrincipal, transformedRadius, ColorSecundario);
        }

        private class RoundGradientContext implements PaintContext {

            protected Point2D mPoint;
            protected Point2D mRadius;
            protected Color color1, color2;

            public RoundGradientContext(Point2D p, Color c1, Point2D r, Color c2) {
                mPoint = p;
                color1 = c1;
                mRadius = r;
                color2 = c2;
            }

            public void dispose() {
            }

            public ColorModel getColorModel() {
                return ColorModel.getRGBdefault();
            }

            public Raster getRaster(int x, int y, int w, int h) {
                WritableRaster raster = getColorModel().createCompatibleWritableRaster(w, h);

                int[] data = new int[w * h * 4];
                for (int j = 0; j < h; j++) {
                    for (int i = 0; i < w; i++) {
                        double distance = mPoint.distance(x + i, y + j);
                        double radius = mRadius.distance(0, 0);
                        double ratio = distance / radius;
                        if (ratio > 1.0) {
                            ratio = 1.0;
                        }

                        int base = (j * w + i) * 4;
                        data[base + 0] = (int) (color1.getRed() + ratio * (color2.getRed() - color1.getRed()));
                        data[base + 1] = (int) (color1.getGreen() + ratio * (color2.getGreen() - color1.getGreen()));
                        data[base + 2] = (int) (color1.getBlue() + ratio * (color2.getBlue() - color1.getBlue()));
                        data[base + 3] = (int) (color1.getAlpha() + ratio * (color2.getAlpha() - color1.getAlpha()));
                    }
                }
                raster.setPixels(0, 0, w, h, data);

                return raster;
            }
        }

    }

}
