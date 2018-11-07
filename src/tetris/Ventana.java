package tetris;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	public Ventana(String nombre, Dibujo dibujo) {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(nombre);
		//this.setSize(600, 600);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.add(dibujo);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
