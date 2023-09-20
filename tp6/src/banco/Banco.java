package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco implements SistemaInformatico{

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Credito> solicitudesDeCredito = new ArrayList<Credito>();
	
	
	public void realizarCreditoHipotecarioPara(Cliente cliente, Double monto, Propiedad garantia,
			int mesesCuota) {
		// TODO Auto-generated method stub
		
	}
	
	public void realizarCreditoPersonalPara(Cliente cliente, Double monto, int mesesCuota) {
		// TODO Auto-generated method stub
		
	}
	
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public List<Credito> getSolicitudesDeCredito() {
		return solicitudesDeCredito;
	}

	@Override
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
		
	}

	@Override
	public void agregarSolicitudesCredito(Credito credito) {
		this.solicitudesDeCredito.add(credito);
	}

	@Override
	public Double montoADesmbolsar() {
		
		return 0d;
	}

}
