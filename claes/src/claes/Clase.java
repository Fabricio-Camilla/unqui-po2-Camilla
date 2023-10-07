package claes;

import java.util.ArrayList;
import java.util.List;


public class Clase {

/*implemente un meotodo que recibe como parametro una lista de strings y un prefijo
 *  y devuelve una lista con solo los elementos que empiecen con ese prefijo*/
	

	

	public List<String> listaConPrefijo (ArrayList<String> lista, String prefijo){
		List<String> listaEsperada = new ArrayList<String>();
		lista.stream().filter(s-> s.startsWith(prefijo)).toList();
		for (String palabra : lista) {
			if(palabra.startsWith(prefijo)) {
				listaEsperada.add(prefijo);
			}
		}
		return listaEsperada;
		
	}


/*implemente un metoodo que recibe como parametro una lista de string y un prefijo 
 * y devuelve true 
 * si hay al menos un elemetno que empiece con ese prefijo
 * */

public Boolean existe(ArrayList<String> lista, String prefijo) {
	Boolean encontro = false;
	int indice= 0;
	lista.stream().anyMatch(s-> s.startsWith(prefijo));
	while (!encontro & indice < lista.size()) {
		encontro = lista.get(indice).startsWith(prefijo);
		indice ++;
	}
	return encontro;
		
	}

/* idem anterior pero devuelve true si todos cumplen
 * */

public Boolean todasCumple(ArrayList<String> lista, String prefijo) {
	Boolean cumple = true;
	int indice = 0;
	lista.stream().allMatch(s -> s.startsWith(prefijo));
	while(cumple & indice< lista.size()) {
		cumple = lista.get(indice).startsWith(prefijo);
		indice ++;
	}
	return cumple;
}


























}
