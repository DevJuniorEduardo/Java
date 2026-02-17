public class UsoObjetos {
	// Metodo de constructor
	public UsoObjetos() {
		ruedas = 4; // Da un estado inicial
		color = "Gris";
	}

	// Propiedades // Esta Encapsulada
	private double ancho;
	private double alto;
	private double peso;
	private String color;
	private int ruedas;

	// Un metodo de entrada, Setter
	public void setRuedas(int ruedas) {
		if (ruedas < 3 || ruedas > 4) System.out.println("El numero de ruedas no puede ser ese.");
		else this.ruedas = ruedas;
	}

	public void setColor(String color) {
		this.color = color; // "This" ayuda a diferenciar el campo de clase (con el this) y el parametro
	}

	// Como leer o devolver un valor encapsulado, Getter
	public int getRuedas () {
		return ruedas;
	}

	public String getColor () {
		return color;
	}

	// Metodos
	void arrancar() {}
	void frenar() {}
	void girar() {}
}