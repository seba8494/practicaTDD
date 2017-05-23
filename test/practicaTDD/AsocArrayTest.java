package practicaTDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class AsocArrayTest {
	
	@Test
	public void creacionDelArrayAsociativoVacio(){
		AsocArray array = new AsocArray();
		assertEquals(0, array.size());
	}
}
