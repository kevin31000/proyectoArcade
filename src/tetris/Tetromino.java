package tetris;
//Al parecer las piezas del tetris se llaman tetrominos
//Un tetrominó es una forma geométrica compuesta de cuatro
//cuadrados iguales, conectados entre sí ortogonalmente (lado a lado). segun wikipedia

public class Tetromino {
	
	ParNum mino[]; //llamo mino a cada cuadradito que forma cada pieza
	String nombre;
	
	
	
	public Tetromino(ParNum mino0, ParNum mino1,ParNum mino2,ParNum mino3,String nombre) {
		 mino = new ParNum[4];
		 mino[0] = mino0;
		 mino[1] = mino1;
		 mino[2] = mino2;
		 mino[3] = mino3;
		this.nombre = nombre;
	}
	
	public static Tetromino Aleatorio() {  //para que nos elija una tetromino aleatorio cada vezz
		String nombre[] = {"Z", "S", "J", "L", "T", "O", "I"};
		
		return consultar(nombre[(int)(Math.random()*6.9)]);
	}
	
	public static Tetromino consultar(String nombre) {
		switch (nombre) {
		// a cada tetromino o pieza le pongo el nombre de la letra a la que se parece
		//la posicion (0,0) de cada tetromino es el unico mino que nunca va a rotar, y en funcoin de esa posicion se contruye la pieza
		case "Z": //la pieza roja
			return new Tetromino(new ParNum(-1,-1), new ParNum(0,-1),new ParNum(0,0),new ParNum(1,0), "Z");
		case "S": //la pieza verde
			return new Tetromino(new ParNum(-1,0), new ParNum(0,0),new ParNum(0,-1),new ParNum(1,-1), "S");
		case "J": //la piez azul
			return new Tetromino(new ParNum(-1,-1), new ParNum(1,0),new ParNum(0,0),new ParNum(1,0), "J");
		case "L": //la pieza naranja
			return new Tetromino(new ParNum(-1,0), new ParNum(0,0),new ParNum(1,0),new ParNum(1,-1), "L");
		case "T": //la pieza morada
			return new Tetromino(new ParNum(-1,0), new ParNum(0,0),new ParNum(0,-1),new ParNum(1,0), "T");
		case "O": //la pieza amarilla
			return new Tetromino(new ParNum(0,0), new ParNum(0,-1),new ParNum(1,-1),new ParNum(1,0), "O");
		case "I": //la pieza cian
			return new Tetromino(new ParNum(-1,0), new ParNum(0,0),new ParNum(1,0),new ParNum(2,0), "I");
		}
		
		//pieza por defecto
		return new Tetromino(new ParNum(0,0), new ParNum(0,0),new ParNum(0,0),new ParNum(0,0), "");
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
