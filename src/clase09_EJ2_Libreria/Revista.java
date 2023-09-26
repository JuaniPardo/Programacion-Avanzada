package clase09_EJ2_Libreria;

class Revista extends Articulo {
    private int numeroPaginas;

    public Revista(String titulo, double precio, Autor autor, int numeroPaginas) {
        super(titulo, precio, autor);
        this.numeroPaginas = numeroPaginas;
        calcularPrecio();
    }

    private void calcularPrecio() {
        if (numeroPaginas < 20) {
            precio *= 1.15;
        } else if (numeroPaginas >= 20 && numeroPaginas <= 50) {
            precio *= 1.25;
        } else {
            precio *= 1.30;
        }
    }

    @Override
    public String toString() {
        return "Revista: " + getTitulo() +
                "\nPrecio: $" + getPrecio() +
                "\nAutor: " + getAutor().getNombreCompleto() +
                "\nNúmero de Páginas: " + numeroPaginas + "\n";
    }
}