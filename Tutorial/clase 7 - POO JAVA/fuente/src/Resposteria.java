public class Resposteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalzonRoto calzon1 = new CalzonRoto();
		
		calzon1.agregarIngrediente("Harina", 200);
		calzon1.agregarIngrediente("Mantequilla", 125);
		calzon1.agregarIngrediente("Agua", 50.5);
		calzon1.agregarIngrediente("Vainilla", 5);
		
		System.out.println("Masa de tamaño: " + calzon1.getCM3Mezcla() + " cm3");
		calzon1.mezclar();
		calzon1.vertir();
		
		calzon1.freir(15);
		
		calzon1.espolvorear(calzon1.CANELA, 3);
		calzon1.espolvorear(calzon1.CHOCOLATE, 4);
		calzon1.espolvorear(calzon1.AZUCAR_FLOR, 2);
		calzon1.espolvorear("NUES MOSCADA", 1);
	
		Mesero mesero = new Mesero();
		mesero.servir(calzon1);
		
		Masa masa1 = new Masa();
		//mesero.servir(masa1);
	}
	
}
