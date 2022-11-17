package listaV;

import java.util.Iterator;

public class Iterador<T> implements  Iterator<T> {
	
	private Nodo<T> cursor;
	
	
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.cursor != null;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		T valor = cursor.getValor();
		cursor=cursor.getSiguiente();
		return valor;
	}
	

}
