package tetris;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	public Ventana(String nombre, Dibujo dibujo, int ancho, int alto) {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(nombre);
		this.setIconImage(dibujo.imagen.cargarImagen("tetris-icon", ".jpg"));
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		this.add(dibujo);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
