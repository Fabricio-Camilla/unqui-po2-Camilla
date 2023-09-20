package banco;

public abstract class Credito {
	
	protected Cliente cliente;
	protected Double montoSolicitado;
	protected int cantidadDeCuotas;
	

	public abstract Boolean esSolicitudAceptable();
	
	public Double montoCuotaMensual() {
		return this.montoSolicitado * this.cantidadDeCuotas;
	}
	
	public Credito(Cliente cliente, Double montoSolicitado, int cantidadDeCuotas) {
		super();
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.cantidadDeCuotas = cantidadDeCuotas;
	}
}
