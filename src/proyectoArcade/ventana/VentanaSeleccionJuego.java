package proyectoArcade.ventana;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaSeleccionJuego extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSeleccionJuego frame = new VentanaSeleccionJuego();
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
	public VentanaSeleccionJuego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 450);
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
		
		JButton btnNewButton_1 = new JButton("PAC-MAN");
		btnNewButton_1.setIcon(null);
		btnNewButton_1.setBounds(265, 26, 159, 65);
		contentPane.add(btnNewButton_1);
		
		JButton BotonAtras = new JButton("Atr\u00E1s");
		BotonAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaInicio nuevaVentana = new VentanaInicio();
				nuevaVentana.setVisible(true);
				VentanaSeleccionJuego.this.dispose();
			}
		});
		BotonAtras.setBounds(10, 227, 59, 23);
		contentPane.add(BotonAtras);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(VentanaSeleccionJuego.class.getResource("/imagenes/imagenInicio.jpg")));
		lblNewLabel.setBounds(-238, 0, 735, 369);
		contentPane.add(lblNewLabel);
	}

}
