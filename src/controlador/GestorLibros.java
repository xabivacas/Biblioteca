package controlador;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.GestorBBDD;
import Modelo.Libro;
import Vista.Menu;
import Vista.Visor;

public class GestorLibros {

	public static void run(Scanner scan) {
		Menu.mostrarMenuLibros();
		int select = Integer.parseInt(scan.nextLine());

		switch (select) {

		// InsertarLibro
		case Menu.INSERTAR_LIBRO:
			System.out.println("InsertarLibro");
			break;

		// EliminarLibro
		case Menu.ELIMINAR_LIBROS:
			System.out.println("EliminarLibro");
			break;

		// ModificarLibro
		case Menu.MODIFICAR_LIBROS:
			System.out.println("ModificarLibro");
			break;

		// visualizarLibro
		case Menu.VISUALIZAR_LIBROS:
			ArrayList<Libro> libros = GestorBBDD.getLibros();
			Visor.mostrarLibros(libros);
			break;

		// salir
		case Menu.SALIR:
			System.out.println("");
			select = 9;
			break;
		}
	}
	
}
