package proyectoArcade.PacMan;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import proyectoArcade.clasesBase.PiezaoPersonaje;
import proyectoArcade.clasesBase.Tablero;
import proyectoArcade.ventana.VentanaScore;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JPanel;

public class VentanaPM extends JFrame {
	static ReentrantLock lock = new ReentrantLock();
	static PiezaoPersonaje PM = new PiezaoPersonaje(20, 20, "PM");
	static PiezaoPersonaje FR = new PiezaoPersonaje(80, 80, "FR");
	static PiezaoPersonaje Fa = new PiezaoPersonaje(70, 30, "Fa");
	static PiezaoPersonaje B = new PiezaoPersonaje(65, 20, "B");
	static PiezaoPersonaje BF = new PiezaoPersonaje(30, 80, "BF");
	static PiezaoPersonaje C = new PiezaoPersonaje(50, 50, "C");
	static ArrayList<PiezaoPersonaje> listaComidos = new ArrayList<PiezaoPersonaje>();
	static ArrayList<PiezaoPersonaje> objMostrados = new ArrayList<PiezaoPersonaje>();
	static ArrayList<PiezaoPersonaje> cerezasComidas = new ArrayList<PiezaoPersonaje>();
	static ArrayList<PiezaoPersonaje> cerezasVida = new ArrayList<PiezaoPersonaje>();
	static JLabel Fantasma1 = new JLabel();
	static JLabel Fantasma2 = new JLabel();
	static JLabel Fantasma3 = new JLabel();
	static JLabel Fantasma4 = new JLabel();
	static JLabel Cereza = new JLabel();
	static JLabel PacMan = new JLabel();
	static JLabel imagen3 = new JLabel();
	static JLabel imagen4 = new JLabel();
	static JLabel vidas;
	static JLabel pts;
	static String direccion = "derecha";
	static String direccionF1 = "derecha";
	static String direccionF2 = "arriba";
	static String direccionF3 = "izquierda";
	static String direccionF4 = "abajo";
	
	
	
	public static String getDireccion() {
		return direccion;
	}

	public VentanaPM(int anchura, int altura, boolean mute) {

		boolean musica = mute;

	}

	public static void main(int anchura, int altura, boolean mute) {
		vidas = new JLabel("3");
		pts = new JLabel();
		VentanaPM VPM = new VentanaPM(anchura, altura, mute);
		VPM.setTitle("Pac-Man");
		VPM.setSize(anchura, altura);
		VPM.setVisible(true);

		VPM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		PiezaoPersonaje[][] tablero = new PiezaoPersonaje[100][100];
		VPM.getContentPane().setLayout(null);

		vidas.setBounds(400, 13, 56, 16);
		VPM.getContentPane().add(vidas);

		pts.setHorizontalAlignment(SwingConstants.TRAILING);
		pts.setBounds(278, 13, 56, 16);
		VPM.getContentPane().add(pts);

		tablero[PM.getCoorX()][PM.getCoorY()] = PM;
		tablero[FR.getCoorX()][FR.getCoorY()] = FR;
		tablero[B.getCoorX()][B.getCoorY()] = B;
		tablero[BF.getCoorX()][BF.getCoorY()] = BF;
		tablero[Fa.getCoorX()][Fa.getCoorY()] = Fa;
		tablero[C.getCoorX()][C.getCoorY()] = C;
		objMostrados.add(C);
		objMostrados.add(Fa);
		objMostrados.add(FR);
		objMostrados.add(BF);
		objMostrados.add(B);

		Fantasma1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaRojo.jpg")));
		Fantasma2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaAmarillo.jpg")));
		PacMan.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/2000px-Pacman.svg.png")));
		Cereza.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/Cereza.jpg")));
		imagen3.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/descarga.jpg")));
		imagen4.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/bola-acero-bingo-o-29mm.jpg")));
		
		VPM.add(Fantasma1);
		VPM.add(Fantasma2);
		VPM.add(PacMan);
		VPM.add(Cereza);
		VPM.add(imagen3);
		VPM.add(imagen4);

//		Thread puntos = new Thread() {
//			public void run() {
//				while (Integer.parseInt(vidas.getText()) > 0) {
//				lock.lock();
//				try {
//					int x = listaComidos.size();
//					pts.setText(x * 100 + "");
//				}finally {
//					lock.unlock();
//				}
//			 }
//			}
//		};puntos.start();

		Thread movimiento = new Thread() {
			public void run() {
				while (Integer.parseInt(vidas.getText()) > 0) {
					comer(); 
					dibujar();
					mover(direccion, PM);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}if(Integer.parseInt(vidas.getText()) == 0) {
					int pts = listaComidos.size() * 100 + cerezasComidas.size() * 350;
					VentanaScore VS = new VentanaScore(anchura, altura, "Pac-Man", pts);
					VS.setSize(anchura, altura);
					VS.setVisible(true);
					closeWindow(VPM);
				}
			}
		};movimiento.start();
			
		Thread movimientoF = new Thread() {
			public void run() {
				int x = 0;
				int numero;
				while (Integer.parseInt(vidas.getText()) > 0) {
					if(x == 4) {
						numero = (int) (Math.random() * 4);
						if(numero == 0) {
							direccionF1 = "arriba";
						}if(numero == 1) {
							direccionF1 = "izquierda";
						}if(numero == 2) {
							direccionF1 = "abajo";
						}if(numero == 3) {
							direccionF1 = "derecha";
						}
						x = 0;
					}if(x < 4) {
					mover(direccionF1, Fa);		
					}x+=1;
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};movimientoF.start();

		VPM.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				// Tambien se puede hacer con e.getKeyCodeText(e.getKeyCode).equals(w, Arriba,
				// a, Izquierda, s, Abajo, d, derecha);
				if (e.getKeyCode() == 87 || e.getKeyCode() == 38) {
					direccion = "arriba";
					// System.out.println(direccion);

				}
				if (e.getKeyCode() == 65 || e.getKeyCode() == 37) {
					direccion = "izquierda";
					// System.out.println(direccion);

				}
				if (e.getKeyCode() == 68 || e.getKeyCode() == 39) {
					direccion = "derecha";
					// System.out.println(direccion);

				}
				if (e.getKeyCode() == 83 || e.getKeyCode() == 40) {
					direccion = "abajo";
					// System.out.println(direccion);

				}
			}
		});
	
