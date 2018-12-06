package tetris;

public class ParNum {
	double X;
	double Y;
	
	public ParNum(double x, double y) {
		super();
		X = x;
		Y = y;
	}
	public int intX(){
        return (int)X;
    }
	
	public void sustituir(double a, double b) {
		X = a;
		Y=b;
	}
    
    public int intY(){
        return (int)Y;
    }
    
    public void adicionar(ParNum parnum) {
    	X+=parnum.X;
    	Y+=parnum.Y;
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
		Double giro = X;
		X = Y;
		Y = -giro;
	}
	
	

}
