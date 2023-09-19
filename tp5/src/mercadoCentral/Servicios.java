package mercadoCentral;

public class Servicios extends Factura {

	private Double costoUnidadConsumida;
	private int cantUnidadConsumida;

	public Servicios(Agencia agencia, Double costoUnidadConsumida, int cantUnidadConsumida){
		super(agencia);		
		this.costoUnidadConsumida = costoUnidadConsumida;
		this.cantUnidadConsumida  = cantUnidadConsumida;
	}

	public Double getCostoUnidadConsumida() {
		return costoUnidadConsumida;
	}

	public int getCantUnidadConsumida() {
		return cantUnidadConsumida;
	}

	@Override
	public Double montoAPagar() {
		return this.getCostoUnidadConsumida() * this.getCantUnidadConsumida();
	}

	
	
}
