public class Prueba {
	public static void main(String[] args) {
		// Pasa los parametros por Valor y no por Referencia
		Clase1 obj = new Clase1();
		int num = 5;
		obj.duplicador(num);
		System.out.println("Valor de num = " + num);
	}
}

class Clase1 {
	void duplicador(int x) {
		x = x * 2;
		System.out.println("Valor de x = " + x);
	}
}