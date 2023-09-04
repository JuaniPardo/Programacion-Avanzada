package zConsola;

public class Consola {

    public static void thinLine() {
        System.out.println("---------------------------");
    }

    public static void thickLine() {
        System.out.println("===========================");
    }

    public static void printTitle(String title) {
        // Imprimir la parte superior de la caja
        yellow();
        System.out.print("╔");
        for (int i = 0; i < title.length() + 2; i++) {
            System.out.print("=");
        }
        System.out.println("╗");

        // Imprimir el contenido del título en la caja
        System.out.print("║ " );
        reset();
        System.out.print(title);
        yellow();
        System.out.println(" ║");

        // Imprimir la parte inferior de la caja
        System.out.print("╚");
        for (int i = 0; i < title.length() + 2; i++) {
            System.out.print("=");
        }
        System.out.println("╝");
        reset();
    }
    public static void yellow(){
        System.out.print("\u001B[33m");
    }

    public static void red(){
        System.out.print("\u001B[31m");
    }

    public static void green(){
        System.out.print("\u001B[32m");
    }

    public static void blue(){
        System.out.print("\u001B[34m");
    }

    public static void reset(){
        System.out.print("\u001B[0m");
    }


    // Metodo para calcular el porcentaje de un valor en múltiplos de 5
    public static double porcentaje(double maximo, double value) {
        double porcentaje = (value / maximo) * 100.0;
        porcentaje = Math.floor(porcentaje / 5.0) * 5.0; // Redondear al múltiplo de 5 más cercano

        return porcentaje;
    }

    public static void printBars(double value){
        for (int i = 0; i < value/5; i++) {
            System.out.print("█");
        }
    }
}
