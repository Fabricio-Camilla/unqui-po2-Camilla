package tpstreams;

public enum Deportes {
	Running(1),Futbol(2), Basket (2), Tennis(3), Jabalina(4);

	int complejidad;
	
	Deportes(int i) {
		complejidad = i;
	}
	
	public int getComplejidad() {
		return this.complejidad;
	}
}
