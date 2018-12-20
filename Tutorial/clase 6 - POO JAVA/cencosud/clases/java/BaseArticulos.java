package cencosud.clases.java;

public class BaseArticulos {
	private String nombre;
	private double id;
	private int largoCodigo;
	private short departamento;
	
	public BaseArticulos(String nombre, double id) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		this.id = id;
		this.largoCodigo = Double.toString(id).length();
	}
	
	protected String getNombre(){
		return this.nombre;
	}

	protected short getDepartamento() {
		return departamento;
	}
	
	protected void setDepartamento(short departamento) {
		this.departamento = departamento;
	}
	
	protected double getId() {
		return this.id;
	}
	
	private int getLargoCodigo() {
		return largoCodigo;
	}
	
	public boolean esCodigoEAN12(){
		return getLargoCodigo() == 12;
	}
	
}
