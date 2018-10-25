package proyectoArcade;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelTamanyo = new JLabel("TAMAÑO PANTALLA");
		labelTamanyo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTamanyo.setForeground(Color.ORANGE);
		labelTamanyo.setBackground(Color.WHITE);
		labelTamanyo.setBounds(63, 89, 101, 14);
		labelTamanyo.setOpaque(true);
		labelTamanyo.setBackground(Color.BLUE);
		contentPane.add(labelTamanyo);
		
		JLabel label = new JLabel("");
		label.setBounds(-284, 10, 1003, 1023);
		label.setIcon(new ImageIcon(VentanaOpciones.class.getResource("/imagenes/imagenOpciones.jpg")));
		contentPane.add(label);
	}
}
