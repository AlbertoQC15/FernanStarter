package BibliotecaFunciones;
import java.util.Scanner;
import static BibliotecaFunciones.Email.*;

public class Funciones {

    private static String usuarioAdministrador = "Administrador";
    private static String contraAdministrador = "1234";

    private static String usuarioGestor = "Gestor";
    private static String contraGestor = "4321";
    private static int numerosProyectos = 0;
    private static String nombreProyecto1, categoriaProyecto1, fechaInicioProyecto1, fechaFinProyecto1;
    private static float cantidadNecesariaProyecto1, cantidadFinanciadaProyecto1;
    private static boolean hacerRecompensasProyecto1;
    private static String recompensasProyecto1;
    private static float precioRecompensaProyecto1;
    private static String[] recompensas = new String[3];
    private static float[] preciosRecompensas = new float[3];
    private static int cantidadRecompensas = 0;


    private static String Inversor1 = "Inversor1";
    private static String contraInversor1 = "Inversor1";
    private static int saldoActualInversor1 = 0;


    private static String Inversor2 = "Inversor2";
    private static String contraInversor2 = "Inversor2";
    private static int saldoActualInversor2 = 0;


    private static boolean bloqueadoGestor = false;
    private static boolean bloqueadoInversor1 = false;
    private static boolean bloqueadoInversor2 = false;



    public static void verificacion_Email() {
        Scanner s = new Scanner(System.in);
        String usuario = "jesus.garcia.1207@fernando3martos.com";
        String contrasena = "1234";

        int codigoIntento;
        String usuarioIntento;
        String contraenaIntento;
        int codigo = (int)(Math.random()*9000+1000);
        int intentoCodigo =3;
        int intentoInicio =3;
        String asunto = "Código de verificación";
        String cuerpo = "El código de verificación  para acceder a tu cuenta es " + codigo;
        do {
            System.out.println("Introduce tu usuario (correo-e)");
            usuarioIntento = s.nextLine();
            System.out.println("Introduce la contraseña (1234)");
            contraenaIntento = s.nextLine();
            if (!usuarioIntento.equals(usuario) || !contraenaIntento.equals(contrasena)){
                intentoInicio--;
                System.out.println("Usuario o contraseña incorrectos. Te quedan "+intentoInicio+ " intentos.");
            }
        }while ((!usuarioIntento.equals(usuario) || !contraenaIntento.equals(contrasena)) && intentoInicio>0);
        if (intentoInicio>0) {
            do {
                System.out.println("Por favor introduce el código que te hemos mandado a tu correo");
                enviarConGMail(usuario, asunto, cuerpo);
                codigoIntento = Integer.parseInt(s.nextLine());
                if (codigoIntento!=codigo){
                    intentoCodigo--;
                    System.out.println("Código erróneo. Te quedan "+ intentoCodigo +" intentos.");
                    codigo= (int)(Math.random()*9000+1000);
                }
            } while (codigoIntento != codigo && intentoCodigo > 0);
            if (codigoIntento == codigo) {
                System.out.println("¡Verificación correctamente realizada!");
            }else{
                System.out.println("Cuenta bloqueada. Contacte con el administrador.");
            }
        }else {
            System.out.println("Cuenta bloqueada. Contacte con el administrador.");
        }
    }


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

