public class UsoObjetos {
	// Propiedades
	double ancho;
	double alto;
	double peso;
	String color;
	private int ruedas; // Esta Encapsulada

	// Un metodo de entrada o Setter
	public void setRuedas(int r) {
		if (r < 3 || r > 4) {
			System.out.println("El numero de ruedas no puede ser ese.");
		} else {
			ruedas = r;
		}
	}

	// Como leer o devolver un valor encapsulado, Getter
	public int getRuedas () {
		return ruedas;
	}

	// Metodos
	void arrancar() {}
	void frenar() {}
	void girar() {}
}