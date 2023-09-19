package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTest {

	private Caja caja1;
	private Producto producto1;
	private Factura factura1;
	private Empresa empresa1;
	
	@BeforeEach
	public void setUp() {
		producto1 = new Producto(4, 10d);
		caja1     = new Caja(0d);
		empresa1  = new Empresa();
		factura1  = new Impuesto(empresa1);
		
	}
	
	@Test
	void test() {
		caja1.registrarPago(producto1);
		assertEquals(10d, caja1.getMontoAPagar());
	}
	
	@Test
	void test2() {
		caja1.registrarPago(factura1);
		caja1.registrarPago(producto1);
		
		assertTrue(empresa1.getElla());
	}

}
