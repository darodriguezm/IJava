package cencosud.clases.java;

public class EanItem extends BaseArticulos {

	public EanItem(String nombre, double id) {
		super(nombre, id);
		// TODO Auto-generated constructor stub
		
	}
	
	public void ejecutarMetodoAjeno(BaseArticulos claseAjena){
		String nombreAjeno = claseAjena.getNombre();
		System.out.println(nombreAjeno);
	}
	
}
