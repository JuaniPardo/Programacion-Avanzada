package clase09_EJ2_Libreria;

abstract class Articulo {
    protected String titulo;
    protected double precio;
    protected Autor autor;

    public Articulo(String titulo, double precio, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
}