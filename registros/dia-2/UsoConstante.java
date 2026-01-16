public class UsoConstante {

	private static final double PI = 3.1416; // Constante de clase

	public static void main(String[] args) {
		// Una constante no te permite cambiar su valor luego
		final int nacimiento = 2006;
		System.out.println(nacimiento);

		// Cuantas cm hay en pulgadas
		final double pulgada = 2.54;
		int cm = 7;
		double resultado = cm * pulgada;
		System.out.println(resultado);
	}
}