package banco;

public class CreditoHipotecario extends Credito{

	private Propiedad propiedad;
		 
	public CreditoHipotecario(Cliente cliente, Double montoSolicitado, int cantidadDeCuotas, Propiedad propiedad) {
		super(cliente, montoSolicitado, cantidadDeCuotas);
		this.propiedad = propiedad;
	}

	
	
	@Override
	public Boolean esSolicitudAceptable(Cliente cliente) {
		
		if(this.getCantidadDeCuotas() == 12 ) {
			int edad =+ cliente.getEdad() + 1;		
		
		return edad < 65;
		}
		return this.montoCuotaMensual() < (cliente.getSueldoNetoMensual() * 0.5)
										&
				this.montoSolicitado < (propiedad.getValorFiscal() * 0.7);
				
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

}
