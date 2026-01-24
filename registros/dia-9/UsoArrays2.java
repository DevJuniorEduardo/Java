public class UsoArrays2 {
	public static void main(String[] args) {
		// Usando el bucle for-each, esta pensado en leer archivos escalabres
		String [] nombres = {"Juan", "Perez", "Jonas", "Sergio", "Pepe", "Elisa", "William"};

		for (String elementos : nombres) { // Syntasis del for-each
			System.out.println(elementos); // Se puede hacer en una linea si es solo una linea
		}
	}
}