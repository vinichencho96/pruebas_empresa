package trabajo;

import static org.junit.Assert.*;

import org.junit.*;

public class prueba_de_unidad_ID {
	cliente micliente = new cliente();
	
	@Test
	public void test() {
		int IDesperado = micliente.getID(111);
		int IDrecibido = micliente.getID(111);
		assertEquals("el ID es igual en ambos",IDesperado,IDrecibido);
	}
	@After 
	public void despues() {
		System.out.println("Se ha ejecutado correctamente");
	}

}
