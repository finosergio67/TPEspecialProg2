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

	
	public void setOrden(Comparator<T> orden) {
		this.orden=orden;
		reordenar();
	}
	
	

	public void insertarOrdenado(Nodo<T> nNuevo) {
		
		Nodo<T> nodoNuevo = new Nodo<T>(nNuevo.getValor());
		
		Nodo<T> aux = this.primerNodo;
		Nodo<T> ant = new Nodo();
		if (this.primerNodo == null || (this.orden.compare(primerNodo.getValor(),nodoNuevo.getValor()) > 0)) {
			aux=primerNodo;
			this.primerNodo=nodoNuevo;
			nodoNuevo.setSiguiente(aux);
		} else {
				while(aux.getSiguiente() != null && (this.orden.compare(aux.getValor(),nodoNuevo.getValor())) < 0) {
				ant=aux;
				aux=aux.getSiguiente();
			}
			if(aux.getSiguiente() == null)
			{
				if (this.orden.compare(aux.getValor(),nodoNuevo.getValor()) < 0) {
					aux.setSiguiente(nodoNuevo);
				} else {
			
					ant.setSiguiente(nodoNuevo);
					nodoNuevo.setSiguiente(aux);
					} 
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

			while(aux.getSiguiente() != null && (i+1 < pos)) {
				i++;
				aux= aux.getSiguiente();
			}
				if (aux.getSiguiente() != null)
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
				else
					System.out.println("Posicion excede el tamaño de la Lista");
		
		}
	}
	
	public void EliminarOcurrencias(T valor) {
		
		
		Nodo<T> aux = this.primerNodo;
		if(	this.orden.compare(valor, aux.getValor()) == 0) 
			primerNodo=primerNodo.getSiguiente();
		while(aux.getSiguiente() != null ) {
			int res = this.orden.compare(valor, aux.getSiguiente().getValor());
			if ( res == 0)
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
				aux=aux.getSiguiente();
		}
//<<<<<<< HEAD
	}

	
	
	public void reordenar() {
		Nodo<T> aux;
		aux= primerNodo;
		primerNodo=null;
		while (aux != null){
			insertarOrdenado(aux);  // getvalor
			aux=aux.getSiguiente();
			
		}
	}
	
	public int primerOcurrencia(T valor) {
		Nodo<T> aux = this.primerNodo;
		System.out.println(valor);
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
		System.out.println(valor + "  no se encuentra");
		return -1;
	}
	
	
	public void recorrer() {
		Nodo<T> aux = this.primerNodo;
		while (aux!= null) {
			System.out.println(" ---  " + aux.getValor());
			aux=aux.getSiguiente();

		}
	}		

	
	
	@Override
	public Iterator iterator() {
		return new Iterador<T> (primerNodo);

	}
	
	
	
	
	
}

