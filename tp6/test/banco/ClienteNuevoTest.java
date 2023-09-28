package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteNuevoTest {

	
	
	private Propiedad casa1;
	private Cliente cliente1;
	
	@BeforeEach
	public void setUp() {
		
		 casa1 = new Propiedad("dosplantas", "calleFalsa", 800d);
	}
	
	
	@Test
	void clienteNuevo() {
		 cliente1 = new Cliente("Sho","apellido","calleFalsa", 20, 30d, casa1); 
		 assertEquals(30d, cliente1.getSueldoNetoMensual());
	}

}
