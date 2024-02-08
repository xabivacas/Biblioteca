package Modelo;

import java.util.Date;

public class Prestamo {

	//Atributos
		private Libro libro;
		private Socio socio;
		private Date fecha;
		private boolean devuelto;
	
	//Getter&Setter
		public Libro getLibro() {
			return libro;
		}
		public void setLibro(Libro libro) {
			this.libro = libro;
		}
		public Socio getSocio() {
			return socio;
		}
		public void setSocio(Socio socio) {
			this.socio = socio;
		}
		public Date getFecha() {
			return fecha;
		}
		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}
		public boolean isDevuelto() {
			return devuelto;
		}
		public void setDevuelto(boolean devuelto) {
			this.devuelto = devuelto;
		}
	
	
}
