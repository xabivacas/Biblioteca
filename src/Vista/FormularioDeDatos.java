package Vista;

import java.util.Scanner;

import Modelo.*;

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
	
	public static int pedirId() {
		System.out.println("\nInserte id");
		return Integer.parseInt(scan.nextLine());
	}
	
	public static Socio pedirDatosSocio() {
		
		Socio s = new Socio();
		
		System.out.println("\n---------------------------");
		System.out.print("Nombre:");
		s.setNombre(scan.nextLine());
		
		System.out.print("\nApellido:");
		s.setApellido(scan.nextLine());
		
		System.out.print("\nDireccion:");
		s.setDireccion(scan.nextLine());
		
		System.out.print("\nPoblacion:");
		s.setPoblacion(scan.nextLine());
		
		System.out.println("\nProvincia:");
		s.setProvincia(scan.nextLine());
		
		System.out.println("\nDNI:");
		s.setDni(scan.nextLine());
		
		return s;
	}
}
