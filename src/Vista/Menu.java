package Vista;

public class Menu {
	//Opciones del menu
	
		//MenuPrincipal
			static final int GESTIONAR_LIBROS=1;
			static final int GESTIONAR_SOCIOS=2;
			static final int GESTIONAR_PRESTAMOS=3;
			static final int SALIR=0;
		
		//MenuLibros
			static final int INSERTAR_LIBROS=1;
			static final int ELIMINAR_LIBROS=2;
			static final int MODIFICAR_LIBROS=3;
			static final int VISUALIZAR_LIBROS=4;
			
		//MenuSocio
			static final int INSERTAR_PRESTAMO=1;
			static final int ELIMINAR_PRESTAMO=2;
			static final int MODIFICAR_PRESTAMO=3;
			static final int VISUALIZAR_PRESTAMO=4;

	public static void mostrarMenuPrincipal() {
		
		System.out.println("----Menu Principal----");
		System.out.println(SALIR+"-Salir");
		System.out.println(GESTIONAR_LIBROS+"Gestionar Libros");
		System.out.println(GESTIONAR_SOCIOS+"Gestionar Socios");
		System.out.println(GESTIONAR_PRESTAMOS+"Gestionar Prestamo");
		
	}
}
