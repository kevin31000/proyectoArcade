package tetris;

public class ParNum {
	double X;
	double Y;
	
	public ParNum(double x, double y) {
		super();
		X = x;
		Y = y;
	}

	public double getX() {
		return X;
	}

	public void setX(double x) {
		X = x;
	}

	public double getY() {
		return Y;
	}

	public void setY(double y) {
		Y = y;
	}
	
	public void moverDerecha() {
		X++;
	}
	
	public void moverIzquierda() {
		X--;
	}
	public void moverArriba() {
		Y--;
	}
	public void moverAbajo() {
		Y++;
	}
	public void girarDerecha() {
		Double giro = X;
		X = -Y;
		Y = giro;
	}
	public void girarIzquierda() {
		
	}
	
	

}
