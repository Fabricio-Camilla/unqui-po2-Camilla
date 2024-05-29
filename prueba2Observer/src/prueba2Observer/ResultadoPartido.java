package prueba2Observer;

public class ResultadoPartido {

	private String resultado;
	private Deporte deporte;
	
	public ResultadoPartido(String resultado, Deporte deporte) {
		super();
		this.resultado = resultado;
		this.deporte = deporte;
	}
	public Deporte getDeporte() {
		return this.deporte;
	}
	public String getResultado() {
		return this.resultado;
	}

}
