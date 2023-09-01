package clase05_CallCenter;

public class LlamadaLocal extends Llamada{
    public LlamadaLocal(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }
    public double costo() {
        return 0.15 * duracion;
    }


    @Override
    public String toString() {
        return String.format("Local %s costo = %.2f", super.toString(), this.costo());
    }
}
