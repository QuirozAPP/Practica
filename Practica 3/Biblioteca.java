import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros.");
        } else {
            for (Libro libro : libros) {
                libro.mostrarInformacion();
                System.out.println();
            }
        }
    }

    public void buscarLibroPorTitulo(String titulo) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.mostrarInformacion();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un libro con el título: " + titulo);
        }
    }
}
