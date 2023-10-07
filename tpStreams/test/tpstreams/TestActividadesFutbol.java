package tpstreams;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestActividadesFutbol {

	ActividadSemanal actividad;
	ActividadSemanal actividadFutbol;
	ActividadSemanal actividadX;

	List<ActividadSemanal> ListaEsperada;
	
	
	@BeforeEach
	public void setUp() {
		ListaEsperada = new ArrayList<ActividadSemanal>();
		
		actividad =  new ActividadSemanal(DiasDeLaSemana.Lunes, 14, 20, Deportes.Jabalina);
		actividadFutbol = new ActividadSemanal(DiasDeLaSemana.Lunes, 14, 20, Deportes.Futbol);
		actividadX = new ActividadSemanal(DiasDeLaSemana.Lunes, 14, 20, Deportes.Basket);
		
		actividad.agregarActividad(actividadFutbol);
		actividad.agregarActividad(actividadX);
		
				
		ListaEsperada.add(actividadFutbol);  
	}
	
	@Test
	void test() {
		
		assertEquals(ListaEsperada , actividad.cantidadDeFutbol());
	}

}
