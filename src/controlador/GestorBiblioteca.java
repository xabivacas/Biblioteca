package controlador;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.GestorBBDD;
import Modelo.Libro;
import Vista.*;

public class GestorBiblioteca {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		run();
	}

	private static void run() {
		// Variables
		int select = 0;

		do {

			Menu.mostrarMenuPrincipal();
			select = Integer.parseInt(scan.nextLine());

			switch (select) {

			// Enseñar menuLibros
			case Menu.GESTIONAR_LIBROS:
				GestorLibros.run(scan);
				break;

			// Enseñar menuSocio
			case Menu.GESTIONAR_SOCIOS:
				GestorSocios.run(scan);
				break;

			// Enseñar menuPrestamo
			case Menu.GESTIONAR_PRESTAMOS:
				GestorPrestamos.run(scan);
				break;

			// Salir
			case Menu.SALIR:
				System.out.println("Agur");
				break;

			default:
				System.out.println("Opcion no valida");
			}
		} while (select != 0);
	}
	
	

}
