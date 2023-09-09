package edu.unq.po;


import org.junit.jupiter.api.Test;
//pasa
class Test_contratarAUnEmpleadoContratado {

	@Test
	public static void main(String[] args) {
		
		Empresa empresa1= new Empresa(222222, "ypf");
	    EmpleadoContratado empleado1=new EmpleadoContratado("Juan", "Calle 123", true, 3000,2001,3,"Transferencia");
	    
	    empresa1.contratarEmpleado(empleado1);	    
	    
	    for (Empleado empleado : empresa1.getEmpleados()) {
	    	System.out.println("empleados: " + empleado.getNombre());
		}
	}
	

}
