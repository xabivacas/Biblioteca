package controlador;

import java.util.Scanner;
import Vista.*;

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
											System.out.println("InsertarLibro");
											break;
										
									//EliminarLibro
										case 2:
											System.out.println("EliminarLibro");
											break;
										
									//ModificarLibro
										case 3:
											System.out.println("ModificarLibro");
											break;
										
									//visualizarLibro
										case 4:
											System.out.println("visualizarLibro");
											break;
										
									//salir
										case 0:
											System.out.println("");
											select=9;
											break;
								}
							
								break;
					
					//Enseñar menuSocio
						case 2:
							Vista.Menu.mostrarMenuSocio();
							select=Integer.parseInt(scan.nextLine());
							
							switch(select) {
							
								//InsertarSocio
									case 1:
										System.out.println("InsertarSocio");
										break;
									
								//EliminarSocio
									case 2:
										System.out.println("EliminarSocio");
										break;
									
								//ModificarSocio
									case 3:
										System.out.println("ModificarSocio");
										break;
									
								//visualizarSocio
									case 4:
										System.out.println("visualizarSocio");
										break;
									
								//salir
									case 0:
										System.out.println("");
										select=9;
										break;
								}
								break;
					
					//Enseñar menuPrestamo
						case 3:
							Vista.Menu.mostrarMenuPrestamo();
							select=Integer.parseInt(scan.nextLine());
							
							switch(select) {
							
								//Insertarprestamo
									case 1:
										System.out.println("Insertarprestamo");
										break;
									
								//EliminarPrestamo
									case 2:
										System.out.println("EliminarPrestamo");
										break;
									
								//ModificarPrestamo
									case 3:
										System.out.println("ModificarPrestamo");
										break;
									
								//visualizarPrestamo
									case 4:
										System.out.println("visualizarPrestamo");
										break;
									
								//salir
									case 0:
										System.out.println("");
										select=9;
										break;
								}	
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
