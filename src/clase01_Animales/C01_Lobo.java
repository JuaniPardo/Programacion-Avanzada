package clase01_Animales;

public class C01_Lobo extends C01_Canino {
    public C01_Lobo(String tipoAnimal, String tipoComida, String localizcion, String tamanio) {
        super(tipoAnimal, tipoComida, localizcion, tamanio);
    }

    public void comer() {
        System.out.println("(LOBO) El " + this.getClass().getSimpleName() + " come " + tipoComida);
    }

    public void hacerRuido() {
        System.out.println("los lobos aullan");
    }

    @Override
    public String toString() {
        return "Lobo{" +
                "tipoAnimal='" + tipoAnimal + '\'' +
                ", tipoComida='" + tipoComida + '\'' +
                ", localizcion='" + localizacion + '\'' +
                ", tamanio='" + tamanio + '\'' +
                "} ";
    }
}
