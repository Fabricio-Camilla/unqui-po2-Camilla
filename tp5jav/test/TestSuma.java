import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSuma {
     
	Multioperador multi = new Multioperador();
     	
	@BeforeEach
	public void setUp(){
		multi.agregarNumeros(2);
		multi.agregarNumeros(2);
		multi.agregarNumeros(2);
		multi.agregarNumeros(1);
	}
	
	@Test
	public void testSuma() {
		int counter = multi.suma();
		assertEquals(counter, 7);
	}
}
