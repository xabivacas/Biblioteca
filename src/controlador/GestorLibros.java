package controlador;

import java.util.ArrayList;
import java.util.Scanner;
import Vista.*;
import Modelo.GestorBBDD;
import Modelo.Libro;
import Vista.Menu;
import Vista.Visor;

public class GestorLibros {

	private static GestorBBDD gestorBBDD = new GestorBBDD();
	
	public static void run(Scanner scan) {
		Menu.mostrarMenuLibros();
		int select = Integer.parseInt(scan.nextLine());

		switch (select) {

		// InsertarLibro
		case Menu.INSERTAR_LIBRO:
			gestorBBDD.conectar();
			gestorBBDD.insertarLibro(FormularioDeDatos.pedirDatosLibro());
			gestorBBDD.cerrar();
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
			
			gestorBBDD.conectar();
			ArrayList<Libro> libros = gestorBBDD.getLibros();
			Visor.mostrarLibros(libros);
			gestorBBDD.cerrar();
			
			break;
			
		// salir
		case Menu.SALIR:
			System.out.println("");
			select = 9;
			break;
		}
	}
	
}
