package prueba2Observer;

public abstract class Observers {

	protected abstract boolean esDeInteres(ResultadoPartido resultado);

	protected abstract void actualizar(ResultadoPartido resultado);
	
	protected abstract void subscribirse(ResultadoSubject subject);
	
	protected abstract void deSubscribirse(ResultadoSubject subject);
	

}
