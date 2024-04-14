package tp5;

import java.util.List;

public class Caja {
	
	private int numero;

	
	public void registrarCompra(List<Producto> productos, Cliente cliente,MercadoCentral mercado) {
		mercado.descontarStockProductos(productos);
		cliente.setMontoAPagar(this.montoACobrar(productos));
	}
	
	public Caja(int numero) {
		this.numero = numero;
	}

	private Double montoACobrar(List<Producto> productos) {
		return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
	}

	public int getNumero() {
		return this.numero;
	}
	
	
}
