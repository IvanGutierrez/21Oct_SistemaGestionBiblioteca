import java.util.List;

public interface Biblioteca {
    String agregarLibro(List<Libro> listaLibro, Libro libro);
    String eliminarLibro(List<Libro> listaLibro,String isbn);
    List<Libro> listarLibros(List<Libro> listaLibro);
    String registrarUsuario(List<Usuario> listaUsuario, Usuario usuario);
    List<Usuario> listarUsuario(List<Usuario> listaUsuario);
    List<Libro> buscarLibroXTitulo(List<Libro> listaLibro, String titulo);

}
