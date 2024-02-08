package Modelo;

public class Libro {

	//Atributos
		private int id;
		private String titulo;
		private String autor;
		private int num_pag;
	
	//Getter&Setter
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public int getNum_pag() {
			return num_pag;
		}
		public void setNum_pag(int num_pag) {
			this.num_pag = num_pag;
		}
		@Override
		public String toString() {
			return  id + ", Titulo=" + titulo + ", Autor=" + autor + ", Pag=" + num_pag ;
		}
		
		
		
	
}