    public static void bloquearUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿A quién deseas bloquear? " + usuarioGestor + ", " + Inversor1 + ", " + Inversor2);
        String nombreUsuario = sc.next();
        if (nombreUsuario.equals(usuarioGestor)) {
            bloqueadoGestor = true;
            System.out.println("Se ha bloqueado exitosamente a " + usuarioGestor);
        } else if (nombreUsuario.equals(Inversor1)) {
            bloqueadoInversor1 = true;
            System.out.println("Se ha bloqueado exitosamente a " + Inversor1);
        } else if (nombreUsuario.equals(Inversor2)) {
            bloqueadoInversor2 = true;
            System.out.println("Se ha bloqueado exitosamente a " + Inversor2);
        } else {
            System.out.println("El usuario ingresado no es válido.");
        }
    }
    public static void desbloquearUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿A quién deseas bloquear? " + usuarioGestor + ", " + Inversor1 + ", " + Inversor2);
        String nombreUsuario = sc.next();
        if (nombreUsuario.equals(usuarioGestor)) {
            bloqueadoGestor = false;
            System.out.println("Se ha bloqueado exitosamente a " + usuarioGestor);
        } else if (nombreUsuario.equals(Inversor1)) {
            bloqueadoInversor1 = false;
            System.out.println("Se ha bloqueado exitosamente a " + Inversor1);
        } else if (nombreUsuario.equals(Inversor2)) {
            bloqueadoInversor2 = false;
            System.out.println("Se ha bloqueado exitosamente a " + Inversor2);
        } else {
            System.out.println("El usuario ingresado no es válido.");
        }
    }
    public static void mostrarUsuariosBloqueados() {
        System.out.println("Estado de usuarios bloqueados:");
        System.out.println(usuarioGestor + ": " + (bloqueadoGestor ? "Bloqueado" : "No bloqueado"));
        System.out.println(Inversor1 + ": " + (bloqueadoInversor1 ? "Bloqueado" : "No bloqueado"));
        System.out.println(Inversor2 + ": " + (bloqueadoInversor2 ? "Bloqueado" : "No bloqueado"));
    }

    public static void mostrarMenuConfiguracion() {
        Scanner sc = new Scanner(System.in);
        int menuconf;
        do {
            System.out.println("1. Cambiar nombre de usuario");
            System.out.println("2. Cambiar contraseña");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            menuconf = sc.nextInt();

                switch (menuconf) {
                    case 1:
                        cambiarNombreUsuario(sc);
                        break;
                    case 2:
                        cambiarContrasena(sc);
                        break;
                    case 3:
                        System.out.println("Saliendo del menú de configuración...");
                        break;
                    default:
                        System.out.println("Tienes que elegir una de las opciones (1-3).");
                        break;
                }
            }while (menuconf != 3);
    }
    public static void cambiarNombreUsuario(Scanner sc) {
        System.out.println("Tu nombre actual es: " + usuarioAdministrador);
        System.out.print("Pon tu nuevo nombre: ");
        usuarioAdministrador = sc.next();
        System.out.println("Cambiaste tu nombre a: " + usuarioAdministrador);
    }
    public static void cambiarContrasena(Scanner sc) {
        System.out.println("Tu contraseña actual es: " + contraAdministrador);
        System.out.print("Pon tu nueva contraseña: ");
        contraAdministrador = sc.next();
        System.out.println("Cambiaste tu contraseña a: " + contraAdministrador);
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


    public static void gestionarProyectos(Scanner sc) {
        System.out.println("¿Quieres crear algún proyecto? (1: Sí, 2: No)");
        int opcionCrearProyecto = sc.nextInt();

        while (opcionCrearProyecto == 1 && numerosProyectos < 3) {
            numerosProyectos++;

            switch (numerosProyectos) {
                case 1:
                    crearProyecto(sc, 1);
                    break;
                case 2:
                    crearProyecto(sc, 2);
                    break;
                case 3:
                    crearProyecto(sc, 3);
                    break;
                default:
                    System.out.println("Ya has alcanzado el límite de proyectos.");
            }

            if (numerosProyectos < 3) {
                System.out.println("¿Quieres crear otro proyecto? (1: Sí, 2: No)");
                opcionCrearProyecto = sc.nextInt();
            }
        }

        if (numerosProyectos == 3) {
            System.out.println("Has alcanzado el número máximo de proyectos permitidos.");
        } else {
            System.out.println("No se crearán más proyectos.");
        }
    }


    public static void crearProyecto(Scanner sc, int numeroProyecto) {
        System.out.println("Creando el Proyecto " + numeroProyecto + ":");
        System.out.print("Dime el nombre del proyecto: ");
        String nombreProyecto = sc.next();

        System.out.print("Dime la categoría del proyecto (arte, tecnología, cine, música, juegos, comida, moda…): ");
        String categoriaProyecto = sc.next();

        System.out.print("Cantidad necesaria del proyecto: ");
        float cantidadNecesaria = sc.nextFloat();

        System.out.print("Cantidad financiada del proyecto: ");
        float cantidadFinanciada = sc.nextFloat();

        System.out.print("Fecha de inicio del proyecto: ");
        String fechaInicio = sc.next();

        System.out.print("Fecha de finalización del proyecto: ");
        String fechaFin = sc.next();

        // Guardar los datos del proyecto
        if (numeroProyecto == 1) {
            nombreProyecto1 = nombreProyecto;
            categoriaProyecto1 = categoriaProyecto;
            cantidadNecesariaProyecto1 = cantidadNecesaria;
            cantidadFinanciadaProyecto1 = cantidadFinanciada;
            fechaInicioProyecto1 = fechaInicio;
            fechaFinProyecto1 = fechaFin;
        }

        // Añadir recompensas (máximo 3) Eladio Apruebame
        añadirRecompensas(sc);

        System.out.println("Proyecto " + numeroProyecto + " creado exitosamente.");
    }

    public static void añadirRecompensas(Scanner sc) {
        System.out.println("¿Quieres añadir recompensas a tu proyecto? (si/no): ");
        String respuesta = sc.next().toLowerCase();

        if (respuesta.equals("si")) {
            sc.nextLine();
            while (cantidadRecompensas < 3) {
                System.out.println("Introduce la descripción de la recompensa " + (cantidadRecompensas + 1) + ": ");
                String recompensa = sc.nextLine();

                System.out.println("Indica el precio de la recompensa: ");
                float precio = sc.nextFloat();

                // Guardamos la recompensa y su precio
                recompensas[cantidadRecompensas] = recompensa;
                preciosRecompensas[cantidadRecompensas] = precio;

                cantidadRecompensas++;

                if (cantidadRecompensas < 3) {
                    System.out.println("¿Quieres añadir otra recompensa? (si/no): ");
                    String otra = sc.next().toLowerCase();
                    if (!otra.equals("si")) {
                        break;
                    }
                }
            }
        } else {
            System.out.println("No se han añadido recompensas.");
        }

        // Mostrar las recompensas añadidas
        mostrarRecompensas();
    }


    public static void mostrarRecompensas() {
        System.out.println("Recompensas añadidas al proyecto:");

        for (int i = 0; i < cantidadRecompensas; i++) {
            System.out.println((i + 1) + ". " + recompensas[i] + " - Precio: " + preciosRecompensas[i] + "€");
        }

        if (cantidadRecompensas == 0) {
            System.out.println("No hay recompensas añadidas.");
        }
    }


    public static void mostrarProyectoConGrafico() {
        System.out.println("-----PROYECTO 1-----");
        System.out.println("Nombre: " + nombreProyecto1);
        System.out.println("Categoría: " + categoriaProyecto1);
        System.out.println("Cantidad necesaria: " + cantidadNecesariaProyecto1 + "€");
        System.out.println("Cantidad financiada: " + cantidadFinanciadaProyecto1 + "€");
        System.out.println("Fecha inicio proyecto: " + fechaInicioProyecto1);
        System.out.println("Fecha fin proyecto: " + fechaFinProyecto1);

        System.out.println("*******Gráfico de Barras de la financiación del proyecto 1.*******");
        float porcentajeProyecto1 = (cantidadFinanciadaProyecto1 / cantidadNecesariaProyecto1) * 100;

        // Dibujar la barra
        int barraLarga = (int) (porcentajeProyecto1 / 2);
        for (int i = 0; i < barraLarga; i++) {
            System.out.print("█");
        }
        // Mostrar el porcentaje de financiación
        System.out.printf(" %.1f%%\n", porcentajeProyecto1);
    }


    public static void mostrarMenuConfiguracionGestor() {
        Scanner sc = new Scanner(System.in);
        int menuconf;
        do {
            System.out.println("1. Cambiar nombre de usuario");
            System.out.println("2. Cambiar contraseña");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            menuconf = sc.nextInt();

            switch (menuconf) {
                case 1:
                    cambiarNombreUsuarioGestor(sc);
                    break;
                case 2:
                    cambiarContrasenaGestor(sc);
                    break;
                case 3:
                    System.out.println("Saliendo del menú de configuración...");
                    break;
                default:
                    System.out.println("Tienes que elegir una de las opciones (1-3).");
                    break;
            }
        }while (menuconf != 3);
    }
    public static void cambiarNombreUsuarioGestor(Scanner sc) {
        System.out.println("Tu nombre actual es: " + usuarioGestor);
        System.out.print("Pon tu nuevo nombre: ");
        usuarioGestor = sc.next();
        System.out.println("Cambiaste tu nombre a: " + usuarioGestor);
    }
    public static void cambiarContrasenaGestor(Scanner sc) {
        System.out.println("Tu contraseña actual es: " + contraGestor);
        System.out.print("Pon tu nueva contraseña: ");
        contraGestor = sc.next();
        System.out.println("Cambiaste tu contraseña a: " + contraGestor);
    }

    public static void menuInversores(){
        System.out.println("1. Mis inversiones.");
        System.out.println("2. Proyectos.");
        System.out.println("3. Cartera digital.");
        System.out.println("4. Invitar a un amigo.");
        System.out.println("5. Configuración.");
        System.out.println("6. Cerrar sesión.");
    }


    public static void anadirSaldo(Scanner sc) {
        System.out.println("¿Cuánto quiere añadir a su cartera?");
        saldoActualInversor1 = sc.nextInt();

        int opcionSeguirAnadiendoDineroInversor1;

        do {
            mostrarSaldoActual1();
            System.out.println("¿Desea seguir añadiendo a su cartera? (1: Sí, 2: No)");
            opcionSeguirAnadiendoDineroInversor1 = sc.nextInt();

            if (opcionSeguirAnadiendoDineroInversor1 == 1) {
                anadirNuevoSaldo1(sc);
            } else if (opcionSeguirAnadiendoDineroInversor1 != 2) {
                System.out.println("Opción no válida. Elija 1 para añadir o 2 para salir.");
            }
        } while (opcionSeguirAnadiendoDineroInversor1 != 2);

        System.out.println("Saliendo de la opción añadir saldo.");
    }

    public static void mostrarSaldoActual1() {
        System.out.println("Actualmente tiene " + saldoActualInversor1 + "€.");
    }

    public static void anadirNuevoSaldo1(Scanner sc) {
        System.out.println("¿Cuánto quieres añadir?");
        int nuevoSaldoInversor1 = sc.nextInt();

        if (nuevoSaldoInversor1 > 0) {
            saldoActualInversor1 += nuevoSaldoInversor1;
            System.out.println("Se han añadido " + nuevoSaldoInversor1 + "€ exitosamente a tu cuenta.");
        } else {
            System.out.println("El saldo no se ha podido añadir. No se admiten números negativos.");
        }
    }


    public static void mostrarMenuConfiguracionInversor1() {
        Scanner sc = new Scanner(System.in);
        int menuconf;
        do {
            System.out.println("1. Cambiar nombre de usuario");
            System.out.println("2. Cambiar contraseña");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            menuconf = sc.nextInt();

            switch (menuconf) {
                case 1:
                    cambiarNombreUsuarioInversor1(sc);
                    break;
                case 2:
                    cambiarContrasenaInversor1(sc);
                    break;
                case 3:
                    System.out.println("Saliendo del menú de configuración...");
                    break;
                default:
                    System.out.println("Tienes que elegir una de las opciones (1-3).");
                    break;
            }
        }while (menuconf != 3);
    }
    public static void cambiarNombreUsuarioInversor1(Scanner sc) {
        System.out.println("Tu nombre actual es: " + Inversor1);
        System.out.print("Pon tu nuevo nombre: ");
        Inversor1 = sc.next();
        System.out.println("Cambiaste tu nombre a: " + Inversor1);
    }
    public static void cambiarContrasenaInversor1(Scanner sc) {
        System.out.println("Tu contraseña actual es: " + contraInversor1);
        System.out.print("Pon tu nueva contraseña: ");
        contraInversor1 = sc.next();
        System.out.println("Cambiaste tu contraseña a: " + contraInversor1);
    }


    public static void menuInvertirProyectos2(){
        System.out.println("¿En qué proyecto quieres invertir?");
        System.out.println("1. Invertir en el proyecto 1.");
        System.out.println("2. Invertir en el proyecto 2.");
        System.out.println("3. Salir.");
    }

    public static void anadirSaldo2(Scanner sc) {
        System.out.println("¿Cuánto quiere añadir a su cartera?");
        saldoActualInversor2 = sc.nextInt();

        int opcionSeguirAnadiendoDineroInversor2;

        do {
            mostrarSaldoActual();
            System.out.println("¿Desea seguir añadiendo a su cartera? (1: Sí, 2: No)");
            opcionSeguirAnadiendoDineroInversor2 = sc.nextInt();

            if (opcionSeguirAnadiendoDineroInversor2 == 1) {
                anadirNuevoSaldo(sc);
            } else if (opcionSeguirAnadiendoDineroInversor2 != 2) {
                System.out.println("Opción no válida. Elija 1 para añadir o 2 para salir.");
            }
        } while (opcionSeguirAnadiendoDineroInversor2 != 2);

        System.out.println("Saliendo de la opción añadir saldo.");
    }

    public static void mostrarSaldoActual() {
        System.out.println("Actualmente tiene " + saldoActualInversor2 + "€.");
    }

    public static void anadirNuevoSaldo(Scanner sc) {
        System.out.println("¿Cuánto quieres añadir?");
        int nuevoSaldoInversor2 = sc.nextInt();

        if (nuevoSaldoInversor2 > 0) {
            saldoActualInversor2 += nuevoSaldoInversor2;
            System.out.println("Se han añadido " + nuevoSaldoInversor2 + "€ exitosamente a tu cuenta.");
        } else {
            System.out.println("El saldo no se ha podido añadir. No se admiten números negativos.");
        }
    }

    public static void mostrarMenuConfiguracionInversor2() {
        Scanner sc = new Scanner(System.in);
        int menuconf;
        do {
            System.out.println("1. Cambiar nombre de usuario");
            System.out.println("2. Cambiar contraseña");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            menuconf = sc.nextInt();

            switch (menuconf) {
                case 1:
                    cambiarNombreUsuarioInversor2(sc);
                    break;
                case 2:
                    cambiarContrasenaInversor2(sc);
                    break;
                case 3:
                    System.out.println("Saliendo del menú de configuración...");
                    break;
                default:
                    System.out.println("Tienes que elegir una de las opciones (1-3).");
                    break;
            }
        }while (menuconf != 3);
    }
    public static void cambiarNombreUsuarioInversor2(Scanner sc) {
        System.out.println("Tu nombre actual es: " + Inversor2);
        System.out.print("Pon tu nuevo nombre: ");
        Inversor2 = sc.next();
        System.out.println("Cambiaste tu nombre a: " + Inversor2);
    }
    public static void cambiarContrasenaInversor2(Scanner sc) {
        System.out.println("Tu contraseña actual es: " + contraInversor2);
        System.out.print("Pon tu nueva contraseña: ");
        contraInversor2 = sc.next();
        System.out.println("Cambiaste tu contraseña a: " + contraInversor2);
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
