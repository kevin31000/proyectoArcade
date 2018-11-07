package tetris;

import java.awt.Graphics;

public class Tablero {
	
	final int columnas = 10;
	final int filas = 20;
	final int lado = 28;
	String [][] Tablero ;
	Dibujo dibujo;
	int anchoD; //ancho dibujo
	int altoD; //alto dibujo
	ParNum posicion;
	
	public Tablero(Dibujo dibujo) {
	this.dibujo = dibujo;
	calcularPosicion();
	Tablero = new String [columnas][filas];
	
	}
	
	public void casillasVacias() {
		
		for (int Y = 0; Y < filas; Y++) {
			for (int X = 0; X < columnas; X++) {
				Tablero[X][Y] = "";
			}
		}
	}
	
	public void calcularPosicion() {  //calcular la posicion del tablero dentro de nuestra superficie de dibujo (clase Dibujo)
		anchoD = dibujo.getWidth();
		altoD = dibujo.getHeight();
		posicion = new ParNum((anchoD - columnas*lado)/2,(altoD - filas*lado)/2);
	}
	
	public void dibujar(Graphics g) {
		
	}

}
