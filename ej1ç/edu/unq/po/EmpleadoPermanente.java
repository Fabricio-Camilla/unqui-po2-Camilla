package edu.unq.po;


public class EmpleadoPermanente extends Empleado{
	private int cantidadDeHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, Boolean estadoCivil, int sueldoBasico,int anioNacimiento,
			int antiguedad, int cantidadDeHijos) {
		super(nombre, direccion, estadoCivil, sueldoBasico,anioNacimiento);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad  = antiguedad;
	}
	@Override
	public int getSueldoBruto() {
		return salarioFamiliar() + getSueldoBasico();
	}
	
	@Override
	protected int getRetenciones() {
		return getObraSocial() + getAportesJubilatorios();
	}
	
	@Override
	protected String getDescripcionDeRetenciones() {
		return"AportesJubilatorios: 15% del sueldo bruto"
				+ "ObraSocial: 10% del sueldo bruto y 20$ por hijo";
	}
	
	private int getAportesJubilatorios() {
		return (int) (getSueldoBruto() * 0.15);
	}
	
	private int getObraSocial() {
		return (int) (getSueldoBruto() * 0.10) + getCantidadDeHijos() * 20 ;
	}
	
	private int salarioFamiliar() {
		return getAsignacionPorHijo() + getPlusPorConyugue() + getPlusPorAntiguedad();
	}
	
	private int getPlusPorAntiguedad() {
		return getAntiguedad() * 50;
	}
	
	private int getPlusPorConyugue() {
		if(getEstadoCivil()) {
			return 100;
		}
		else{
			return 0;
		}
	}	
			
	private int getAsignacionPorHijo() {
		return getCantidadDeHijos() * 150;
	}
	
	public int getCantidadDeHijos() {
		return this.cantidadDeHijos;
	}

	public int getAntiguedad() {
		return this.antiguedad;
	}
}
