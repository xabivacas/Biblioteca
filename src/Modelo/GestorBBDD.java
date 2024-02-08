package Modelo;

import java.util.ArrayList;
import java.sql.*;

public class GestorBBDD extends Conector {

	public void insertarLibro(Libro libro) {
		//TODO
		
	}
	public void eliminarLibro(int id) {
		
	}
	public Libro getLibro(int id) {
		return null;
		
	}
	
	public static ArrayList<Libro> getLibros(){
		
		ArrayList<Libro> libros = new ArrayList<>();
		String sql= "SELECT * FROM libros";
		
		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				Libro l = new Libro();
				
				l.setId(rs.getInt("id"));
				l.setTitulo(rs.getString("titulo"));
				l.setAutor(rs.getString("autor"));
				l.setNum_pag(rs.getInt("num_pag"));
				
				libros.add(l);
			}
		} catch (SQLException e) {
			System.out.println("Peto en getLibros");
			e.printStackTrace();
		}
		
		return libros;
	}
}
