package Universidad;

import listaV.ListaVinc;
import listaV.Nodo;

import java.util.ArrayList;

public class GrupoAlumnos extends ElementoAlumno{

    private String nombre;
    private ListaVinc<ElementoAlumno> grupos;

    public GrupoAlumnos(String nombre) {
        this.nombre = nombre;
    }

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

    public void addElemento(ElementoAlumno e){
        grupos.insertarOrdenado(new Nodo<ElementoAlumno>(e));
    }
}
