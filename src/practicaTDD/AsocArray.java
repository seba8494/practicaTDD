package practicaTDD;

public class AsocArray {

	private class Nodo {
		String clave;
		String valor;
		Nodo siguiente;
	}

	private Nodo prim;
	private int tam;
	
	public AsocArray() {
		prim = null;
		tam = 0;
		
	}
	
	public int size() {
		return tam;
	}

}
