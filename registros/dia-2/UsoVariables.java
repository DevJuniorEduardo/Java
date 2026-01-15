public class UsoVariables {
	public static void main(String[] args) {
		// Variable uso simple
		var edad1 = 17; // No se puede crear la variable y luego inicializarla con var
		System.out.println(edad1);
		edad1 = 35; // Se puede cambiar luego el valor pero no lo cambia si se adelanta de la linea donde se pedira 

		// Para inicializar la variable pero no se que poner o puede cambiar, se le pone 0 para INT o '' para String
		String nombre1 = ""; // Se la puede inicializar con conmillas dobles y sin nada dentro
		nombre1 = "Juan";
		System.out.println(nombre1); 

		// Operadores comunes en Java - Aritmeticos - Logicos - Relacionales - Booleanos
		int edad2 = 15;
		edad2++;
		String nombre2 = "Joni";
		System.out.println("El dia de hoy " + nombre2 + " cumple " + edad2 + " años");
	}
}
