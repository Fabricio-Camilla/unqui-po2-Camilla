package edu.unq.po;

import java.util.Calendar;

public class EmpleadoTemporal extends Empleado {

	private Calendar fechaFin;
	private int horasExtras;
	
	public EmpleadoTemporal(String nombre, String direccion, Boolean estadoCivil, int sueldoBruto,int anioNacimiento,
			Calendar fechaFin, int horasExtras) {
		super(nombre, direccion, estadoCivil, sueldoBruto,anioNacimiento);
		this.horasExtras = horasExtras;
		this.fechaFin  = fechaFin;
	}

	
	@Override
	public int getSueldoBruto() {
		return horasExtras() + getSueldoBasico() - getRetenciones(); 
	}
	
	@Override
	protected int getRetenciones() {
		if (edad() > 50){
			return obraSocial() + 25 + aportesJubilatorios();
		}else {
			return obraSocial() + aportesJubilatorios();
		}
	}
	
	private int aportesJubilatorios() {
		return (int) (getSueldoBruto() * 0.10) + getHorasExtras() * 5;
	}
	
	
	private int obraSocial() {
		return (int) (getSueldoBruto() * 0.10);
	}


	private int horasExtras() {
		return getHorasExtras() * 40;
	}


	public int getHorasExtras() {
		return horasExtras;
	}

	public Calendar getFechaFin() {
		return fechaFin;
	}
	
	@Override
	protected String getDescripcionDeRetenciones() {
		return"AportesJubilatorios: 10% del sueldo bruto + 5 por cada hora extra"
				+ "ObraSocial: 10% del sueldo bruto";
	}
}
