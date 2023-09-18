package supermercado;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajorTest {
	
	private Trabajador trabajador;
	private IngresoHorasExtra ingreso;
	private ArrayList<IngresoHorasExtra> listaIngresos = new ArrayList<IngresoHorasExtra>();
	
	@BeforeEach
	public void setUp() {
		
		ingreso = new IngresoHorasExtra(2,"ella", 8d,2);
		listaIngresos.add(ingreso);					
		trabajador = new Trabajador(100, listaIngresos);		
		trabajador.asignarIngresos(ingreso);
	

	}
	
	@Test
	public void test1(){
		assertEquals(36, trabajador.getTotalPercibido());
	}
	
	@Test
	public void test2(){
		assertEquals(0,trabajador.getImpuestoAPagar());
	}
}
