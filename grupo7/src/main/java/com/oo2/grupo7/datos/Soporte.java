package com.oo2.grupo7.datos;

public class Soporte extends Persona{
	private int idSoporte;
	private String clave;
	private int LimitTickets;
	
	public Soporte(String nombre, String apellido, String email, int dni, String clave, int limitTickets) {
		super(nombre, apellido, email, dni);
		//this.idSoporte = idSoporte;
		this.clave=clave;
		this.LimitTickets = limitTickets;
	}
	
	public Soporte() {
		
	}

	public int getIdSoporte() {
		return idSoporte;
	}

	public void setIdSoporte(int idSoporte) {
		this.idSoporte = idSoporte;
	}

	public int getLimitTickets() {
		return LimitTickets;
	}

	public void setLimitTickets(int limitTickets) {
		LimitTickets = limitTickets;
	}

	public String getPass() {
		return clave;
	}

	public void setPass(String pass) {
		this.clave = pass;
	}
	
	
	
}
