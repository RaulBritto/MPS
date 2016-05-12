package Test;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import business.control.Facede;

public class FacadeTest extends TestCase{
	
	private Facede fachada;
	
	@Before
	public void setUp(){
		fachada = new Facede();
		fachada.addInstrument("nome", "marca", 1,1,"");
		fachada.addInstrument("nome2", "marca2", 3,2,"");
	}
	
	@Test
	public void testListEmpty() {
		assertFalse(fachada.listEmpty());
	}
	
	@Test
	public void testSizeList() {
		assertEquals(2,fachada.sizeList());
	}
	
	@Test
	public void testAddInstrument(){
		fachada.addInstrument("nome3", "marca3", 2, 3, "");
		assertEquals(3, fachada.sizeList());
	}
	
	@Test
	public void testRemoveInstrument(){
		fachada.removeInstrument("nome");
		assertEquals(1, fachada.sizeList());
	}
}
