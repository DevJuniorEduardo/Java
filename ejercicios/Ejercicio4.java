// Guardar 200 numeros aleatorias en un array y luego mostrarlo con una for-each

public class Ejercicio4 {
	public static void main(String[] args) {
		int [] aleatorios = new int[200];
		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = (int)(Math.random() * 100) + 1;
		}
		for (int elementos : aleatorios) {
			System.out.print(resultado + " "); // Usando "print" solo sin el "ln" no hace salto de linea
		}
	}
}