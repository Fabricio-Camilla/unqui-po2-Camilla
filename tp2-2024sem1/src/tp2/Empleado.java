package tp2;

import java.time.LocalDate;

abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private boolean estadoCivil;
	private LocalDate fechaNac;
	private Double sueldoBasico;

	public Empleado(String nombre, String direccion, boolean estadoCivil, LocalDate fechaNac, Double sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaNac = fechaNac;
		this.sueldoBasico = sueldoBasico;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public boolean isEstadoCivil() {
		return this.estadoCivil;
	}

	public LocalDate getFechaNac() {
		return this.fechaNac;
	}

	public Double getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public int edad(){
		return LocalDate.now().getYear() - this.getFechaNac().getYear();
	}
	
	abstract Double sueldoBruto();
	abstract Double retenciones();
	
	
	
	
	
}
