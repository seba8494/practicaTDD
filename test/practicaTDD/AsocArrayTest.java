package practicaTDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AsocArrayTest {
	
	private AsocArray array;
	
	@Before
	public void setUp(){
		array = new AsocArray();
	}
	
	@Test
	public void creacionDelArrayAsociativoVacio(){
		assertEquals(0, array.size());
	}
	
	@Test
	public void creacionDeArrayAsociativoUnDato(){
		array.put("pepe", "31");
		assertEquals("31", array.get("pepe"));
	}
	
	@Test
	public void creacionDeArrayAsociativoConVariosDatos(){
		array.put("pepe", "31");
		array.put("juan", "44");
		assertEquals("31", array.get("pepe"));
		assertEquals("44", array.get("juan"));
	}
	
	@Test
	public void insertarNodoConMismaClaveModificaSuValor(){
		array.put("pepe", "31");
		array.put("juan", "44");
		array.put("juan", "12");
		assertEquals("31", array.get("pepe"));
		assertEquals("12", array.get("juan"));
		assertEquals(2, array.size());
		
	}
	
	@Test(expected = UndefinedKeyException.class)
	public void noEncontrarLaClaveElevaUnaExcepcion() throws Exception{
		array.get("pepe");
	}
	
	@Test
	public void funcionGetOrElseDevuelveValorSiEncuentraLaClave(){
		array.put("pepe", "31");
		array.put("juan", "44");
		assertEquals("44", array.getOrElse("juan", "0"));
	}
	
}
