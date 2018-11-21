package tetris;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Dibujo extends Canvas{
	
	private BufferStrategy buffer;
	private Graphics g;
	CargarImagen imagen;
	Tablero tablero;
	
	public Dibujo(int ancho, int alto) {
		this.setSize(ancho, alto);
		tablero = new Tablero(this);
		imagen = new CargarImagen(this);
		
	}
	
	public void dibujar() {
		buffer = getBufferStrategy();
		if(buffer == null) {
			createBufferStrategy(2);
			return;
		}
		
		g = buffer.getDrawGraphics();
		//aqui voy a dibujar
		tablero.dibujar(g);
		
		g.dispose();
		buffer.show();
		
		
	}

}
