package proyectoArcade.PacMan;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import proyectoArcade.clasesBase.PiezaoPersonaje;
import proyectoArcade.clasesBase.Tablero;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class VentanaPM extends JFrame {
	PiezaoPersonaje PM = new PiezaoPersonaje(20, 20);
	PiezaoPersonaje FR = new PiezaoPersonaje(80, 80);
	PiezaoPersonaje B = new PiezaoPersonaje(65, 20);
	PiezaoPersonaje BF = new PiezaoPersonaje(30, 80);
	String direccion;
	
	ArrayList<PiezaoPersonaje> listaComidos = new ArrayList<PiezaoPersonaje>();
	ArrayList<PiezaoPersonaje> objMostrados = new ArrayList<PiezaoPersonaje>();
	
	public VentanaPM(int anchura, int altura, boolean mute) {
		JLabel imagen2 = new JLabel("PacMan");
		JLabel pts = new JLabel("0");
		JLabel lblPuntos = new JLabel("Puntos :");
		JLabel imagen = new JLabel("Fantasma");
		JLabel imagen3 = new JLabel("Comida");
		JLabel imagen4 = new JLabel("ComerFantasma");
		boolean musica = mute;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PiezaoPersonaje[][] tablero = new PiezaoPersonaje[100][100];
		getContentPane().setLayout(null);
		
		lblPuntos.setBounds(228, 13, 56, 16);
		getContentPane().add(lblPuntos);
		
		pts.setHorizontalAlignment(SwingConstants.TRAILING);
		pts.setBounds(278, 13, 56, 16);
		getContentPane().add(pts);
		
		imagen.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/Pac-man_(Official_Image).png")));
		imagen.setBounds(238, 35, 508, 552);
		getContentPane().add(imagen);
				
		tablero[PM.getCoorX()][PM.getCoorY()] = PM;
		tablero[FR.getCoorX()][FR.getCoorY()] = FR;
		tablero[B.getCoorX()][B.getCoorY()] = B;
		tablero[BF.getCoorX()][BF.getCoorY()] = BF;
		objMostrados.add(FR);
		objMostrados.add(BF);
		objMostrados.add(B);
		
		imagen2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/2000px-Pacman.svg.png")));
		imagen2.setBounds(PM.getCoorX(), PM.getCoorY() , PM.getCoorX() + 20 , PM.getCoorY() + 20);
		getContentPane().add(imagen2);
		
		imagen.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/kisspng-pac-man-world-3-ghosts-red-packs-5ae218e46ff980.5320704415247669484587.jpg")));
		imagen.setBounds(FR.getCoorX(), FR.getCoorY() , FR.getCoorX() + 20 , FR.getCoorY() + 20);
		getContentPane().add(imagen);
		
		imagen3.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/descarga.jpg")));
		imagen3.setBounds(B.getCoorX(), B.getCoorY() , B.getCoorX() + 20 , B.getCoorY() + 20);
		getContentPane().add(imagen3);
		
		imagen4.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/bola-acero-bingo-o-29mm.jpg")));
		imagen4.setBounds(BF.getCoorX(), BF.getCoorY() , BF.getCoorX() + 20 , BF.getCoorY() + 20);
		getContentPane().add(imagen4);
		
		Thread puntos = new Thread() {
			public void run() {
				int x = listaComidos.size();
				pts.setText(x*100 + "");
			};
		};puntos.start();
		
	}
	public void comer() {
		int x = PM.getCoorX();
		int y = PM.getCoorY();
		
		for(int obj = 0; obj < objMostrados.size(); obj ++) {
			if(x == objMostrados.get(obj).getCoorX() && y == objMostrados.get(obj).getCoorY()) {
				listaComidos.add(objMostrados.get(obj));
				objMostrados.remove(obj);
			}
		}
	}
	
	public void mover(String direccion) {
		if(direccion.equals("derecha")) {
			PM.setCoorY(PM.getCoorY() + 1);
			
		}if(direccion.equals("abajo")) {
			PM.setCoorX(PM.getCoorX() + 1);
			
		}if(direccion.equals("izquierda")) {
			PM.setCoorY(PM.getCoorY() - 1);
			
		}if(direccion.equals("arriba")) {
			PM.setCoorX(PM.getCoorX() - 1);
			
		}
	}
}
