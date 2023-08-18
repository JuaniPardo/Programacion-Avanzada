package clase01_Animales;

public class C01_Gato extends C01_Felino {
    public C01_Gato(String tipoAnimal, String tipoComida, String localizcion, String tamanio) {
        super(tipoAnimal, tipoComida, localizcion, tamanio);
    }

    public void comer() {
        System.out.println("(GATO) El " + this.getClass().getSimpleName() + " come " + tipoComida);
    }

    public void hacerRuido() {
        System.out.println("los gatos maullan");
    }

    public void vacunar() {
        System.out.println("los gatos se vacunan");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "tipoAnimal='" + tipoAnimal + '\'' +
                ", tipoComida='" + tipoComida + '\'' +
                ", localizcion='" + localizacion + '\'' +
                ", tamanio='" + tamanio + '\'' +
                "} ";
    }
}
