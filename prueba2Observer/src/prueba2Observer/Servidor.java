package prueba2Observer;

public class Servidor extends Observers {
	
	private Deporte deporteInteres;
	private String resultado;

	public Servidor(Deporte deporteInteres) {
		super();
		this.deporteInteres = deporteInteres;
		
	}

	@Override
	protected boolean esDeInteres(ResultadoPartido resultado) {
		return resultado.getDeporte().equals(this.deporteInteres);
	}

	@Override
	protected void actualizar(ResultadoPartido subject) {
		this.resultado = subject.getResultado();
		System.out.println(this.deporteInteres + " cambio en servidor el resultado de su ultimo partido " + this.resultado);
	}

	//esto quizas no hace falta
	
	@Override
	protected void subscribirse(ResultadoSubject subject) {
		subject.agregarObservador(this);
	}

	@Override
	protected void deSubscribirse(ResultadoSubject subject) {
		subject.removeObservador(this);
		
	}
}
