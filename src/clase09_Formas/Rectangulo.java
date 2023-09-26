package clase09_Formas;

import clase09_Formas.interfaces.Dibujable;
import clase09_Formas.interfaces.Rotable;

class Rectangulo extends Forma implements Dibujable, Rotable {
    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    public void dibujar() {
        System.out.println("Dibujando un rectángulo " + getColor());
    }

    public void rotar() {
        System.out.println("Rotando un rectángulo " + getColor());
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Es un rectángulo con Base: " + base + " y Altura: " + altura);
    }

    private void calcularArea() {
        setArea(base * altura);
    }
}