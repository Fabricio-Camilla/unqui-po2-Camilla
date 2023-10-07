package tpstreams;


import java.util.ArrayList;
import java.util.List;

public class ActividadSemanal {

	DiasDeLaSemana dia;
	int horaDeinicio;
	int duracion;
	Deportes deporte;
	
	List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	public ActividadSemanal(DiasDeLaSemana dia, int horaDeinicio, int duracion, Deportes deporte) {
		this.dia = dia;
		this.horaDeinicio = horaDeinicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}

	public int precioActividad(Deportes deporte){
			if ((dia == DiasDeLaSemana.Lunes) || (dia == DiasDeLaSemana.Martes) || (dia == DiasDeLaSemana.Miercoles)) {
				return 500 + (deporte.getComplejidad() * 200);
			}
			else {
				return 1000 + (deporte.getComplejidad() * 200);
			}
	}

	public void agregarActividad(ActividadSemanal actividadNueva) {
		actividades.add(actividadNueva);
	}

	public List<ActividadSemanal> cantidadDeFutbol() {
		
		 return actividades.stream().filter(a-> a.deporte == Deportes.Futbol).toList();
	}
	
	
}
