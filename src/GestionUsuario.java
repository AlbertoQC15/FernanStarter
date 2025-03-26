import java.util.ArrayList;

public class GestionUsuario {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static int contadorId = 1;
    private static boolean adminCreado = false;

    public static void insertarUsuario(String nombre, String email, TipoUsuario tipo, String contrasena) {
        if (tipo == TipoUsuario.ADMIN && adminCreado) {
            System.out.println("Ya existe un administrador. No se puede crear otro.");
            return;
        }
        Usuario nuevoUsuario = new Usuario(contadorId++, nombre, email, tipo, contrasena);
        usuarios.add(nuevoUsuario);
        if (tipo == TipoUsuario.ADMIN) {
            adminCreado = true;
        }
        System.out.println("Usuario agregado: " + nuevoUsuario);
    }

    public static Usuario buscarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public static void modificarUsuario(int id, String nuevoNombre, String nuevoEmail, TipoUsuario nuevoTipo) {
        Usuario usuario = buscarUsuario(id);
        if (usuario != null) {
            if (usuario.getTipo() == TipoUsuario.ADMIN && nuevoTipo != TipoUsuario.ADMIN) {
                adminCreado = false;
            }
            if (nuevoTipo == TipoUsuario.ADMIN && adminCreado) {
                System.out.println("Ya existe un administrador. No se puede modificar a otro.");
                return;
            }
            usuario.setNombre(nuevoNombre);
            usuario.setEmail(nuevoEmail);
            usuario.setTipo(nuevoTipo);
            if (nuevoTipo == TipoUsuario.ADMIN) {
                adminCreado = true;
            }
            System.out.println("Usuario modificado: " + usuario);
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    public static void eliminarUsuario(int id) {
        Usuario usuario = buscarUsuario(id);
        if (usuario != null) {
            if (usuario.getTipo() == TipoUsuario.ADMIN) {
                adminCreado = false;
            }
            usuarios.remove(usuario);
            System.out.println("Usuario eliminado: " + usuario);
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    public static void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
