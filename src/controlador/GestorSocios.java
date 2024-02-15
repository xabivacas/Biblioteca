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
		
	Menu.mostrarMenuSocio();
	select = Integer.parseInt(scan.nextLine());

	switch (select) {

		// InsertarSocio
		case Menu.INSERTAR_SOCIO:
			
			gestorBBDD.conectar();
			gestorBBDD.insertarSocio(FormularioDeDatos.pedirDatosSocio());
			gestorBBDD.cerrar();
			
			break;
	
		// EliminarSocio
		case Menu.ELIMINAR_SOCIO:
			//TODO
			System.out.println("EliminarSocio");
			break;
	
		// ModificarSocio
		case Menu.MODIFICAR_SOCIO:
			//TODO
			System.out.println("ModificarSocio");
			break;
	
		// visualizarSocio
		case Menu.VISUALIZAR_SOCIO:
			
			gestorBBDD.conectar();
			Visor.mostrarSocios(gestorBBDD.getSocios());
			gestorBBDD.cerrar();
			break;
		
		//Buscar un socio
		case Menu.BUSCAR_SOCIO:
			
			gestorBBDD.conectar();
			Visor.mostrarSocio(gestorBBDD.getSocio(FormularioDeDatos.pedirId()));
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
