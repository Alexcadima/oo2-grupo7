package com.oo2.grupo7.datos;

import java.util.ArrayList;

public class Empresa {
	private int idEmpresa;
	private String nombre;
	private ArrayList<Empleado> listEmpleados = new ArrayList<Empleado>();
	
	
	public Empresa(int idEmpresa, String nombre, ArrayList<Empleado> listEmpleados) {
		super();
		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
		this.listEmpleados = listEmpleados;
	}
	
	public Empresa() {
		
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Empleado> getListEmpleados() {
		return listEmpleados;
	}

	public void setListEmpleados(ArrayList<Empleado> listEmpleados) {
		this.listEmpleados = listEmpleados;
	}
	
	

}
