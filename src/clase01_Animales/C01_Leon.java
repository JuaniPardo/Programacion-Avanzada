package clase01_Animales;

public class C01_Leon extends C01_Felino {
    public C01_Leon(String tipoAnimal, String tipoComida, String localizcion, String tamanio) {
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
