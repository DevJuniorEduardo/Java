public class UsoVariables {
	public static void main(String[] args) {
		// Variable uso simple
		/* var edad = 17; // No se puede crear la variable y luego inicializarla con var
		System.out.println(edad);
		edad = 35; // Se puede cambiar luego el valor pero no lo cambia si se adelanta de la linea donde se pedira */

		// Para inicializar la variable pero no se que poner o puede cambiar, se le pone 0 para INT o '' para String
		/* String nombre = ""; // Se la puede inicializar con conmillas dobles y sin nada dentro
		nombre = "Juan";
		System.out.println(nombre); */

		// Operadores comunes en Java - Aritmeticos - Logicos - Relacionales - Booleanos
		int edad = 15;
		edad++;
		String nombre = "Juan";
		System.out.println("El dia de hoy " + nombre + " cumple " + edad + " años");
	}
}