package Vista;
import java.util.ArrayList;

import Modelo.*;

public class Visor {

	//Libros
	public static void mostrarArray(ArrayList<Object> objetos) {
		for (Object o : objetos) {
			System.out.println(o);
		}
	}
	
	public static void mostrarObject(Object o) {
		System.out.println(o);
	}
	
	public static void gestionTerminada() {
		System.out.println("Gestion completada");
	}
}
