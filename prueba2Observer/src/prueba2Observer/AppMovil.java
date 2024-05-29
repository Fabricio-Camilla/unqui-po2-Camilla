package prueba2Observer;

public class AppMovil extends Observers{
	
	private Deporte deporteInteres;
	

	public AppMovil(Deporte deporteInteres) {
		super();
		this.deporteInteres = deporteInteres;
	}

	@Override
	protected boolean esDeInteres(ResultadoPartido resultado) {
		return resultado.getDeporte().equals(this.deporteInteres);
	}

	@Override
	protected void actualizar(ResultadoPartido subject) {
		System.out.println(deporteInteres + " tubo una actualizacion en su resultado");
	}

	@Override
	protected void subscribirse(ResultadoSubject subject) {
		subject.agregarObservador(this);
	}

	@Override
	protected void deSubscribirse(ResultadoSubject subject) {
		subject.removeObservador(this);
		
	}

}
