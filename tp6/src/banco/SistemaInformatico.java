package banco;

public interface SistemaInformatico {

	
	public void agregarCliente(Cliente cliente);
	public void agregarSolicitudesCredito(Credito credito);
	public Double montoADesmbolsar();
}
