package ejemploPolimorfismo.aritmetica;

public class PruebaAritmetica {
    static int operandoC = 8;

    public static void main(String args[]) {


        int operandoA = 6;
        int operandoB = 4;


        Aritmetica obj1 = new Aritmetica(operandoC, operandoB);
        Aritmetica obj2 = new Aritmetica();

        System.out.println("Operando A:" + operandoA + " y operadoB:" + operandoB);


        System.out.println("\nResultado suma:" + obj1.sumar());

        System.out.println("\nResultado resta:" + obj1.restar());


        System.out.println("\nResultado multiplicacion:" + obj1.multiplicar());


        System.out.println("\nResultado division:" + obj1.dividir());
    }

    void otroMetodo() {

        //System.out.println("valor operando A" + operandoA);
    }

}