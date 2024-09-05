public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El color que cayó del cielo", "H. P. Lovecraft", 1927, "9781234567890");
        Libro libro2 = new Libro("El Señor de los Anillos", "J. R. R. Tolkien", 1954, "9789876543210");
        Libro libro3 = new Libro("Luna de Plutón", "Dross Rotzank", 2015, "9781111111111");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("\nLista de libros en la biblioteca:");
        biblioteca.mostrarLibros();

        System.out.println("\nBuscar libro por título: 'El Señor de los Anillos'");
        biblioteca.buscarLibroPorTitulo("El Señor de los Anillos");

        System.out.println("\nBuscar libro por título: 'Luna de Plutón'");
        biblioteca.buscarLibroPorTitulo("Luna de Plutón");
    }
}


