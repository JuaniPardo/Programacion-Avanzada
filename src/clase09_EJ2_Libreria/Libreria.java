package clase09_EJ2_Libreria;

import java.util.ArrayList;

class Libreria {
    private ArrayList<Articulo> articulos = new ArrayList<>();

    public void agregar(Articulo articulo) {
        articulos.add(articulo);
    }

    public void mostrar() {
        for (Articulo articulo : articulos) {
            System.out.println(articulo);;
        }
    }

    public void buscarPorAutor(String nombreAutor) {
        for (Articulo articulo : articulos) {
            if (articulo.getAutor().getNombreCompleto().equalsIgnoreCase(nombreAutor)) {
                System.out.println("Título: " + articulo.getTitulo());
                System.out.println("Precio: $" + articulo.getPrecio());
                System.out.println();
            }
        }
    }
}
