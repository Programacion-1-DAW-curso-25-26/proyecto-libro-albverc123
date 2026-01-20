import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//
//        // --- ATRIBUTOS PÚBLICOS ---
//
//       /*
//       Libro libro0 = new Libro();
//       libro0.titulo("Quijote");
//       libro0.autor("Cervantes");
//       libro0.numPaginas(500);
//       libro0.valoracion(9);
//       */
//
//
//        // --- ATRIBUTOS PRIVADOS ---
//
//       /*
//       Libro libro0 = new Libro();
//       libro0.setTitulo("Quijote");
//       libro0.setAutor("Cervantes");
//       libro0.setNumPaginas(900);
//       libro0.setValoracion(9);
//       */
//
//
//        // --- CONDUCTORES ---
//
//        Libro libro1 = new Libro("Quijote", "Cervantes", 500, 9, 11);
//        Libro libro2 = new Libro("Cervantes", "Quijote", 300, 7, 11);
//
//        libro1.mostrarInfo();
//        if (libro1.equals(libro2)) {
//            System.out.println("Son iguales");
//        }else {
//            System.out.println("No son iguales");
//        }
//        System.out.println();
//
        ArrayList<Libro> biblioteca = new ArrayList<>(); // el ArrayList mira el equals para comparar
//        biblioteca.add(libro1);
//        // biblioteca.add(libro2);
//
//        for (Libro lib : biblioteca) {
//            System.out.println(lib);
//        }
//
//        System.out.println();
//        System.out.println(biblioteca.contains(libro2)); // aunque el libro2 no esta en la biblioteca el isbn SI que esta en la biblioteca, libro1
//
//        HashSet<Libro> casera = new HashSet<>(); // el HashSet mira el hasCode para saber si estan repetidos
//        System.out.println((casera.add(libro1)));
//        System.out.println(casera.add(libro2)); // no lo puede meter porque tiene el mismo isbn
//
//
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(" --- Menú Biblioteca--- \n" +
                    "1. Añadir libro.\n" +
                    "2. Buscar libro por isbn." +
                    "3. Eliminar libro por isbn." +
                    "4. Salir.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    anyadirLibro(biblioteca, sc);
                    break;
                case 2:
                    buscarLibro(biblioteca, sc);
                    break;
                case 3:
                    eliminarLibro(biblioteca, sc);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 4);
    }

    private static void buscarLibro(ArrayList<Libro> biblioteca, Scanner sc) {
        System.out.println("--- Buscar libro ---");
        System.out.println("1 - para buscar con contains, y 2 - para buscar con iterator");
        int opcion1 = sc.nextInt();
    }

    private static void eliminarLibro(ArrayList<Libro> biblioteca, Scanner sc) {
        System.out.println("--- Eliminar libro ---");
        System.out.println("1 - para eliminar con remove, y 2 - para eliminar con recorrido");
        int opcion2 = sc.nextInt();
        if (opcion2 == 1) {
            System.out.println("TODO");
        } else {
            System.out.println("TODO");
        }
    }

    private static void anyadirLibro(ArrayList<Libro> biblioteca, Scanner sc) {
        System.out.println("--- Añadir libro ---");
        System.out.println("Dime el nombre: ");
        String titulo = sc.nextLine();
        System.out.println("Dime el autor: ");
        String autor = sc.nextLine();
        System.out.println("Dime el isbn: ");
        int isbn = sc.nextInt();
        System.out.println("Dime el numero de paginas: ");
        int numPaginas = sc.nextInt();
        System.out.println("Dime la valoracion: ");
        int valoracion = sc.nextInt();

        Libro libro = new Libro(titulo, autor, numPaginas, valoracion, isbn);
    }
}
