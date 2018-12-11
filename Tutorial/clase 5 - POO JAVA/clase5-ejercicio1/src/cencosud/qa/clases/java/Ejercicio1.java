package cencosud.qa.clases.java;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona varAlterna1 = new Persona(13999800, 32);
		Persona varAlterna2 = new Persona(10455665, 11);
		
		varAlterna1.setNombre("Juan");
		varAlterna2.setNombre("Pedro");
		
		System.out.println(varAlterna1.getNombre());
		System.out.println(varAlterna2.getNombre());
		
		varAlterna1.imprimirDetalle();
		
		varAlterna1.dineroEnCtaCte=100;
		
		//Creación de instancia de clase FiguraGerometrica
		FiguraGeometrica cubo = new FiguraGeometrica(100, 100, 100);
		FiguraGeometrica piramide = new FiguraGeometrica(100, 100, 90);
		FiguraGeometrica rectangulo = new FiguraGeometrica(200, 50);
		
		cubo.dibujar();
		piramide.dibujar();
		rectangulo.dibujar();
	}

}
