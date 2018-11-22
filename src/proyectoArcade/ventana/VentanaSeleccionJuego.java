package proyectoArcade.ventana;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import proyectoArcade.main;
import proyectoArcade.PacMan.VentanaPM;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaSeleccionJuego extends JFrame {

	private JPanel contentPane;

	public VentanaSeleccionJuego(int anchura, int altura, boolean mute) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(584, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BotonTetris = new JButton("TETRIS");
		BotonTetris.setBounds(265, 178, 159, 58);
		contentPane.add(BotonTetris);
		
		JButton BotonBomber = new JButton("BOMBERMAN");
		BotonBomber.setBounds(265, 102, 159, 65);
		contentPane.add(BotonBomber);
		
		JButton btnPM = new JButton("PAC-MAN");
		btnPM.setIcon(null);
		btnPM.setBounds(265, 26, 159, 65);
		contentPane.add(btnPM);
		
		JButton BotonAtras = new JButton("Atr\u00E1s");
		BotonAtras.setBounds(10, 227, 59, 23);
		contentPane.add(BotonAtras);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(VentanaSeleccionJuego.class.getResource("/imagenes/imagenInicio.jpg")));
		lblNewLabel.setBounds(0, 0, anchura, altura);
		contentPane.add(lblNewLabel);
		
		//Eventos
		BotonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.leerFichero();
				VentanaInicio VI = new VentanaInicio(anchura, altura, mute);
				VI.setSize(anchura, altura);
				VI.setVisible(true);
				VentanaSeleccionJuego.this.dispose();
			}
		});
		
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main.leerFichero();
				VentanaPM VPM = new VentanaPM(anchura, altura, mute);
				VPM.setSize(anchura, altura);
				VPM.setVisible(true);
				VentanaSeleccionJuego.this.dispose();
			}
		});
	}
}
