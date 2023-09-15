package clase06_FigGeo;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio){
        super("Circulo");
        this.radio = radio;
    }

    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }

//    @Override
//    public String toString(){
//        return "Circulo de radio " + radio;
//    }
}
