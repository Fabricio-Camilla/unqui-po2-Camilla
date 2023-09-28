package claes;

public class Producto {

	
	private String nombre;
	private Double precio;
	
	public Producto(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public Double getPrecio() {
		return precio;
	}
	
	public Boolean precioConIvaValido() {
		return this.precioConIva(1.21) < 2000;
	}

	public Double precioConIva(Double iva) {
		return this.getPrecio() * iva;
	}
}

