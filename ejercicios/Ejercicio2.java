import java.util.Scanner;
public class Bucles2 {
	public static void main(String[] args) {
		// Uso de Math.random y Util.Scanner
		int intentos = 0;
		int numero = (int)(Math.random() * 100) + 1;
		int respuesta = 0;
		Scanner guardar = new Scanner(System.in);

		System.out.println("Ingrese un numero entre 1 y 100:");
		while(numero != respuesta && intentos < 10) {
			intentos++;
			respuesta = guardar.nextInt();
			guardar.nextLine(); // Por si las dudas
			if (respuesta < numero) {
				System.out.println("El numero generado es mas grande.\n");
			} else if (respuesta > numero) {
				System.out.println("El numero generado es mas chico.\n");
			}
		}
		if (respuesta == numero) {
			System.out.println("\nEl numero ingresado es correcto. Intentos realizados: " + intentos);
		} else if (intentos == 10) {
			System.out.println("\nSe te acabaron los intentos. El numero correcto era: " + numero);
		} else {
			System.out.println("\nA habido un Error.");
		}
	}
}