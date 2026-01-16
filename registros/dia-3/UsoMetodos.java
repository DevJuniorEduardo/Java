import java.math.BigInteger; // Importacion

public class UsoMetodos {
	public static void main(String[] args) {
		// Uso pow (Potencia)
		double potencia1 = Math.pow(5, 3); // Es igual a 5 elevado a 3, el resultado es 125
		System.out.println(potencia1);

		// Usando BigInteger
		BigInteger base = BigInteger.valueOf(25); // No pertenece al paquete java.lang
		int exponente2 = 32;
		BigInteger potencia2 = base.pow(exponente2); // El pow pertenece a la clase BigInteget y no a java.lang
		System.out.println(potencia2);

		// Usando metodo Random (Da un num aleatorio)
		double aleatorio1 = Math.random()*100;
		System.out.println(aleatorio1);

		// Usando metodo Random con Casting
		int aleatorio2 = (int)(Math.random()*100);
		System.out.println(aleatorio2);

		// Usando metodo Random con Round (Pasa de Float a INT) y casting
		int aleatorio3 = Math.round((float)(Math.random()*100));
		System.out.println(aleatorio3);

		// Usando abs (Devuelve el valor absoluto o su longitud en la recta numerica) siempre positivos
		int absoluto1 = Math.abs(-45);
		System.out.println(absoluto1);

		// Usando Max (Nos devuelve el valor mas grande de dos valores)
		int mayor1 = Math.max(3, 7);
		System.out.println(mayor1);
	}
}