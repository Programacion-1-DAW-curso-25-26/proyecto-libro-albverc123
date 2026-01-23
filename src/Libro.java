import java.util.Objects;

public class Libro {

    // --- ATRIBUTOS PÚBLICOS ---

   /*
   String titulo;
   String autor;
   int numPaginas;
   int valoracion;
   */

    // ------------------------------


    // --- ATRIBUTOS PRIVADOS ---

    private String titulo;
    // private String autor;
    private Autor autor;
    private int numPaginas;
    private int valoracion;
    private int isbn;
    private String idioma;


   public void setTitulo(String titulo) {
       this.titulo = titulo;
   }

   public void setAutor(Autor autor) {
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

    public Autor getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getValoracion() {
        return valoracion;
    }

    public int getIsbn() {
        return isbn;
    }

    // ------------------------------

    // --- CONSTRUCTORES ---

    public Libro(String titulo, Autor autor, int numPaginas, int valoracion, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.valoracion = valoracion;
        this.isbn = isbn;
    }

    private Libro(){

    }

    // ------------------------------

    // --- MÁS MÉTODOS ---

    // --- equals & haschCode ---
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    // -- el hashCode no se va a ver pero no se borra
    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }


    // --- toString ---
    @Override
    public String toString() {
        return "Libro{" +
                "titulo --> '" + titulo + '\'' +
                ", autor --> '" + autor + '\'' +
                ", numPaginas --> " + numPaginas +
                ", valoracion --> " + valoracion +
                ", isbn --> " + isbn +
                '}';
    }

    // ------------------------------

    void mostrarInfo() {
        System.out.println("El libro '" + titulo + "' de " + autor + " tiene " + numPaginas + " páginas, con una valoración de " + valoracion + " sobre 10.");
    }

}

