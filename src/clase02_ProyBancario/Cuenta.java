package clase02_ProyBancario;

public class Cuenta {
    protected double balance;

    //Constructor sobrecargado
    public Cuenta(double iniBalance) {
        balance = iniBalance;
    }

    //Métodos
    public double getBalance() {  //Obtengo el balance
        return balance;
    }
    public boolean depositar(double monto) {  //Deposito una suma mayor a 0
        if (monto>0){
            balance += monto;
            return true;
        } else {
            return false;
        }
    }
    public boolean retirar(double monto){  //Retiro si el balance lo permite
        if (balance>=monto){
            balance -= monto;
            return true;
        } else {
            return false;
        }
    }


}
