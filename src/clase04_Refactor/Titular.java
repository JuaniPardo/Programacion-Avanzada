package clase04_Refactor;

public class Titular {
    private String nombre;
    private String apellido;
    private int edad;

    public Titular(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return (nombre + " " + apellido);
    }
}
