import java.util.Scanner;
import static BibliotecaFunciones.Funciones.*;
public class FernanStarter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear un nuevo usuario");
            System.out.println("2. Mostrar usuarios registrados");
            System.out.println("3. Iniciar sesión");
            System.out.println("4. Salir");

            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nCrear un nuevo usuario:");
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Contraseña: ");
                    String contrasena = scanner.next();
                    System.out.print("Confirmar Contraseña: ");
                    String contrasenaConfirmacion = scanner.next();
                    System.out.print("Tipo de usuario (Inversor, Gestor, Administrador): ");
                    String tipo = scanner.next();
                    crearUsuario(nombre, contrasena, contrasenaConfirmacion, tipo);
                    break;

                case 2:
                    mostrarUsuarios();
                    break;

                case 3:
                    System.out.println("Iniciar sesión");
                    System.out.print("Nombre de usuario: ");
                    String nombreUsuario = scanner.next();
                    System.out.print("Contraseña: ");
                    String contrasenaUsuario = scanner.next();
                    if (iniciarSesion(nombreUsuario, contrasenaUsuario)) {
                        tipoUsuario = obtenerTipoUsuario(nombreUsuario);
                        if (tipoUsuario != null && tipoUsuario.equalsIgnoreCase("Administrador")) {
                            mostrarMenuAdministrador();
                        } else if (tipoUsuario != null && tipoUsuario.equalsIgnoreCase("Gestor")) {
                            mostrarMenuGestor();
                        } else if (tipoUsuario != null && tipoUsuario.equalsIgnoreCase("Inversor")) {
                            mostrarMenuInversor();
                        }else{
                            System.out.println("No existe.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Adios Makina");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }
}
