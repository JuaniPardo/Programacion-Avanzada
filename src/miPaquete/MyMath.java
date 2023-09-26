package miPaquete;

public class MyMath{

    // Metodo para calcular el porcentaje de un valor en múltiplos de 5

    public static double porcentaje(double maximo, double value) {
        double porcentaje = (value / maximo) * 100.0;
        porcentaje = Math.floor(porcentaje / 5.0) * 5.0; // Redondear al múltiplo de 5 más cercano

        return porcentaje;
    }

    public static void printBars(double value) {
        for (int i = 0; i < value / 5; i++) {
            System.out.print("▓");
        }
        for (int i = 0; i < (20-(value/5)); i++) {
            System.out.print("░");
        }
    }
}