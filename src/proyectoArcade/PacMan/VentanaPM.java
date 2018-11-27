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
	static PiezaoPersonaje FR = new PiezaoPersonaje(80, 80);
	static PiezaoPersonaje B = new PiezaoPersonaje(65, 20);
	static PiezaoPersonaje BF = new PiezaoPersonaje(30, 80);
	static ArrayList<PiezaoPersonaje> listaComidos = new ArrayList<PiezaoPersonaje>();
	static ArrayList<PiezaoPersonaje> objMostrados = new ArrayList<PiezaoPersonaje>();
	static String direccion;
	
	public static String getDireccion() {
		return direccion;
	}

	public static void setDireccion(String direccion) {
		direccion = direccion;
	}

	public VentanaPM(int anchura, int altura, boolean mute) {
	
		boolean musica = mute;
		
	}
	public static void main(int anchura, int altura, boolean mute) {
		JLabel imagen2 = new JLabel("PacMan");
		JLabel pts = new JLabel("0");
		JLabel lblPuntos = new JLabel("Puntos :");
		JLabel imagen = new JLabel("Fantasma");
		JLabel imagen3 = new JLabel("Comida");
		JLabel imagen4 = new JLabel("ComerFantasma");
		
		VentanaPM VPM = new VentanaPM(anchura, altura, mute);
		
		VPM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PiezaoPersonaje[][] tablero = new PiezaoPersonaje[100][100];
		VPM.getContentPane().setLayout(null);
		
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
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 162, 462, 310);
		VPM.getContentPane().add(panel);
		panel.setLayout(null);
		imagen2.setBounds(PM.getCoorX(), PM.getCoorY(), PM.getCoorX() + 10, PM.getCoorY() + 20);
		panel.add(imagen2);
		imagen2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/2000px-Pacman.svg.png")));
		imagen3.setBounds(FR.getCoorX(), FR.getCoorY(), FR.getCoorX() + 10, FR.getCoorY() + 20);
		panel.add(imagen3);
		imagen3.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/descarga.jpg")));
		imagen4.setBounds(B.getCoorX(), B.getCoorY(), B.getCoorX() + 10, B.getCoorY() + 20);
		panel.add(imagen4);
		imagen4.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/bola-acero-bingo-o-29mm.jpg")));
		imagen.setBounds(BF.getCoorX(), BF.getCoorY(), BF.getCoorX() + 10, BF.getCoorY() + 20);
		panel.add(imagen);
//		imagen.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/Pac-man_(Official_Image).png")));
		imagen.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/kisspng-pac-man-world-3-ghosts-red-packs-5ae218e46ff980.5320704415247669484587.jpg")));
		
		Thread puntos = new Thread() {
			public void run() {
				int x = listaComidos.size();
				pts.setText(x*100 + "");
			}
		};puntos.start();
		
		Thread movimiento = new Thread() {
			public void run() {
				mover(getDireccion());
			}
		};
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
				//Tambien se puede hacer con e.getKeyCodeText(e.getKeyCode).equals(w, Arriba, a, Izquierda, s, Abajo, d, derecha);
				if(e.getKeyCode() == 87 || e.getKeyCode() == 38) {
					setDireccion("Arriba");
								
				}if(e.getKeyCode() == 65 || e.getKeyCode() == 37) {
					setDireccion("Izquierda");
								
				}if(e.getKeyCode() == 68 || e.getKeyCode() == 39) {
					setDireccion("Derecha");
								
				}if(e.getKeyCode() == 83 || e.getKeyCode() == 40) {
					setDireccion("Abajo");
					
				}	
			}
		});
	}

	public void comer() {
		int x = PM.getCoorX();
		int y = PM.getCoorY();

		for (int obj = 0; obj < objMostrados.size(); obj++) {
			if (x == objMostrados.get(obj).getCoorX() && y == objMostrados.get(obj).getCoorY()) {
				listaComidos.add(objMostrados.get(obj));
				objMostrados.remove(obj);
			}
		}
	}

	public static void mover(String direccion) {
		if (direccion.equals("derecha")) {
			System.out.println(PM.getCoorY());
			PM.setCoorY(PM.getCoorY() + 1);
			System.out.println(PM.getCoorY());

		}
		if (direccion.equals("abajo")) {
			System.out.println(PM.getCoorX());
			PM.setCoorX(PM.getCoorX() + 1);
			System.out.println(PM.getCoorX());

		}
		if (direccion.equals("izquierda")) {
			System.out.println(PM.getCoorY());
			PM.setCoorY(PM.getCoorY() - 1);
			System.out.println(PM.getCoorY());

		}
		if (direccion.equals("arriba")) {
			System.out.println(PM.getCoorX());
			PM.setCoorX(PM.getCoorX() - 1);
			System.out.println(PM.getCoorX());
		}
	}
}
