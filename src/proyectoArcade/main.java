package proyectoArcade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import proyectoArcade.ventana.VentanaInicio;

public class main {
	
	static int altura;
	static int anchura;
	static boolean mutear;
	static String texto;
	
	public static void leerFichero() {
	File aFicheroLectura = new File("src/Ficheros/Opciones.txt");
	try {
		FileReader fr = new FileReader(aFicheroLectura);
		BufferedReader br = new BufferedReader(fr);
		String linea = br.readLine();
		texto = linea+"\n";
		while(linea != null) {
			if(linea.contains("X")) {
			String[] num = linea.split("X");
			anchura = Integer.parseInt(num[0]);
			altura = Integer.parseInt(num[1]);
			}linea = br.readLine();
			if(linea.equals("false")) {
				mutear = false;
			}if(linea.equals("true")) {
				mutear = true;
			}linea = br.readLine();
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
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leerFichero();
		VentanaInicio VI = new VentanaInicio(anchura, altura, mutear);
		VI.setSize(anchura, altura);
		VI.setVisible(true);
	}

}
