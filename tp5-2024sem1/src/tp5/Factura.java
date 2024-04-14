package tp5;

public abstract class Factura implements Agencia{
	
	protected Double costoUnidad;
	protected int cantUnidadesConsumidas;
	
	abstract Double calcularMontoAPagar();
}
