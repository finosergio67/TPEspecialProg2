package listaV;


import java.util.Comparator;
import Universidad.GrupoAlumnos;
import Universidad.ElementoAlumno;
import alumnos.Alumno;


public class Pruebai {

    

    public static void main(String[] args) {
    Comparator orden = new comparaAlumnosCantidad();
    ListaVinc<ElementoAlumno> lista = new ListaVinc<ElementoAlumno>(null,orden);
    GrupoAlumnos unicen = new GrupoAlumnos("unicen");
    GrupoAlumnos humanas = new GrupoAlumnos("humanas");
    GrupoAlumnos exactas = new GrupoAlumnos("exactas");
    GrupoAlumnos historia = new GrupoAlumnos("Historia");
    unicen.addElemento(exactas);
    unicen.addElemento(humanas);
    String [] interesesJhon = {"intercambio"};
    Alumno John = new Alumno("Jhon","Doe",120000, interesesJhon);
    unicen.addElemento(John);
    String [] interesesMora = {"psicologia","Freud"};
    Alumno mora = new Alumno("Mora", "Diaz", 37124445, interesesMora);
    humanas.addElemento(historia);
    humanas.addElemento(mora);
    String [] interesesRoman = {"Argentina"};
    Alumno Roman = new Alumno("Roman","Bazan",32555111, interesesRoman);
    String [] interesesMartin = {"romanos","egipcios","griegos"};
    Alumno Martin = new Alumno("Martin","Gomez",34111222, interesesMartin);
    String [] interesesFlora = {"historia","antigua"};
    Alumno Flora = new Alumno("Flora", "Rivas", 34555111, interesesFlora);
    String [] interesesJuana = {"programacion","php","java"};
    Alumno Juana = new Alumno("Juana","Garcia",27123455, interesesJuana);
    String [] interesesFede = {"redes","php","java","python"};
    Alumno Fede = new Alumno("Federico","Lopez",35999888, interesesFede);
    historia.addElemento(Roman);
    historia.addElemento(Martin);
    historia.addElemento(Flora);
    exactas.addElemento(Juana);
    exactas.addElemento(Fede);
    GrupoAlumnos Olimpiadas = new GrupoAlumnos("OlimpiadasMatematica");
    GrupoAlumnos fibo = new GrupoAlumnos("fibo");
    GrupoAlumnos Matea2 = new GrupoAlumnos("Matea2");
    String [] interesesJuan = {"sucesiones","algebra"};
    Alumno Juan = new Alumno("Juan","Juarez",332224444, interesesJuan);
    String [] interesesJulio = {"sucesiones","algebra"};
    Alumno Julio = new Alumno("Julio","Cesar",33222111, interesesJulio);
    String [] interesesBernardino = {"matematicas"};
    Alumno Bernardino = new Alumno("Bernardino","Rivas",30987654, interesesBernardino);
    String [] interesesJose = {"problemas"};
    Alumno Jose = new Alumno("Jose","Paso",33322112, interesesJose);
    String [] interesesIsaac = {"sucesiones"};
    Alumno Isaac = new Alumno("Isaac","Newton",12343565, interesesIsaac);
    Olimpiadas.addElemento(Matea2);
    Olimpiadas.addElemento(fibo);
    Matea2.addElemento(Juan);
    Matea2.addElemento(Julio);
    fibo.addElemento(Bernardino);
    fibo.addElemento(Jose);
    fibo.addElemento(Isaac);
    lista.insertarOrdenado(new Nodo<ElementoAlumno>(humanas));
    lista.insertarOrdenado(new Nodo<ElementoAlumno>(unicen));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (exactas));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (historia));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (John));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (mora));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Flora));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Roman));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Martin));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Flora));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Fede));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Juan));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Olimpiadas));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (fibo));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Isaac));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Jose));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Julio));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Bernardino));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Matea2));
    lista.insertarOrdenado(new Nodo<ElementoAlumno> (Juan));
    }
}