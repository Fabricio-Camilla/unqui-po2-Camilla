package supermercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoPrimeraTest {
	
private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2d , leche.getPrecio());
	}
}
