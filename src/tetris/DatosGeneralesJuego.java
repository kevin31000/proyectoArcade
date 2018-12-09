package tetris;

public interface DatosGeneralesJuego {
	int Tetromino_Z = 0;
	int Tetromino_S = 1;
	int Tetromino_J = 2;
	int Tetromino_L = 3;
	int Tetromino_T = 4;
	int Tetromino_O = 5;
	int Tetromino_I = 6;
	int no_tetro = -1;
	
	int[] tetrominos_nombre= {Tetromino_Z,Tetromino_S,Tetromino_J,
			Tetromino_L,Tetromino_T,Tetromino_O,Tetromino_I,no_tetro};

	int columnas = 10;
	int filas = 20;
	int ancho_mino=28; //pixeles
	int alto_mino = 28; // pixeles
	
	int ancho_tablero=columnas*ancho_mino;
	int alto_tablero=filas*alto_mino;

}
