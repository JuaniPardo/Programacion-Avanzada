package clase05_CallCenter;

import java.util.ArrayList;

public class CallCenter {
    private ArrayList<Llamada> llamadas;

    public CallCenter() {
        llamadas = new ArrayList<>();
    }

    public void registrarLlamada(Llamada llamada) {
        llamadas.add(llamada);
        System.out.println(llamada);
    }

    public void calcularCostoTotal() {
        double costoTotal = 0;
        for (Llamada llamada : llamadas) {
            costoTotal += llamada.costo();
        }
        System.out.println("Costo total: " + costoTotal);
    }


}
