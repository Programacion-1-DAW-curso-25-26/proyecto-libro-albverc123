import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

// ===========================
// ===== MIRAR PARA EXAM =====
// ===========================

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
//        ArrayList<Libro> biblioteca = new ArrayList<>(); // el ArrayList mira el equals para comparar
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
        char opcion;
        ArrayList<Libro> biblioteca = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();

        do {
            System.out.println(" --- Menú Biblioteca--- \n" +
                    "a. Añadir libro.\n" +
                    "b. Mostrar todos.\n" +
                    "c. Buscar libro por isbn.\n" +
                    "d. Eliminar libro por isbn.\n" +
                    "e. Vaciar lista.\n" +
                    "f. Salir.");
            System.out.println("Elige una opción: ");
            opcion = sc.nextLine().toLowerCase().charAt(0);
            switch (opcion) {
                case 'a':
                    anyadirLibro(biblioteca, sc, autores);
                    break;
                case 'b':
                    mostrarTodos(biblioteca);
                    break;
                case 'c':
                    buscarLibro(biblioteca, sc);
                    break;
                case 'd':
                    eliminarLibro(biblioteca, sc);
                    break;
                case 'e':
                    vaciarLista(biblioteca);
                    break;
                case 'f':
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (opcion != 'f');
    }

    private static void vaciarLista(ArrayList<Libro> biblioteca) {
        int contador = biblioteca.size();
        biblioteca.clear();
        System.out.println("Borradoes " + contador + " libros de la bilbioteca");
    }

    private static void mostrarTodos(ArrayList<Libro> biblioteca) {
        System.out.println(" --- Lista de libros completo ---");
        for (Libro libro : biblioteca) {
            System.out.println(libro); //  o  libro.toString()
            // o libro.mostrarInfo();
            System.out.println("-----------------------------------");
        }
    }

    private static void buscarLibro(ArrayList<Libro> biblioteca, Scanner sc) {
        System.out.println("--- Buscar libro ---");
        System.out.println("1 - para buscar isbn con contains\n" +
                "2 - para buscar isbn con iterator\n" +
                "3 - buscar por autor\n");
        int opcion1 = sc.nextInt();
        if (opcion1 == 1) {
            System.out.println("Dime el ISBN: ");
            int isbn = sc.nextInt();
            // opcion con contains, si solo se quiere sabe rque existe sirve esta opcion pero si se quiere mostrar su infor NO SIRVE esta opcion
            System.out.println("Dime el nombre del autor:");
            String nombreAutor = sc.nextLine();
            System.out.println("Dime la nacionalidad del autor:");
            String nacienAutor = sc.nextLine();
            Autor autorLib = new Autor(nombreAutor, nacienAutor);
            Libro buscar = new Libro("",autorLib,0,0,isbn);
            if (biblioteca.contains(buscar)) {
                System.out.println("Encontrado el libro");
            }
            // Otra opcion con for-each
            for (Libro libro : biblioteca) {
                if (libro.getIsbn() == isbn) {
                    System.out.println("Encontrado " + libro);
                }
            }
        } else if (opcion1 == 2) {
            System.out.println("Dime el ISBN: ");
            int isbn = sc.nextInt();
            Iterator<Libro> it = biblioteca.iterator();
            Libro libro;
            while (it.hasNext()) {
                libro = it.next();
                if (libro.getIsbn() == isbn) {
                    System.out.println(libro); // o libro.toString();
                }
            }
        } else {
            System.out.println("Dime el nombre del autor: ");
            String nomAutor = sc.nextLine();
            Iterator<Libro> it = biblioteca.iterator();
            Libro libro;
            while (it.hasNext()) {
                libro = it.next();
                if (libro.getAutor().getNombre().equals(nomAutor)) {
                    System.out.println(libro); // o libro.toString();
                }
            }
        }
    }

    private static void eliminarLibro(ArrayList<Libro> biblioteca, Scanner sc) {
        System.out.println("--- Eliminar libro ---");
        System.out.println("Dime el ISBN: ");
        int isbn = sc.nextInt();
        sc.nextLine();

        Iterator<Libro> it = biblioteca.iterator();
        Libro libro;
        while (it.hasNext()) {
            libro = it.next();
            if (libro.getIsbn() == isbn) {
                it.remove();
                System.out.println("Libro con ISBN" + isbn + " se ha borrado correctamente");
            }
        }
    }


    private static void anyadirLibro(ArrayList<Libro> biblioteca, Scanner sc, ArrayList<Autor> autores) {
        System.out.println("--- Añadir libro ---");
        System.out.println("Dime el nombre: ");
        String titulo = sc.nextLine();

        System.out.println("Dime el nombre del autor: ");
        String nombreAutor = sc.nextLine();
        System.out.println("Dime el nombre del autor: ");
        String nacionAutor = sc.nextLine();
        Autor autorLib = crearAutor(nombreAutor, nacionAutor, biblioteca);
        autores.add(autorLib);

        System.out.println("Dime el numero de paginas: ");
        int numPaginas = sc.nextInt();
        System.out.println("Dime la valoracion: ");
        int valoracion = sc.nextInt();
        System.out.println("Dime el isbn: ");
        int isbn = sc.nextInt();
        sc.nextLine();

        Libro libro = new Libro(titulo, autorLib, numPaginas, valoracion, isbn);
        biblioteca.add(libro);
    }

    private static Autor crearAutor(String nombreAutor, String nacionAutor, ArrayList<Libro> biblioteca) {
        boolean existeAutor = false;
        Autor autorLib = null;
        for (Libro libro : biblioteca) {
            if (libro.getAutor().getNombre().equals(nombreAutor) && libro.getAutor().getNacionalidad().equals(nacionAutor)) {
                existeAutor = true;
                autorLib = libro.getAutor();
            }
        }
        if (!existeAutor) {
            autorLib = new Autor(nombreAutor, nacionAutor);
        }
        return autorLib;
    }
}
