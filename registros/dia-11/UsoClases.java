public class UsoClases {
	public static void main(String[] args) {

		UsoObjetos renaul = new UsoObjetos();
		renaul.setColor("Azul");
		renaul.arrancar();

		UsoObjetos mazda = new UsoObjetos();
		mazda.setRuedas(3);
		mazda.girar();

		System.out.println("El coche tiene: " + mazda.getRuedas());
		System.out.println("El coche tiene color: " + renaul.getColor());
	}
}