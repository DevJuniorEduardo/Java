import static javax.swing.JOptionPane.showInputDialog;
public class Bucles4 {
	public static void main(String[] args) {
		// Resuelve factoriales
		int resultado = 1;
		int numero = Integer.parseInt(showInputDialog("Ingrese un num a factorizar:"));
		for (int i = numero; i > 0; i--) resultado = resultado * i; // Si hay una sola linea se puede poner asi.
		System.out.println("El factorial de " + numero + " es: " + resultado);
	}
}