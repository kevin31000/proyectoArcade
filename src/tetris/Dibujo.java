package tetris;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

public class Dibujo extends Canvas{
	
	private BufferStrategy buffer;
	private Graphics g;
	CargarImagen imagen;
	Tablero tablero;
	Pieza pieza;
	Figura fondo = new Figura();
	
	public Dibujo(int ancho, int alto) {
		this.setSize(ancho, alto);
		tablero = new Tablero(this);
		imagen = new CargarImagen(this);
		tablero.imagen = imagen;
		pieza = new Pieza(this);
		capturarTeclas();
		setFocusable(true);
		
	}
	
	public void dibujar() {
		buffer = getBufferStrategy();
		if(buffer == null) {
			createBufferStrategy(2);
			return;
		}
		
		g = buffer.getDrawGraphics();
		//aqui voy a dibujar
		fondo.RectanguloDegradadoDesactivable((Graphics2D)g, Tamaño());
		g.setColor(Color.BLACK);
		tablero.dibujar((Graphics2D)g);
		pieza.dibujar(g);
		
		g.dispose();
		buffer.show();
		
		
	}
	
	public ParNum Tamaño() {
		return new ParNum(this.getWidth(),this.getHeight());
	}
	
	public void capturarTeclas() {
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					pieza.MoverDerecha();
					return;
				}if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					pieza.MoverIzquierda();
					return;
				}if(e.getKeyCode()==KeyEvent.VK_UP) {
					pieza.girarDerecha();
					return;
				}if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					pieza.MoverAbajo();
					return;
				}
					
				
			}
		});
	}
	

}
