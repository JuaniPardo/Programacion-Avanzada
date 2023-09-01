package clase05_CallCenter;
import java.util.ArrayList;


public class Test {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();
        callCenter.registrarLlamada(new LlamadaLocal("123", "456", 10));
        callCenter.registrarLlamada(new LlamadaLargaDist("123", "456", 10, 1));
        callCenter.registrarLlamada(new LlamadaLargaDist("123", "456", 10, 2));
        callCenter.registrarLlamada(new LlamadaLargaDist("123", "456", 10, 3));
        callCenter.calcularCostoTotal();
    }
}
