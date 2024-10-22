import java.util.List;

public interface Biblioteca {
    String agregarLibro(Libro libro);
    String eliminarLibro(String isbn);
    List<Libro> listarLibros();
    String registrarUsuario(Usuario usuario);
    List<Usuario> listarUsuario();
    List<Libro> buscarLibroXTitulo(String titulo);

}
