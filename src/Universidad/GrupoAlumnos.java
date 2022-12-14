package Universidad;

import listaV.ListaVinc;
import listaV.Nodo;
import listaV.comparaAlumnosCantidad;

import java.util.ArrayList;
import java.util.Comparator;

public class GrupoAlumnos extends ElementoAlumno{
    

    private String nombre;
    private ListaVinc<ElementoAlumno> grupos;

    public GrupoAlumnos(String nombre) {
        this.nombre = nombre;
        grupos = new ListaVinc<ElementoAlumno>(null, new comparaAlumnosCantidad());
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

    @Override
    public void imprimir() {
        System.out.println("   " + this.nombre);
        for (Object o : grupos) {
            ElementoAlumno e = (ElementoAlumno) o;
            e.imprimir();
        }
    }


}
