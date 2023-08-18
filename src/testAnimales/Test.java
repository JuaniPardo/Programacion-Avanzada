package testAnimales;

import java.util.Scanner;

import clase01_Animales.*;

public class Test {
    public static void main(String[] args) {
        C01_Animal[] animales = {
                new C01_Tigre("Tigre", "Carne", "Selva", "Grande"),
                new C01_Leon("Leon", "carne", "Selva", "grande"),
                new C01_Gato("Gato", "Croquetas", "Hogar", "chico"),
                new C01_Lobo("Lobo", "carne", "bosque", "mediano"),
                new C01_Perro("Perro", "Croquetas", "Hogar", "variado")
        };

        Scanner scanner = new Scanner(System.in);

        int mainOption;
        int animalOption;

        do {
            displayMenu("1. Clase 01 - 14/08/23 (Animales | Felinos/Caninos)", "0. FIN");

            mainOption = scanner.nextInt();

            if (mainOption == 1) {
                do {
                    displayAnimalOptions(animales);
                    animalOption = scanner.nextInt();

                    if (animalOption >= 1 && animalOption <= animales.length) {
                        handleAnimalMenu(animales[animalOption - 1], scanner);
                    } else if (animalOption != 0) {
                        System.out.println("\n##########################\n");
                        System.out.println("Opción no válida. Intente nuevamente.");
                    }
                } while (animalOption != 0);
            } else if (mainOption != 0) {
                System.out.println("\n##########################\n");
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (mainOption != 0);

        scanner.close();
    }


    // ********************************************
    // * METODOS ESTATICOS PARA MANEJAR LOS MENUS *
    // ********************************************
    private static void displayMenu(String title, String exitOption) {
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@\n");
        System.out.println(title);
        System.out.println(exitOption);
        System.out.print("Opción: ");
    }

    private static void displayAnimalOptions(C01_Animal[] animales) {
        System.out.println("\n##########################\n");
        for (int i = 0; i < animales.length; i++) {
            System.out.println((i + 1) + ". Menu " + animales[i].getClass().getSimpleName());
        }
        System.out.println("0. Volver al menú principal");
        System.out.print("Elija una opción: ");
    }

    private static void handleAnimalMenu(C01_Animal c01Animal, Scanner scanner) {
        System.out.println("\n##########################\n");
        System.out.println("Has elegido el Menú " + c01Animal.getClass().getSimpleName());
        System.out.println("==========================");
        System.out.println(c01Animal);
        c01Animal.comer();
        c01Animal.comer("Sanguchitos de miga");
        c01Animal.hacerRuido();

        if (c01Animal instanceof C01_Gato) {
            ((C01_Gato) c01Animal).vacunar();
        } else if (c01Animal instanceof C01_Perro) {
            ((C01_Perro) c01Animal).sacarPaseo();
            ((C01_Perro) c01Animal).vacunar();
        }
    }
}
