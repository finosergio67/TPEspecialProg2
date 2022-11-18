package alumnos;

public class ComparaAlPorApellido extends ComparaAlumno {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		return(o1.getApellido().compareTo(o2.getApellido()));
	}

}
