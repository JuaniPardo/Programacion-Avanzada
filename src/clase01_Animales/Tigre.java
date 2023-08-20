package clase01_Animales;

public class Tigre extends Felino {
    public Tigre(String tipoAnimal, String tipoComida, String localizcion, String tamanio) {
        super(tipoAnimal, tipoComida, localizcion, tamanio);
    }

    public void comer() {
        System.out.println("(TIGRE) El " + this.getClass().getSimpleName() + " come " + tipoComida);
    }

    public void hacerRuido() {
        System.out.println("los tigres rugen");
    }

    @Override
    public String toString() {
        return "Tigre{" +
                "tipoAnimal='" + tipoAnimal + '\'' +
                ", tipoComida='" + tipoComida + '\'' +
                ", localizcion='" + localizacion + '\'' +
                ", tamanio='" + tamanio + '\'' +
                "} ";
    }
}
