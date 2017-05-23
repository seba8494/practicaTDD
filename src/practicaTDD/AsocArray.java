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
		
		if(tam == 0){
			prim = new Nodo();
			prim.clave = clave;
			prim.valor = valor;
			prim.siguiente = null;
			tam ++;
			
		}else{
			
			Nodo actual = prim;
			Nodo sig = actual.siguiente;
			boolean encontrado = false;
			
			while (sig != null && !encontrado) {
				actual = actual.siguiente;
				sig = actual.siguiente;
				if(actual.clave.equals(clave)){
					actual.valor = valor;
					encontrado = true;
				}
			}
			
			if(!encontrado){
				 Nodo n = new Nodo();
				 n.clave = clave;
				 n.valor = valor;
				 n.siguiente = null;
				 actual.siguiente = n;
				 tam ++;
			}
		}

	}
	
	public String get(String clave){
		Nodo actual = prim;
		boolean encontrado = false;
		String val = "";
		while(actual != null && !encontrado){
			if(actual!= null && actual.clave.equals(clave)){
				val = actual.valor;
				encontrado = true;
			}
			actual = actual.siguiente;
		}
		
		if(!encontrado){
			throw new UndefinedKeyException();
		}
		return val;
	}

	public String getOrElse(String clave, String pordefecto) {
		Nodo actual = prim;
		boolean encontrado = false;
		String val = "";
		while(actual != null && !encontrado){
			if(actual!= null && actual.clave.equals(clave)){
				val = actual.valor;
				encontrado = true;
			}
			actual = actual.siguiente;
		}
		
		if(!encontrado){
			val = pordefecto;
		}
		
		return val;
	}

	public boolean containsKey(String clave) {
		boolean encontrado = false;
		Nodo actual = prim;
		
		while(actual!= null && !encontrado){
			if(actual.clave.equals(clave)){
				encontrado = true;
			}
		}
		
		return encontrado;
	}

	public Object remove(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
