package tp5;

import java.util.ArrayList;
import java.util.List;

public class MercadoCentral {

	private List<Producto> stock = new ArrayList<Producto>();
	private List<Caja> cajas= new ArrayList<Caja>();
	
	public void agregarCaja(Caja unaCaja) {
		cajas.add(unaCaja);
	}
	
	public List<Producto> getStock() {
		return this.stock;
	}
	
	public List<Caja> getCajas() {
		return this.cajas;
	}

	public void comprarProducto(List<Producto> producto, Cliente unCliente) {
		Caja unaCaja = cajas.get(0);
		unaCaja.registrarCompra(producto, unCliente,this);
		
	}

	public void descontarStockProductos(List<Producto> productos) {
		for (Producto producto : productos) {
			if (productos.contains(producto)) {
				producto.descontarStock();
			}
		}
	}
	
	
	
	
}
