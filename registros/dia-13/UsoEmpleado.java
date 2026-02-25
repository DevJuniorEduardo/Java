import java.util.*;

public class UsoEmpleado {
	public static void main(String[] args) {
		// Uso de GregoriaCalendar
}

class Empleado { // Mala practica en proyectos Medianos y Grandes
	public Empleado(String nom, double sue, int age, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregoriaCalendar calendario = GregoriaCalendar(age, mes-1, dia);

		altaContrato = calendario.getTime(); // GetTime devuelve un valor date
	}

	public String getNombre() { // Metodo getter
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaContrato() {
		return altaContrato;
	}

	public void subeSueldo(double porcentaje) { // setter o logica de negocio
		double aumento = sueldo * (porcentaje / 100);
		sueldo += aumento;
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;
}