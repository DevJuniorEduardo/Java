public class UsoClases {
	public static void main(String[] args) {

		UsoObjetos renaul = new UsoObjetos();
		renaul.ancho = 1520.5;
		renaul.arrancar();

		UsoObjetos mazda = new UsoObjetos();
		mazda.color = "Azul";
		mazda.setRuedas(4);
		mazda.girar();

		System.out.println("El coche tiene: " + mazda.getRuedas());
	}
}