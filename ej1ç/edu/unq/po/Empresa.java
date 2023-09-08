package edu.unq.po;


import java.util.HashSet;
import java.util.Set;

public class Empresa {
		
	private Integer cuit;
	private String nombre;
	private Set<Empleado> empleados;
	
	public Integer getCuit() {
		return this.cuit;
	}
			
	public String getNombreEmpresa() {
		return this.nombre;
	}
	
	public Empresa (Integer cuit, String nombre) {
		this.cuit   = cuit;
		this.nombre = nombre;
		this.empleados = new HashSet<Empleado>();
	}
	
	public void contratarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	public Set<Empleado> getEmpleados() {	
		return this.empleados;
	}
	
	public int montoTotalSueldosNeto() {
		int montoTotal = 0;
		for (Empleado empleado : empleados) {
			montoTotal += empleado.getSueldoNeto();
		} 		
		return montoTotal;
	}
	
	public int montoTotalSueldosBrutos() {
		int montoTotal = 0;
		for (Empleado empleado : empleados) {
			montoTotal += empleado.getSueldoBruto();
		} 		
		return montoTotal;
	}
	
	public int montoTotalDeRetenciones() {
		int montoTotal = 0;
		for (Empleado empleado : empleados) {
			montoTotal += empleado.getRetenciones();
		} 		
		return montoTotal;
	}
		
}
