public class UsoString {
	public static void main(String[] args) {
		// Usando String
		String nombre1 = "Juan";
		String nombre2 = new String("Juan"); // Hacen lo mismo o algo muy parecido

		// Usando Length
		System.out.println("Mi nombre tiene " + nombre1.length() + " letras"); // Version abreviada
		int longitud1 = nombre1.length(); System.out.println(longitud1); // Version larga

		// Usando CharAt
		System.out.println("La primera letra de mi nombre es " + nombre1.charAt(0));
		int ultimoCaracter = nombre1.length() - 1;
		System.out.println("La primera letra de mi nombre es " + nombre1.charAt(ultimoCaracter));

		// Usando Substring (Empieza a contar desde 0 - El ultimo caracter no lo toma)
		String frase = "Hoy es un estupendo dia para aprender a programar en Java";
		String subCadena1 = frase.substring(4, 19);
		System.out.println("Hoy " + subCadena1 + " dia");

		// Usando Substring pero con un parametro
		String subCadena2 = frase.substring(4);
		System.out.println(subCadena2);

		// Usando Equals (Esta comprara si son exactamente igual)
		String alumno1 = "David";
		String alumno2 = "david";
		System.out.println(alumno1.equals(alumno2)); // Compara el nombre1 con el nombre2

		// Usando EqualsIgnoreCase (Es igual al otro pero no tiene en cuenta MAY y MIN)
		String alumno3 = "Anna";
		String alumno4 = "anna";
		System.out.println(alumno3.equalsIgnoreCase(alumno4));
	}
}