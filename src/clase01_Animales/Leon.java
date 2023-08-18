package clase01_Animales;

public class Leon extends Felino {
    public Leon(String tipoAnimal, String tipoComida, String localizcion, String tamanio) {
        super(tipoAnimal, tipoComida, localizcion, tamanio);
    }

    public void comer() {
        System.out.println("(LEON) El " + this.getClass().getSimpleName() + " come "  + tipoComida);
    }

    public void hacerRuido() {
        System.out.println("los leones rugen");

    }

    @Override
    public String toString() {
        return "Leon{" +
                "tipoAnimal='" + tipoAnimal + '\'' +
                ", tipoComida='" + tipoComida + '\'' +
                ", localizcion='" + localizacion + '\'' +
                ", tamanio='" + tamanio + '\'' +
                "} ";
    }
}
