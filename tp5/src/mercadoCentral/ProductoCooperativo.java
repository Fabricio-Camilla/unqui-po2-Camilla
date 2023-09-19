package mercadoCentral;

public class ProductoCooperativo extends Producto{

	public ProductoCooperativo(int stock, Double precio) {
		super(stock, precio);
	}
	
	@Override
	public Double montoAPagar() {
		return this.precio * 0.9;
	}

}
