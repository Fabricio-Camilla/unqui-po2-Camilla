package mercadoCentral;

public abstract class Factura implements Cobrable {

	protected Agencia agencia;
	
	
	public Factura(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public abstract Double montoAPagar();
	
	public  void cobrar(){
		getAgencia().registrarPago(this);
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	
}
