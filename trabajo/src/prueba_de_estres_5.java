package trabajo;

import static org.junit.Assert.*;

import org.junit.*;

public class prueba_de_estres_5 {
	cliente micliente = new cliente();
	@Before
	public void prueba5() {
		System.out.println("Prueba con 5 miembros");
	}
	@Test
	public void test() {
		micliente.anyadirmiembro("mario", "marugan", 0001, 100);
		micliente.anyadirmiembro("mario", "marugan", 0001, 100);
		micliente.anyadirmiembro("mario", "marugan", 0001, 100);
		micliente.anyadirmiembro("mario", "marugan", 0001, 100);
		micliente.anyadirmiembro("mario", "marugan", 0001, 100);
	}
	@After
	public void fin() {
		System.out.println("programa terminado");
	}

}
