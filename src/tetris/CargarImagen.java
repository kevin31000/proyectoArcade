package tetris;

import java.awt.Color;
import java.awt.Graphics;

public class CargarImagen {
	
	 Dibujo superficieDeDibujo; 
	 ParNum posicionTablero;
	 int lado; 
	 
	 public CargarImagen(Dibujo superficieDeDibujo) {
		 this.superficieDeDibujo = superficieDeDibujo;
		 posicionTablero = superficieDeDibujo.tablero.posicion;
		 lado = superficieDeDibujo.tablero.lado;
		 
	 }
	 
	 public ParNum calcularPosicion(ParNum pos) {
		 int X = (int)(pos.X*lado+posicionTablero.X);
		 int Y = (int)(pos.Y*lado+posicionTablero.Y);
		
		 
		 return new ParNum(X,Y);
	 }
	
	 
	public void dibujarPeriferico(ParNum pos, Graphics g, String tipo) {
		switch (tipo) {
		case "Z":
			g.setColor(Color.red);
			break;
		case "S":
			g.setColor(Color.GREEN);		
			break;
		case "L":
			g.setColor(Color.ORANGE);
			break;
		case "J":
			g.setColor(Color.BLUE);
			break;
		case "T":
			g.setColor(Color.MAGENTA);
			break;
		case "O":
			g.setColor(Color.YELLOW);
			break;
		case "I":
			g.setColor(Color.CYAN);
			break;
		
		}
		
		g.fillRect((int)calcularPosicion(pos).X, (int)calcularPosicion(pos).Y, lado, lado);
	}

}
