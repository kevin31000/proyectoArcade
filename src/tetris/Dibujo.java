package tetris;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Dibujo extends Canvas{
	
	private BufferStrategy buffer;
	private Graphics graficos;
	
	public Dibujo(int ancho, int alto) {
		this.setPreferredSize(new Dimension(ancho, alto));
		
	}
	
	public void dibujar() {
		buffer = getBufferStrategy();
		if(buffer == null) {
			createBufferStrategy(2);
			return;
		}
		
		graficos = buffer.getDrawGraphics();
		//aqui voy a dibujar
		graficos.dispose();
		buffer.show();
		
		
	}

}
