package clase09_EJ2_Libreria;

class Libro extends Articulo {
    private String categoria;

    public Libro(String titulo, double precio, Autor autor, String categoria) {
        super(titulo, precio, autor);
        this.categoria = categoria;
        calcularPrecio();
    }

    private void calcularPrecio() {
        if (categoria.equals("programación") || categoria.equals("medicina")) {
            precio *= 1.25;
        } else if (categoria.equals("administración")) {
            precio *= 1.15;
        }
    }

    @Override
    public String toString() {
        return "Libro: " + getTitulo() +
                "\nPrecio: $" + getPrecio() +
                "\nAutor: " + getAutor().getNombreCompleto() +
                "\nCategoría: " + categoria + "\n";
    }
}