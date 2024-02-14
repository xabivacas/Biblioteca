package controlador;

import java.util.Scanner;

import Modelo.GestorBBDD;
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
		System.out.println("InsertarSocio");
		break;

	// EliminarSocio
	case Menu.ELIMINAR_SOCIO:
		System.out.println("EliminarSocio");
		break;

	// ModificarSocio
	case Menu.MODIFICAR_SOCIO:
		System.out.println("ModificarSocio");
		break;

	// visualizarSocio
	case Menu.VISUALIZAR_SOCIO:
		
		gestorBBDD.conectar();
		Visor.mostrarSocios(gestorBBDD.getSocios());
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
