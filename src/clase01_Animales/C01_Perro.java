package clase01_Animales;

public class C01_Perro extends C01_Canino {
    public C01_Perro(String tipoAnimal, String tipoComida, String localizcion, String tamanio) {
        super(tipoAnimal, tipoComida, localizcion, tamanio);
    }

    public void comer() {
        System.out.println("(PERRO) El " + this.getClass().getSimpleName() + " come " + tipoComida);
    }

    public void hacerRuido() {
        System.out.println("los perros ladran");
    }

    public void sacarPaseo() {
        System.out.println("los perros pasean");
    }

    public void vacunar() {
        System.out.println("los perros se vacunan");
    }

    @Override
    public String toString() {
        return "Perro{" +
                "tipoAnimal='" + tipoAnimal + '\'' +
                ", tipoComida='" + tipoComida + '\'' +
                ", localizcion='" + localizacion + '\'' +
                ", tamanio='" + tamanio + '\'' +
                "} ";
    }
}
