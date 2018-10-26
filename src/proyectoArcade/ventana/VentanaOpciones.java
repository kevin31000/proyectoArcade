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
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setTitle("Opciones");
		
		JLabel labelTamanyo = new JLabel("Resolución:");
		JLabel labelFondo = new JLabel();
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaInicio ventanaInicio = new VentanaInicio();
				ventanaInicio.setVisible(true);
				VentanaOpciones.this.dispose();
			}
		});
		JLabel labelMusica = new JLabel("  Música:");
		labelMusica.setForeground(Color.WHITE);
		labelTamanyo.setForeground(Color.WHITE);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("/imagenes/MaquinaArcade.png")).getImage());
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelTamanyo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTamanyo.setBounds(90, 81, 69, 14);
		contentPane.add(labelTamanyo);
		
		labelMusica.setBounds(90,106,69,20);
		contentPane.add(labelMusica);
		
		btnAtras.setBounds(168, 215, 87, 25);
		contentPane.add(btnAtras);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"320X240", "640X480", "850X480", "1366X768", "1920X1080"}));
		comboBox.setBounds(213, 78, 87, 20);
		contentPane.add(comboBox);
		
		JCheckBox chckbxActivar = new JCheckBox("Activar");
		chckbxActivar.setBounds(223, 105, 69, 23);
		contentPane.add(chckbxActivar);
		
		labelFondo.setBounds(-279, 0, 1003, 1023);
		labelFondo.setIcon(new ImageIcon(VentanaOpciones.class.getResource("/imagenes/6839513-grey-wallpaper.jpg")));
		contentPane.add(labelFondo);
	}
}
