package banco;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private int    edad;
	private Double sueldoNetoMensual;
	private Banco  banco;
	private Propiedad propiedad;
	private List<Credito> creditos = new ArrayList<Credito>();
	
	
	public Cliente(String nombre,String apellido,String direccion, int edad, Double sueldoNetoMensual,Propiedad propiedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual= sueldoNetoMensual;
		this.propiedad = propiedad;
		this.banco = new Banco();
	}
	
	
	public void pedirCreditoHipotecario(Double monto, Propiedad garantia, int mesesCuota) {
		this.banco.realizarCreditoHipotecarioPara(this,monto, garantia, mesesCuota);
	}
	
	public void pedirCreditoPersonal(Double monto, int mesesCuota) {
		this.banco.realizarCreditoPersonalPara(this, monto,  mesesCuota);
	}
	
		
	public Double getSueldoAnual() {
		return getSueldoNetoMensual() * 12;
	}
		
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public Double getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	public Banco getBanco() {
		return this.banco;
	}

	public Propiedad getPropiedades() {
		return this.propiedad;
	}

	public List<Credito> getCreditos() {
		return this.creditos;
	}

	public void agregarCredito(Credito credito) {
		this.creditos .add(credito);		
	}
}
