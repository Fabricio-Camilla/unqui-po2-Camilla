package tp5;

public class Impuesto extends Factura{

	public Impuesto( int cantUnidadesConsumidas) {
		super();
		this.cantUnidadesConsumidas = cantUnidadesConsumidas;
		this.costoUnidad = 100d;
	}
	
	@Override
	public void registrarPago(Factura factura) {
		System.out.println(factura.calcularMontoAPagar());
	}

	@Override
	public Double calcularMontoAPagar() {
		return this.getCostoUnidad() * this.getCantUnidadesConsumidas();
	}
	
	
	
	public Double getCostoUnidad() {
		return this.costoUnidad;
	}
	
	
	public int getCantUnidadesConsumidas() {
		return this.cantUnidadesConsumidas;
	}

	
}
