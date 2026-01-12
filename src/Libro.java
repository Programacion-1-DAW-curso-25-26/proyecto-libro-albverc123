public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private int valoracion;

    void mostrarInfo() {
        System.out.println("El libro '" + titulo + "' de " + autor + " tiene " + numPaginas + " páginas, con una valoración de " + valoracion + " sobre 10.");
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getValoracion() {
        return valoracion;
    }
}
