package tetris;

public class GestionPrincipal {
	
	private static Dibujo dibujo;
	private static Ventana ventana;
	
	public static void main(String[] args) {
		crearVentana(950, 600, "Tetris");
		
	}
	
	public void iniciarJuego() {
		
	}
	
	public static void crearVentana(int ancho, int alto, String nombre) {
		dibujo = new Dibujo(ancho, alto);
		ventana = new Ventana(nombre, dibujo);
	}

}
