package alumnos;

public class ComparadorCompuesto extends ComparaAlumno {

	private ComparaAlumno c1;
	private ComparaAlumno c2;
	
	
	public ComparadorCompuesto(ComparaAlumno c1,ComparaAlumno c2){
		this.c1= c1;
		this.c2=c2;
		
	}
	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		int aux =  (c1.compare(o1, o2));
		if (aux==0)
			return (c2.compare(o1, o2));
		return aux;
	}

}
