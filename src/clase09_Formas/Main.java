package clase09_Formas;

public class Main {
    public static void main(String[] args) {
        // Crear formas
        Forma[] formas = new Forma[4];
        formas[0] = new Rectangulo("Rojo", 5, 10);
        formas[1] = new Elipse("Azul", 3, 4);
        formas[2] = new Triangulo("Verde", 6, 8);
        formas[3] = new Rectangulo("Amarillo", 7, 12);

        // Encontrar la forma con el área máxima
        Forma formaMaxima = null;
        double areaMaxima = Double.MIN_VALUE;

        for (Forma forma : formas) {
            if (forma.getArea() > areaMaxima) {
                areaMaxima = forma.getArea();
                formaMaxima = forma;
            }
        }

        // Imprimir información de la forma con el área máxima
        if (formaMaxima != null) {
            System.out.println("La forma con el área máxima es:");
            formaMaxima.imprimir();
        } else {
            System.out.println("No se encontraron formas para calcular el área máxima.");
        }
    }
}