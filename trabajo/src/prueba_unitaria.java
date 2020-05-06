package trabajo;

import static org.junit.Assert.*;

import org.junit.*;

public class prueba_unitaria {
	cliente miCliente = new cliente();
	@Before
	public void testBefore() {
		System.out.println("Inicio de prueba");
	}
	@Test
	public void añadirNombre() {
		miCliente.getNombre("Federico");
		miCliente.getApellido("Lopez");
		miCliente.getID(15644);
		miCliente.getTarifa(1235);
		miCliente.setNuevoCliente();
		}
	@After
	public void despues() {
		System.out.println("Prueba terminada");
	}

}
