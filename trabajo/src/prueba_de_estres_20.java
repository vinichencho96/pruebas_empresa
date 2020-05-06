package trabajo;

import static org.junit.Assert.*;

import org.junit.*;

public class prueba_de_estres_20 {
	cliente micliente = new cliente();
	@Before
	public void antes()
	{
		System.out.println("prueba con 20 miembros mas");
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
	public void despues() {
		System.out.println("programa terminado");
	}

}
