public class UsoArrays {
	public static void main(String[] args) {
		// Usando Arrays

		// Se puede crear y luego inicializarla
		int [] miArray;
		miArray = new int[5];

		int [] miArray = new int[5]; // Array, como se escribe normalmente

		miArray[0] = 5; miArray[1] = 15; miArray[2] = 52; // Asi se inicializa
		miArray[3] = 53; miArray[4] = 85;
		//System.out.println(miArray[3]); // Asi se muestra un elemento
		//for (int i = 0; i < 5; i++) System.out.println(miArray[i]); // Muestra todo y es mas corto

		int [] miArray2 = {1, 4, 7, 8, 0, 55, 78, 37, 11, 22, 78, 22, 55, 80, 42}; // Array mas resumida
		// System.out.println(miArray2.length); // Me muestra la longitud de la Array
		for (int i = 0; i < miArray2.length; i++) System.out.println(miArray2[i]);
	}
}