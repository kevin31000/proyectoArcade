package tetris;

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
	
	 
	public void dibujarPeriferico(ParNum pos, Graphics g) {
		
		g.fillRect((int)calcularPosicion(pos).X, (int)calcularPosicion(pos).Y, lado, lado);
	}

}
