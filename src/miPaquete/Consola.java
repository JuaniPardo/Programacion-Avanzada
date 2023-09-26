package miPaquete;

public class Consola {

    public static void thinLine() {
        System.out.println("-----------------------------------");
    }

    public static void thickLine() {
        System.out.println("===================================");
    }

    public static void printTitle(String title) {
        // Imprimir la parte superior de la caja
        yellow();
        System.out.print("\n    ");
        for (int i = 0; i < title.length() + 4; i++) {
            System.out.print("█");
        }

        // Imprimir el contenido del título en la caja
        System.out.print("\n    █ ");
        reset();
        System.out.print(title);
        yellow();
        System.out.println(" █");

        // Imprimir la parte inferior de la caja
        System.out.print("    ");
        for (int i = 0; i < title.length() + 4; i++) {
            System.out.print("█");
        }
        System.out.println();
        reset();
    }

    public static void yellow() {
        System.out.print("\u001B[33m");
    }

    public static void red() {
        System.out.print("\u001B[31m");
    }

    public static void green() {
        System.out.print("\u001B[32m");
    }

    public static void blue() {
        System.out.print("\u001B[34m");
    }

    public static void reset() {
        System.out.print("\u001B[0m");
    }

}

// █████████████████
// █ Ejercicio 1.1 █
// █████████████████
