package clase03_Abstraccion;

public class C3Test {
    public static void main(String[] args) {

        //!VARIABLES
        Titular t1 = new Titular("Jose", "Lopez", 25);
        CuentaCorriente cc1 = new CuentaCorriente(new Titular("Sara", "Perez", 30), 1000, "123456");
        CuentaCorriente cc2 = new CuentaCorriente(t1, 2000, "654321");
        CuentaAhorro ca1 = new CuentaAhorro(new Titular("Lucas", "Caraballo", 22), 3000, "987654", 5.5);

        //!INICIO PROGRAMA
        System.out.println("========================");

        System.out.println(cc1);
        System.out.println("------------------------");
        System.out.println(ca1);
        System.out.println("------------------------");
        ca1.calcularInteres();
        System.out.println(ca1);
        System.out.println("------------------------");
        if (cc1.compararCuentas(cc2)) {
            System.out.println("Las cuentas son iguales");
        } else {
            System.out.println("Las cuentas son distintas");
        }
        System.out.println("========================");
    }
}
