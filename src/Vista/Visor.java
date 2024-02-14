package Vista;
import java.util.ArrayList;

import Modelo.*;

public class Visor {

	
	public static void mostrarLibros(ArrayList<Libro> libros) {
		
		for (Libro l : libros) {
			System.out.println(l);
		}
		
	}
	public static void mostrarLibro(Libro l) {
		System.out.println(l);
	}
}
