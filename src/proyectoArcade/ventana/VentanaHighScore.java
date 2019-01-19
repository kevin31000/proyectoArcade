package proyectoArcade.ventana;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import proyectoArcade.BD.BDScore;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class VentanaHighScore extends JFrame{
	public VentanaHighScore() {
		getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 47, 103, 172);
		getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(127, 47, 103, 172);
		getContentPane().add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(242, 47, 103, 172);
		getContentPane().add(textPane_2);
		
		JLabel lblTetris = new JLabel("Tetris");
		lblTetris.setBounds(35, 18, 56, 16);
		getContentPane().add(lblTetris);
		
		JLabel lblPacman = new JLabel("Pac-Man");
		lblPacman.setBounds(143, 18, 56, 16);
		getContentPane().add(lblPacman);
		
		JLabel lblBomberman = new JLabel("Bomberman");
		lblBomberman.setBounds(258, 18, 75, 16);
		getContentPane().add(lblBomberman);
		
		JButton btnSelJuego = new JButton("Seleccionar Juego");
		btnSelJuego.setBounds(127, 239, 169, 25);
		getContentPane().add(btnSelJuego);
		btnSelJuego.addActionListener(new ActionListener() {
			VentanaSeleccionJuego VSJ = new VentanaSeleccionJuego(500, 500, true);
			public void actionPerformed(ActionEvent arg0) {
				VSJ.setVisible(true);
				VSJ.setSize(500, 500);
				closeWindow();
			}
		});
		Connection connection = BDScore.initBD("HighScore");
		Statement st = BDScore.usarCrearTablasBD(connection);
		textPane.setText(BDScore.puntosSelect(st, "Tetris"));
	}
	
	private void closeWindow() {
		this.dispose(); //eliminar el hilo
	}
}
