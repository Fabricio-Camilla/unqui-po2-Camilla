package banco;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteSolicitaCreditoPersonalTest {

	
	
	private Propiedad casa1;
	private Cliente cliente1;

	
	@BeforeEach
	public void setUp() {
		
		 casa1 = new Propiedad("dosplantas", "calleFalsa", 800d);
		 cliente1 = new Cliente("Sho","apellido", "calleFalsa", 20, 3000d, casa1);
		
	}
	
	@Test
	void test() {
		cliente1.pedirCreditoPersonal(30d,12);
		int creditos = cliente1.getCreditos().size();
		
		assertTrue(creditos == 1);
		
	}

}
