package Universidad;

import listaV.ListaVinc;

import java.util.ArrayList;

public class GrupoAlumnos extends ElementoAlumno{

    private String nombre;
    private ListaVinc<ElementoAlumno> grupos;

    @Override
    public int cantAlumnos() {
        int aux = 0;
        for (Object o : grupos)
        {
            ElementoAlumno e = (ElementoAlumno) o;
            aux += e.cantAlumnos();
        }
        return aux;
    }

}
