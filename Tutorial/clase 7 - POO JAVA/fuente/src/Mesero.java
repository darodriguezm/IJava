import interfaces.IEspolvoreable;

public class Mesero {
	
	public void servir(IEspolvoreable alimento){
		alimento.espolvorear(alimento.CHOCOLATE, 10);	
		System.out.println("Me llevo el alimento a la mesa");
	}
}
