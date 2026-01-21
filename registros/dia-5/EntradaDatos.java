import java.util.Scanner;
public class EntradaDatos {
	public static void main(String[] args) {
		// Entrada y Salida de datos (Scanner)
		Scanner entrada = new Scanner(System.in); // Abre el Scanner
		System.out.println("Ingrese su edad:");
		int edad = entrada.nextInt();
		entrada.nextLine(); // "Soluciona" el problema del Buffer consumiendolo
		System.out.println("Introduce tu nombre, por favor:");
		String nombreUsuario = entrada.nextLine(); // Se deberia poner primero este
		System.out.println("Hola " + nombreUsuario + ", Tienes " + edad + " años.");
		entrada.close(); // Cierra el Scanner
	}
}