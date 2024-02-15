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
				insertarLibro();
				break;
	
			// EliminarLibro
			case Menu.ELIMINAR_LIBROS:
				eliminarLibro();
				break;
	
			// ModificarLibro
			case Menu.MODIFICAR_LIBROS:
				modificarLibro();			
				break;
	
			// visualizarLibro
			case Menu.VISUALIZAR_LIBROS:
				visualizarLibros();		
				break;
				
			//Buscar un libro en concreto
			case Menu.BUSCAR_LIBRO:
				buscarLibro();			
			
			break;
			// salir
			case Menu.SALIR:
				System.out.println("Agur");
				break;
			}
		}while(select!=Menu.SALIR);
	}

	private static void insertarLibro() {
		gestorBBDD.conectar();
		gestorBBDD.insertarLibro(FormularioDeDatos.pedirDatosLibro());
		gestorBBDD.cerrar();
	}
	
	private static void eliminarLibro() {
		gestorBBDD.conectar();
		gestorBBDD.eliminarLibro(FormularioDeDatos.pedirId());
		gestorBBDD.cerrar();
	}
	
	private static void modificarLibro() {
		int id=FormularioDeDatos.pedirId();
		
		gestorBBDD.conectar();
		Visor.mostrarObject(gestorBBDD.getLibro(id));
		
		gestorBBDD.modificarLibro(id, FormularioDeDatos.pedirDatosLibro());
		gestorBBDD.cerrar();
	}
	
	private static void visualizarLibros() {
		gestorBBDD.conectar();
		ArrayList<Object> libros = gestorBBDD.getLibros();
		Visor.mostrarArray(libros);
		gestorBBDD.cerrar();
	}
	
	private static void buscarLibro() {
		gestorBBDD.conectar();
		Visor.mostrarObject(gestorBBDD.getLibro(FormularioDeDatos.pedirId()));
		gestorBBDD.cerrar();
	}
	
	
}
