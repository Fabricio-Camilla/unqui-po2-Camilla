package prueba2Observer;

public enum Deporte {
	
	TENIS("0-2"), HANDBALL("2-2");
	
	private ResultadoPartido partido;
	
	Deporte(String resultado) {
		this.partido = new ResultadoPartido(resultado, this);
	}
	


}
