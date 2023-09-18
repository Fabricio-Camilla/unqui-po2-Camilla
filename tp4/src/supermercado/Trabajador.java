package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private int montoImponible;
	private List<IngresoHorasExtra> ingresosPercibidos = new ArrayList<IngresoHorasExtra>();
	
	
	public Trabajador(int montoImponible, List<IngresoHorasExtra> ingresosPercibidos) {
		this.montoImponible = montoImponible;
		this.ingresosPercibidos = ingresosPercibidos;
	}

	public void asignarIngresos(IngresoHorasExtra ingreso) {
		ingresosPercibidos.add(ingreso);
	}
	
	public int getTotalPercibido() {
		int totalIngresos = 0;
		for ( Ingreso ingreso : ingresosPercibidos ) {
			totalIngresos += ingreso.getMontoPercibido();
		}
		for ( IngresoHorasExtra ingreso : ingresosPercibidos ) {
			totalIngresos += ingreso.getMontoPercibido();
			totalIngresos += ingreso.getHorasExtra();
		}
		return totalIngresos;
	}
	
		
	public int getMontoImponible() {
		int totalIngresos = 0;
		for ( Ingreso ingreso : ingresosPercibidos ) {
			totalIngresos += ingreso.getMontoPercibido();
		}
		return totalIngresos;
	}
	
	public int getImpuestoAPagar() {
		return (this.getMontoImponible()/100)*2;
	}
	
	
}
