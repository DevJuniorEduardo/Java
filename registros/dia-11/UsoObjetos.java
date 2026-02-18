public class UsoObjetos {
	// Metodo de constructor
	public UsoObjetos() {
		ruedas = 4; // Da un estado inicial
		color = "Gris";
		pesoBase = 1350.25;
		precioBase = 15650.25;

		peso = pesoBase;
		precio = precioBase;
	}

	// Propiedades // Esta Encapsulada

	private String color;
	private int ruedas;

	private double pesoBase;
	private double peso;
	private boolean climatizador;
	private boolean asientosCuero;
	private double precioBase;
	private double precio;

	//
	public void setPeso () { // Un metodo de entrada, Setter
		if (asientosCuero) pesoBase += 50;
		if (climatizador) pesoBase += 70;
		peso = pesoBase;
	}
	public double getPeso() { // Como leer o devolver un valor encapsulado, Getter
		return peso;
	}

	//
	public void setPesoBase (double pesoBase) {
		this.pesoBase = pesoBase; // "This" ayuda a diferenciar el campo de clase (con el this) y el parametro
	}
	public double getPesoBase() {
		return pesoBase;
	}

	//
	public void setPrecio () {
		if (climatizador) precioBase += 3250.20;
		if (asientosCuero) precioBase += 3500;
		precio = precioBase;
	}
	public double getPrecio() {
		return precio;
	}

	//
	public void setPrecioBase (double precioBase) {
		this.precioBase = precioBase;
	}
	public double getPrecioBase() {
		return precioBase;
	}

	//
	public void setClimatizador (String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) this.climatizador = true;
		else this.climatizador = false;

		setPrecio();
		setPeso();
	}
	public String getClimatizador() {
		if (climatizador) return "El coche incorpora climatizador";
		else return "El coche incorpora aire acondicionado";
	}

	//
	public void setAsientosCuero (String asientosCuero) {
		if (asientosCuero.equalsIgnoreCase("si")) this.asientosCuero = true;
		else this.asientosCuero = false;

		setPrecio();
		setPeso();
	}
	public String getAsientosCuero() {
		if (asientosCuero) return "El coche tiene asientos de cuero";
		else return "El coche no tiene asientos de cuero";
	}


	public void setRuedas(int ruedas) {
		if (ruedas < 3 || ruedas > 4) System.out.println("El numero de ruedas no puede ser ese.");
		else this.ruedas = ruedas;
	}
	public int getRuedas () {
		return ruedas;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public String getColor () {
		return color;
	}


	// Metodos
	void arrancar() {}
	void frenar() {}
	void girar() {}
}