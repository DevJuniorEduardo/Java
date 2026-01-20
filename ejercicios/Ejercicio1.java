import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
		// Ejercicio con Scanner
		Scanner datos = new Scanner(System.in);
		System.out.println("Por favor ingrese su nombre:");
		String nombre = datos.nextLine();
		System.out.println("Por favor ingrese su apellido:");
		String apellido = datos.nextLine();
		System.out.println("Ingrese su edad:");
		int edad = datos.nextInt();
		System.out.println("Su nombe es completo es " + nombre + " " + apellido + " y tienes " + edad + " años.");

		System.out.println("\nDentro de cuantos años quieres ver su edad?");
		int cambio = datos.nextInt();
		int realizado = edad + cambio;
		System.out.println("Su edad dentro de " + cambio + " es de " + realizado + " años.");
		datos.close();
	}
}