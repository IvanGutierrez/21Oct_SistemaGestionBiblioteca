import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        BibliotecaImpl biblioteca = new BibliotecaImpl();
//
//        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "vdveveve");
//        Libro libro2 = new Libro("Marco Polo", "Gary Jennins", "4545xcf");
//        Libro libro3 = new Libro("Las 5 caras de Dios", "Javier Alonso Lopez", "4cc4e5v");
//
//        Usuario usuario1 = new Usuario("Ivan Gutierrez", "1142IV");
//        Usuario usuario2 = new Usuario("Bill Gates", "15412C");
//        Usuario usuario3 = new Usuario("Francisco Ruiz", "992146SC");
//
//        AGREGAR LIBROS
//        System.out.println(biblioteca.agregarLibro(libro1));
//        System.out.println(biblioteca.agregarLibro(libro2));
//        System.out.println(biblioteca.agregarLibro(libro3));
//
//        List<Libro> listaLibros = biblioteca.listarLibros();
//        System.out.println("\nLa lista contiene " + listaLibros.size() + " libros");
//        for (int i=0; i<listaLibros.size(); i++){
//            System.out.println("Libro " + (i+1) + " :"+ listaLibros.get(i).getTitulo());
//        }
//
//        ELIMINAR LIBROS
//        System.out.println(biblioteca.eliminarLibro("4545xcf"));
//        listaLibros = biblioteca.listarLibros();
//        System.out.println("\nLa lista contiene " + listaLibros.size() + " libros");
//        for (int i=0; i<listaLibros.size(); i++){
//            System.out.println("Libro " + (i+1) + " :"+ listaLibros.get(i).getTitulo());
//        }
//
//        CONSULTA DE LIBRO POR TITULO
//        System.out.println("");
//        System.out.println(biblioteca.buscarLibroXTitulo("Cien años de soledad"));
//        System.out.println(biblioteca.buscarLibroXTitulo("El Caso de Charles Dexter Ward"));
//
//        AGREGAR USUARIO
//        System.out.println(biblioteca.registrarUsuario(usuario1));
//        System.out.println(biblioteca.registrarUsuario(usuario2));
//        System.out.println(biblioteca.registrarUsuario(usuario3));
//        List<Usuario> listaUsuario = biblioteca.listarUsuario();
//        System.out.println("\nLa lista contiene " + listaUsuario.size() + " usuarios");
//        for (int i=0; i<listaUsuario.size(); i++){
//            System.out.println("Usuario " + (i+1) + " :"+ listaUsuario.get(i).getNombre());
//        }
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("\n1. Agregar Libros");
            System.out.println("2. Eliminar libro de la lista");
            System.out.println("3. Listar libros");
            System.out.println("4. Buscar libro por titulo");
            System.out.println("5. Registrar Usuario");
            System.out.println("6. Listar usuarios");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion){
                case 1: //AGREGAR LIBRO
                    System.out.println("Ingresa el libro que deseas agregar al Sistema de Gestion de Bibliotecas: ");
                    System.out.println("Ingresa el título del libro: ");
                    String titulo = entrada.nextLine();
                    entrada.nextLine();
                    System.out.println("Ingresa el autor del libro: ");
                    String autor = entrada.nextLine();
                    entrada.nextLine();
                    System.out.println("Ingresa el ISBN del libro: ");
                    String isbn = entrada.nextLine();
                    Libro libro1 = new Libro(titulo, autor, isbn);
                    System.out.println(biblioteca.agregarLibro(libro1));
                    break;

                case 2: //ELIMINAR LIBRO
                    System.out.println("Ingresa el ISBN del libro que deseas ELIMINAR del Sistema de Gestion de Bibliotecas: ");
                    System.out.println("Ingresa el ISBN del libro: ");
                    isbn = entrada.nextLine();
                    entrada.nextLine();
                    System.out.println(biblioteca.eliminarLibro(isbn));
                    break;

                case 3: //LISTAR LIBROS
                    System.out.println("Libros almacenados en el Sistema de Gestion de Bibliotecas: ");
                    List<Libro> listaLibros = biblioteca.listarLibros();
                    System.out.println("\nLa lista contiene " + listaLibros.size() + " libros");
//                    for (int i=0; i<listaLibros.size(); i++){
//                        System.out.println("Libro " + (i+1) + " :"+ listaLibros.get(i).getTitulo());
//                    }
                    IntStream.range(0, listaLibros.size())
                            .forEach(i -> System.out.println("Usuario " + (i + 1) + " :" + listaLibros.get(i).getTitulo()));
                    break;

                case 4: //BUSCAR LIBRO POR TITULO
                    System.out.println("Ingresa el título del libro a buscar en el Sistema de Gestion de Bibliotecas: ");
                    titulo = entrada.nextLine();
                    System.out.println(biblioteca.buscarLibroXTitulo(titulo));
                    break;

                case 5: //REGISTRAR USUARIO
                    System.out.println("Ingresa el USUARIO que deseas agregar al Sistema de Gestion de Bibliotecas: ");
                    System.out.println("Ingresa el nombre del Usuario a registrar: ");
                    String nombre = entrada.nextLine();
                    entrada.nextLine();
                    System.out.println("Ingresa el ID del Usuario a registrar: ");
                    String id = entrada.nextLine();
                    entrada.nextLine();
                    Usuario usuario1 = new Usuario(nombre, id);
                    System.out.println(biblioteca.registrarUsuario(usuario1));
                    break;

                case 6: //LISTAR USUARIOS
                    System.out.println("Usuarios almacenados en el Sistema de Gestion de Bibliotecas: ");
                    List<Usuario> listaUsuarios = biblioteca.listarUsuario();
                    System.out.println("\nLa lista contiene " + listaUsuarios.size() + " usuarios");
//                    for (int i=0; i<listaUsuarios.size(); i++){
//                        System.out.println("Usuario " + (i+1) + " :"+ listaUsuarios.get(i).getNombre());
//                    }
                    IntStream.range(0, listaUsuarios.size())
                            .forEach(i -> System.out.println("Usuario " + (i + 1) + " :" + listaUsuarios.get(i).getNombre()));
                    break;

                case 7:
                    System.out.println("SALIR del Sistema de Gestión de Bibliotecas");
                    break;

                default:
                    System.out.println("Opción NO valida, intenta de nuevo");
                    break;
            }
        } while (opcion != 7);

    }
}