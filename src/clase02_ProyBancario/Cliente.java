package clase02_ProyBancario;

public class Cliente {
    private String primerNombre;
    private String apellido;
    private Cuenta cuenta;

    //Constructor Sobrecargado

    public Cliente(String primerNombre, String apellido) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
    }

    //Getters y Setters

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
