package proyectoArcade.ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.SwingConstants;

public class VentanaOpciones extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOpciones frame = new VentanaOpciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaOpciones() {
		
		JLabel labelTamanyo = new JLabel("Resolución:");
		JLabel labelFondo = new JLabel();
		JButton btnAtras = new JButton("Atras");
		JLabel labelMusica = new JLabel("  Musica:");
		labelMusica.setForeground(Color.WHITE);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("/imagenes/MaquinaArcade.png")).getImage());
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelTamanyo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTamanyo.setBounds(22, 81, 101, 14);
		contentPane.add(labelTamanyo);
		
		labelMusica.setBounds(32,97,105,20);
		contentPane.add(labelMusica);
		
		btnAtras.setBounds(168, 215, 87, 25);
		contentPane.add(btnAtras);
		
		labelFondo.setBounds(-279, 0, 1003, 1023);
		labelFondo.setIcon(new ImageIcon(VentanaOpciones.class.getResource("/imagenes/6839513-grey-wallpaper.jpg")));
		contentPane.add(labelFondo);
	}
}
