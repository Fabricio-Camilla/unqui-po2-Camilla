package banco;

public class CreditoPersonal extends Credito{

	public CreditoPersonal(Cliente cliente, Double montoSolicitado, int cantidadDeCuotas) {
		super(cliente, montoSolicitado, cantidadDeCuotas);
	}

	
	@Override
	public Boolean esSolicitudAceptable(Cliente cliente) {
		return (cliente.getSueldoAnual() > 15000) 
						& 
		(this.montoCuotaMensual() < (cliente.getSueldoNetoMensual() * 0.7));
	}

}
