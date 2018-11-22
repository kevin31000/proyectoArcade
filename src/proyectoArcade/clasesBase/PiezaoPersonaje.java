package proyectoArcade.clasesBase;

public class PiezaoPersonaje {

	int coorX;
	int coorY;
	String color;
	
	public PiezaoPersonaje(int coorX, int coorY, String color) {
		super();
		this.coorX = coorX;
		this.coorY = coorY;
		this.color = color;
	}
	
	public PiezaoPersonaje(int coorX, int coorY) {
		super();
		this.coorX = coorX;
		this.coorY = coorY;
	}

	public int getCoorX() {
		return coorX;
	}
	
	public void setCoorX(int coorX) {
		this.coorX = coorX;
	}
	
	public int getCoorY() {
		return coorY;
	}
	
	public void setCoorY(int coorY) {
		this.coorY = coorY;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}
