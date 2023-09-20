package banco;

public class CreditoHipotecario extends Credito{

	private Propiedad propiedad;
	 
	public CreditoHipotecario(Cliente cliente, Double montoSolicitado, int cantidadDeCuotas, Propiedad propiedad) {
		super(cliente, montoSolicitado, cantidadDeCuotas);
		this.propiedad = propiedad;
	}

	
	
	@Override
	public Boolean esSolicitudAceptable() {
		// TODO Auto-generated method stub
		return null;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

}
