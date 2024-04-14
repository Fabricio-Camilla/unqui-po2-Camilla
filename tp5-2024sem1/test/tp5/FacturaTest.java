package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacturaTest {

	
	private Factura factura = new Impuesto(2);
	private Factura factura2 = new Impuesto(3);
	private Caja caja = new Caja(1);
	
	@Test
	void test() {
		factura.registrarPago(factura2);
	}

}
