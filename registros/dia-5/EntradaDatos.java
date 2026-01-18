import java.util.Scanner;
public class EntradaDatos {
	public static void main(String[] args) {
		// Entrada y Salida de datos (Scanner)
		Scanner entrada = new Scanner(System.in); // Abre el Scanner
		System.out.println("Introduce tu nombre, por favor:");
		String nombre_usuario = entrada.nextLine();
		System.out.println("Ingrese su edad:");
		int edad = entrada.nextInt();
		System.out.println("Hola " + nombre_usuario + ", Tienes " + nombre_usuario + " años.");
		entrada.close(); // Cierra el Scanner
	}
}