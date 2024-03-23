package tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import encapsulamento.Persona;
import equipoDeTrabajo.EquipoDeTrabajo;

class EquipoDeTrabajoTest {

	private EquipoDeTrabajo equipo;
	private Persona persona1;
	private Persona persona2;
	private Persona persona3;
	private Persona persona4;
	private Persona persona5;

	@BeforeEach
	void setUp() {
		equipo = new EquipoDeTrabajo("Mi equipo");
		persona1 = new Persona("Sho", LocalDate.of(2000, 3, 23));
		persona2 = new Persona("Sho1", LocalDate.of(1999, 3, 23));
		persona3 = new Persona("Sho2", LocalDate.of(2001, 3, 23));
		persona4 = new Persona("Sho2", LocalDate.of(1993, 3, 23));
		persona5 = new Persona("Sho3", LocalDate.of(1963, 3, 23));
		
		equipo.agregarIntegrante(persona1);
		equipo.agregarIntegrante(persona2);
		equipo.agregarIntegrante(persona3);
		equipo.agregarIntegrante(persona4);
		equipo.agregarIntegrante(persona5);
	}
	
	@Test
	void test() {
		System.out.println(equipo.promedioDeEdadDeIntegrantes());
	}

}
