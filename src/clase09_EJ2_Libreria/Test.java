package clase09_EJ2_Libreria;

public class Test {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Juan", "Perez");
        Autor autor2 = new Autor("Ana", "Lopez");
        Autor autor3 = new Autor("Pedro", "Diaz");

        Libro libro1 = new Libro("Libro de Programación", 50.0, autor1, "programación");
        Libro libro2 = new Libro("Libro de Medicina", 60.0, autor2, "medicina");
        Libro libro3 = new Libro("Libro de Administración", 40.0, autor3, "administración");
        Libro libro4 = new Libro("Libro de Cuentos", 40.0, autor3, "cuentos");
        Revista revista1 = new Revista("Revista de Tecnología", 10.0, autor1, 15);
        Revista revista2 = new Revista("Revista de Negocios", 8.0, autor2, 40);
        Revista revista3 = new Revista("Revista de Deportes", 5.0, autor3, 60);

        Libreria libreria = new Libreria();
        libreria.agregar(libro1);
        libreria.agregar(libro2);
        libreria.agregar(libro3);
        libreria.agregar(libro4);
        libreria.agregar(revista1);
        libreria.agregar(revista2);
        libreria.agregar(revista3);

        System.out.println("-------------------------");
        System.out.println("Artículos en la librería:");
        System.out.println("-------------------------");
        libreria.mostrar();

        System.out.println("-------------------------------");
        System.out.println("Artículos del autor Juan Perez:");
        System.out.println("-------------------------------");
        libreria.buscarPorAutor("Juan Perez");
    }
}