package listaV;

import java.util.Comparator;

import Universidad.*;


public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Nodo<Integer> n1 = new Nodo(10);
		 Nodo<Integer> n2 = new Nodo(17);

						 
		Comparator<Integer> compEnt = new comparaEnteros();
		ListaVinc listaNum = new ListaVinc(n1,compEnt);
		

		 
		 Nodo<Integer> n3 = new Nodo(8);
		 Nodo<Integer> n4 = new Nodo(99);
		 Nodo<Integer> n5 = new Nodo(2);
		 listaNum.insertarOrdenado(n1);
		 listaNum.insertarOrdenado(n2);
		 listaNum.insertarOrdenado(n3);
		 listaNum.insertarOrdenado(n4);
		 listaNum.insertarOrdenado(n5);
		 
		// listaNum.recorrer();
		 
		 
		 
		 Nodo<Integer> n6 = new Nodo(3);
		 Nodo<Integer> n7 = new Nodo(9);
		 Nodo<Integer> n8 = new Nodo(16);
		 listaNum.insertarOrdenado(n6);
		 listaNum.insertarOrdenado(n7);
		 listaNum.insertarOrdenado(n8);
		 System.out.println(" Lista Numerica Ordenada");
		 listaNum.recorrer();
		 
		 
		
		 System.out.println(" Lista de String Ordenada");
		 Nodo<String> ns1 = new Nodo("koala");
		Comparator<String> compStr = new comparaString();
		ListaVinc listaStr = new ListaVinc(ns1,compStr);
		
		
		 Nodo<String> ns2 = new Nodo("perro");
		 Nodo<String> ns3 = new Nodo("ardilla");
		 Nodo<String> ns4 = new Nodo("gato");
		 Nodo<String> ns5 = new Nodo("leon");
		 Nodo<String> ns6 = new Nodo("vibora");
		 listaStr.insertarOrdenado(ns1);
		 listaStr.insertarOrdenado(ns2);
		 listaStr.insertarOrdenado(ns3);
		 listaStr.insertarOrdenado(ns4);
		 listaStr.insertarOrdenado(ns5);
		 listaStr.insertarOrdenado(ns6);
		 
		
		listaStr.recorrer();
		 
		 
		 
		 
	}

}
