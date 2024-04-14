package tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {

	private Cliente unCliente;
	private Caja unaCaja;
	private MercadoCentral mercado;
	private Producto producto;
	private Producto producto2;
	private List<Producto> paraComprar;
	
	@BeforeEach
	void setUp() {
		unaCaja = new Caja(2);
		paraComprar = new ArrayList<Producto>();
		unCliente = new Cliente("yo");
		mercado = new MercadoCentral();
		producto = new Producto(10d,"leche");
		producto2 = new Producto(10d,"algo");
		paraComprar.add(producto);
		mercado.agregarCaja(unaCaja);
	}
	
	@Test
	void test1() {
		mercado.comprarProducto(paraComprar, unCliente);
		
		assertEquals(unCliente.montoAPagar(), 10d);
	}
	
	

}
