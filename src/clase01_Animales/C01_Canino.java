package clase01_Animales;

public class C01_Canino extends C01_Animal {
    public C01_Canino(String tipoAnimal, String tipoComida, String localizcion, String tamanio) {
        super(tipoAnimal, tipoComida, localizcion, tamanio);
    }

    public void rugir() {
        System.out.println("los caninos rugen");
    }
}

