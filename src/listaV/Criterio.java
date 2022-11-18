package listaV;

import java.util.Comparator;

public abstract class Criterio implements Comparator<Object> {
    public abstract int compare(Object o1, Object O2);
}
