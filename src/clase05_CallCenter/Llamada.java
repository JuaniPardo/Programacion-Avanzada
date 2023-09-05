package clase05_CallCenter;

abstract public class Llamada {
    protected String origen;
    protected String destino;
    protected int duracion;

    protected Llamada(String origen, String destino, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }

    abstract public double costo();

    public String toString() {
        return String.format("\u001B[34m├> \u001B[0morigen   = %s \n\u001B[34m  ├> \u001B[0mdestino  = %s \n\u001B[34m  ├> \u001B[0mduracion = %d", origen, destino, duracion);
    }
}
