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
}
