package controlador;

import java.util.Scanner;

import Modelo.GestorBBDD;
import Vista.FormularioDeDatos;
import Vista.Menu;
import Vista.Visor;

public class GestorSocios {
	
	private static GestorBBDD gestorBBDD = new GestorBBDD();
	
	public static void run(Scanner scan) {
	
	int select;
	do {
		
		Menu.mostrarMenuSocio();
		select = Integer.parseInt(scan.nextLine());
	
		switch (select) {
	
			// InsertarSocio
			case Menu.INSERTAR_SOCIO:
				insertarSocio();
				break;
		
			// EliminarSocio
			case Menu.ELIMINAR_SOCIO:
				eliminarSocio();
				break;
		
			// ModificarSocio
			case Menu.MODIFICAR_SOCIO:
				modificarSocio();				
				break;
		
			// visualizarSocio
			case Menu.VISUALIZAR_SOCIO:
				visualizarSocio();
				break;
			
			//Buscar un socio
			case Menu.BUSCAR_SOCIO:
				buscarSocio();
				break;
				
			// salir
			case Menu.SALIR:
				System.out.println("");
				break;
			}
	}while(select!=Menu.SALIR);
}
	
	private static void buscarSocio() {
		gestorBBDD.conectar();
		Visor.mostrarObject(gestorBBDD.getSocio(FormularioDeDatos.pedirId()));
		gestorBBDD.cerrar();		
	}

	private static void visualizarSocio() {
		gestorBBDD.conectar();
		Visor.mostrarArray(gestorBBDD.getSocios());
		gestorBBDD.cerrar();
	}

	private static void modificarSocio() {

		int id= FormularioDeDatos.pedirId();
		
		//Pedir un Id y mostrar el socio
		gestorBBDD.conectar();
		Visor.mostrarObject(gestorBBDD.getSocio(id));
		
		//Con esa Id pedir datos y modificar socio
		gestorBBDD.modificarSocio(id,FormularioDeDatos.pedirDatosSocio());
		gestorBBDD.cerrar();
		
	}

	private static void eliminarSocio() {
		gestorBBDD.conectar();
		gestorBBDD.eliminarSocio(FormularioDeDatos.pedirId());
		gestorBBDD.cerrar();
		
	}

	private static void insertarSocio() {
		gestorBBDD.conectar();
		gestorBBDD.insertarSocio(FormularioDeDatos.pedirDatosSocio());
		gestorBBDD.cerrar();
		
	}
}
