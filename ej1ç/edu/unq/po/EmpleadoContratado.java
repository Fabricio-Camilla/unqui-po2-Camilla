package edu.unq.po;

public class EmpleadoContratado extends Empleado{
	
	private int numeroDeContrato;
	private String medioDePago;
	
	
	public EmpleadoContratado(String nombre, String direccion, Boolean estadoCivil, int sueldoBasico,int anioNacimiento,
			int numeroDeContrato, String medioDePago) {
		super(nombre, direccion, estadoCivil, sueldoBasico,anioNacimiento);
		this.numeroDeContrato = numeroDeContrato;
		this.medioDePago  = medioDePago;
	}
	
	@Override
	public int getRetenciones() {
		return getGastosAdministrativosContractuales();
	}
	
	private int getGastosAdministrativosContractuales() {
		return 50;
	}

	@Override
	protected int getSueldoBruto() {
		return getSueldoBasico();
	}
	
	public int getNumeroDeContrato() {
		return numeroDeContrato;
	}
	
	public String getMedioDePago() {
		return medioDePago;
	}

	@Override
	protected String getDescripcionDeRetenciones() {
		return null;
	}



	



	
	
}
