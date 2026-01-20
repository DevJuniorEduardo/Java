// A los condicionales se les considera controlador de flujo, por que modifica el fujo normal
import java.util.*;
public class Condicionales1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingraduce su edad:");
		int edad = entrada.nextInt();

		if (edad >= 18 && edad < 35) { // Condicional if
			System.out.println("Eres joven");
		} else if (edad > 35 && edad < 60) { // Condicional else if
			System.out.println("Eres maduro");
		} else if (edad > 60 && edad < 90) { // Condicional else if
			System.out.println("Eres viejo");
		} else if (edad > 90 && edad < 110) { // Condicional else if
			System.out.println("Eres muy viejo");
		} else if (edad > 110) { // Condicional else if
			System.out.println("Eres muy pero muy viejo");
		}else if (edad < 18) { // Condicional else if
			System.out.println("Eres muy joven");
		} else { // Condicional else
			System.out.println("Error, verifique que sean los datos correctos.");
		}

		// Operador ternario (Porque opera 3 operandos)
		System.out.println("Ingraduce su edad:");
		int edad = entrada.nextInt();

		// (Condicion) ? ( Valor Si es verdad):(Valor si no es verdad)
		String resultado = (edad <= 18) ? "Eres menor de edad":"Eres mayor de edad";
		System.out.println(resultado);

		entrada.close(); // Cierra el (System.in) de para todos, no se vuelve a abrir
	}
}