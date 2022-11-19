package listaV;

import java.util.Iterator;

public class Iterador<T> implements  Iterator {
	private Nodo<T> cursor;

	public Iterador(Nodo<T> inicio) {
		this.cursor = inicio;
	}

	@Override
	public boolean hasNext() {
		return this.cursor != null;
	}

	@Override
	public T next() {
		T valor  = cursor.getValor();
		cursor = cursor.getSiguiente();
		return valor;
	}
}
