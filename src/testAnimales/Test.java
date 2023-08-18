package testAnimales;

import java.util.Scanner;

import clase01_Animales.*;

public class Test {
    public static void main(String[] args) {
        Animal[] animales = {
                new Tigre("Tigre", "Carne", "Selva", "Grande"),
                new Leon("Leon", "carne", "Selva", "grande"),
                new Gato("Gato", "Croquetas", "Hogar", "chico"),
                new Lobo("Lobo", "carne", "bosque", "mediano"),
                new Perro("Perro", "Croquetas", "Hogar", "variado")
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

    private static void displayAnimalOptions(Animal[] animales) {
        System.out.println("\n##########################\n");
        for (int i = 0; i < animales.length; i++) {
            System.out.println((i + 1) + ". Menu " + animales[i].getClass().getSimpleName());
        }
        System.out.println("0. Volver al menú principal");
        System.out.print("Elija una opción: ");
    }

    private static void handleAnimalMenu(Animal animal, Scanner scanner) {
        System.out.println("\n##########################\n");
        System.out.println("Has elegido el Menú " + animal.getClass().getSimpleName());
        System.out.println("==========================");
        System.out.println(animal);
        animal.comer();
        animal.comer("Sanguchitos de miga");
        animal.hacerRuido();

        if (animal instanceof Gato) {
            ((Gato) animal).vacunar();
        } else if (animal instanceof Perro) {
            ((Perro) animal).sacarPaseo();
            ((Perro) animal).vacunar();
        }
    }
}
