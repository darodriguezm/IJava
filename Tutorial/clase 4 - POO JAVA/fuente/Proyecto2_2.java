package cencosud.qa.clases.java;

public class Proyecto2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a); //11
		System.out.println(++a); //12
		
		System.out.println(a--);
		System.out.println(a); //11
		System.out.println(--a); //10
		
		
		int b = 6;
		b *= 2;
		System.out.println("Valor de b: " + b);
		
		int c = 9;
		c /= 3;
		System.out.println("Valor de c: " + c);
		
		long d = 9;
		d %= 2;
		System.out.println("Valor de d: " + d);
		
		char miC = 'n';
		
		if (miC == 'l'){
			System.out.println("es verdadero");
		} else if (miC == 'h'){
			System.out.println("es falso");
		} else if (miC == 'n'){
			System.out.println("es una n");
		} else {
			System.out.println("ninguna de las anteriores");
		}
		
		System.out.println('A' == 'A' ? "son iguales" : "son diferentes");
	
		String result = 'A' == 'A' ? "son iguales" : "son diferentes";
		System.out.println(result);
		

		String result2 = 'A' == 'A' ? ('F' == 'F' ? "es F" : "No es F") : "son diferentes";
		System.out.println(result2);
		
		int miV = 5;
		while (miV > 0){
			System.out.println(miV);
			miV--;
		}
		
		System.out.println("------------------");
		
		miV = 5;
		
		do {
			System.out.println(miV);
			miV--;
		} while (miV > 0);
		
		for (int i = 0; i < 10; i = i + 2) {
			System.out.println("Iterador: " + i);
		}
		
		int l = 10;

		switch (l) {
		case 10:
			System.out.println("esto vale 10");
			break;

		case 11:
			System.out.println("Esto vale 11");
			break;

		case 130:
			System.out.println("Es mucho!!!");
			break;

		default:
			System.out.println("la acción por defecto");
		}
		
		String miString1 = new String("Hola, yo soy un String");
		String miString2 = "Hola, yo soy otra cadena de String";
		
		System.out.println("Mi cadena 1 tiene : " + miString1.length() + " caracteres");
		System.out.println("Mi cadena 2 tiene : " + miString2.length() + " caracteres");
		
		System.out.println("Caracter 8 de la cadena 1 : " + miString1.charAt(9));
		System.out.println("Porción hasta el índice 3: " + miString2.substring(3, 7));
		
		System.out.println("ubicación de un caracteres o palabra: " + miString2.indexOf("String"));
		
		System.out.println(miString1.equals(miString2));
		
		System.out.println(miString1.compareTo(miString2));
		System.out.println(miString2.compareTo(miString1));
		
		//long arrLong[];
		
		char arrLong[] = new char[miString1.length()];
		
		for (int j = 0; j < miString1.length(); j++) {
			arrLong[j] = miString1.charAt(j);
			System.out.println("Estoy guardando: " + arrLong[j]);
		}
		
		System.out.println(arrLong.length);
		
		
		System.out.println("Argumentos");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

}
