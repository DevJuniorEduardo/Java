import static javax.swing.JOptionPane.showInputDialog;
public class Bucles2 {
	public static void main(String[] args) {
		// Usando Do-While - Calcular el peso ideal por medio de la altura y el genero
		int altura = 0, encontrado = 0;
		String genero = "";

		do {
			genero = showInputDialog("Ingrese su genero (M/F):");
			switch (genero) {
			case "M", "m", "F", "f" -> {
				altura = Integer.parseInt(showInputDialog("Ingrese su altura en cm:"));
				encontrado = 1;
			}
			default -> System.out.println("Error en la respuesta.");
			}
		} while (encontrado == 0);

		switch (genero) {
		case "M", "m" -> {
			int pesoIdealM = altura - 110;
			System.out.println("Su peso ideal es: " + pesoIdealM);
		}
		case "F", "f" -> {
			int pesoIdealF = altura - 120;
			System.out.println("Su peso ideal es: " + pesoIdealF);
		}
		default -> System.out.println("Error.");
		}

		/* Tambien sirve
		if (genero.squalsIgnoreCase("H")) {
			int pesoIdealM = altura - 110;
			System.out.println("Su peso ideal es: " + pesoIdealM);
		} else is (genero.squalsIgnoreCase("F")) {
			int pesoIdealM = altura - 120;
			System.out.println("Su peso ideal es: " + pesoIdealF);
		}
		*/

	}
}