package clase02_ProyBancario;

import java.util.ArrayList;
import java.util.Scanner;

public class C2Test {
    public static void main(String[] args) {
        //! VARIABLES CLASE 02 PROYECTO BANCARIO
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
        CajaAhorro ca1 = new CajaAhorro(0, 3);
        CuentaCorriente cc1 = new CuentaCorriente(500000, 40000);
        CuentaCorriente cc2 = new CuentaCorriente(100);

        //! VARIABLES GENERALES
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n##########################\n");
        System.out.println(" Menú Cuentas");
        System.out.println("==========================");
        displayCuentas(ca1);
        displayCuentas(cc1);
        displayCuentas(cc2);
        cc1.retirar(540000);
        cc2.retirar(150);
        displayCuentas(cc1);
        displayCuentas(cc2);
    }

    private static void displayCuentas(Cuenta c) {
        System.out.println(c.getBalance());
    }
}
