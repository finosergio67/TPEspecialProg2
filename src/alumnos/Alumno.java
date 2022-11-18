package alumnos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Alumno {
	
	private String nombre;
	private String apellido;
	private int dni;
	private LocalDate fechaNac;
	private ArrayList<String> intereses;


public Alumno (String nombre, String apellido, int dno, LocalDate fechaNac) {
	
	this.nombre=nombre;
	this.apellido= apellido;
	this.dni=dni;
	this.fechaNac=fechaNac;
	ArrayList<String> intreses= new ArrayList<>();
	
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}


public int getDni() {
	return dni;
}


public void setDni(int dni) {
	this.dni = dni;
}


public LocalDate getFechaNac() {
	return fechaNac;
}


public void setFechaNac(LocalDate fechaNac) {
	this.fechaNac = fechaNac;
}


	
}


