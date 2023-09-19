package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {

	private Caja caja1;
	private Producto Leche;
	private Producto Gaseosa;
	
	@BeforeEach
	public void setUp() {
		Leche   = new Producto(4, 20d);
		Gaseosa = new ProductoCooperativo(2, 10d);
		caja1   = new Caja(0d);
	}
	
	@Test
	void test() {
		caja1.registrarPago(Gaseosa);
		caja1.registrarPago(Leche);
		
		assertEquals(29 , caja1.getMontoAPagar());
		assertEquals(3 , Leche.getStock());
		assertEquals(1 , Gaseosa.getStock());
	}

}
