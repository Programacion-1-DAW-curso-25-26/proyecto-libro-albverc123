public class Libro {
    public String titulo;
    public String autor;
    public int numPaginas;
    public int valoracion;

    void mostrarInfo() {
        System.out.println("El libro '" + titulo + "' de " + autor + " tiene " + numPaginas + " páginas, con una valoración de " + valoracion + " sobre 10.");
    }
}
