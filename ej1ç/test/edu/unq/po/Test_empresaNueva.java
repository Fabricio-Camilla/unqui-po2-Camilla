package edu.unq.po;

import org.junit.Test;
//pasa
class Test_empresaNueva {

	@Test
public static void main(String[] args) {
		
		
	    Empresa empresa1= new Empresa(222222, "ypf");
	    
		   
	    System.out.println("Nombre: " + empresa1.getNombreEmpresa());
	    
	    System.out.println("Cuit: " + empresa1.getCuit());
	   
	 }
}
