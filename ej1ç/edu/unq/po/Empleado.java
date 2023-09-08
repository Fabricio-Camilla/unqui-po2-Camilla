package edu.unq.po;
import java.util.Calendar;
abstract class  Empleado {
	
	private String  nombre; 
	private String  direccion;
	private Boolean estadoCivil;
	private int     anioNacimiento;
	private int     sueldoBasico;
	
	public Empleado(String nombre, String direccion, Boolean estadoCivil, int sueldoBasico,int anioNacimiento){
		this.nombre        = nombre;
		this.direccion     = direccion;
		this.estadoCivil   = estadoCivil;
		this.sueldoBasico  = sueldoBasico;
		this.anioNacimiento= anioNacimiento;
	}
	
	public int edad() {		
		return Calendar.getInstance().get(Calendar.YEAR) - this.getAnioNacimiento();
	}
	
	public int getSueldoNeto() {
		return getSueldoBruto() - getRetenciones();
	}
	
	protected abstract int getSueldoBruto();	
	protected abstract int getRetenciones();

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public Boolean getEstadoCivil() {
		return this.estadoCivil;
	}

	public int getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public int getAnioNacimiento() {
		return this.anioNacimiento;
	}

	protected abstract String getDescripcionDeRetenciones();
	
	
	
	
	

	
}
