import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


        // --- ATRIBUTOS PÚBLICOS ---

       /*
       Libro libro0 = new Libro();
       libro0.titulo("Quijote");
       libro0.autor("Cervantes");
       libro0.numPaginas(500);
       libro0.valoracion(9);
       */


        // --- ATRIBUTOS PRIVADOS ---

       /*
       Libro libro0 = new Libro();
       libro0.setTitulo("Quijote");
       libro0.setAutor("Cervantes");
       libro0.setNumPaginas(900);
       libro0.setValoracion(9);
       */


        // --- CONDUCTORES ---

        Libro libro1 = new Libro("Quijote", "Cervantes", 500, 9, 11);
        Libro libro2 = new Libro("Cervantes", "Quijote", 300, 7, 11);

        libro1.mostrarInfo();
        if (libro1.equals(libro2)) {
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
        System.out.println();

        ArrayList<Libro> biblioteca = new ArrayList<>(); // el ArrayList mira el equals para comparar
        biblioteca.add(libro1);
        // biblioteca.add(libro2);

        for (Libro lib : biblioteca) {
            System.out.println(lib);
        }

        System.out.println();
        System.out.println(biblioteca.contains(libro2)); // aunque el libro2 no esta en la biblioteca el isbn SI que esta en la biblioteca, libro1

        HashSet<Libro> casera = new HashSet<>(); // el HashSet mira el hasCode para saber si estan repetidos
        System.out.println((casera.add(libro1)));
        System.out.println(casera.add(libro2)); // no lo puede meter porque tiene el mismo isbn


    }
}
