package mercadoCentral;

public class Empresa implements Agencia{

	private Boolean ella = false;
	
	@Override
	public void registrarPago(Factura factura) {
		 this.ella = true;
	}

	public Boolean getElla() {
		return ella;
	}
	
	
}
