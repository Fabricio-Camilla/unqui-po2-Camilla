package tp2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	private String nombre;
	private int cuit;
	private List<Empleado> empleados;
	
	
	
	public Empresa(String nombre, int cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = new ArrayList<Empleado>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public int getCuit() {
		return this.cuit;
	}

	public List<Empleado> getEmpleados() {
		return this.empleados;
	}
	
	public Double montoTotalSuledoBrutos() {
		return this.empleados.stream().mapToDouble(e -> e.sueldoBruto()).sum();
		
	}

	public void contratar(Empleado empleado1) {
		this.empleados.add(empleado1);
	}
	
	
	
}
