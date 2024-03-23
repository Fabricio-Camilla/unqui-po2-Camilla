package encapsulamento;

import java.time.LocalDate;

public class Persona {
	
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public int edad() {
		return LocalDate.now().getYear() - this.getFechaNacimiento().getYear(); 
	}

	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public boolean menorQue(Persona persona) {
		
		if(this.edad() < persona.edad()) {
			return true;
		}else {
			return false;
		}
	}

	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.setNombre(nombre);
		this.setFechaNacimiento( fechaNacimiento);
	}

	private void setFechaNacimiento(LocalDate fechaNacimiento2) {
		this.fechaNacimiento = fechaNacimiento2;
	}

	private void setNombre(String nombre2) {
		this.nombre = nombre2;
	}
	
	
}
