package proyectoArcade.ventana;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

	int altura;
	int anchura;
	boolean mutear;
	String texto;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio frame = new VentanaInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public VentanaInicio() {
		
		File aFicheroLectura = new File("src/Ficheros/Opciones.txt");
		try {
			FileReader fr = new FileReader(aFicheroLectura);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			texto = linea+"\n";
			while(linea != null) {
				linea = br.readLine();
				String[] num = linea.split("X");
				anchura = Integer.parseInt(num[0]);
				altura = Integer.parseInt(num[1]);
				
				
				}
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setSize(anchura, altura);
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
		BotonJuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSeleccionJuego nuevaVentana = new VentanaSeleccionJuego();
				nuevaVentana.setVisible(true);
				VentanaInicio.this.dispose();
			}
		});
		BotonJuegos.setBounds(308, 59, 89, 23);
		contentPane.add(BotonJuegos);
		
		JButton BotonOpciones = new JButton("Opciones");
		BotonOpciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOpciones ventanaOpciones = new VentanaOpciones();
				ventanaOpciones.setVisible(true);
				VentanaInicio.this.dispose();
			}
		});
		BotonOpciones.setBounds(308, 109, 89, 23);
		contentPane.add(BotonOpciones);
		
		JButton BotonSalir = new JButton("Salir");
		BotonSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		BotonSalir.setBounds(308, 165, 89, 23);
		contentPane.add(BotonSalir);
		
		JLabel labelFondo = new JLabel("New label");
		labelFondo.setIcon(new ImageIcon(VentanaInicio.class.getResource("/imagenes/imagenInicio.jpg")));
		labelFondo.setBounds(-204, -23, 718, 453);
		contentPane.add(labelFondo);
		

		
		
		
		
	}
}
