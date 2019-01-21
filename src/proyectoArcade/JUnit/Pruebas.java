package proyectoArcade.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import proyectoArcade.clasesBase.PiezaoPersonaje;

class Pruebas {

	@Test
	void detectarMuro() {
		ArrayList<PiezaoPersonaje> muros = new ArrayList<>();
		PiezaoPersonaje PM = new PiezaoPersonaje(2, 2);
		PiezaoPersonaje M = new PiezaoPersonaje(1, 2);
		PiezaoPersonaje M2 = new PiezaoPersonaje(3, 2);
		PiezaoPersonaje M3 = new PiezaoPersonaje(2, 3);
		PiezaoPersonaje M4 = new PiezaoPersonaje(2, 1);
		
		muros.add(M); muros.add(M2); muros.add(M3); muros.add(M4);
		
		assertTrue(comprobarSiguiente("derecha", muros, PM.getCoorX(), PM.getCoorY()));
		assertTrue(comprobarSiguiente("izquierda", muros, PM.getCoorX(), PM.getCoorY()));
		assertTrue(comprobarSiguiente("arriba", muros, PM.getCoorX(), PM.getCoorY()));
		//Para probar que da error, si se quita el + 1 da correcto.
		assertTrue(comprobarSiguiente("abajo", muros, PM.getCoorX(), PM.getCoorY()+ 1));
	}

	public boolean comprobarSiguiente(String direccion, ArrayList<PiezaoPersonaje> list, int x, int y) {
		boolean b = false;
		if (direccion.equals("derecha")){
			for(int muro = 0; muro< list.size(); muro ++) {
				if(x + 1 == list.get(muro).getCoorX() && y == list.get(muro).getCoorY()) {
					b = true;
					return b;
				}
			}
		}if (direccion.equals("izquierda")){
			for(int muro = 0; muro< list.size(); muro ++) {
				if(x - 1 == list.get(muro).getCoorX() && y == list.get(muro).getCoorY()) {
					b = true;
					return b;
				}
			}
		}if (direccion.equals("arriba")){
			for(int muro = 0; muro< list.size(); muro ++) {
				if(x == list.get(muro).getCoorX() && y - 1 == list.get(muro).getCoorY()) {
					b = true;
					return b;
				}
			}
		}if (direccion.equals("abajo")){
			for(int muro = 0; muro< list.size(); muro ++) {
				if(x == list.get(muro).getCoorX() && y + 1== list.get(muro).getCoorY()) {
					b = true;
					return b;
				}
			}
		}return b;
	}
}
