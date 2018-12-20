import interfaces.IEspolvoreable;
import interfaces.IFreible;

public class CalzonRoto
extends Masa
implements IFreible, IEspolvoreable{
	
	@Override
	public void espolvorear(String sabor, int gramos) {
		// TODO Auto-generated method stub
		switch (sabor) {

		case CHOCOLATE:
			System.out.println("¡¡Que rico es el " + CHOCOLATE);
			System.out.println("le vamos a echar: " + gramos + " gramos");
			break;

		case CANELA:
			System.out.println("¡¡Me encanta la " + CANELA);
			System.out.println("le vamos a echar: " + gramos + " gramos");
			break;

		case AZUCAR_FLOR:
			System.out.println("¡¡Azucar mala, sin embargo te quiero!!");
			System.out.println("le vamos a echar: " + gramos + " gramos");
			break;

		default:
			System.out.println("No podemos espolvorear ningún otro sabor");
		}
	}

	@Override
	public void freir(int minutos) {
		// TODO Auto-generated method stub
		System.out.println("Mi masa va a estar haciendo Tsssssssssssss " + minutos + " minutos");
	}
	
	@Override
	public void vertir(){
		super.vertir();
		System.out.println("la freidora");
	}
}