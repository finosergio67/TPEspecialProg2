package listaV;


import java.util.Comparator;
import Universidad.GrupoAlumnos;
import Universidad.ElementoAlumno;
import alumnos.Alumno;


public class Pruebai {

    Comparator orden = new comparaAlumnosCantidad();
    Nodo<ElementoAlumno> primero = new Nodo<ElementoAlumno>();
    ListaVinc<ElementoAlumno> lista = new ListaVinc<ElementoAlumno>(primero,orden);
    GrupoAlumnos unicen = new GrupoAlumnos("unicen");
    GrupoAlumnos humanas = new GrupoAlumnos("humanas");
    GrupoAlumnos exactas = new GrupoAlumnos("exactas");
    GrupoAlumnos Historia = new GrupoAlumnos("Historia");
    unicen.addElemento(exactas);
    unicen.addElemento(humanas);
    String [] interesesJhon = {"intercambio"};
    Alumno John = new Alumno("Jhon","Doe",120000, interesesJhon);
    unicen.addElemento(Jhon);
    String [] interesesMora = {"psicologia","Freud"};
    Alumno Mora = new Alumno("Mora", "Diaz", 37124445, interesesMora);
    humanas.addElemento(historia)
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
    GrupoAlumnos fibo = new GrupoAlumnos("LosFibo");
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
    Olimpiadas.addElemento(LosFibo);
    Matea2.addElemento(Juan);
    Matea2.addElemento(Julio);
    LosFibo.addElemento(Bernardino);
    LosFibo.addElemento(Jose);
    LosFibo.addElemento(Isaac);
    lista.addElemento(unicen);
    lista.addElemento(humanas);
    lista.addElemento(exactas);
    lista.addElemento(historia);
    lista.addElemento(Jhon);
    lista.addElemento(Mora);
    lista.addElemento(Rivas);
    lista.addElemento(Roman);
    lista.addElemento(Martin);
    lista.addElemento(Flora);
    lista.addElemento(Fede);
    lista.addElemento(Juana);
    lista.addElemento(Olimpiadas);
    lista.addElemento(LosFibo);
    lista.addElemento(Isaac);
    lista.addElemento(Jose)
    lista.addElemento(Julio);
    lista.addElemento(Bernardino);
    lista.addElemento(Matea2);
    lista.addElemento(Juan);

}