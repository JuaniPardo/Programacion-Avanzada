package clase01_Animales;

public class Felino extends Animal {
    public Felino(String tipoAnimal, String tipoComida, String localizcion, String tamanio) {
        super(tipoAnimal, tipoComida, localizcion, tamanio);
    }

    public void rugir() {
        System.out.println("los felinos rugen");
    }
}