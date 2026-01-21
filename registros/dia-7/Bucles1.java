import static javax.swing.JOptionPane.showInputDialog;

public class Bucles1 {
	public static void main(String[] args) {
		// Usando While
		String clave = "Lunes";
		String pass = "";
		while (clave.equals(pass) == false) { // Equals compara 2 cadenas
			pass = showInputDialog("Indroduce la contraseña");
			if (clave.equals(pass) == false) { // Se puede poner en una sola linea sin {} pero no quiero
				System.out.println("Contraseña incorrecta.");
			}
		}
		System.out.println("Acceso correcto");
	}
}