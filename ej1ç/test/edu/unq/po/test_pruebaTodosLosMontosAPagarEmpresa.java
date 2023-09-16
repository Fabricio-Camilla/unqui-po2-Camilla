package edu.unq.po;

import org.junit.Test;
//pasa
class test_pruebaTodosLosMontosAPagarEmpresa {

	@Test
	public static void main(String[] args) {
		
		Empresa empresa1= new Empresa(222222, "ypf");
	    Empleado empleado1=new EmpleadoPermanente("Juan", "Calle 123", true, 20000,2001,3,2);
		    
		    empresa1.contratarEmpleado(empleado1);
		  
		    System.out.println("montoSueldos: " + empresa1.montoTotalSueldosNeto());
		    System.out.println("montoSueldosBrutos: " + empresa1.montoTotalSueldosBrutos());
		    System.out.println("montoSueldosRetenciones: " + empresa1.montoTotalDeRetenciones());;
	}

}
