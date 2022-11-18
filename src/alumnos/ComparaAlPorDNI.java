package alumnos;

public class ComparaAlPorDNI extends ComparaAlumno {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		return (o1.getDni() - o2.getDni());
	}

}
