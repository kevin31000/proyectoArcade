package proyectoArcade.ventana;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import proyectoArcade.main;

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
import javax.swing.DefaultListModel;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.awt.event.ActionEvent;

public class VentanaOpciones extends JFrame {

	private JPanel contentPane;

	public VentanaOpciones(int anchura, int altura, boolean mute) {
		setTitle("Opciones");

		JLabel labelTamanyo = new JLabel("Resoluci�n:");
		JLabel labelFondo = new JLabel();
		JButton btnAtras = new JButton("Atras");
		JButton btnAplicar = new JButton("Aplicar");
		JLabel labelMusica = new JLabel("  M�sica:");
		JComboBox comboBox = new JComboBox();

		labelMusica.setForeground(Color.WHITE);
		labelTamanyo.setForeground(Color.WHITE);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("/imagenes/MaquinaArcade.png")).getImage());
		setSize(anchura, altura);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		labelTamanyo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTamanyo.setBounds(90, 81, 69, 14);
		contentPane.add(labelTamanyo);

		labelMusica.setBounds(90, 106, 69, 20);
		contentPane.add(labelMusica);

		btnAtras.setBounds(236, 215, 87, 25);
		contentPane.add(btnAtras);

		btnAplicar.setBounds(95, 215, 97, 25);
		contentPane.add(btnAplicar);

		comboBox.setModel(
				new DefaultComboBoxModel(new String[] { "320X240", "640X480", "850X480", "1366X768", "1920X1080" }));
		comboBox.setBounds(213, 78, 87, 20);
		contentPane.add(comboBox);

		JCheckBox chckbxActivar = new JCheckBox("Mutear");
		chckbxActivar.setBounds(223, 105, 69, 23);
		contentPane.add(chckbxActivar);

		labelFondo.setBounds(0, 0, anchura, altura);
		labelFondo.setIcon(new ImageIcon(VentanaOpciones.class.getResource("/imagenes/imagenInicio.jpg")));
		contentPane.add(labelFondo);

		// Eventos botones
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.leerFichero();

				VentanaInicio VI = new VentanaInicio(anchura, altura, mute);
				VI.setSize(anchura, altura);
				VI.setVisible(true);
				VentanaOpciones.this.dispose();
			}
		});

		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultComboBoxModel<String> modeloLista = (DefaultComboBoxModel<String>) comboBox.getModel();
				String tamano = modeloLista.getElementAt(comboBox.getSelectedIndex());
				String[] nums = tamano.split("X");
				int x = Integer.parseInt(nums[0]);
				int y = Integer.parseInt(nums[1]);
				labelFondo.setBounds(0, 0, x, y);
				setSize(x, y);
				try {
					String path = "src/Ficheros/Opciones.txt";
					File afile = new File(path);// tipo fichero ya metido en java
					FileWriter fw;
					fw = new FileWriter(afile);
					BufferedWriter bw = new BufferedWriter(fw);// El fichero te lo crea despues del Buffered
					bw.write(nums[0] + "X" + nums[1]);// va escribiendo cuando le da la gana
					bw.newLine();
					bw.write(chckbxActivar.isSelected() + "");
					bw.flush();// para obligar al bw a escribir de golpe
					bw.close(); // cierra el fichero
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

	}
}
