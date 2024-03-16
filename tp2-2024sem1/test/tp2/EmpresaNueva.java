package tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaNueva {
	
	private Empresa empresa;
	private Empleado empleado1;
	private Empleado empleado2;
	private Empleado empleado3;
	
	@BeforeEach
	void setUp() {
		empresa = new Empresa("sho", 2);
		empleado1 = new EmpleadoPermanente("fran", "123", true,LocalDate.now(), 1200d, 2d, 10d);
		empleado2 = new EmpleadoPermanente("fra2", "123", true,LocalDate.now(), 2000d, 1d, 10d);
		empleado3 = new EmpleadoPermanente("fr1", "123", true,LocalDate.now(), 3000d, 6d, 10d);
	}

	@Test
	void test() {
		
		empresa.contratar(empleado1);
		empresa.contratar(empleado2);
		empresa.contratar(empleado3);
		
		System.out.println(empresa.montoTotalSuledoBrutos());
	}

}