	Thread cambiarF = new Thread() {
		int x = 0;
		boolean FAExiste;
		public void run() {
			while (Integer.parseInt(vidas.getText()) > 0) {
			if(x == 7) {
				for(PiezaoPersonaje objeto : objMostrados){
					if(objeto.getColor().contains("FA")) {
						Fantasma1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaRojo.jpg")));
						Fantasma2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaAmarillo.jpg")));
						if(objeto.getColor().equals("FA_1")) {
						objeto.setColor("FR");
						}if(objeto.getColor().equals("FA_2")) {
						objeto.setColor("Fa");
						}
						FAExiste = false;
					}
					x = 0;
				}
			}if(x < 7){
				for(PiezaoPersonaje objeto : objMostrados){
					
					if(objeto.getColor().contains("FA")) {
						FAExiste = true;
					}
				}
				if(FAExiste){
					x+= 1;					
				}try {	
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}	
		}
		}
	};cambiarF.start();

	Thread apareceC = new Thread() {
		public void run() {
			int x = 0;
			Cereza.setVisible(false);
			while (Integer.parseInt(vidas.getText()) > 0) {
				System.out.println(x);
				if(x == 7 && !(Cereza.isVisible())) {
					Cereza.setVisible(true);
					Cereza.setBounds(C.getCoorX(), C.getCoorY(), C.getCoorX() + 10, C.getCoorY() + 20);
					x = 0;
				}if(x == 7 && Cereza.isVisible()) {
					x = 0;
				}if(x < 7) {
					x+= 1;
				}try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	};apareceC.run();
	}

	protected static void dibujar() {
		// TODO Auto-generated method stub
		Fantasma1.setBounds(FR.getCoorX(), FR.getCoorY(), FR.getCoorX() + 10, FR.getCoorY() + 20);
		Fantasma2.setBounds(Fa.getCoorX(), Fa.getCoorY(), Fa.getCoorX() + 10, Fa.getCoorY() + 20);
		PacMan.setBounds(PM.getCoorX(), PM.getCoorY(), PM.getCoorX() + 10, PM.getCoorY() + 20);
		imagen3.setBounds(BF.getCoorX(), BF.getCoorY(), BF.getCoorX() + 10, BF.getCoorY() + 20);
		imagen4.setBounds(B.getCoorX(), B.getCoorY(), B.getCoorX() + 10, B.getCoorY() + 20);
	}

	public static void comer() {
		int x = PM.getCoorX();
		int y = PM.getCoorY();
		for (int objeto = 0; objeto < objMostrados.size(); objeto ++) {
			if (x == objMostrados.get(objeto).getCoorX() && y == objMostrados.get(objeto).getCoorY()) {
				if (objMostrados.get(objeto).getColor().contains("F") && !(objMostrados.get(objeto).getColor().contains("FA")) && !(objMostrados.get(objeto).getColor().equals("BF"))) {
					vidas.setText(Integer.parseInt(vidas.getText()) - 1 + "");
					//Coordenada X		Coordenada Y
					//en la que se		en la que se
					//reinicia			reinicia
					PM.setCoorX(50);	PM.setCoorY(50);
					FR.setCoorX(80);	FR.setCoorY(80);
					Fa.setCoorX(70);	Fa.setCoorY(30);
				}
				if (objMostrados.get(objeto).getColor().contains("B") && !(objMostrados.get(objeto).getColor().contains("BF"))) {
					listaComidos.add(new PiezaoPersonaje(objMostrados.get(objeto).getCoorX(), objMostrados.get(objeto).getCoorY(), objMostrados.get(objeto).getColor()));
					objMostrados.remove(objeto);
					objeto = 0;
					break;
				}
				if (objMostrados.get(objeto).getColor().contains("BF")) {
					if(objMostrados.get(objeto).getColor().equals("BF")) {
						imagen3.setVisible(false);
					}
					objMostrados.remove(objeto);
					Fantasma1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaAzul.jpg")));
					Fantasma2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaAzul.jpg")));
					FR.setColor("FA_1");
					Fa.setColor("FA_2");
					break;
				}
				if (objMostrados.get(objeto).getColor().equals("FA_1")) {
					objMostrados.get(objeto).setColor("FR");
					Fantasma1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaRojo.jpg")));
					objMostrados.get(objeto).setCoorX(80);
					objMostrados.get(objeto).setCoorY(80);
					listaComidos.add(new PiezaoPersonaje(objMostrados.get(objeto).getCoorX(), objMostrados.get(objeto).getCoorY(), objMostrados.get(objeto).getColor()));
				}
				if (objMostrados.get(objeto).getColor().equals("FA_2")) {
					objMostrados.get(objeto).setColor("Fa");
					Fantasma2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaAmarillo.jpg")));
					objMostrados.get(objeto).setCoorX(70);
					objMostrados.get(objeto).setCoorY(30);
					listaComidos.add(new PiezaoPersonaje(objMostrados.get(objeto).getCoorX(), objMostrados.get(objeto).getCoorY(), objMostrados.get(objeto).getColor()));
				}
				if (objMostrados.get(objeto).getColor().equals("FA_3")) {
					
				}
				if (objMostrados.get(objeto).getColor().equals("FA_4")) {
	
				}
				if (objMostrados.get(objeto).getColor().equals("C")) {
					cerezasComidas.add(new PiezaoPersonaje(objMostrados.get(objeto).getCoorX(), objMostrados.get(objeto).getCoorY(), objMostrados.get(objeto).getColor()));
					cerezasVida.add(new PiezaoPersonaje(objMostrados.get(objeto).getCoorX(), objMostrados.get(objeto).getCoorY(), objMostrados.get(objeto).getColor()));
					Cereza.setVisible(false);
					aumentarVida();
					objeto = 0;
					break;
				}
			}
		}
	}

	// En caso de añadir las cerezas
	public static void aumentarVida() {
		if (cerezasVida.size() == 1) {
			vidas.setText(Integer.parseInt(vidas.getText()) + 1 + "");
			for (int cereza = 0; cereza < cerezasVida.size(); cereza ++) {
				cerezasVida.remove(cereza);
			}
		}
	}
	
	public static void mover(String direccion, PiezaoPersonaje F) {
		if (direccion.equals("derecha")) {
			F.setCoorX(F.getCoorX() + 1);
		}
		if (direccion.equals("abajo")) {
			F.setCoorY(F.getCoorY() + 1);
		}
		if (direccion.equals("izquierda")) {
			F.setCoorX(F.getCoorX() - 1);
		}
		if (direccion.equals("arriba")) {
			F.setCoorY(F.getCoorY() - 1);
		}
	}
	
	private static void closeWindow(VentanaPM VPM) {
		VPM.dispose(); // eliminar el hilo
	}
}
