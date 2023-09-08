package edu.unq.po;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Empresa {
		
	private Integer cuit;
	private String nombre;
	private Set<Empleado> empleados;
	private List<ReciboDeHaberes> recibos;
			
	public Empresa (Integer cuit, String nombre) {
		this.cuit   = cuit;
		this.nombre = nombre;
		this.empleados = new HashSet<Empleado>();
		this.recibos = new LinkedList<ReciboDeHaberes>();
	}
	
	public void liquidarSueldo(Empleado empleado) {
		Liquidador liquidador1 = new Liquidador();
		this.recibos.add(liquidador1.generarRecibo(empleado));
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
	
	public Integer getCuit() {
		return this.cuit;
	}
			
	public String getNombreEmpresa() {
		return this.nombre;
	}

	public List<ReciboDeHaberes> getRecibos() {
		return this.recibos;
	}
	
		
}
