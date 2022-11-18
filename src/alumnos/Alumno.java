package alumnos;

import Universidad.ElementoAlumno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends ElementoAlumno {
	
	private String nombre;
	private String apellido;
	private int dni;
	private LocalDate fechaNac;
	private ArrayList<String> intereses;


public Alumno (String nombre, String apellido, int dno, LocalDate fechaNac) {

	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.fechaNac = fechaNac;
	ArrayList<String> intreses = new ArrayList<>();
	}

	@Override
	public int cantAlumnos() {
		return 1;
	}
}


