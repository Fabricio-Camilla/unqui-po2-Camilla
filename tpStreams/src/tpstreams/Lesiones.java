package tpstreams;

public enum Lesiones {
	 Rojo(1,"esguinze"), Gris(2,"fisura"), Amarillo(3,"quemadura"), Miel (4,"fractura");

	String descripcion;
	int nivelRiesgo;
	
	Lesiones(int i, String string) {
		descripcion = string;
		nivelRiesgo = i;
	}
	
	public int getNivelDeRiesgo() {
		return nivelRiesgo;
	}
	
	public String getDescripcionDeLesion() {
		return descripcion;
	}
	
	public Lesiones siguiente() {
        int ordinal = this.ordinal();
        int totalLesiones = values().length;
        int siguienteOrdinal = (ordinal + 1) % totalLesiones;
        return values()[siguienteOrdinal];
    }
}
