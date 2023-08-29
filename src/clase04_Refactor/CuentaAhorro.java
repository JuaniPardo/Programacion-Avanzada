package clase04_Refactor;

public class CuentaAhorro  extends Cuenta {
    private double interes;

    public CuentaAhorro(Titular titular, double saldo, String nroCuenta, double interes) {
        super(titular, saldo, nroCuenta);
        this.interes = interes;
    }

    public CuentaAhorro(Titular titular, String nroCuenta, double interes) {
        super(titular, nroCuenta);
        this.interes = interes;
    }

    public CuentaAhorro(Titular titular, String nroCuenta) {
        super(titular, nroCuenta);
        this.interes = 2.5;
    }

    public double getInteres() {
        return interes;
    }

    public void calcularInteres() {
       this.setSaldo(this.getSaldo() + (this.getSaldo() * this.interes / 100));
    }

    @Override
    public String toString() {
        return String.format("%s\nInteres: %.1f%%",super.toString(),this.interes);
    }


}
