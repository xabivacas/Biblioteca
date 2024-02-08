package Vista;

public class Menu {
	//Opciones del menu
	
		//MenuPrincipal
			private static final int GESTIONAR_LIBROS=1;
			private static final int GESTIONAR_SOCIOS=2;
			private static final int GESTIONAR_PRESTAMOS=3;
			private static final int SALIR=0;
		
		//MenuLibros
			private static final int INSERTAR_LIBROS=1;
			private static final int ELIMINAR_LIBROS=2;
			private static final int MODIFICAR_LIBROS=3;
			private static final int VISUALIZAR_LIBROS=4;
			
		//MenuSocio
			private static final int INSERTAR_PRESTAMO=1;
			private static final int ELIMINAR_PRESTAMO=2;
			private static final int MODIFICAR_PRESTAMO=3;
			private static final int VISUALIZAR_PRESTAMO=4;

	public static void mostrarMenuPrincipal() {
		
		System.out.println("\n----Menu Principal----");
		System.out.println(SALIR+"-Salir");
		System.out.println(GESTIONAR_LIBROS+"-Gestionar Libros");
		System.out.println(GESTIONAR_SOCIOS+"-Gestionar Socios");
		System.out.println(GESTIONAR_PRESTAMOS+"-Gestionar Prestamo");
		
	}
	
	public static void mostrarMenuLibros() {
		
		System.out.println("\n----Menu Libros----");
		System.out.println(SALIR+"-Salir");
		System.out.println(INSERTAR_LIBROS+"-Insertar libros");
		System.out.println(ELIMINAR_LIBROS+"-Eliminar libros");
		System.out.println(MODIFICAR_LIBROS+"-Modificar libros");
		System.out.println(VISUALIZAR_LIBROS+"-Visualizar libros");

	}
	
	public static void mostrarMenuSocio() {
		
		System.out.println("\n----Menu Socio----");
		System.out.println(SALIR+"-Salir");
		System.out.println(INSERTAR_PRESTAMO+"-Insertar Socio");
		System.out.println(ELIMINAR_PRESTAMO+"-Eliminar Socio");
		System.out.println(MODIFICAR_PRESTAMO+"-Modificar Socio");
		System.out.println(VISUALIZAR_PRESTAMO+"-Visualizar Socio");
	}
	
	public static void mostrarMenuPrestamo() {
		
		System.out.println("\n----Menu Socio----");
		System.out.println(SALIR+"-Salir");
		System.out.println(INSERTAR_PRESTAMO+"-Insertar prestamo");
		System.out.println(ELIMINAR_PRESTAMO+"-Eliminar prestamo");
		System.out.println(MODIFICAR_PRESTAMO+"-Modificar prestamo");
		System.out.println(VISUALIZAR_PRESTAMO+"-Visualizar prestamo");
	}
}
