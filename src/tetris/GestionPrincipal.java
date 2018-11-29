package tetris;

public class GestionPrincipal {
	
    static int FPS = 0, IPS = 0; //Fotogramas e iteraciones por segundo
    static Dibujo superficieDeDibujo;
    static Ventana ventana;
    static boolean fondoDetenido;
    static final int restaurarAPS = 60;
    static int APS_OBJETIVO = restaurarAPS;

    public static void main(String[] args) {
        iniciarJuego();
    }

    public static void iniciarJuego() {
        crearVentana(950, 600, "Tetris");
        iterarBuclePrincipal();
    }

    public static ParNum DiferenciaEntreVentanaYSDD() { //SDD es superficie de dibujo
        return new ParNum(ventana.getWidth() - superficieDeDibujo.getWidth(), ventana.getHeight() - superficieDeDibujo.getHeight());
    }

    public static void crearVentana(int ancho, int alto, String nombre) {
        superficieDeDibujo = new Dibujo(ancho, alto);
        ventana = new Ventana(nombre, superficieDeDibujo, ancho, alto);
        superficieDeDibujo.dibujar();
    }

    private static void actualizar() {
        superficieDeDibujo.dibujar();
        FPS++;
    }

    private static String Cadena_APS_IPS() {
        return "FPS = " + FPS + ", IPS = " + IPS;
    }
    
    private static void dibujar() {
        IPS++;
    }

    public static void iterarBuclePrincipal() {
        //de aqui para abajo se empieza el cronometro
        final int NS_POR_SEGUNDO = 1000000000; //Nanosegundos que hay en un segundo

        long tiempoDeReferenciaActualizacion = System.nanoTime(); //obtener el dato de tiempo en este momento
        long tiempoReferenciaContador = System.nanoTime();

        double delta = 0, tiempoSinProcesar;

        while (true) {

            final int NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO;//Fraccion de segundo para Tamaño

            long tiempoInicial = System.nanoTime();
            tiempoSinProcesar = tiempoInicial - tiempoDeReferenciaActualizacion;
            tiempoDeReferenciaActualizacion = tiempoInicial;

            delta += tiempoSinProcesar / NS_POR_ACTUALIZACION; 
            while (delta >= 1) {
             
                delta--;
                actualizar();
            }
            dibujar();
            if (System.nanoTime() - tiempoReferenciaContador >= NS_POR_SEGUNDO) { //entrara cada segundo

                if (!true) {//si se cambia a false el titulo de la ventana mostrara los FPS y los IPS
                    System.out.println(Cadena_APS_IPS()); //mostrará en la consola
                } else {
                  System.out.println("IPS= " + IPS + " ,FPS = " + FPS);
                }

                tiempoReferenciaContador = System.nanoTime(); //reinicia esta variable
                FPS = 0; //reinicia esta variable
                IPS = 0; //reinicia esta variable
            }
        }
    }


}
