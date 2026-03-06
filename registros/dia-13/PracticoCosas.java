package poo;

public class PracticoCosas {
    public static void main(String[] args) {
        //
        /*final */Empleados trabajador1 = new Empleados("Paco"); // Si se le agrega final al principio, se vuelve como uns const
        Empleados trabajador2 = new Empleados("Anna");
        
        trabajador1.cambiaSeccion("RRHH");
        //trabajador2.cambiaNombre("Maria"); 
        
        trabajador1 = new Empleados("Jose"); // Cambia la referencia de trabajador1
        
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
    }
}

class Empleados {
    public Empleados(String nombre) {
        this.nombre = nombre;
        seccion = "TI";
    }
    
    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    /*public void cambiaNombre(String nombre) {
        this.nombre = nombre;
    }*/
    
    public String devuelveDatos() {
        return "Su nombre es: " + nombre + " y su seccion es: " + seccion;
    }
    
    private final String nombre; // Con "final" vuelve una Constante a la variable
    private String seccion;
}