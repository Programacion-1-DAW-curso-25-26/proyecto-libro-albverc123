import java.util.Objects;

public class Autor {

    private String nombre;
    private String nacionalidad;

    // --- CONSTRUCTORES ---
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public Autor(String nombre) {
        this.nombre = nombre;
    }

    private Autor() {

    }
    // ------------------

    // --- GETTERS Y SETTERS ---
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    private void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    // ------------------

    // -------- EQUALS ----------
    // hashCode -- lo utiliza HashMap, HashTree, Hash en general
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nombre, autor.nombre) && Objects.equals(nacionalidad, autor.nacionalidad);
    }

    // ---------------------------------

    // -------- TOSTRING ----------

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
