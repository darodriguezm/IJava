package cencosud.qa.clases.java;

public class Persona {
	private String nombre;
	private int rut;
	private int edad;
	public long dineroEnCtaCte=0;
	public String apellido;
	
	public Persona(int rut, int edad){
		this.rut = rut;
		this.edad = edad;
	}
	
	public Persona(String apellido){
		
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void imprimirDetalle(){
		System.out.println(nombre + ", de RUT: " + rut + " tiene " + edad + " años de edad.");
	}
}
