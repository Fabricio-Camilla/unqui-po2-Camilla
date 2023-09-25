package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco implements SistemaInformatico{

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Credito> solicitudesDeCredito = new ArrayList<Credito>();
	
	
	public void realizarCreditoHipotecarioPara(Cliente cliente, Double monto, Propiedad garantia,
			int mesesCuota) {
		
		for (Credito credito1 : solicitudesDeCredito) {
			if (credito1.esSolicitudAceptable(cliente)) {
				cliente.agregarCredito(credito1);
				this.agregarSolicitudesCredito(credito1);
			}
		}
		
	}
	
	public void realizarCreditoPersonalPara(Cliente cliente, Double monto, int mesesCuota) {
	
		for (Credito credito1 : solicitudesDeCredito) {
			if (credito1.esSolicitudAceptable(cliente)) {
				cliente.agregarCredito(credito1);
				this.agregarSolicitudesCredito(credito1);
			}
		}		
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
