package Vista;

import java.util.Scanner;

import Modelo.Libro;

public class FormularioDeDatos {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static Libro pedirDatosLibro() {
		Libro l = new Libro();
		System.out.println("\n---------------------------");
		System.out.println("Titulo:");
		l.setTitulo(scan.nextLine());
		
		System.out.println("\nAutor:");
		l.setAutor(scan.nextLine());
		
		System.out.println("\nNumero de paginas:");
		l.setNum_pag(Integer.parseInt(scan.nextLine()));
		
		return l;
	}
	
	public static int pedirIdLibro() {
		System.out.println("\nInserte id");
		return Integer.parseInt(scan.nextLine());
	}
	
}
