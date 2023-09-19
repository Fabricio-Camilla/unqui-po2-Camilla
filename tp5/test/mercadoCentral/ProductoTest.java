package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProductoTest {

	private Producto producto1;
	
	@BeforeEach
	public void setUp() {
		producto1 = new Producto(4, 10d);
	}
	
	@Test
	void test() {
		assertEquals(10d, producto1.montoAPagar());
	}

}
