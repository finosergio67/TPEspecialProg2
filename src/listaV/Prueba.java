package listaV;

import java.util.Comparator;

import Universidad.*;


public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Nodo<Integer> n1 = new Nodo(10);
		 Nodo<Integer> n2 = new Nodo(21);
		 Nodo<Integer> n3 = new Nodo(1);
		 Nodo<Integer> n4 = new Nodo(5);
		 Nodo<Integer> n5 = new Nodo(11); 
		/* Nodo<Integer> n6 = new Nodo(3);
		 Nodo<Integer> n7 = new Nodo(9);
		 Nodo<Integer> n8 = new Nodo(16);
		 */
		Comparator<Integer> compEnt = new comparaEnteros();
		ListaVinc<Integer> listaNum = new ListaVinc(n1,compEnt);
		

		
		 listaNum.insertarOrdenado(n1);
		 listaNum.insertarOrdenado(n2);
		 listaNum.insertarOrdenado(n3);
		 listaNum.insertarOrdenado(n4);
		 listaNum.insertarOrdenado(n5);
		 /*listaNum.insertarOrdenado(n6);
		 listaNum.insertarOrdenado(n7);
		 listaNum.insertarOrdenado(n8);
		 System.out.println(" Lista Numerica Ordenada");
		 listaNum.recorrer();*/
		 
		 
		 for (Object o: listaNum){  /// recorremos e imprimimos
			 Integer e= (Integer) o;
			 System.out.println(" Valores de la Lista: " + e);
			 
		 }
		 
		 listaNum.recorrer();
		 
		System.out.println(" Eliminar posicion 1");
		 listaNum.EliminarPosicion(1);
		 listaNum.recorrer();
	
		 System.out.println(" Eliminar Ocurrencias 5 ");
		 listaNum.EliminarOcurrencias(5);
		 listaNum.recorrer();
		 
		 System.out.println(" Eliminar Ocurrencias 11 ");
		 listaNum.EliminarOcurrencias(11);
		 listaNum.recorrer();
		 
	
		 
	
		
		 
		 
		 System.out.println(" ------------------------ String -----------------------------------");
		
		 System.out.println(" Lista de String Ordenada");
		 Nodo<String> ns1 = new Nodo("Facil");
		 Nodo<String> ns2 = new Nodo("Es");
		 Nodo<String> ns3 = new Nodo("Parcial");
		 Nodo<String> ns4 = new Nodo("Prog2");
		
		 
		 Comparator<String> compStr = new comparaString();
		ListaVinc listaStr = new ListaVinc(ns1,compStr);
		
		
		
		 listaStr.insertarOrdenado(ns1);
		 listaStr.insertarOrdenado(ns2);
		 listaStr.insertarOrdenado(ns3);
		 listaStr.insertarOrdenado(ns4);

		 
		 
		 for (Object o: listaStr){  /// Nota : Utilizamos el metodo recorrer(), 
			 String e= (String) o;
			 System.out.println(" Valores de la Lista: " + e);
			 
		 }
		 
		listaStr.recorrer(); // lousamos en vez del forEach, por practicidad.
		 
		 int posicion = listaStr.primerOcurrencia("Parcial");
		 System.out.println(" la primer ocurrencia de la palabra Parcial se encuentra en el nodo : " +  posicion );
		 
		 posicion = listaStr.primerOcurrencia("Recuperatorio");
		 System.out.println(" la primer ocurrencia de la palabra Recuperatorio se encuentra en el nodo : " +  posicion );
		 
		
		 
		 
		 Comparator<Object> compInv = new ComparadorInverso(compStr);
		 listaStr.setOrden(compInv);

	

		 listaStr.recorrer();
		 
	}

}
