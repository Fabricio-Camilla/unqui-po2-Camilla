package tp5;

public class Cliente {

	private String nombre;
	private Double monto;

	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public void setMontoAPagar(Double unMonto) {
		this.monto = unMonto;
	}
	
	public Double montoAPagar() {
		return this.monto;
	}

	
	
	
	
	
}
