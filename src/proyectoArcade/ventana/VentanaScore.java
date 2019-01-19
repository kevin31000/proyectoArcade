package proyectoArcade.ventana;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import proyectoArcade.BD.BDScore;
import proyectoArcade.BD.Conexion;

public class VentanaScore extends JFrame{
	
	private JPanel contentPane;
	private JTextField textField;
	private JLabel labelFondo;
	
	public VentanaScore(int anchura, int altura, String juego, int puntos) {
		getContentPane().setLayout(null);
		labelFondo = new JLabel();
		contentPane = new JPanel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("/imagenes/MaquinaArcade.png")).getImage());
		setSize(445, 365);
		
		textField = new JTextField();
		textField.setBounds(201, 69, 116, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(64, 69, 99, 22);
		getContentPane().add(lblNombre);
		
		JButton btnIntroducir = new JButton("Introducir");
		btnIntroducir.setBounds(146, 187, 97, 25);
		getContentPane().add(btnIntroducir);
		
		JLabel label = new JLabel();
		label.setBounds(0, 0, anchura, altura);
		label.setIcon(new ImageIcon(VentanaInicio.class.getResource("/imagenes/imagenInicio.jpg")));
		getContentPane().add(label);
		
		JLabel lblHasPerdido = new JLabel("Has perdido");
		lblHasPerdido.setForeground(Color.WHITE);
		lblHasPerdido.setHorizontalAlignment(SwingConstants.CENTER);
		lblHasPerdido.setBounds(64, 13, 253, 39);
		getContentPane().add(lblHasPerdido);
		
		//Eventos
		btnIntroducir.addActionListener(new ActionListener() {
			VentanaHighScore VHS = new VentanaHighScore();
			public void actionPerformed(ActionEvent arg0) {
				Statement st = BDScore.usarCrearTablasBD(Conexion.conectar());
				BDScore.insertJugador(st, textField.getText(), juego, puntos);
				closeWindow();
//				BDScore.cerrarBD(C.conectar(), st);
				VHS.setVisible(true);
				VHS.setSize(500,500);
				
			}
		});
		
	}
	
	private void closeWindow() {
		this.dispose(); //eliminar el hilo
	}
}
