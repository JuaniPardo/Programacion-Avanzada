package clase01_Animales;

import java.util.Scanner;

public class C1Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal[] animales = {
                new Tigre("Tigre", "Carne", "Selva", "Grande"),
                new Leon("Leon", "carne", "Selva", "grande"),
                new Gato("Gato", "Croquetas", "Hogar", "chico"),
                new Lobo("Lobo", "carne", "bosque", "mediano"),
                new Perro("Perro", "Croquetas", "Hogar", "variado")
        };

        int animalOption;

        do {
            displayAnimalOptions(animales);
            animalOption = scanner.nextInt();

            if (animalOption >= 1 && animalOption <= animales.length) {
                handleAnimalMenu(animales[animalOption - 1]);
            } else if (animalOption != 0) {
                System.out.println("\n##########################\n");
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (animalOption != 0);
    }

    private static void displayAnimalOptions(Animal[] animales) {
        System.out.println("\n##########################\n");
        for (int i = 0; i < animales.length; i++) {
            System.out.println((i + 1) + ". Menú " + animales[i].getClass().getSimpleName());
        }
        System.out.println("0. FIN");
        System.out.print("Elija una opción: ");
    }

    private static void handleAnimalMenu(Animal c01Animal) {
        System.out.println("\n##########################\n");
        System.out.println("Has elegido el Menú " + c01Animal.getClass().getSimpleName());
        System.out.println("==========================");
        System.out.println(c01Animal);
        c01Animal.comer();
        c01Animal.comer("Sanguchitos de miga");
        c01Animal.hacerRuido();

        if (c01Animal instanceof Gato) {
            ((Gato) c01Animal).vacunar();
        } else if (c01Animal instanceof Perro) {
            ((Perro) c01Animal).sacarPaseo();
            ((Perro) c01Animal).vacunar();
        }
    }
}
