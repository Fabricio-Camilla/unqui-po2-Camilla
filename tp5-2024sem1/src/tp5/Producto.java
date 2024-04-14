package tp5;

public class Producto {
	
	private Double precio;
	private int cantidad;
	private String nombre;
	
	public Producto(Double precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
		this.cantidad = 0;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	

	public int getCantidad() {
		return this.cantidad;
	}

	public void descontarStock() {
		this.cantidad = this.cantidad -1;
	}
	
	

}
