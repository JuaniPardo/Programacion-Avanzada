package clase06_FigGeo;

public abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre){
        this.nombre = nombre;

    }
    public abstract double area();

    public static double areaPromedio(FiguraGeometrica[] figuras){
        double suma = 0;
        for (FiguraGeometrica figura : figuras) {
            suma += figura.area();
        }
        return suma / figuras.length;
    }

    public String toString(){
        return String.format("%s de area %.2f",nombre, area());
    }
}
