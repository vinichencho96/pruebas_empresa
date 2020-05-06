package trabajo;

import static org.junit.Assert.*;

import org.junit.*;

public class prueba_de_unidad_nombre {
	cliente nuevoCliente;
	@Before
	public void TestBefore() {
		System.out.println("Método Before");
		nuevoCliente = new cliente();		
	}
	@Test
	public void TestNombre() {
		String NombreEsperado = nuevoCliente.getNombre("patricia");
		String NombreFinal = nuevoCliente.getNombre("patricia");
		assertEquals(NombreEsperado,NombreFinal);
	}
	@After
	public void TestAfter() {
		System.out.println("Método After");
	}
}
