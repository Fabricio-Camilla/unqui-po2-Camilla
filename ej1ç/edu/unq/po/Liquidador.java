package edu.unq.po;

import java.time.LocalDate;

public class Liquidador {
	
	public ReciboDeHaberes generarRecibo(Empleado empleado) {
		return new ReciboDeHaberes(empleado.getNombre(), empleado.getDireccion(), LocalDate.now(), empleado.getSueldoBruto(),
				empleado.getSueldoNeto(), empleado.getDescripcionDeRetenciones());
	}
}



