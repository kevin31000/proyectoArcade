package proyectoArcade.ventana;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import proyectoArcade.main;

import javax.swing.JLabel;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class VentanaInicio extends JFrame{
	
	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	
	public VentanaInicio(int anchura, int altura, boolean mute) {
		setTitle("Arcade");
		JButton btnJugar = new JButton("Jugar");
		JButton btnSalir = new JButton("Salir");
		JButton btnAjustes = new JButton("Ajustes");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("/imagenes/MaquinaArcade.png")).getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BotonJuegos = new JButton("Jugar");
		BotonJuegos.setBounds(308, 59, 89, 23);
		contentPane.add(BotonJuegos);
		
		JButton BotonOpciones = new JButton("Opciones");
		BotonOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOpciones ventanaOpciones = new VentanaOpciones(anchura, altura, mute);
				ventanaOpciones.setVisible(true);
				VentanaInicio.this.dispose();
			}
		});
		BotonOpciones.setBounds(308, 109, 89, 23);
		contentPane.add(BotonOpciones);
		
		JButton BotonSalir = new JButton("Salir");
		BotonSalir.setBounds(308, 165, 89, 23);
		contentPane.add(BotonSalir);
		
		JLabel labelFondo = new JLabel();
		labelFondo.setIcon(new ImageIcon(VentanaInicio.class.getResource("/imagenes/imagenInicio.jpg")));
		labelFondo.setBounds(0, 0, anchura, altura);
		contentPane.add(labelFondo);
		
		//Eventos
		BotonJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.leerFichero();
				VentanaSeleccionJuego VSJ = new VentanaSeleccionJuego(anchura, altura, mute);
				VSJ.setSize(anchura, altura);
				VSJ.setVisible(true);
				VentanaInicio.this.dispose();
			}
		});
		
		BotonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
