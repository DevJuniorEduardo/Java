public class PracticoCosas {
    public static void main(String[] args) {
        //
        /*final Empleados trabajador1 = new Empleados("Paco"); // Si se le agrega final al principio, se vuelve como una constante
        Empleados trabajador2 = new Empleados("Anna");
        Empleados trabajador3 = new Empleados("Raul");
        Empleados trabajador4 = new Empleados("Juan"); */
        
        Empleados[] trabajador = new Empleados[4];
        
        trabajador[0] = new Empleados("Paco");
        trabajador[1] = new Empleados("Anna");
        trabajador[2] = new Empleados("Raul");
        trabajador[3] = new Empleados("Juan");
        
        /* trabajador1.cambiaSeccion("RRHH");
        trabajador3.cambiaSeccion("Medicina"); */
        
        trabajador[0].cambiaSeccion("RRHH");
        trabajador[2].cambiaSeccion("Medicina");
        
        // trabajador2.cambiaNombre("Maria"); // Uso del constructor/metodo cambiaNombre
        // trabajador1 = new Empleados("Jose"); // Cambia la referencia de trabajador1 y es como tener un nuevo empleado que remplaza al 1ro

        for (int i = 0; i < trabajador.length; i++) {
            System.out.println(trabajador[i].devuelveDatos());
        }
        
        System.out.println(Empleados.dameIdSiguiente());
        
    }
}

class Empleados {
    public Empleados(String nombre) {
        this.nombre = nombre;
        seccion = "TI";
        
        id = idSiguiente;
        idSiguiente++;
    }

    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }

    /*public void cambiaNombre(String nombre) { // Desactivado porque no se requiere cambiar nombres de los empleados
        this.nombre = nombre;
    }*/

    public String devuelveDatos() {
        return "Su nombre es: " + nombre + "\n su seccion es: " + seccion + " y su id es: " + id + "\n";
    }
    
    
    
    public static String dameIdSiguiente() { // Un metodo static solo puede acceder a campos que solo sean static
        return "El ID siguiente es: " + idSiguiente;
    }

    private final String nombre; // Con "final" vuelve una Constante a la variable
    private String seccion;
    private int id;
    private static int idSiguiente = 1;
}