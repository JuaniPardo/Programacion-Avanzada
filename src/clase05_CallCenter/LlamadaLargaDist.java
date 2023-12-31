package clase05_CallCenter;

public class LlamadaLargaDist extends Llamada{
    protected int franja;

    public LlamadaLargaDist(String origen, String destino, int duracion, int franja) {
        super(origen, destino, duracion);
        this.franja = franja;
    }

    public double costo() {
        switch (franja) {
            case 1:
                return 0.2 * duracion;
            case 2:
                return 0.25 * duracion;
            case 3:
                return 0.3 * duracion;
            default:
                return 0;
        }
    }


    @Override
    public String toString() {
        return String.format("\u001B[34mLarga \n  %s \n\u001B[34m  ├> \u001B[0mfranja   = %d \n\u001B[34m  └> \u001B[0mcosto \t  = $%.2f", super.toString(), franja, this.costo());
    }
}
