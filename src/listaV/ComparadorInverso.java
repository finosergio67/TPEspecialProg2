package listaV;

import java.util.Comparator;

public class ComparadorInverso implements Comparator<Object> {

	
	private Comparator c1;
	
	public ComparadorInverso(Comparator c) {
		this.c1 = c;
	}
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return c1.compare(o1 , o2) * -1;
	}

}
