import static javax.swing.JOptionPane.showInputDialog;
public class Ejercicio3 {
	public static void main(String[] args) {
		// Agrega a una array hasta 9 elementos
		String [] paises = new String[8];
		for (int i = 0; i < paises.length; i++) paises[i] = showInputDialog("Introduce un pais: ");
		for (String elementos : paises) System.out.println(todo);
	}
}