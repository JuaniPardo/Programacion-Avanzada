package clase04_Refactor;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(Titular titular, double saldo, String nroCuenta) {
        super(titular, saldo, nroCuenta);
        System.out.printf("Se ha creado la CUENTA CORRIENTE Nro: %s, a nombre de %s, con un saldo inicial de $%.2f\n", this.nroCuenta, this.titular.getNombre(), this.saldo);
    }



}
