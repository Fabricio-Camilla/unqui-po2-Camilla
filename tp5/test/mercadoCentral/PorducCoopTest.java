package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PorducCoopTest {

private Producto producto1;
	
	@BeforeEach
	public void setUp() {
		producto1 = new ProductoCooperativo(4, 10d);
	}
	
	@Test
	void test() {
		assertEquals(9, producto1.montoAPagar());
	}

}
