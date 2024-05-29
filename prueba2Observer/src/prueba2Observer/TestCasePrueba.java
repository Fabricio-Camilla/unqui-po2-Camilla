package prueba2Observer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCasePrueba {

	private ResultadoSubject subject;
	private ResultadoPartido resultado;
	private ResultadoPartido resultado2;
	private AppMovil app;
	private AppMovil app2;
	private Servidor servidor;
	private Servidor servidor2;
	
	@BeforeEach
	void setUp() {
		subject = new ResultadoSubject();
		resultado = new ResultadoPartido("2-0", Deporte.TENIS);
		resultado2 = mock(ResultadoPartido.class);
		servidor = new Servidor(Deporte.TENIS);
		servidor2 = mock(Servidor.class);
		app = new AppMovil(Deporte.HANDBALL);
		app2 = mock(AppMovil.class);
	}
	
	@Test
	void PruebaConClasesConcretas() {
		
		subject.agregarObservador(app);
		subject.agregarObservador(servidor);
		subject.notify(resultado);
		
	}
	
	
	@Test
	void PruebaConMock() {
		when(servidor2.esDeInteres(resultado2)).thenReturn(true);
		
		subject.agregarObservador(app2);
		subject.agregarObservador(servidor2);
		subject.notify(resultado2);
		
		verify(servidor2).actualizar(resultado2);
	}

}
