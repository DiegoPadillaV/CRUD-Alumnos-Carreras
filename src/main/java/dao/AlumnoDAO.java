package dao;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import modelo.Alumno;

public interface AlumnoDAO {
	
	public List<Alumno> findAllAlumnos() throws SQLException, NamingException;
	public Alumno findAllAlumnoByid(int id) throws SQLException, NamingException;
	public void crearAlumno(Alumno alumno) throws SQLException, NamingException;
	public void editarAlumno(Alumno alumno) throws SQLException, NamingException;
	public void eliminarAlumno(int id) throws SQLException, NamingException;
	
}
