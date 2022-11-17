package listaV;

public class Nodo<T> {
	private T valor;
	private Nodo<T> siguiente;
	
	public Nodo (T valor) {
		this.valor= valor ;
		this.siguiente = null;
		
	}
	

	
	public T getValor() {
		return this.valor;
	}



	public Nodo<T> getSiguiente() {
		return siguiente;
	}



	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}



	public void setValor(T valor) {
		this.valor = valor;
	}
	
	
	
}
