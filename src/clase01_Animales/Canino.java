package clase01_Animales;

abstract public class Canino extends Animal {
    public Canino(String tipoAnimal, String tipoComida, String localizcion, String tamanio) {
        super(tipoAnimal, tipoComida, localizcion, tamanio);
    }

    public void rugir() {
        System.out.println("los caninos rugen");
    }
}

