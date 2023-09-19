package mercadoCentral;

public class Impuesto extends Factura {

	private Double tasaDelServicio = 10d;
	
	public Impuesto(Agencia agencia) {
		super(agencia);
	}

	public Double getTasaDelServicio() {
		return tasaDelServicio;
	}

	@Override
	public Double montoAPagar() {
		return this.getTasaDelServicio();
	}

}
