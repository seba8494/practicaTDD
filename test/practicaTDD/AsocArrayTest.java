package practicaTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsocArrayTest {
	
	@Test
	public void creacionDelArrayAsociativoVacio(){
		AsocArray array = new AsocArray();
		assertEquals(0, array.size());
	}
	
	@Test
	public void creacionDeArrayAsociativoUnDato(){
		AsocArray array = new AsocArray();
		array.put("pepe", "31");
		assertEquals("31", array.get("pepe"));
	}
	
	@Test
	public void creacionDeArrayAsociativoConVariosDatos(){
		AsocArray array = new AsocArray();
		array.put("pepe", "31");
		array.put("juan", "44");
		assertEquals("31", array.get("pepe"));
		assertEquals("44", array.get("juan"));
	}
	
	@Test
	public void insertarNodoConMismaClaveModificaSuValor(){
		AsocArray array = new AsocArray();
		array.put("pepe", "31");
		array.put("juan", "44");
		array.put("juan", "12");
		assertEquals("31", array.get("pepe"));
		assertEquals("12", array.get("juan"));
		assertEquals(2, array.size());
		
	}
}
