package com.oo2.grupo7.datos;

import java.time.LocalTime;

public class Empleado extends Persona{
	private int idEmpleado;
	private String clave;
	private Empresa idEmp;
	private LocalTime entrada;
	private LocalTime salida;
	
	public Empleado(String nombre, String apellido, String email, int dni, String clave, Empresa idEmp, LocalTime entrada,
			LocalTime salida) {
		super(nombre, apellido, email, dni);
		this.clave=clave;
		this.idEmp = idEmp;
		this.entrada = entrada;
		this.salida = salida;
	}
	
	public Empleado() {
		
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Empresa getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(Empresa idEmp) {
		this.idEmp = idEmp;
	}

	public LocalTime getEntrada() {
		return entrada;
	}

	public void setEntrada(LocalTime entrada) {
		this.entrada = entrada;
	}

	public LocalTime getSalida() {
		return salida;
	}

	public void setSalida(LocalTime salida) {
		this.salida = salida;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	

}
