package clase01_Animales;

public class C01_Animal {

    protected String tipoAnimal;
    protected String tipoComida;
    protected String localizacion;
    protected String tamanio;


    public C01_Animal(String tipoAnimal, String tipoComida, String localizcion, String tamanio) {
        this.tipoAnimal = tipoAnimal;
        this.tipoComida = tipoComida;
        this.localizacion = localizcion;
        this.tamanio = tamanio;
    }

    public void hacerRuido() {
        System.out.println("Los animales hacen ruido");
    }

    public void comer() {
        System.out.println("El " + this.getClass().getSimpleName() + " come " + tipoComida);
    }

    public void comer(String comida) {
        System.out.println("Este " + this.getClass().getSimpleName() + " come " + comida);
    }

    public void dormir() {
        System.out.println("los animnales duermen");
    }

    public void rugir() {
        System.out.println("los animnales rugen(?)");
    }
}