package proyectoArcade.ventana;

import javax.swing.JFrame;
import javax.swing.JTextPane;

import proyectoArcade.BD.BDScore;
import proyectoArcade.BD.Conexion;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class VentanaHighScore extends JFrame{
	public VentanaHighScore() {
		getContentPane().setLayout(null);
		
		JLabel lblTetris = new JLabel("Tetris");
		lblTetris.setBounds(35, 18, 56, 16);
		getContentPane().add(lblTetris);
		
		JLabel lblPacman = new JLabel("Pac-Man");
		lblPacman.setBounds(143, 18, 56, 16);
		getContentPane().add(lblPacman);
		
		JLabel lblBomberman = new JLabel("Bomberman");
		lblBomberman.setBounds(271, 18, 75, 16);
		getContentPane().add(lblBomberman);
		
		JButton btnSelJuego = new JButton("Inicio");
		btnSelJuego.setBounds(127, 239, 75, 25);
		getContentPane().add(btnSelJuego);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 47, 100, 160);
		getContentPane().add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		scrollPane.setViewportView(textPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(127, 47, 102, 160);
		getContentPane().add(scrollPane_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		scrollPane_1.setViewportView(textPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(258, 47, 100, 160);
		getContentPane().add(scrollPane_2);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		scrollPane_2.setViewportView(textPane_2);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(217, 239, 97, 25);
		getContentPane().add(btnReset);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setBounds(12, 239, 97, 25);
		getContentPane().add(btnCargar);
		
		ArrayList<String> PuntuacionT = new ArrayList<String>();
		ArrayList<String> PuntuacionPM = new ArrayList<String>();
		ArrayList<String> PuntuacionBM = new ArrayList<String>();
		

		//Eventos
		btnSelJuego.addActionListener(new ActionListener() {
			VentanaInicio VI = new VentanaInicio(500, 500, true);
			public void actionPerformed(ActionEvent arg0) {
				
				VI.setVisible(true);
				VI.setSize(500, 500);
				closeWindow();
			}
		});
		
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Statement st = BDScore.usarCrearTablasBD(Conexion.conectar());
				BDScore.puntosSelect(st, "Tetris", PuntuacionT);
				BDScore.puntosSelect(st, "Pac-Man", PuntuacionPM);
				BDScore.puntosSelect(st, "BomberMan", PuntuacionBM);
				String textoT = " ";
				String textoPM = " ";
				String textoBM = " ";
				for(int t = 0; t < PuntuacionT.size(); t ++) {
					textoT += PuntuacionT.get(t) + "\n";
					textPane.setText(textoT);
				}for(int pm = 0; pm < PuntuacionT.size(); pm ++) {
					textoPM += PuntuacionPM.get(pm) + "\n";
					textPane_1.setText(textoPM);
				}for(int bm = 0; bm < PuntuacionT.size(); bm ++) {
					textoBM += PuntuacionBM.get(bm) + "\n";
					textPane_1.setText(textoBM);
				}
			}
		});
	}
	
	private void closeWindow() {
		this.dispose(); //eliminar el hilo
	}
}
