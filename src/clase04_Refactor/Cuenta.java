package clase04_Refactor;

abstract public class Cuenta {
    protected Titular titular;
    protected double saldo;
    protected String nroCuenta;

    public Cuenta(Titular titular, double saldo, String nroCuenta) {
        this.titular = titular;
        this.saldo = saldo;
        this.nroCuenta = nroCuenta;
    }

    public Cuenta(Titular titular, String nroCuenta) {
        this(titular, 15.3, nroCuenta);
    }

    public double getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingresar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            return true;
        }
        return false;
    }

    public boolean reintegro(double monto) {
        if (monto > 0 && this.saldo >= monto) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }

    //un método para comparar cuentas, sabiendo que dos cuentas serán iguales si sus números de cuenta son iguales.
    public boolean compararCuentas(Cuenta otraCuenta) {
        return this.getNroCuenta().compareTo(otraCuenta.getNroCuenta()) == 0;
    }

    @Override
    public String toString() {
        return String.format("%s\nTitular:\t%s,\nSaldo:\t\t%.2f\nNroCuenta:\t%s", this.getClass().getSimpleName(), titular.getNombre(), saldo, nroCuenta);
    }
}
