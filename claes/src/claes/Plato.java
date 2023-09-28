package claes;

import java.util.ArrayList;
import java.util.List;

public class Plato {
		
	
	public Plato(List<Producto> productos) {
		super();
		this.productos = productos;
	}

	public Plato() {
		// TODO Auto-generated constructor stub
	}

	private List<Producto> productos = new ArrayList<Producto>();
	
	public void agregegarProducto(Producto producto) {
		this.productos.add(producto);
	}
	
	public Double sumarMontosConIva(ArrayList<Producto> productos) {
		return 
				productos.stream()
				.filter(p-> p.precioConIvaValido())
				.mapToDouble(p -> p.precioConIva(1.21))
				.sum();
	}
	

}
	



