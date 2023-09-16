package supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	
	private int descuento;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean preciosCuidados) {
		super(nombre, precio, preciosCuidados);
		this.preciosCuidados = true;
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean preciosCuidados, int descuento) {
		super(nombre, precio, preciosCuidados);
		this.preciosCuidados = true;
		this.descuento = descuento;
	}
	
	
	@Override
	public Double getPrecio() {
		return this.precio - (this.precio * this.descuento) / 100;
	}
		
	
}
