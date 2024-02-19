package controlador;

import java.util.Scanner;

import Modelo.GestorBBDD;
import Vista.FormularioDeDatos;
import Vista.Menu;
import Vista.Visor;

public class GestorPrestamos {
	private static GestorBBDD gestorBBDD = new GestorBBDD();
	
	public static void run(Scanner scan) {
		int select=0;
		
		Vista.Menu.mostrarMenuPrestamo();
		select = Integer.parseInt(scan.nextLine());

		switch (select) {

		// Insertarprestamo
		case Menu.INSERTAR_PRESTAMO:
			gestorBBDD.conectar();
			gestorBBDD.insertarPrestamo(FormularioDeDatos.pedirDatosPrestamo());
			gestorBBDD.cerrar();
			break;

		// EliminarPrestamo
		case Menu.ELIMINAR_PRESTAMO:
			//TODO
			System.out.println("EliminarPrestamo");
			break;

		// ModificarPrestamo
		case Menu.MODIFICAR_PRESTAMO:
			//TODO
			System.out.println("ModificarPrestamo");
			break;

		// visualizarPrestamo
		case Menu.VISUALIZAR_PRESTAMO:
			//TODO
			System.out.println("visualizarPrestamo");
			gestorBBDD.conectar();
			Visor.mostrarArray(gestorBBDD.visualizarPrestamos());
			break;

		// salir
		case Menu.SALIR:
			break;
		}
	}
	
}
