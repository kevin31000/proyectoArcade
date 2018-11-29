package tetris;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

public class Dibujo extends Canvas{
	
	private BufferStrategy buffer;
	private Graphics g;
	CargarImagen imagen;
	Tablero tablero;
	Pieza pieza;
	ColorRGB color = ColorRGB.aleatorio();
	
	public Dibujo(int ancho, int alto) {
		this.setSize(ancho, alto);
		tablero = new Tablero(this);
		imagen = new CargarImagen(this);
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
		g.setColor(color.Retornarse());
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.BLACK);
		tablero.dibujar(g);
		pieza.dibujar(g);
		
		g.dispose();
		buffer.show();
		
		
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
					pieza.piezaActual.girarDerecha();
					return;
				}if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					pieza.MoverAbajo();
					return;
				}
					
				
			}
		});
	}
	

}
