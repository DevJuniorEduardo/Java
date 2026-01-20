import static javax.swing.JOptionPane.showInputDialog; // Para ser mas precisos y ahorrar mas codigo

public class EntradaDatos2 {
	public static void main(String[] args) {
		// Usando JOptionPane
		String nombre_usuario = showInputDialog("Ingrese su nombre:");
		int edad = Integer.parseInt(showInputDialog("Ingrese su edad:")); // Pasa de String a Intege
		double salario = Double.parseDouble(showInputDialog("Ingrese su salario:")); // Pasa de String a double
		System.out.println("Te llamas " + nombre_usuario + " y este año cumples " + (edad + 1) + " años. Y tienes un salario de " + salario + " pesos.");
	}
}