package cencosud.clases.java;

public class Herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkuItem nuevoSkuItem = new SkuItem("Bebida Cocacola 1lt retornable", 7801999);
		EanItem nuevoEanItem = new EanItem("Esponja amarilla con lija", 4054);
		BaseArticulos miBase = new BaseArticulos("Clase base", 1);
		HijoDeSkuItem nietoBaseArticulos = new HijoDeSkuItem("nieto de Base Artículos", 4980, 43);
		
		nuevoEanItem.ejecutarMetodoAjeno(miBase);
		nuevoEanItem.ejecutarMetodoAjeno(nuevoSkuItem);
		nuevoEanItem.ejecutarMetodoAjeno(nietoBaseArticulos);
		
		System.out.println(nietoBaseArticulos.getDepartamento());
	}
}
