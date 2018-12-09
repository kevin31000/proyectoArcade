package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class CargarImagen implements DatosGeneralesJuego{
	
	 Dibujo superficieDeDibujo; 
	 ParNum posicionTablero;
	 final String nombre_imagen_tetromino[] = {"Z", "S", "J", "L", "T", "O", "I"};
	 
	 BufferedImage[] imagen_minos = new BufferedImage[nombre_imagen_tetromino.length];
	 
	 public CargarImagen(Dibujo superficieDeDibujo) {
		 this.superficieDeDibujo = superficieDeDibujo;
		 posicionTablero = superficieDeDibujo.tablero.posicion;
		 cargarImagenesMinos();
		 
	 }
		private void cargarImagenesMinos() {
			for (int i = 0; i < imagen_minos.length; i++) {
				imagen_minos[i] = cargarImagen(nombre_imagen_tetromino[i], ".jpg");
			}
		}
	 
	 public ParNum calcularPosicion(ParNum pos) {
		 int X = (int)(pos.X*ancho_mino+posicionTablero.X);
		 int Y = (int)(pos.Y*alto_mino+posicionTablero.Y);
		
		 
		 return new ParNum(X,Y);
	 }
	
	 
	public void dibujarPeriferico(ParNum pos, Graphics g, int nombre) {
		
		g.drawImage(imagen_minos[nombre], calcularPosicion(pos).intX(), calcularPosicion(pos).intY(), superficieDeDibujo);
		
	}
	

	
	public BufferedImage cargarImagen(String nombre, String extension) {
		BufferedImage imagen = null;
		
		try {
			imagen = ImageIO.read(ClassLoader.class.getResource("/imagenes/" + nombre + extension));
		} catch (Exception e) {
			
		}
		
		return imagen;
	}

}
