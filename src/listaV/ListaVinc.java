package listaV;

import javax.swing.text.html.HTMLDocument;
import java.util.Comparator;
import java.util.Iterator;

public class ListaVinc<T> implements Iterable {
	private Nodo<T> primerNodo;
	private  Comparator<T> orden;

	public ListaVinc (Nodo<T> nodo, Comparator<T> orden){
		this.primerNodo = nodo;
		this.orden=orden;
		
	}

	public void insertarOrdenado(T nNuevo) {	
		Nodo<T> nodoNuevo = new Nodo(nNuevo);
		if (this.primerNodo == null) {
			this.primerNodo=nodoNuevo;
		} else {
			Nodo<T> aux = this.primerNodo;
			Nodo<T> ant = new Nodo();
			while(aux.getSiguiente() != null && (this.orden.compare(aux.getValor(),nodoNuevo.getValor())) < 0) {
				ant=aux;
				aux=aux.getSiguiente();
			}
			if(aux.getSiguiente() == null)
			{
				if (this.orden.compare(aux.getValor(),nodoNuevo.getValor()) < 0)
					aux.setSiguiente(nodoNuevo);
			} else {
				ant.setSiguiente(nodoNuevo);
				nodoNuevo.setSiguiente(aux);
			}
		}
	}
	
	public void EliminarPosicion(int pos) {
		if(pos==1)
			this.primerNodo = primerNodo.getSiguiente();
		else{
			Nodo<T> aux = this.primerNodo;
			int i = 1; 

			while(aux.getSiguiente() != null && (i+1 < pos)) 
				i++;
			
				if (aux.getSiguiente() != null)
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
				/*else
					System.out.println("Pos excede el tama�o de la Lista");*/
		
		}
	}
	
	public void EliminarOcurrencias(T valor) {
		if(primerNodo.getValor() == valor)
			primerNodo.setSiguiente(primerNodo.getSiguiente());
		Nodo<T> aux = this.primerNodo;
		while(aux.getSiguiente() != null )
				if (aux.getSiguiente().getValor() == valor)
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
		
		}


	@Override
	public Iterator iterator() {
		return new Iterador<T> (primerNodo);
	}
}
