package trabajo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class prueba_de_estres_10 {

	cliente micliente = new cliente();
	@Before
	public void prueba10() {
		System.out.println("Prueba con 10 miembros");
	}
	@Test
	public void test() {
		micliente.anyadirmiembro("mario", "marugan", 0001, 100);
		micliente.anyadirmiembro("mario", "marugan", 0001, 100);
		micliente.anyadirmiembro("mario", "marugan", 0001, 100);
		micliente.anyadirmiembro("mario", "marugan", 0001, 100);
		micliente.anyadirmiembro("mario", "marugan", 0001, 100);
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
