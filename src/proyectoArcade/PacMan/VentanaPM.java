package proyectoArcade.PacMan;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import proyectoArcade.clasesBase.PiezaoPersonaje;
import proyectoArcade.clasesBase.Tablero;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JPanel;

public class VentanaPM extends JFrame {
	static PiezaoPersonaje PM = new PiezaoPersonaje(20, 20, "PM");
	static PiezaoPersonaje FR = new PiezaoPersonaje(80, 80, "FR");
	static PiezaoPersonaje B = new PiezaoPersonaje(65, 20, "B");
	static PiezaoPersonaje BF = new PiezaoPersonaje(30, 80, "BF");
	static PiezaoPersonaje C = new PiezaoPersonaje(50, 50, "C");
	static ArrayList<PiezaoPersonaje> listaComidos = new ArrayList<PiezaoPersonaje>();
	static ArrayList<PiezaoPersonaje> objMostrados = new ArrayList<PiezaoPersonaje>();
	static ArrayList<PiezaoPersonaje> cerezasComidas = new ArrayList<PiezaoPersonaje>();
	static JLabel Fantasma1 = new JLabel();
	static JLabel PacMan = new JLabel();
	static JLabel imagen3 = new JLabel();
	static JLabel imagen4 = new JLabel();
	static JLabel vidas;
	static JLabel pts;
	static String direccion = "abajo";

	public static String getDireccion() {
		return direccion;
	}

	public VentanaPM(int anchura, int altura, boolean mute) {

		boolean musica = mute;

	}

	public static void main(int anchura, int altura, boolean mute) {
		vidas = new JLabel("3");
		pts = new JLabel();
		JLabel lblPuntos = new JLabel("Puntos :");
		VentanaPM VPM = new VentanaPM(anchura, altura, mute);
		VPM.setSize(anchura, altura);
		VPM.setVisible(true);

		VPM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		PiezaoPersonaje[][] tablero = new PiezaoPersonaje[100][100];
		VPM.getContentPane().setLayout(null);

		vidas.setBounds(400, 13, 56, 16);
		VPM.getContentPane().add(vidas);

		lblPuntos.setBounds(228, 13, 56, 16);
		VPM.getContentPane().add(lblPuntos);

		pts.setHorizontalAlignment(SwingConstants.TRAILING);
		pts.setBounds(278, 13, 56, 16);
		VPM.getContentPane().add(pts);

		tablero[PM.getCoorX()][PM.getCoorY()] = PM;
		tablero[FR.getCoorX()][FR.getCoorY()] = FR;
		tablero[B.getCoorX()][B.getCoorY()] = B;
		tablero[BF.getCoorX()][BF.getCoorY()] = BF;
		objMostrados.add(FR);
		objMostrados.add(BF);
		objMostrados.add(B);

		Fantasma1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaRojo.jpg")));
		PacMan.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/2000px-Pacman.svg.png")));
		imagen3.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/descarga.jpg")));
		imagen4.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/bola-acero-bingo-o-29mm.jpg")));

		VPM.add(Fantasma1);
		VPM.add(PacMan);
		VPM.add(imagen3);
		VPM.add(imagen4);

		Thread puntos = new Thread() {
			public void run() {
				while (Integer.parseInt(vidas.getText()) > 0) {
				int x = listaComidos.size();
				pts.setText(x * 100 + "");
			 }
			}
		};
		puntos.start();

		Thread movimiento = new Thread() {
			public void run() {
				while (Integer.parseInt(vidas.getText()) > 0) {
					comer(); 
					dibujar();
					mover(getDireccion());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		movimiento.start();

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
					System.out.println(objeto.getColor());
					if(objeto.getColor().contains("FA")) {
						Fantasma1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaRojo.jpg")));
						objeto.setColor("FR");
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
					System.out.println(x);
					x+= 1;
					System.out.println(x);
					
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

	}

	protected static void dibujar() {
		// TODO Auto-generated method stub
		Fantasma1.setBounds(FR.getCoorX(), FR.getCoorY(), FR.getCoorX() + 10, FR.getCoorY() + 20);
		PacMan.setBounds(PM.getCoorX(), PM.getCoorY(), PM.getCoorX() + 10, PM.getCoorY() + 20);
		imagen3.setBounds(BF.getCoorX(), BF.getCoorY(), BF.getCoorX() + 10, BF.getCoorY() + 20);
		imagen4.setBounds(B.getCoorX(), B.getCoorY(), B.getCoorX() + 10, B.getCoorY() + 20);
	}

	public static void comer() {
		int x = PM.getCoorX();
		int y = PM.getCoorY();
		for (PiezaoPersonaje objeto : objMostrados) {
			if (x == objeto.getCoorX() && y == objeto.getCoorY()) {
				if (objeto.getColor().contains("F") && !(objeto.getColor().contains("FA")) && !(objeto.getColor().equals("BF"))) {
					vidas.setText(Integer.parseInt(vidas.getText()) - 1 + "");
					PM.setCoorX(50);
					PM.setCoorY(50);
					FR.setCoorX(80);
					FR.setCoorY(80);
				}
				if (objeto.getColor().contains("B") && !(objeto.getColor().contains("BF"))) {
					System.out.println("2");
					System.out.println(objMostrados + " " + listaComidos);
					objMostrados.remove(objeto);
					listaComidos.add(objeto);
					System.out.println(objMostrados + " " + listaComidos);
				}
				if (objeto.getColor().contains("BF")) {
					objMostrados.remove(objeto);
					Fantasma1.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/FantasmaAzul.jpg")));
					FR.setColor("FA_1");
				}
				if (objeto.getColor().equals("FA_1")) {
					objeto.setColor("FR");
					Fantasma1.setIcon(new ImageIcon(VentanaPM.class.getResource(
							"/imagenes/kisspng-pac-man-world-3-ghosts-red-packs-5ae218e46ff980.5320704415247669484587.jpg")));
					objeto.setCoorX(80);
					objeto.setCoorY(80);
					listaComidos.add(objeto);
				}
				if (objeto.getColor().equals("FA_2")) {

				}
				if (objeto.getColor().equals("FA_3")) {

				}
				if (objeto.getColor().equals("FA_4")) {

				}
				if (objeto.getColor().equals(C)) {
					System.out.println("5");
					cerezasComidas.add(objeto);
					aumentarVida();
					pts.setText(Integer.parseInt(pts.getText()) + 350 + "");
				}
			}
		}
	}

	// En caso de añadir las cerezas
	public static void aumentarVida() {
		if (cerezasComidas.size() == 7) {
			vidas.setText(Integer.parseInt(vidas.getText()) + 1 + "");
			for (PiezaoPersonaje cereza : cerezasComidas) {
				cerezasComidas.remove(cereza);
			}

		}
	}

	public static void mover(String direccion) {
		if (direccion.equals("derecha")) {
			PM.setCoorX(PM.getCoorX() + 1);
		}
		if (direccion.equals("abajo")) {
			PM.setCoorY(PM.getCoorY() + 1);
		}
		if (direccion.equals("izquierda")) {
			PM.setCoorX(PM.getCoorX() - 1);
		}
		if (direccion.equals("arriba")) {
			PM.setCoorY(PM.getCoorY() - 1);
		}
	}
}
