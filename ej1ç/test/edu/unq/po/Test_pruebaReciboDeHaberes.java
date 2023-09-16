package edu.unq.po;

import org.junit.Test;

class Test_pruebaReciboDeHaberes {

	@Test
	public static void main(String[] args) {
		Empresa empresa1= new Empresa(222222, "ypf");
		
	    Empleado empleado1=new EmpleadoPermanente("Juan", "Calle 123", true, 20000,2001,3,2);
	    
					
		empresa1.contratarEmpleado(empleado1);
		empresa1.liquidarSueldo(empleado1);
		    
		for (ReciboDeHaberes recibo : empresa1.getRecibos() ) {
			System.out.println("nombreEmpleado: " + recibo.getNombreEmpleado());
		}
		
	}

}
