package Vista;
import java.util.ArrayList;

import Modelo.*;

public class Visor {

	//Libros
	public static void mostrarLibros(ArrayList<Libro> libros) {
		for (Libro l : libros) {
			System.out.println(l);
		}
	}
	
	public static void mostrarLibro(Libro l) {
		System.out.println(l);
	}
	
	//Socios
	public static void mostrarSocios(ArrayList<Socio> socios) {
		for(Socio s : socios) {
			System.out.println(s);
		}
	}
	
	public static void mostrarSocio(Socio s) {
		System.out.println(s);
	}
	
	public static void gestionTerminada() {
		System.out.println("gestion completada");
	}
}
