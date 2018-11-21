package tetris;

import java.awt.Graphics;

public class Pieza {
	Dibujo superficieDeDibujo;
	Tablero tablero;
	CargarImagen imagen;
	ParNum posicion = new ParNum(3,10);
	Tetromino Z = Tetromino.consultar("T");
	
	public Pieza(Dibujo superficieDeDibujo) {
		this.superficieDeDibujo = superficieDeDibujo;
		this.tablero = superficieDeDibujo.tablero;
		this.imagen = superficieDeDibujo.imagen;
	}
	
	public void dibujar(Graphics g) {
		for (int i = 0; i < 4; i++) {
					
			imagen.dibujarPeriferico(new ParNum(posicion.X+Z.mino[i].X, posicion.Y+Z.mino[i].Y), g);
			

		}
	}

}
