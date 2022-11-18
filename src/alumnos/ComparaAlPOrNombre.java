package alumnos;

public class ComparaAlPOrNombre extends ComparaAlumno {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		// TODO Auto-generated method stub
		return (o1.getNombre().compareTo(o2.getNombre()));
	}

}
