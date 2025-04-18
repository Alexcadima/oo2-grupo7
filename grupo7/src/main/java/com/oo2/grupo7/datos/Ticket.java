package com.oo2.grupo7.datos;

public class Ticket {
	private int idTicket;
	private Empleado emp;
	private Soporte supp;
	private Dpto_Reclamos dpto;
	private String descripcion;
	private boolean estado;
	
	public Ticket(Empleado emp, Soporte supp, Dpto_Reclamos dpto, String descripcion, boolean estado) {
		super();
		//this.idTicket = idTicket;
		this.emp = emp;
		this.supp = supp;
		this.dpto = dpto;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	
	public Ticket() {
		
	}

	public int getIdTicket() {
		return idTicket;
	}

	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}

	public Empleado getEmp() {
		return emp;
	}

	public void setEmp(Empleado emp) {
		this.emp = emp;
	}

	public Soporte getSupp() {
		return supp;
	}

	public void setSupp(Soporte supp) {
		this.supp = supp;
	}

	public Dpto_Reclamos getDpto() {
		return dpto;
	}

	public void setDpto(Dpto_Reclamos dpto) {
		this.dpto = dpto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	

}
