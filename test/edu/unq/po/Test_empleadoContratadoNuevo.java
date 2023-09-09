package edu.unq.po;


//pasa
import org.junit.jupiter.api.Test;

class Test_empleadoContratadoNuevo {

	@Test
	public static void main(String[] args) {
		
		Empresa empresa1= new Empresa(222222, "ypf");
	    EmpleadoContratado empleado1=new EmpleadoContratado("Juan", "Calle 123", true, 3000,2001,3,"Transferencia");
	    
	    empresa1.contratarEmpleado(empleado1);	 
	    
    	System.out.println("empleados: " + empleado1.getNombre());
    	System.out.println("numeroDeContrato: " + empleado1.getNumeroDeContrato());
    	System.out.println("medioDePago: " + empleado1.getMedioDePago());



	}

}
