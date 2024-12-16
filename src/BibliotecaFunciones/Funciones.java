package BibliotecaFunciones;

public class Funciones {
    public static void inicioPrograma(){
        System.out.println("*****Bienvenidos al sistema de acceso*****");
        System.out.println("Si quiere hacer login pulse 1, si quiere salir del programa 2.");
    }
    public static void menuAdministrador(){
        System.out.println("-----Menú Administrador-----");
        System.out.println("1. Panel de control");
        System.out.println("2. Proyectos");
        System.out.println("3. Configuración");
        System.out.println("4. Cerrar sesión");
    }
    public static void panelControlAdministrador(){
        System.out.println("Bienvenido al Panel de control que deseas");
        System.out.println("1.Bloquear");
        System.out.println("2.Desbloquear");
        System.out.println("3.Salir");
    }
    public static void proyectosControlAdministrador(){
        System.out.println("--------------------------------------");
        System.out.println("1. Visualizar Proyectos creados");
        System.out.println("2. Modificar o eliminar Proyectos");
        System.out.println("3. Salir");
        System.out.println("--------------------------------------");
    }
    public static void menuGestor(){
        System.out.println("-----Menú Gestor-----");
        System.out.println("1. Mis proyectos.");
        System.out.println("2. Vista detallada de los proyectos.");
        System.out.println("3. Modificar o eliminar datos de los proyectos.");
        System.out.println("4. Configuración.");
        System.out.println("5. Cerrar sesión.");
    }
    public static void configuracionGestor(){
        System.out.println("1. Cambiar nombre de usuario.");
        System.out.println("2. Cambiar la contraseña de usuario.");
        System.out.println("3. Salir.");
    }
    public static void menuInversores(){
        System.out.println("1. Mis inversiones.");
        System.out.println("2. Proyectos.");
        System.out.println("3. Cartera digital.");
        System.out.println("4. Invitar a un amigo.");
        System.out.println("5. Configuración.");
        System.out.println("6. Cerrar sesión.");
    }
    public static void menuInvertirProyectos2(){
        System.out.println("¿En qué proyecto quieres invertir?");
        System.out.println("1. Invertir en el proyecto 1.");
        System.out.println("2. Invertir en el proyecto 2.");
        System.out.println("3. Salir.");
    }
    public static void menuInvertirProyectos1(){
        System.out.println("¿En qué proyecto quieres invertir?");
        System.out.println("1. Invertir en el proyecto 1.");
        System.out.println("2. Salir.");
    }
    public static void menuInvertirProyectos3(){
        System.out.println("¿En qué proyecto quieres invertir?");
        System.out.println("1. Invertir en el proyecto 1.");
        System.out.println("2. Invertir en el proyecto 2.");
        System.out.println("3. Invertir en el proyecto 3.");
        System.out.println("4. Salir.");
    }
    public static void menuInversoresAmigos(){
        System.out.println("1. Mostrar lista de amigos referidos");
        System.out.println("2. Añadir un nuevo amigo");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opción: ");
    }
    public static void menuConfiguracionInversores(){
        System.out.println("1. Cambiar nombre de usuario.");
        System.out.println("2. Cambiar la contraseña de usuario.");
        System.out.println("3. Salir.");
    }
}
