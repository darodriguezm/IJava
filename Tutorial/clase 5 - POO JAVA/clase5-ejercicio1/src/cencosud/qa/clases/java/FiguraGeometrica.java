package cencosud.qa.clases.java;

public class FiguraGeometrica {
	private int x, y, z = 0;
	private boolean shape3D;
	
	public FiguraGeometrica(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
		shape3D = true;
	}
	
	public FiguraGeometrica(int x, int y){
		this.x = x;
		this.y = y;
		shape3D = false;
	}
	
	public boolean is3D(){
		return shape3D;
	}
	
	public void dibujar(){
		System.out.println(x + "x" + y + (is3D() ? "x" + z : "" ) );
	}

}
