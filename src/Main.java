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
        Libro libro2 = new Libro("Quijote", "Cervantes", 300, 7, 11);

        libro1.mostrarInfo();
        if (libro1.equals(libro2)) {
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
        System.out.println(libro1);
        System.out.println(libro2);

    }
}
