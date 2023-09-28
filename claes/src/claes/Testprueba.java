package claes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Testprueba {

	private Plato plato;
	private ArrayList<Producto> productos ;
	
	
	public void setUp() {
		plato = new Plato();
		productos = new ArrayList<Producto>();
		productos.add(new Producto( "mila" ,1500d));
		productos.add(new Producto( "guiso" ,1800d));
		productos.add(new Producto( "asado" ,2000d));
		productos.add(new Producto( "toritlla" ,1400d));
	}
	
	@Test
	public void testprecio() {
		assertEquals(plato.sumarMontosConIva(productos), 3509);
	}

}
