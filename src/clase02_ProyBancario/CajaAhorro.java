package clase02_ProyBancario;

public class CajaAhorro extends Cuenta {
    private double interes;

    public CajaAhorro(double iniBalance, double interes) {
        super(iniBalance);
        this.interes = interes;
    }
}
