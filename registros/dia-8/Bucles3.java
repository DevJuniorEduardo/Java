import static javax.swing.JOptionPane.showInputDialog;
public class Bucles3 {
	public static void main(String[] args) {
		// Usando bucle For (Por convencion para el 1er bucle es i, para el 2do es j o k;
		for (int i = 0; i < 10; i++) {
			//System.out.println("Juan");
		}

		// Utilidad ejemplo
		String mail = showInputDialog("Introduce su email:");
		int arroba = 0;
		boolean punto = false;
		for (int i = 1; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {
				arroba++;
			}
			if (mail.charAt(i) == '.') {
				punto = true;
			}
		}
		if (arroba == 1 && punto) {
			System.out.println("Email correcto");
		} else {
			System.out.println("Email incorrecto");
		}
	}
}