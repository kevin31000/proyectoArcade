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
	
	public VentanaInicio(int anchura, int altura, boolean mute) {
		System.out.println(anchura + " " + altura);
		setTitle("Arcade");
		JButton btnJugar = new JButton("Jugar");
		JButton btnSalir = new JButton("Salir");
		JButton btnAjustes = new JButton("Ajustes");
		JLabel labelFondo = new JLabel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("/imagenes/MaquinaArcade.png")).getImage());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnJugar.setBounds(308, 59, 89, 23);
		contentPane.add(btnJugar);
		
		btnAjustes.setBounds(308, 109, 89, 23);
		contentPane.add(btnAjustes);
		
		btnSalir.setBounds(308, 165, 89, 23);
		contentPane.add(btnSalir);
		
		labelFondo.setIcon(new ImageIcon(VentanaInicio.class.getResource("/imagenes/imagenInicio.jpg")));
		labelFondo.setBounds(0, 0, anchura, altura);
		contentPane.add(labelFondo);
		
		//Eventos
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.leerFichero();
				VentanaSeleccionJuego VSJ = new VentanaSeleccionJuego(anchura, altura, mute);
				VSJ.setSize(anchura, altura);
				VSJ.setVisible(true);
				VentanaInicio.this.dispose();
			}
		});
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOpciones VO = new VentanaOpciones(anchura, altura, mute);
				VO.setVisible(true);
				VentanaInicio.this.dispose();
			}
		});
	}
}
