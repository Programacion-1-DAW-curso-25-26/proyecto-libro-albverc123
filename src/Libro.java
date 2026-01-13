public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private int valoracion;

    public Libro(String titulo, String autor, int numPaginas, int valoracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.valoracion = valoracion;

    }

    void mostrarInfo() {
        System.out.println("El libro '" + titulo + "' de " + autor + " tiene " + numPaginas + " páginas, con una valoración de " + valoracion + " sobre 10.");
    }
}

