package tetris;

public class GestionPrincipal {
	
	private static Dibujo dibujo;
	private static Ventana ventana;
	private static int APS = 0;  //actualizaciones por segundo
	private static int FPS = 0; //frames por segundo
	
	
	public static void main(String[] args) {
		iniciarJuego();
		
	}
	
	public static void iniciarJuego() {
		crearVentana(950, 600, "Tetris");
		avanceBuclePrincipal();
	}
	
	public static void actualizar() {
		APS++;
		dibujo.dibujar();
	}
	
	public static void dibujar() {
		FPS++;
	}
	
	public static void crearVentana(int ancho, int alto, String nombre) {
		dibujo = new Dibujo(ancho, alto);
		ventana = new Ventana(nombre, dibujo);
	}
	
	public static void avanceBuclePrincipal() {
		final int NS_SEGUNDO = 1000000000;
		final int APS_SEGUNDO = 60;  //actualizamos el bucle principal 30 veces x segundo.
		final int NS_ACTUAL = NS_SEGUNDO / APS_SEGUNDO;
		
		long tiempoReferenciaActualizacion = System.nanoTime(); 
		long tiempoReferenciaContador = System.nanoTime();
		
		double delta = 0;
		double tiempoSinProcesar;
		
		while(true) {
			long tiempoInicial = System.nanoTime();
			tiempoSinProcesar = tiempoInicial - tiempoReferenciaActualizacion;  //siempre va a ser positivo
			tiempoReferenciaActualizacion = tiempoInicial;  //vemos cuanto ha pasado entre cada bucle
			delta += tiempoSinProcesar/NS_ACTUAL;
			while(delta>=1) {
				//actualiza
				delta--;
				actualizar();
			}
			//dibuja
			dibujar();
			
			if(System.nanoTime() - tiempoReferenciaContador >= NS_ACTUAL) {
				System.out.println("APS = " + APS + "FPS = " + FPS);
			}
			
		}
		
	}

}
