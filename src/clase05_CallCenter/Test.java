package clase05_CallCenter;
import static miPaquete.Consola.*;

public class Test {
    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter();

        printTitle("Call Center \"Lo de Juani\"");

        callCenter.registrarLlamada(new LlamadaLocal("123", "456", 45));
        callCenter.registrarLlamada(new LlamadaLargaDist("123", "456", 50, 1));
        callCenter.registrarLlamada(new LlamadaLargaDist("123", "456", 20, 2));
        callCenter.registrarLlamada(new LlamadaLargaDist("123", "456", 10, 3));

        //Separador
        red();
        thickLine();
        reset();
        //! Costo total
        callCenter.getCostoTotal();
        //Separador
        red();
        thickLine();
        reset();
        callCenter.getCostoUsuario("123");
        //Separador
        red();
        thickLine();
        reset();

    }
}
