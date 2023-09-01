package ejemploPolimorfismo.aritmetica;

public class Aritmetica {

    int a;
    int b;

    //Constructor Vacio
    //Recordar que si agregamos un constructor distinto al vacio
    //ya no se crea este constructor y nosotros debemos crearlo si lo necesitamos
    Aritmetica() {
    }
    //!necesito setters

    //Constructor con 2 argumentos
    Aritmetica(int a, int b) {
        //Uso del operador this
        this.a = a;
        this.b = b;
    }


    int sumar() {
        return a + b;
    }


    int restar() {
        return a - b;
    }


    int multiplicar() {
        return a * b;
    }


    int dividir() {
        //! division por 0?
        return a / b;
    }

}