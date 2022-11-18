package listaV;

import Universidad.ElementoAlumno;

import java.util.Comparator;

public class comparaAlumnosCantidad implements Comparator<ElementoAlumno> {

    @Override
    public int compare(ElementoAlumno e1, ElementoAlumno e2) {
        return e1.cantAlumnos() - e2.cantAlumnos();
    }
}