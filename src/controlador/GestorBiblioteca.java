package controlador;

import java.util.Scanner;

public class GestorBiblioteca {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		run();
	}
	private static void run() {
		//Variables
			int select=0;
			
			do {
			
				Vista.Menu.mostrarMenuPrincipal();
				select=Integer.parseInt(scan.nextLine());
				
				switch(select) {
				
					//Enseñar menuLibros
					case 1:
						Vista.Menu.mostrarMenuLibros();
						select=Integer.parseInt(scan.nextLine());
						
							switch(select) {
							
								//InsertarLibro
								case 1:
									
								//EliminarLibro
								case 2:
									
								//ModificarLibro
								case 3:
									
								//visualizarLibro
								case 4:
									
							}
							
						break;
					
					//Enseñar menuSocio
					case 2:
						Vista.Menu.mostrarMenuSocio();
						break;
					
					//Enseñar menuPrestamo
					case 3:
						Vista.Menu.mostrarMenuPrestamo();
						break;
					
					//Salir
					case 0:
						System.out.println("Agur");
						break;
						
					default:
						System.out.println("Opcion no valida");
				}
			}while(select!=0);
	}

}
