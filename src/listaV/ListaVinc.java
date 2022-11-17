package listaV;

import java.util.Comparator;

public class ListaVinc<T> { 
	private Nodo<T> primerNodo;
	private  Comparator<T> orden;
	

	public ListaVinc (Nodo<T> nodo, Comparator<T> orden){
		this.primerNodo = nodo;
		this.orden=orden;
		
	}
	
	
	
}
