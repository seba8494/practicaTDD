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

	public void put(String clave, String valor){
		prim = new Nodo();
		prim.clave = clave;
		prim.valor = valor;
		prim.siguiente = null;
		tam ++;
	}
	
	public String get(String clave){
		Nodo actual = prim;
		String val = "";
		if(actual!= null && actual.clave.equals(clave)){
			val = actual.valor;
		}
		return val;
	}
	
}
