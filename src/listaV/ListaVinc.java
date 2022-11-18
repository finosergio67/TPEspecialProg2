package listaV;

import java.util.Comparator;

public class ListaVinc<T> { 
	private Nodo<T> primerNodo;
	private  Comparator<T> orden;
	

	public ListaVinc (Nodo<T> nodo, Comparator<T> orden){
		this.primerNodo = nodo;
		this.orden=orden;
		
	}
	
	
	
	
	public void insertarOrdenado(Nodo<T> nNuevo) {
		
		Nodo<T> nodoNuevo = new Nodo(nNuevo);
		if (this.primerNodo == null) {
			this.primerNodo=nodoNuevo;
		} else {
			Nodo<T> sig = new Nodo();
			Nodo<T> ant = new Nodo();
			sig=primerNodo;
			while(sig.getSiguiente() != null && (this.orden.compare(sig.getValor(),nNuevo.getValor())) > 0) {
				ant=sig;
				sig=sig.getSiguiente();
			}
			if(sig.getSiguiente() == null){
				nNuevo =  sig.getSiguiente();
			} else {
				ant = sig;
				sig = sig.getSiguiente();
				nNuevo = ant.getSiguiente();
				sig = nNuevo.getSiguiente();
			}
		}
		
		
	}
	
	
	
	
}
