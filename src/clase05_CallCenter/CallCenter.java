package clase05_CallCenter;
import static zConsola.Consola.*;

import java.util.ArrayList;

public class CallCenter {
    private ArrayList<Llamada> llamadas;
    private int costoTotal = 0;

    public CallCenter() {
        llamadas = new ArrayList<>();
    }

    public void registrarLlamada(Llamada llamada) {
        llamadas.add(llamada);
        System.out.println(llamada);
        costoTotal += llamada.costo();
    }

    public void getCostoTotal() {
        System.out.println("Costo total: " + costoTotal);
    }

    public void getCostoUsuario(String usuario) {
        double[] costoUsuario = {0, 0, 0, 0};
        double total = 0;
        double max = 0;
        String[] tiposLlamada = {"Local: ", "LDFr1: ", "LDFr2: ", "LDFr3: "};
        for (Llamada llamada : llamadas) {
            if (llamada.origen.equals(usuario)) {
                if (llamada instanceof LlamadaLocal) {
                    costoUsuario[0] += llamada.costo();
                    total += llamada.costo();
                } else if (llamada instanceof LlamadaLargaDist) {
                    LlamadaLargaDist llamadaLargaDist = (LlamadaLargaDist) llamada;
                    switch (llamadaLargaDist.franja) {
                        case 1:
                            costoUsuario[1] += llamada.costo();
                            total += llamada.costo();
                            break;
                        case 2:
                            costoUsuario[2] += llamada.costo();
                            total += llamada.costo();
                            break;
                        case 3:
                            costoUsuario[3] += llamada.costo();
                            total += llamada.costo();
                            break;
                    }
                }
            }
        }
        blue();
        System.out.println("Costo de usuario: " + usuario);
        thinLine();
        reset();
        for (int i = 0; i < 4; i++) {
            System.out.print(tiposLlamada[i] + costoUsuario[i] + " - ");
            green();
            printBars(porcentaje(total, costoUsuario[i]));
            reset();
            System.out.println();
        }
        System.out.println("Costo total de " + usuario + ": " + total);
    }


}
