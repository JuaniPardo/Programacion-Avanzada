package clase06_FigGeo;

import static zConsola.Consola.*;

public class TestFiguras {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];
        figuras[0] = new Circulo(4);
        figuras[1] = new Rectangulo(10, 5);
        figuras[2] = new Triangulo(4.5, 4);

        printTitle("Figuras Geometricas");

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura);
        }
        thinLine();
        Rectangulo rectangulo = (Rectangulo) figuras[1];
        System.out.println("El perimetro del rectangulo es " + rectangulo.perimetro());

//        System.out.printf("El perimetro del rectangulo es %.2f\n", (Rectangulo) figuras[1].perimetro());
    }
}
