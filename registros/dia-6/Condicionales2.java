import java.util.Scanner;
public class Condicionales2 {
	public static void main(String[] args) {
		// Usando Switch-case
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingraduce el nº del mes a saber:");
		int numeroMes = entrada.nextInt();
		entrada.nextLine();

		// Uso Nº 1
		switch (numeroMes) {
		case 1:
			System.out.println("Enero");
			break; // Detiene la condicion
		case 2:
			System.out.println("Febrero");
			break; // Detiene la condicion
		case 3:
			System.out.println("Marzo");
			break; // Detiene la condicion
		case 4:
			System.out.println("Abril");
			break; // Detiene la condicion
		case 5:
			System.out.println("Mayo");
			break; // Detiene la condicion
		case 6:
			System.out.println("Junio");
			break; // Detiene la condicion
		case 7:
			System.out.println("Julio");
			break; // Detiene la condicion
		case 8:
			System.out.println("Agosto");
			break; // Detiene la condicion
		case 9:
			System.out.println("Septiembre");
			break; // Detiene la condicion
		case 10:
			System.out.println("Octubre");
			break; // Detiene la condicion
		case 11:
			System.out.println("Noviembre");
			break; // Detiene la condicion
		case 12:
			System.out.println("Diciembre");
			break; // Detiene la condicion
		default: // Si no encuentra otro resultado
			System.out.println("Nº del mes incorrecto");
	    }

	    // Uso Nº2
	    System.out.println("Ingraduce dia de la semana:");
		String diaSemana = entrada.nextLine();

		String resultado = switch (diaSemana) { // Se puede guardar en una variable
		case "Lunes", "Martes", "Miercoles", "Juves", "Viernes" -> "Laborable"; // Se puede agrupar
		case "Sabado", "Domingo" -> "Festivo";
		default -> { // Asi se puede ejecutar varias lineas de codigo
			System.out.println("Procesando...");
			yield "Dia no valido";
		}
		};
		System.out.println(resultado);
	}
}