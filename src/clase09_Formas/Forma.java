package clase09_Formas;

class Forma {
    private String color;
    private double area;

    public Forma(String color) {
        this.color = color;
        this.area = 0.0;
    }

    public void imprimir() {
        System.out.println("Color: " + color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}