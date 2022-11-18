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
//<<<<<<< HEAD
	
	public void setOrden(Comparator<T> orden) {
		this.orden=orden;
		reordenar();
	}
	
	
//=======

//>>>>>>> e91b3db265ffd9f10f3df1d5e28b2bb11ec1cfe5
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

			while(aux.getSiguiente() != null && (i+1 < pos)) 
				i++;
			
				if (aux.getSiguiente() != null)
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
				/*else
					System.out.println("Pos excede el tama�o de la Lista");*/
		
		}
	}
	
	public void EliminarOcurrencias(T valor) {
		
		Nodo<T> aux = this.primerNodo;
		while(aux.getSiguiente() != null ) {
			int res = this.orden.compare(valor, aux.getValor());
				if ( res == 0)
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
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
			System.out.println(" ---  " + aux.getValor());
			aux=aux.getSiguiente();

		}
	}		
//=======


	@Override
	public Iterator iterator() {
		return new Iterador<T> (primerNodo);
//>>>>>>> e91b3db265ffd9f10f3df1d5e28b2bb11ec1cfe5
	}
}

