package tetris;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Tablero {
	
	final int columnas = 10;
	final int filas = 20;
	final int lado = 28;
	String [][] Tablero ;
	Dibujo dibujo;
	int anchoD; //ancho dibujo
	int altoD; //alto dibujo
	ParNum posicion;
	CargarImagen imagen;
	
	public Tablero(Dibujo dibujo) {
	this.dibujo = dibujo;
	calcularPosicion();
	Tablero = new String [columnas][filas];
	casillasVacias();
	
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
	
	public void dibujar(Graphics2D g) {
		for (int Y = 0; Y < filas; Y++) {
			for (int X = 0; X < columnas; X++) {
				ParNum posicionTemporal = new ParNum(X*lado+posicion.X, Y*lado+posicion.Y+1); //posicion en pixeles para que no aparezca en la esquina superior
				//dibujar casilla
				if(Tablero[X][Y] == "") { //Solo es estético estilo ajedrez en 2D
					Color color = new Color(0,0,0);
					Color color2 = new Color(0,0,0);
					if((X+Y)%2 ==0) { //If es par..
						color = new Color (30,30,93);
						color2 = new Color (90,50,158);
					}else {
						color = new Color (0,0,63);
						color2 = new Color (30,30,93);
					}
					
					g.setPaint(new GradientPaint(20,0, color, 0,20, color2));
					g.fillRect(posicionTemporal.intX(), posicionTemporal.intY(), lado, lado);
					g.setColor(new Color(0,0,0));
					g.drawRect(posicionTemporal.intX(), posicionTemporal.intY(), lado, lado);

				}else {
					imagen.dibujarPeriferico(new ParNum(X,Y), g, Tablero[X][Y]);
				}
				//escribe la posicion de la casilla
				if(false) {
					g.setFont(new Font("calibri", Font.PLAIN, 9));
					g.drawString(X+","+Y,(int)posicionTemporal.X+5, (int)posicionTemporal.Y+11);
				}
				

			}
		}
		
			
	}
	
	public void borrarBasurilla() {
		int Y = filas-1;
		int lineas = 0;
		
		while(Y>=0) {
			int X =0;
			while(X<columnas&& !Tablero[X][Y].equals("")) {
				X++;
			}
			
			if(X==columnas) {
				lineas++;
				bajarBasurilla(Y);
			}else {
				Y--;
			}
		}
		//Aqui sumaran las lineas para la puntuacion
	}
	
	public void bajarBasurilla(int Y) {
		for (int X = 0; X < columnas; X++) {
			Tablero[X][Y]="";
		}
		
		while(Y>=0) {
			for (int X = 0; X < columnas; X++) {
				Tablero[X][Y]= Y==0?"":Tablero[X][Y-1]; //condicional
			}
			Y--;
		}
		
	}
	
	public String Obtener(int X, int Y) {
		if(Y>0) {
			return Tablero[X][Y];
		}
		return"";
		
	}

}
