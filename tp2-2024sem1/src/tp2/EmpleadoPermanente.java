package tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado{

	private Double cantHijos;
	private Double antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, boolean estadoCivil, LocalDate fechaNac,
			Double sueldoBasico, Double cantHijos, Double antiguedad) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.antiguedad = antiguedad;
		this.cantHijos = cantHijos;
	}

	public Double getCantHijos() {
		return this.cantHijos;
	}

	public Double getAntiguedad() {
		return this.antiguedad;
	}

	@Override
	public Double sueldoBruto() {
		return this.getSueldoBasico() + this.getSalarioFamiliar() + this.retenciones();
	}
	
	public Double getSalarioFamiliar() {
		return (150d * this.getCantHijos()) + this.tieneConyuge() + (50d * this.getAntiguedad());
	}
	
	@Override
	public Double retenciones() {
		return this.obraSocial() + this.aportesJubilatorios();
	}
	

	public Double aportesJubilatorios() {
		return this.getSueldoBasico() * 0.15;
	}

	public Double obraSocial() {
		return this.getSueldoBasico() * 0.10 + 20d * this.getCantHijos();
	}

	public Double tieneConyuge() {
		if(this.isEstadoCivil()) {
			return 100d;
		}
		return 0d;		
	}
	
	
	
	

}
