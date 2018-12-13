package tetris;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JOptionPane;

public class Tablero implements DatosGeneralesJuego{
	
	int [][] Tablero ;
	Dibujo dibujo;
	int anchoD; //ancho dibujo
	int altoD; //alto dibujo
	ParNum posicion;
	CargarImagen imagen;
	
	Color casilla_clara = new Color(0,0,63),
			casilla_clara2 = new Color(30,20,128),
			casilla_oscura = new Color (30,40,93),
			casilla_oscura2 =new Color (90,50,158);

	
	public Tablero(Dibujo dibujo) {
	this.dibujo = dibujo;
	calcularPosicion();
	Tablero = new int [columnas][filas];
	casillasVacias();
	
	}
	
	public void casillasVacias() {
		
		for (int Y = 0; Y < filas; Y++) {
			for (int X = 0; X < columnas; X++) {
				Tablero[X][Y] = no_tetro; 
			}
		}
	}
	
	public void calcularPosicion() {  //calcular la posicion del tablero dentro de nuestra superficie de dibujo (clase Dibujo)
		anchoD = dibujo.getWidth();
		altoD = dibujo.getHeight();
		posicion = new ParNum((anchoD - ancho_tablero)/2,(altoD - alto_tablero)/2);
	}
	
	public void dibujar(Graphics2D g) {
		for (int Y = 0; Y < filas; Y++) {
			for (int X = 0; X < columnas; X++) {
				ParNum posicionTemporal = new ParNum(X*ancho_mino+posicion.X, Y*alto_mino+posicion.Y+1); //posicion en pixeles para que no aparezca en la esquina superior
				//dibujar casilla
				if(Tablero[X][Y] == no_tetro) { //Solo es estético estilo ajedrez en 2D
					Color color = new Color(0,0,0);
					Color color2 = new Color(0,0,0);
					if((X+Y)%2 ==0) { //If es par..
						color =casilla_clara;
						color2 = casilla_clara2;
					}else {
						color = casilla_oscura;
						color2 = casilla_oscura2;
					}
					
					g.setPaint(new GradientPaint(20,0, color, 0,20, color2));
					g.fillRect(posicionTemporal.intX(), posicionTemporal.intY(), ancho_mino, alto_mino);
					g.setColor(new Color(0,0,0));
					g.drawRect(posicionTemporal.intX(), posicionTemporal.intY(), ancho_mino, alto_mino);

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
	
	public void borrarPecera() {
		int Y = filas-1;
		int lineas = 0;
		
		while(Y>=0) {
			int X =0;
			while(X<columnas&& Tablero[X][Y]!=no_tetro) {
				X++;
			}
			
			if(X==columnas) {
				lineas++;
				bajarPecera(Y);
			}else {
				Y--;
			}
		}
		//Aqui sumaran las lineas para la puntuacion
	}
	
	public void bajarPecera(int Y) {
		for (int X = 0; X < columnas; X++) {
			Tablero[X][Y]=no_tetro;
		}
		
		while(Y>=0) {
			for (int X = 0; X < columnas; X++) {
				Tablero[X][Y]= Y==0?no_tetro:Tablero[X][Y-1]; //condicional
			}
			GestionPrincipal.finDelJuego(); //Cuando no se puedan bajar mas piezas se para el juego.
			//JOptionPane.showMessageDialog(frame, "¡Has perdido!", "FIN DEL JUEGO", messageType);
			Y--;
		}
		
	}
	
	public int Obtener(int X, int Y) {
		if(Y>0) {
			return Tablero[X][Y];
		}
		return no_tetro;
		
	}

}
