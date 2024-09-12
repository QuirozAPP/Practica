import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Creando autores
        Autor autor1 = new Autor(1, "H. P. Lovecraft", "lovecraftElQueTodoLoVe@gmail.com");
        Autor autor2 = new Autor(2, "J. R. R. Tolkien", "tolkienRemake@gmail.com");
        Autor autor3 = new Autor(3, "Dross Rotzank", "representacionesdross@gmail.com");

        // Creando libros
        Libro libro1 = new Libro("El color que cayó del cielo", autor1, 1927, "9781234567890", false);
        Libro libro2 = new Libro("El Señor de los Anillos", autor2, 1954, "9789876543210", true);
        Libro libro3 = new Libro("Luna de Plutón", autor3, 2015, "9781111111111", false);

        // Agregando libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        // Mostrando información de los libros
        System.out.println("\nLista de todos los libros:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println(libro.getInformacion());
        }

        // Mostrando libros prestados
        System.out.println("\nLista de libros prestados:");
        List<Libro> librosPrestados = biblioteca.getLibrosPrestados(true);
        for (Libro libro : librosPrestados) {
            System.out.println(libro.getInformacion());
        }

        // Mostrando libros no prestados
        System.out.println("\nLista de libros no prestados:");
        List<Libro> librosNoPrestados = biblioteca.getLibrosPrestados(false);
        for (Libro libro : librosNoPrestados) {
            System.out.println(libro.getInformacion());
        }
    }
}



