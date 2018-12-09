package tetris;

import java.awt.Graphics;

public class Pieza implements Runnable, DatosGeneralesJuego{
	Dibujo superficieDeDibujo;
	Tablero tablero;
	CargarImagen imagen;
	ParNum posicion = new ParNum(3,10);
	Tetromino piezaActual = Tetromino.Aleatorio();
	Tetromino piezasSiguientes[] = new Tetromino[7];
	Thread Hilo = new Thread(this);
	Boolean estadoHilo = true;
	
	public Pieza(Dibujo superficieDeDibujo) {
		this.superficieDeDibujo = superficieDeDibujo;
		this.tablero = superficieDeDibujo.tablero;
		this.imagen = superficieDeDibujo.imagen;
		for (int i = 0; i < piezasSiguientes.length; i++) {
			piezasSiguientes[i] = Tetromino.Aleatorio();
			
		}
		Hilo.start();
	}
	
	public void dibujar(Graphics g) {
		for (int i = 0; i < 4; i++) {
					
			imagen.dibujarPeriferico(new ParNum(posicion.X+piezaActual.mino[i].X, posicion.Y+piezaActual.mino[i].Y), g, piezaActual.nombre);
		}
		for (int i = 0; i < piezasSiguientes.length; i++) {
			ParNum posicion = new ParNum(12, 1+i*3);
			for (int j = 0; j < piezasSiguientes[i].mino.length; j++) {
				double Xreal = piezasSiguientes[i].mino[j].X+posicion.X;
				double Yreal = piezasSiguientes[i].mino[j].Y+posicion.Y;
				imagen.dibujarPeriferico(new ParNum(Xreal,Yreal), g, piezasSiguientes[i].nombre);
				
			}
		}
	}
	
	public void Reiniciar() {
		posicion = new ParNum(4,1);
		piezaActual = piezasSiguientes[0];
		for (int i = 0; i < piezasSiguientes.length-1; i++) {
			piezasSiguientes[i] = piezasSiguientes[i+1];
		}
		piezasSiguientes[piezasSiguientes.length-1] = Tetromino.Aleatorio();
	}
	
	public void almacenarEnTablero() {
		for (int i = 0; i < piezaActual.mino.length; i++) {
			int columna = piezaActual.mino[i].intX()+posicion.intX();
			int fila= piezaActual.mino[i].intY()+posicion.intY();
			int dato = piezaActual.nombre;
			
			tablero.Tablero[columna][fila] = dato;
		}
	}
	
	public void girarDerecha() {
		piezaActual.girarDerecha();
		if(MovimientoErroneo()) {
			piezaActual.girarIzquierda();
		}
	}
	
	public void MoverDerecha() {
		posicion.moverDerecha();
		if(MovimientoErroneo()) {
			posicion.moverIzquierda();
		}
	}
	
	public void MoverIzquierda() {
		posicion.moverIzquierda();
		if(MovimientoErroneo()) {
			posicion.moverDerecha();
		}
	}
	
	public void MoverAbajo() {
		posicion.moverAbajo();
		if(MovimientoErroneo()) {
			posicion.moverArriba();
			//System.out.println("Reinicio de pieza");
			almacenarEnTablero();
			Reiniciar();
			tablero.borrarPecera();
		}
	}
	
	public boolean MovimientoErroneo() {
		for (int i = 0; i < piezaActual.mino.length; i++) {
			double Xactual = piezaActual.mino[i].X + posicion.X;
			double Yactual = piezaActual.mino[i].Y + posicion.Y;
			if(Xactual>tablero.columnas-1||Xactual<0) {
				return true;
			}
			if(Yactual>tablero.filas-1) {
				return true;
			}
			if(tablero.Obtener((int)Xactual, (int)Yactual)!=no_tetro){
				return true;
			}
		}
		return false;
		
	}

	@Override
	public void run() {
		try {
			while(true) {
				MoverAbajo();
				Thread.sleep(500);
				
			}
			
		} catch (Exception e) {
			System.err.println("tetris.Pieza.run() - Error en el hilo");
		}
		
	}

	public void Pausar() {
		if(estadoHilo) {
			Hilo.suspend();  //pausamos el hilo
		}else {
			Hilo.resume();   //reanudamos el hilo
		}
		estadoHilo = !estadoHilo;
	}
	

}
