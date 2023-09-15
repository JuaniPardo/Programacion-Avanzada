package clase06_FigGeo;

public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        return base * altura / 2;
    }

//    @Override
//    public String toString(){
//        return "Triangulo de base " + base + " y altura " + altura;
//    }
}
