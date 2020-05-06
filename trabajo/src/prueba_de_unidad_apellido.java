package trabajo;

import static org.junit.Assert.*;

import org.junit.*;

public class prueba_de_unidad_apellido {
	cliente micliente = new cliente();
	@Test
	public void test() {
		String apellidoReal = micliente.getApellido("Lopez");
		String apellidoEsperado = micliente.getApellido("Lopez");
		assertEquals(apellidoReal,apellidoEsperado);
		System.out.println("Los apellidos coinciden");
	}
	@After
	public void despues() {
		System.out.println("Prueba ejectada con exito");
	}

}
