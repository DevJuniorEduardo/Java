import java.util.*;

public class UsoEmpleado {
    public static void main(String[] args) {
             /*Empleado empleado1 = new Empleado("Paco Gomez",  85000, 1990, 12, 17);
                Empleado empleado2 = new Empleado("Ana Perez",  80000, 1980, 10, 07);
                Empleado empleado3 = new Empleado("Juan Lobo",  85000, 1890, 03, 23);
                
                empleado1.subeSueldo(5);
                empleado2.subeSueldo(5);
                empleado3.subeSueldo(5);
                
                System.out.println("Nombre del empleado: " + empleado1.getNombre() +
                " Sueldo: " + empleado1.getSueldo() + 
                " Fecha de contratacion: " + empleado1.getFechaContrato());
                
                System.out.println("Nombre del empleado: " + empleado2.getNombre() +
                " Sueldo: " + empleado2.getSueldo() + 
                " Fecha de contratacion: " + empleado2.getFechaContrato());
                
                System.out.println("Nombre del empleado: " + empleado3.getNombre() +
                " Sueldo: " + empleado3.getSueldo() + 
                " Fecha de contratacion: " + empleado3.getFechaContrato());*/
        
        // Creamos el array de objetos
        Empleado[] misEmpleados = new Empleado[3];
        
        misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana Perez", 80000, 1980, 10, 07);
        misEmpleados[2] = new Empleado("Juan Lobo", 85000, 1890, 03, 23);
        
        // Bucle para subir el sueldo
            // for(int i = 0; i < misEmpleados.length; i++) {
            for (Empleado e : misEmpleados) {
            e.subeSueldo(5);
        }
        
        // Bucle para imprimir (Usando el largo del array)
        //for(int i = 0; i < misEmpleados.length; i++) {
                for (Empleado e : misEmpleados) {
                System.out.println("Nombre: " + e.getNombre() +
            " Sueldo: " + e.getSueldo() + 
            " Fecha: " + e.getFechaContrato());
        }
    }
}

class Empleado {
    public Empleado(String nom, double sue, int age, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
            
        //
        GregorianCalendar calendario = new GregorianCalendar(age, mes - 1, dia);
        altaContrato = calendario.getTime();
    }

    public String getNombre() { return nombre; }
    public double getSueldo() { return sueldo; }
    public Date getFechaContrato() { return altaContrato; }

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * (porcentaje / 100);
        sueldo += aumento;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
}