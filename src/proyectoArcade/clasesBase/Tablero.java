package proyectoArcade.clasesBase;

public class Tablero{
	

	public Tablero(int x, int y) {
		
	PiezaoPersonaje[][] tablero = new PiezaoPersonaje[x][y];
	}
	
	public void anyadir(PiezaoPersonaje o, PiezaoPersonaje[][] tablero) {
		tablero[o.getCoorX()][o.getCoorY()] = o;
	}
}
