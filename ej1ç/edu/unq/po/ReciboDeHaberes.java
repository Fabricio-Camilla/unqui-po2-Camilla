package edu.unq.po;

import java.time.LocalDate;

public class ReciboDeHaberes {
	
	private String   nombreEmpleado;
	private String   direccion;
	private LocalDate fechaDeEmision;
	private int      sueldoBruto;
	private int      sueldoNeto;
	private String   desgloceDeConceptos;
	
	public ReciboDeHaberes(String nombreEmpleado, String direccion, LocalDate fechaDeEmision, int sueldoBruto, int sueldoNeto,
			String desgloceDeConceptos) {
		
		this.nombreEmpleado      = nombreEmpleado;
		this.direccion           = direccion;
		this.fechaDeEmision      = fechaDeEmision;
		this.sueldoBruto         = sueldoBruto;
		this.sueldoNeto          = sueldoNeto;
		this.desgloceDeConceptos = desgloceDeConceptos;
		
	}
	

	public String getNombreEmpleado() {
		return this.nombreEmpleado;
	}


	public String getDireccion() {
		return this.direccion;
	}


	public LocalDate getFechaDeEmision() {
		return this.fechaDeEmision;
	}


	public int getSueldoBruto() {
		return this.sueldoBruto;
	}


	public int getSueldoNeto() {
		return this.sueldoNeto;
	}


	public String getDesgloceDeConceptos() {
		return this.desgloceDeConceptos;
	}
}

	
