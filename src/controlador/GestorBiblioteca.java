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
				Vista.Menu.mostrarMenuPrestamo();
				select = Integer.parseInt(scan.nextLine());

				switch (select) {

				// Insertarprestamo
				case Menu.INSERTAR_PRESTAMO:
					System.out.println("Insertarprestamo");
					break;

				// EliminarPrestamo
				case Menu.ELIMINAR_PRESTAMO:
					System.out.println("EliminarPrestamo");
					break;

				// ModificarPrestamo
				case Menu.MODIFICAR_PRESTAMO:
					System.out.println("ModificarPrestamo");
					break;

				// visualizarPrestamo
				case Menu.VISUALIZAR_PRESTAMO:
					System.out.println("visualizarPrestamo");
					break;

				// salir
				case Menu.SALIR:
					System.out.println("");
					select = 9;
					break;
				}
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
