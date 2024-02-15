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
		int select;
		
		do {
			Menu.mostrarMenuLibros();
			select = Integer.parseInt(scan.nextLine());
			switch (select) {
	
			// InsertarLibro
			case Menu.INSERTAR_LIBRO:
				
				gestorBBDD.conectar();
				gestorBBDD.insertarLibro(FormularioDeDatos.pedirDatosLibro());
				gestorBBDD.cerrar();
				
				break;
	
			// EliminarLibro
			case Menu.ELIMINAR_LIBROS:
				
				gestorBBDD.conectar();
				gestorBBDD.eliminarLibro(FormularioDeDatos.pedirId());
				gestorBBDD.cerrar();
				
				break;
	
			// ModificarLibro
			case Menu.MODIFICAR_LIBROS:
				
				int id=FormularioDeDatos.pedirId();
				
				gestorBBDD.conectar();
				Visor.mostrarLibro(gestorBBDD.getLibro(id));
				gestorBBDD.modificarLibro(id, FormularioDeDatos.pedirDatosLibro());
				gestorBBDD.cerrar();
				break;
	
			// visualizarLibro
			case Menu.VISUALIZAR_LIBROS:
				
				gestorBBDD.conectar();
				ArrayList<Libro> libros = gestorBBDD.getLibros();
				Visor.mostrarLibros(libros);
				gestorBBDD.cerrar();
				
				break;
				
			//Buscar un libro en concreto
			case Menu.BUSCAR_LIBRO:
				
				gestorBBDD.conectar();
				Visor.mostrarLibro(gestorBBDD.getLibro(FormularioDeDatos.pedirId()));
				gestorBBDD.cerrar();
			
			break;
			// salir
			case Menu.SALIR:
				System.out.println("Agur");
				break;
			}
		}while(select!=Menu.SALIR);
	}
	
}
