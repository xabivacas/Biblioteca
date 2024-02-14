package Modelo;

import java.util.ArrayList;
import java.sql.*;

public class GestorBBDD extends Conector {

	public void insertarLibro(Libro libro) {
		String sql ="INSERT INTO libros (titulo,autor,num_pag) VALUES (?,?,?) ";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, libro.getTitulo());
			pst.setString(2, libro.getAutor());
			pst.setInt(3, libro.getNum_pag());
			
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void eliminarLibro(int id) {
		String sql ="DELETE FROM libros WHERE id=?";
		 
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setInt(1, id);
			
			pst.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	public Libro getLibro(int id) {
		//TODO
		return null;
		
	}
	
	public  ArrayList<Libro> getLibros(){
		
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
