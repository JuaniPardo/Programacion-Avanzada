package clase06_FigGeo;
import static miPaquete.Consola.*;

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
        red();
        thickLine();
        reset();
        System.out.printf("El área promedio es: %.2f",FiguraGeometrica.areaPromedio(figuras));

    }
}
