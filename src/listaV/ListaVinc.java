package listaV;

import java.util.Comparator;

public class ListaVinc<T> { 
	private Nodo<T> primerNodo;
	private  Comparator<T> orden;
	

	public ListaVinc (Nodo<T> nodo, Comparator<T> orden){
		this.primerNodo = nodo;
		this.orden=orden;
		
	}
	
	public void setOrden(Comparator<T> orden) {
		this.orden=orden;
		reordenar();
	}
	
	
	public void insertarOrdenado(T nNuevo) {	
		Nodo<T> nodoNuevo = new Nodo<T>(nNuevo);
		if (this.primerNodo == null) {
			this.primerNodo=nodoNuevo;
		} else {
			Nodo<T> aux = this.primerNodo;
			Nodo<T> ant = new Nodo<T>();
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
					System.out.println("Pos excede el tamaño de la Lista");*/
		
		}
	}
	
	public void EliminarOcurrencias(T valor) {
		if(primerNodo.getValor() == valor)
			primerNodo.setSiguiente(primerNodo.getSiguiente());
		Nodo<T> aux = this.primerNodo;
		while(aux.getSiguiente() != null ) {
			int res = this.orden.compare(valor, aux.getValor());
				if ( res == 0)
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
		}
	}

	
	
	public void reordenar() {
		Nodo<T> aux;
		aux= primerNodo;
		primerNodo=null;
		while (aux != null){
			insertarOrdenado(aux.getValor());
			aux=aux.getSiguiente();
			
		}
	}
	
	public int primerOcurrencia(T valor) {
		Nodo<T> aux = this.primerNodo;
		int i=1;
		while (aux != null) {
			int res = this.orden.compare(valor, aux.getValor());
			if ( res == 0)
				return i;
			else {
				aux=aux.getSiguiente();
				i++;
				}		
			}
		return 0;
	}
	
	
	public void recorrer() {
		Nodo<T> aux = this.primerNodo;
		while (aux!= null) {
			aux=aux.getSiguiente();
			System.out.println("Nodo" + aux.getValor());
		}
			
	}
}
