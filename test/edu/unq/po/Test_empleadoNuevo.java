package edu.unq.po;

import org.junit.Test;
//pasa
class Test_empleadoNuevo {

	@Test
	public static void main(String[] args) {
			 
	    
	   EmpleadoPermanente empleado2 = new EmpleadoPermanente("Juan", "Calle 123", true, 20000,2001,3,2);

	   
	    System.out.println("Nombre: " + empleado2.getNombre());
	    System.out.println("Dirección: " + empleado2.getDireccion());
	    System.out.println("edad: " + empleado2.edad());
	    System.out.println("Estado Civil: " + empleado2.getEstadoCivil());
	    System.out.println("Sueldo Básico: " + empleado2.getSueldoNeto());
	    System.out.println("Cantidad Hijos: " + empleado2.getCantidadDeHijos());
	    System.out.println("Antiguedad: " + empleado2.getAntiguedad());
	
	}
	
}

