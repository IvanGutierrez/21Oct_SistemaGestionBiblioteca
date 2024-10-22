import java.util.List;

public class Main {
    public static void main(String[] args) {

        BibliotecaImpl biblioteca = new BibliotecaImpl();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "vdveveve");
        Libro libro2 = new Libro("Marco Polo", "Gary Jennins", "4545xcf");
        Libro libro3 = new Libro("Las 5 caras de Dios", "Javier Alonso Lopez", "4cc4e5v");

        Usuario usuario1 = new Usuario("Ivan Gutierrez", "1142IV");
        Usuario usuario2 = new Usuario("Bill Gates", "15412C");
        Usuario usuario3 = new Usuario("Francisco Ruiz", "992146SC");

        //AGREGAR LIBROS
        System.out.println(biblioteca.agregarLibro(libro1));
        System.out.println(biblioteca.agregarLibro(libro2));
        System.out.println(biblioteca.agregarLibro(libro3));

        List<Libro> listaLibros = biblioteca.listarLibros();
        System.out.println("\nLa lista contiene " + listaLibros.size() + " libros");
        for (int i=0; i<listaLibros.size(); i++){
            System.out.println("Libro " + (i+1) + " :"+ listaLibros.get(i).getTitulo());
        }

        //ELIMINAR LIBROS
        System.out.println(biblioteca.eliminarLibro("4545xcf"));
        listaLibros = biblioteca.listarLibros();
        System.out.println("\nLa lista contiene " + listaLibros.size() + " libros");
        for (int i=0; i<listaLibros.size(); i++){
            System.out.println("Libro " + (i+1) + " :"+ listaLibros.get(i).getTitulo());
        }

        //CONSULTA DE LIBRO POR TITULO
        System.out.println("");
        System.out.println(biblioteca.buscarLibroXTitulo("Cien años de soledad"));
        System.out.println(biblioteca.buscarLibroXTitulo("El Caso de Charles Dexter Ward"));

        //AGREGAR USUARIO
        System.out.println(biblioteca.registrarUsuario(usuario1));
        System.out.println(biblioteca.registrarUsuario(usuario2));
        System.out.println(biblioteca.registrarUsuario(usuario3));
        List<Usuario> listaUsuario = biblioteca.listarUsuario();
        System.out.println("\nLa lista contiene " + listaUsuario.size() + " usuarios");
        for (int i=0; i<listaUsuario.size(); i++){
            System.out.println("Usuario " + (i+1) + " :"+ listaUsuario.get(i).getNombre());
        }

    }
}