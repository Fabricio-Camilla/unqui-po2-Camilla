package prueba2Observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ResultadoSubject {
	
	private List<Observers> observadores = new ArrayList<Observers>();
	private ResultadoPartido resultado;
	
	public void agregarObservador(Observers observador) {
		this.observadores.add(observador);
	}
	
	public void removeObservador(Observers observador) {
		this.observadores.add(observador);
	}
	
	public void notify(ResultadoPartido resultado) {
		this.observersInteresados(resultado).stream().forEach(o-> o.actualizar(resultado));
		
		
		/*for (Observers observador : observadores) {
			if(observador.esDeInteres(resultado)) {
				observador.actualizar(resultado);
			}
		}*/
	}

	private List<Observers> observersInteresados(ResultadoPartido resultado2) {
		return this.observadores.stream().filter(o -> o.esDeInteres(resultado2)).toList(); 
	}

	public ResultadoPartido getResultadoPartido() {
		return this.resultado;
	}
}
