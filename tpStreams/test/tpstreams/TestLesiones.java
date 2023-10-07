package tpstreams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLesiones {


	private Lesiones lesion;
		
	@BeforeEach
	public void setUp() {
		lesion = Lesiones.Miel;
	}
	
	@Test
	void test() {
		assertEquals(lesion.getNivelDeRiesgo(), 4);
		assertEquals(lesion.siguiente(), Lesiones.Rojo);
	}

}
