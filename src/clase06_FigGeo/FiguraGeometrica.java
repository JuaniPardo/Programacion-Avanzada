package clase06_FigGeo;

public abstract class FiguraGeometrica {
    protected String nombre;

    public FiguraGeometrica(String nombre){
        this.nombre = nombre;

    }
    public abstract double area();

    public String toString(){
        return String.format("%s de area %.2f",nombre, area());
    }
}
