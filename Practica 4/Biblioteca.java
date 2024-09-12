import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public List<Libro> getLibrosPrestados(boolean prestado) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.isPrestado() == prestado) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
}

