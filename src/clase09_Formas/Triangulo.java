package clase09_Formas;

class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
        calcularArea();
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Es un triángulo con Base: " + base + " y Altura: " + altura);
    }

    private void calcularArea() {
        setArea((base * altura) / 2);
    }
}