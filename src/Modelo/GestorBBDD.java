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
			System.out.println("Peto en insertarLibro");
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
			System.out.println("Peto en eliminarLibro");
			e.printStackTrace();
		}
		
		
	}
	
	public Libro getLibro(int id) {
		Libro libro = new Libro();
		String sql= "SELECT * FROM libros WHERE id=?";
		
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			
			rs.next();
			libro.setId(rs.getInt("id"));
			libro.setTitulo(rs.getString("titulo"));
			libro.setAutor(rs.getString("autor"));
			libro.setNum_pag(rs.getInt("num_pag"));
				
			
		} catch (SQLException e) {
			System.out.println("Peto en getLibro");
			e.printStackTrace();
		}
		return libro;
		
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
	
	public void modificarLibro(int id,Libro l) {
		String sql ="UPDATE libros SET titulo=?,autor=?,num_pag=? WHERE id=?";
		
		try {
			PreparedStatement pst = cn.prepareStatement(sql);
			pst.setString(1, l.getTitulo());
			pst.setString(2, l.getAutor());
			pst.setInt(3, l.getNum_pag());
			pst.setInt(4, id);
			
			pst.execute();
			
		} catch (SQLException e) {
			System.out.println("Peto en modificarLibro");
			e.printStackTrace();
		}
		
		
	}
}
