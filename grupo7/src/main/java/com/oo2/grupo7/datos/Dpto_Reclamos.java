package com.oo2.grupo7.datos;

public class Dpto_Reclamos {
	private int idDpto;
	private Soporte idSupp;
	
	public Dpto_Reclamos(int idDpto, Soporte idSupp) {
		super();
		this.idDpto = idDpto;
		this.idSupp = idSupp;
	}
	
	public Dpto_Reclamos() {
		
	}

	public int getIdDpto() {
		return idDpto;
	}

	public void setIdDpto(int idDpto) {
		this.idDpto = idDpto;
	}

	public Soporte getIdSupp() {
		return idSupp;
	}

	public void setIdSupp(Soporte idSupp) {
		this.idSupp = idSupp;
	}
	
	

}
