package tetris;
//Al parecer las piezas del tetris se llaman tetrominos
//Un tetrominó es una forma geométrica compuesta de cuatro
//cuadrados iguales, conectados entre sí ortogonalmente (lado a lado). segun wikipedia

public class Tetromino implements DatosGeneralesJuego{
	
	ParNum mino[]; //llamo mino a cada cuadradito que forma cada pieza
	int nombre;
	
	
	
	public Tetromino(ParNum mino0, ParNum mino1,ParNum mino2,ParNum mino3,int nombre) {
		 mino = new ParNum[4];
		 mino[0] = mino0;
		 mino[1] = mino1;
		 mino[2] = mino2;
		 mino[3] = mino3;
		this.nombre = nombre;
	}
	
	public static Tetromino Aleatorio() {  //para que nos elija una tetromino aleatorio cada vezz
		return consultar(tetrominos_nombre[(int)(Math.random()*6.9)]);
	}
	
	public static Tetromino consultar(int nombre) {
		switch (nombre) {
		// a cada tetromino o pieza le pongo el nombre de la letra a la que se parece
		//la posicion (0,0) de cada tetromino es el unico mino que nunca va a rotar, y en funcoin de esa posicion se contruye la pieza
		case Tetromino_Z: //la pieza roja
			return new Tetromino(new ParNum(0,0), new ParNum(-1,-1),new ParNum(0,-1),new ParNum(1,0), nombre);
		case Tetromino_S: //la pieza verde
			return new Tetromino(new ParNum(0,0), new ParNum(-1,0),new ParNum(0,-1),new ParNum(1,-1), nombre);
		case Tetromino_J: //la piez azul
			return new Tetromino(new ParNum(0,0), new ParNum(-1,-1),new ParNum(-1,0),new ParNum(1,0), nombre);
		case Tetromino_L: //la pieza naranja
			return new Tetromino(new ParNum(0,0), new ParNum(-1,0),new ParNum(1,-1),new ParNum(1,0), nombre);
		case Tetromino_T: //la pieza morada
			return new Tetromino(new ParNum(0,0), new ParNum(0,-1),new ParNum(-1,0),new ParNum(1,0), nombre);
		case Tetromino_O: //la pieza amarilla
			return new Tetromino(new ParNum(0,0), new ParNum(0,-1),new ParNum(1,-1),new ParNum(1,0), nombre);
		case Tetromino_I: //la pieza cian
			return new Tetromino(new ParNum(0,0), new ParNum(-1,0),new ParNum(1,0),new ParNum(2,0), nombre);
		}
		
		//pieza por defecto
		return new Tetromino(new ParNum(0,0), new ParNum(0,0),new ParNum(0,0),new ParNum(0,0), nombre);
	}
	
	
	public void girarDerecha(){
		for (int i = 0; i < mino.length; i++) {
			mino[i].girarDerecha();
		}
	}
	public void girarIzquierda(){
		for (int i = 0; i < mino.length; i++) {
			mino[i].girarIzquierda();;
		}
	}
	
	

}
