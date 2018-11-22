package proyectoArcade.PacMan;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import proyectoArcade.clasesBase.PiezaoPersonaje;
import proyectoArcade.clasesBase.Tablero;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class VentanaPM extends JFrame {
	
	public VentanaPM(int anchura, int altura, boolean mute) {
		PiezaoPersonaje[][] tablero = new PiezaoPersonaje[50][50];
		getContentPane().setLayout(null);
		
		JLabel lblPuntos = new JLabel("Puntos :");
		lblPuntos.setBounds(228, 13, 56, 16);
		getContentPane().add(lblPuntos);
		
		JLabel pts = new JLabel("0");
		pts.setHorizontalAlignment(SwingConstants.TRAILING);
		pts.setBounds(278, 13, 56, 16);
		getContentPane().add(pts);
		
//		JLabel imagen = new JLabel();
//		imagen.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/Pac-man_(Official_Image).png")));
//		imagen.setBounds(238, 35, 508, 552);
//		getContentPane().add(imagen);
		
		PiezaoPersonaje PM = new PiezaoPersonaje(20, 20);
		
		tablero[PM.getCoorX()][PM.getCoorY()] = PM;
		
		System.out.println(PM.getCoorX());
		JLabel imagen2 = new JLabel();
		imagen2.setIcon(new ImageIcon(VentanaPM.class.getResource("/imagenes/Pac-man_(Official_Image).png")));
		imagen2.setBounds(PM.getCoorX(), PM.getCoorY() ,PM.getCoorX() + 20 , PM.getCoorY() + 20);
		getContentPane().add(imagen2);
	}
}
