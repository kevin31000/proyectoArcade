package tetris;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class CargarImagen {
	
	 Dibujo superficieDeDibujo; 
	 ParNum posicionTablero;
	 int lado; 
	 String tetromino[] = {"Z", "S", "J", "L", "T", "O", "I"};
	 Color TetroColor[] = {Color.RED, Color.GREEN, Color.BLUE, Color.ORANGE, Color.MAGENTA, Color.YELLOW, Color.CYAN};
	 
	 BufferedImage[] minos = new BufferedImage[tetromino.length];
	 
	 public CargarImagen(Dibujo superficieDeDibujo) {
		 this.superficieDeDibujo = superficieDeDibujo;
		 posicionTablero = superficieDeDibujo.tablero.posicion;
		 lado = superficieDeDibujo.tablero.lado;
		 cargarImagenesMinos();
		 
	 }
		private void cargarImagenesMinos() {
			for (int i = 0; i < minos.length; i++) {
				minos[i] = cargarImagen(tetromino[i], ".jpg");
			}
		}
	 
	 public ParNum calcularPosicion(ParNum pos) {
		 int X = (int)(pos.X*lado+posicionTablero.X);
		 int Y = (int)(pos.Y*lado+posicionTablero.Y);
		
		 
		 return new ParNum(X,Y);
	 }
	
	 
	public void dibujarPeriferico(ParNum pos, Graphics g, String tipo) {
		int i = 0;
		while(!tetromino[i].equals(tipo)) {
			i++;
		}
		g.drawImage(minos[i], calcularPosicion(pos).intX(), calcularPosicion(pos).intY(), superficieDeDibujo);
		
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
