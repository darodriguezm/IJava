import java.util.ArrayList;
import java.util.Iterator;

public class Masa {
	static final double TAMAÑO_BOWL = 1000.0;

	private ArrayList<String> ingredientes;
	private double cm3Mezcla;

	public Masa() {
		ingredientes = new ArrayList<String>();
		cm3Mezcla = 0.0;
	}

	protected void agregarIngrediente(String ingrediente, double cm3Ingrediente) {
		if ((cm3Mezcla + cm3Ingrediente) > TAMAÑO_BOWL) {
			System.out.println("No se pueden añadir más ingredientes al bowl\ntamaño sobrepasdo");
		} else {
			ingredientes.add(ingrediente);
			cm3Mezcla += cm3Ingrediente;
		}
	}

	protected ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	protected double getCM3Mezcla() {
		return cm3Mezcla;
	}

	public void mezclar() {
		if (ingredientes.size() > 0) {
			System.out.println("Se están incorporando los ingredientes siguientes:");
			Iterator<String> it = ingredientes.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());
			}
		} else {
			System.out.println("No hay elementos en el bowl");
		}
	}

	// Método que se complementará con las clases que hereden de esta.
	public void vertir() {
		System.out.print("Vertiendo mezcla sobre ");
	}
}
