package cencosud.clases.java;

public class HijoDeSkuItem extends SkuItem {

	public HijoDeSkuItem(String nombre, double id) {
		super(nombre, id);
		// TODO Auto-generated constructor stub
	}
	
	public HijoDeSkuItem(String nombre, double id, int departamento){
		super(nombre, id);
		this.setDepartamento((short)departamento);
	}

}
