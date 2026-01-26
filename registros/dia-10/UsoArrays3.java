public class UsoArrays3{
	public static void main(String[] args) {
		// Arrays bidimensionales (Array en una Array)
		/*int [][] arrayBidi = new int[2][2];

		// Rellenando array nº1
		arrayBidi[0][0] = 27;
		arrayBidi[0][1] = 03;
		arrayBidi[1][0] = 2006;
		arrayBidi[1][1] = 2026;

		// Recorriendo array nº1
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(arrayBidi[i][j]);
			}
		}*/

		// Creando y Rellenando una array nº2
		int [][] matrix = {
			{10, 15, 18, 19, 21}, // K = 0
			{1, 5, 8, 9, 2}, // K = 1
			{102, 156, 184, 192, 210} // K = 2
		};

		// Recorriendo array nº2
		for (int k = 0; k < 3; k++) {
			for (int l = 0; l < 5; l++) {
				System.out.println(matrix[k][l]);
			}
		}

		// Recorriendo array nº3
		for (int [] fila: matrix) { // Le dice a java que se almacenara arrays
			System.out.println();
			for (int z : fila) { // Guarda la cantidades de array que hay en fila a z
				System.out.print(z + " ");
			}
		}
	}
}