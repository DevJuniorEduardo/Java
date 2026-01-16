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

		// Declaracion multiple
		int operador1 = 7, operador2 = 9, resultado = operador1 - operador2;
		System.out.println(resultado);

		// Inicializar valiables con el mismo valor
		int a, b, c;
		a = b = c = 10;
		System.out.println(a + b + c); // 30

		// Usando Casting
		byte num1 = 15, num2 = 25;
		byte result = (byte)(num1 + num2);
		System.out.println(result);
	}
}
