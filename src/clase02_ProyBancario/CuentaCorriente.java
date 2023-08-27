package clase02_ProyBancario;

public class CuentaCorriente extends Cuenta{
    private double descubierto;

    public CuentaCorriente(double iniBalance, double descubierto) {
        super(iniBalance);
        this.descubierto = descubierto;
    }

    public CuentaCorriente(double iniBalance) {
        this(iniBalance,0.0); //!Llamo al constructor sobrecargado
    }

    @Override
    public boolean retirar(double monto) {
        if ((balance+descubierto)>=monto){
            balance -= monto;
            return true;
        } else {
            return false;
        }
    }
}
