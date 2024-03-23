package equipoDeTrabajo;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

import encapsulamento.Persona;

public class EquipoDeTrabajo {
	
	private String nombre;
	private List<Persona> integrantes;
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Persona> getIntegrantes() {
		return this.integrantes;
	}
	
	public Double promedioDeEdadDeIntegrantes() {
		return this.getIntegrantes().stream().mapToDouble(p -> p.edad()).average().getAsDouble();
	}

	public EquipoDeTrabajo(String nombre) {
		super();
		this.nombre = nombre;
		this.integrantes = new ArrayList<Persona>();
	}

	public void agregarIntegrante(Persona persona) {
		this.integrantes.add(persona);
	}
	

}
