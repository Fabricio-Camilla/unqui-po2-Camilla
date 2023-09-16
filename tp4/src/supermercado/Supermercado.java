package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>(); 
	
	
	public Supermercado(String string, String string2) {
		this.nombre = string;
		this.direccion = string2;
	}

	public Double getPrecioTotal() {
		Double precioTotal = 0d;
		for (Producto producto : productos) {
			 precioTotal = precioTotal + producto.getPrecio();
		}
		return precioTotal;
	}
	
    public int getCantidadDeProductos() {
    	return productos.size();
    }
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
}
