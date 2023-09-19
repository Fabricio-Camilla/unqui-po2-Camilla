package mercadoCentral;

public class Caja {

	private Double montoAPagar;

	public Caja (Double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}	
	
	public void registrarPago(Cobrable aCobrar) {
		this.montoAPagar += aCobrar.montoAPagar();
		aCobrar.cobrar();
	}	
	
	public Double getMontoAPagar() {
		return montoAPagar;
	}
	
	
	
}
