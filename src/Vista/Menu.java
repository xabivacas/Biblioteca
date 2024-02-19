package Vista;

public class Menu {
	//Opciones del menu
	
		//MenuPrincipal
			public static final int GESTIONAR_LIBROS=1;
			public static final int GESTIONAR_SOCIOS=2;
			public static final int GESTIONAR_PRESTAMOS=3;
			public static final int SALIR=0;
		
		//MenuLibros
			public static final int INSERTAR_LIBRO=1;
			public static final int ELIMINAR_LIBROS=2;
			public static final int MODIFICAR_LIBROS=3;
			public static final int VISUALIZAR_LIBROS=4;
			public static final int BUSCAR_LIBRO=5;
			
		//MenuSocio
			public static final int INSERTAR_SOCIO=1;
			public static final int ELIMINAR_SOCIO=2;
			public static final int MODIFICAR_SOCIO=3;
			public static final int VISUALIZAR_SOCIO=4;
			public static final int BUSCAR_SOCIO=5;
			
		//MenuPrestamo
			public static final int INSERTAR_PRESTAMO=1;
			public static final int ELIMINAR_PRESTAMO=2;
			public static final int MODIFICAR_PRESTAMO=3;
			public static final int VISUALIZAR_PRESTAMO=4;

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
		System.out.println(INSERTAR_LIBRO+"-Insertar libros");
		System.out.println(ELIMINAR_LIBROS+"-Eliminar libros");
		System.out.println(MODIFICAR_LIBROS+"-Modificar libros");
		System.out.println(VISUALIZAR_LIBROS+"-Visualizar libros");
		System.out.println(BUSCAR_LIBRO+"-Buscar libro");


	}
	
	public static void mostrarMenuSocio() {
		
		System.out.println("\n----Menu Socio----");
		System.out.println(SALIR+"-Salir");
		System.out.println(INSERTAR_SOCIO+"-Insertar Socio");
		System.out.println(ELIMINAR_SOCIO+"-Eliminar Socio");
		System.out.println(MODIFICAR_SOCIO+"-Modificar Socio");
		System.out.println(VISUALIZAR_SOCIO+"-Visualizar Socio");
		System.out.println(BUSCAR_SOCIO+"-Buscar Socio");
	}
	
	public static void mostrarMenuPrestamo() {
		
		System.out.println("\n----Menu Prestamo----");
		System.out.println(SALIR+"-Salir");
		System.out.println(INSERTAR_PRESTAMO+"-Insertar prestamo");
		System.out.println(ELIMINAR_PRESTAMO+"-Eliminar prestamo");
		System.out.println(MODIFICAR_PRESTAMO+"-Modificar prestamo");
		System.out.println(VISUALIZAR_PRESTAMO+"-Visualizar prestamo");
	}
}
