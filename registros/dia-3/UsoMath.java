public class UsoMath {
	public static void main(String[] args) {
		// Uso de Math
		double raiz1 = Math.sqrt(9); // Math convierte INT a Double como parametro, pq no hay perdida de informacion
		System.out.println(raiz1);

		// Usando casting
		int raiz2 = (int)Math.sqrt(9); // Con el casting ya no devolvera Double si no INT, pero se perdera inf
		System.out.println(raiz2);
	}
}