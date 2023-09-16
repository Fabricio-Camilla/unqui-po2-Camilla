package supermercado;

public class Producto {

	private String nombre;
	protected Double precio;
	protected Boolean preciosCuidados;
	
	 public Producto(String nombre, Double precio) {
		 this.nombre = nombre;
		 this.precio = precio;
		 this.preciosCuidados = false;
	 }
	 
	 public Producto(String nombre, Double precio, Boolean preciosCuidados) {
		 this.nombre = nombre;
		 this.precio = precio;
		 this.preciosCuidados = preciosCuidados;
	 }
	
	public void aumentarPrecio(Double monto) {
		this.precio = precio + monto;
	}
	
	public Boolean esPrecioCuidado() {
		return getPreciosCuidados();
	}
	 
	public String getNombre() {
		return this.nombre;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public Boolean getPreciosCuidados() {
		return this.preciosCuidados;
	}
}
