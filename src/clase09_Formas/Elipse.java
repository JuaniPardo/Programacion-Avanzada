package clase09_Formas;

class Elipse extends Forma {
    private double radioMayor;
    private double radioMenor;

    public Elipse(String color, double radioMayor, double radioMenor) {
        super(color);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
        calcularArea();
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Es una elipse con Radio Mayor: " + radioMayor + " y Radio Menor: " + radioMenor);
    }

    private void calcularArea() {
        setArea(Math.PI * radioMayor * radioMenor);
    }
}
