package clase01_Animales;

public class C01_Felino extends C01_Animal {
    public C01_Felino(String tipoAnimal, String tipoComida, String localizcion, String tamanio) {
        super(tipoAnimal, tipoComida, localizcion, tamanio);
    }

    public void rugir() {
        System.out.println("los felinos rugen");
    }
}