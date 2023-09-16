import java.util.ArrayList;

public class Multioperador {

	private ArrayList<Integer> numeros;
	
	public Multioperador() {
		this.numeros = new ArrayList<Integer>();
	}
	
	public void agregarNumeros(int numero) {
		this.numeros.add(numero);
	}

	public ArrayList<Integer> getNumeros() {
		return this.numeros;
	}
	
public int suma() {
		
		
		int sumaEsperada = 0;
		for (int numero1 : this.getNumeros()) {
			sumaEsperada = sumaEsperada + numero1;
		}
		return sumaEsperada;
				
		}
}

