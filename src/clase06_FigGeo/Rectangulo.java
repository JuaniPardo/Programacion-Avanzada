package clase06_FigGeo;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    public double perimetro(){
        return 2 * (base + altura);
    }

    @Override
    public double area(){
        return base * altura;
    }

//    @Override
//    public String toString(){
//        return "Rectangulo de base " + base + " y altura " + altura;
//    }
}
