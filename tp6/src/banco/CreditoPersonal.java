package banco;

public class CreditoPersonal extends Credito{

	public CreditoPersonal(Cliente cliente, Double montoSolicitado, int cantidadDeCuotas) {
		super(cliente, montoSolicitado, cantidadDeCuotas);
	}

	
	@Override
	public Boolean esSolicitudAceptable() {
		// TODO Auto-generated method stub
		return null;
	}

}
