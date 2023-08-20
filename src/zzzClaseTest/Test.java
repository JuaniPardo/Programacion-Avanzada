package zzzClaseTest;

import java.util.*;

import clase01_Animales.*;
import clase02_ProyBancario.*;

public class Test {
    public static void main(String[] args) {

        //! -------------------
        //? ARRAY MENU OPCIONES
        //! -------------------
        String[] opcionesMainMenu = {
                "1. Clase 01 - 14/08/23 (Animales | Felinos/Caninos)",
                "2. Clase 02 - 17/08/23 (Proyecto Bancario)"
        };

        //! VARIABLES CLASE 01 ANIMALES
        Animal[] animales = {
                new Tigre("Tigre", "Carne", "Selva", "Grande"),
                new Leon("Leon", "carne", "Selva", "grande"),
                new Gato("Gato", "Croquetas", "Hogar", "chico"),
                new Lobo("Lobo", "carne", "bosque", "mediano"),
                new Perro("Perro", "Croquetas", "Hogar", "variado")
        };
        int animalOption;

        //! VARIABLES CLASE 02 PROYECTO BANCARIO
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
        CajaAhorro ca1 = new CajaAhorro(0, 3);
        CuentaCorriente cc1 = new CuentaCorriente(500000, 40000);
        CuentaCorriente cc2 = new CuentaCorriente(100);

        //! VARIABLES GENERALES
        Scanner scanner = new Scanner(System.in);
        int mainOption;

        //! -------------------
        //! INICIO DEL PROGRAMA
        //! -------------------
        do {
            displayMenu(opcionesMainMenu, "0. FIN");

            mainOption = scanner.nextInt();

            //! ACA SE MANEJAN LAS OPCIONES DEL MENU PRINCIPAL
            switch (mainOption) {
                case 1:
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
                    break;

                case 2:
                    System.out.println("\n##########################\n");
                    System.out.println("Has elegido el Menú Cuentas");
                    System.out.println("==========================");
                    displayCuentas(ca1);
                    displayCuentas(cc1);
                    displayCuentas(cc2);
                    cc1.retirar(540000);
                    cc2.retirar(150);
                    displayCuentas(cc1);
                    displayCuentas(cc2);
                    break;

                default:
                    if (mainOption != 0) {
                        System.out.println("\n##########################\n");
                        System.out.println("Opción no válida. Intente nuevamente.");
                    }
                    break;
            }

        } while (mainOption != 0);

        scanner.close();
    }


    // ********************************************
    // * METODOS ESTATICOS PARA MANEJAR LOS MENUS *
    // ********************************************

    //! MENU PRINCIPAL
    private static void displayMenu(String[] menuOptions, String exitOption) {
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@\n");
        for (String option : menuOptions) {
            System.out.println(option);
        }
        System.out.println(exitOption);
        System.out.print("Opción: ");
    }

    //! MENU ANIMALES
    private static void displayAnimalOptions(Animal[] animales) {
        System.out.println("\n##########################\n");
        for (int i = 0; i < animales.length; i++) {
            System.out.println((i + 1) + ". Menu " + animales[i].getClass().getSimpleName());
        }
        System.out.println("0. Volver al menú principal");
        System.out.print("Elija una opción: ");
    }

    //! MANEJO DE MENU ANIMALES
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

    //! MANEJO DE MENU CUENTAS
    private static void displayCuentas(Cuenta c) {
        System.out.println(c.getBalance());
    }
}
