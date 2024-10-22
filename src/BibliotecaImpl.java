import java.util.ArrayList;
import java.util.List;

public class BibliotecaImpl implements Biblioteca{

    List<Libro> listaLibros = new ArrayList<>();
    List<Usuario> listaUsuario = new ArrayList<>();

    @Override
    public String agregarLibro(Libro libro) {
        listaLibros.add(libro);
        return "libro agregado: " + libro.getTitulo();
    }

    @Override
    public String eliminarLibro(String isbn) {
        for (int i=0; i<listaLibros.size(); i++){
            if (listaLibros.get(i).getIsbn().equals(isbn)){
                listaLibros.remove(i);
                return "Libro eliminado";
            }
        }
        return "Libro NO encontrado";
    }

    @Override
    public List<Libro> listarLibros() {
        return new ArrayList<>(listaLibros);
    }

    @Override
    public String registrarUsuario(Usuario usuario) {
        listaUsuario.add(usuario);
        return "Usuario nuevo: " + usuario.getNombre();
    }

    @Override
    public List<Usuario> listarUsuario() {
        return new ArrayList<>(listaUsuario);
    }

    @Override
    public String buscarLibroXTitulo(String titulo) {
        for (int i=0; i<listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                return "Libro encontrado en la lista: " + listaLibros.get(i).getTitulo();
            }
        }
        return "Libro NO encontrado en la lista";
    }
}
