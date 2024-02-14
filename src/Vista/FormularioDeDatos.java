package Vista;

import java.util.Scanner;

import Modelo.Libro;

public class FormularioDeDatos {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static Libro pedirDatosLibro() {
		Libro l = new Libro();
		
		System.out.println("Titulo:");
		l.setTitulo(scan.nextLine());
		
		System.out.println("Autor:");
		l.setAutor(scan.nextLine());
		
		System.out.println("Numero de paginas:");
		l.setNum_pag(Integer.parseInt(scan.nextLine()));
		
		return l;
	}
	
	public static Libro modificarDatosLibro(Libro libro) {
		return null;
	}
	
	public static int pedirIdLibro() {
		return 0;
	}
	
}
