package mercadoCentral;

public class Producto implements Cobrable {
	
	private int stock;
	protected Double precio;
	
	
	public Producto(int stock, Double precio) {
		this.stock = stock;
		this.precio = precio;
	}
	
	public void disminuirStock() {
		this.stock -= 1;
	}
	
	public int getStock() {
		return this.stock;
	}
	
	@Override
	public Double montoAPagar() {
		return this.precio;
	}

	@Override
	public void cobrar() {
		this.disminuirStock();
	}

}
