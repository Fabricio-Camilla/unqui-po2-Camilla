package tp2;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado{

	private LocalDate fechaFin;
	private int cantHoraExtra; 
	
	public EmpleadoTemporario(String nombre, String direccion, boolean estadoCivil, LocalDate fechaNac,
			Double sueldoBasico, LocalDate fechaFin, int cantHoraExtra) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.cantHoraExtra = cantHoraExtra;
		this.fechaFin = fechaFin;
	}

	public LocalDate getFechaFin() {
		return this.fechaFin;
	}

	public int getCantHoraExtra() {
		return this.cantHoraExtra;
	}

	@Override
	public Double sueldoBruto() {
		return this.getSueldoBasico() + 40d * this.getCantHoraExtra();
	}

	@Override
	public Double retenciones() {
		return this.getSueldoBasico() * 0.10 + this.supera50Anios() + this.aporteJubilatorios();
	}
	
	
	public Double aporteJubilatorios() {
		return this.getSueldoBasico() * 0.10 + this.getCantHoraExtra() * 5d;
	}

	public Double supera50Anios() {
		if(this.edad() > 50) {
			return 25d;
		}return 0d;
	}
	
	
}
