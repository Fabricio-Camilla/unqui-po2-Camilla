package edu.unq.po;

import org.junit.Test;

//aprobado

class Test_prubaDosEmpleadosIguales {

	@Test
	public static void main(String[] args) {
		
		Empresa empresa1= new Empresa(222222, "ypf");
	    Empleado empleado1=new EmpleadoPermanente("Juan", "Calle 123", true, 3000,2001,3,2);
	    
	    empresa1.contratarEmpleado(empleado1);
	    
	    empresa1.contratarEmpleado(empleado1);
	    
	    for (Empleado empleado : empresa1.getEmpleados()) {
	    	System.out.println("empleados: " + empleado.getNombre());
		}
	}

}
