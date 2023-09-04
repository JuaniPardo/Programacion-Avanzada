package clase05_CallCenter;

import static zConsola.Consola.*;

public class Test {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();

        printTitle("Call Center");

        callCenter.registrarLlamada(new LlamadaLocal("123", "456", 20));
        callCenter.registrarLlamada(new LlamadaLargaDist("123", "456", 10, 1));
        callCenter.registrarLlamada(new LlamadaLargaDist("123", "456", 10, 2));
        callCenter.registrarLlamada(new LlamadaLargaDist("123", "456", 10, 3));
        callCenter.getCostoTotal();
        red();
        thickLine();
        reset();
        callCenter.getCostoUsuario("123");

    }
}
