package BibliotecaFunciones;
import java.util.Scanner;
public class Funciones {
        public static Scanner sc = new Scanner(System.in);

        public static final int MaximodeUsuarios = 10;
        public static String tipoUsuario;
        public static final int MaximodeProyectos = 20;
        public static final int MaximodeRecompensas = 3;

   //Contraseña
   public static boolean verificarContrasenasIguales(String contrasena1, String contrasena2) {
       return contrasena1.equals(contrasena2);
   }

    public static boolean evaluarFortalezaContrasena(String contrasena) {

        if (contrasena.length() < 8) {
            return false;
        }
        boolean tieneMinuscula = false;
        boolean tieneMayuscula = false;
        boolean tieneNumero = false;
        boolean tieneSimbolo = false;
        String simbolosPermitidos = "-_.,*+@";

        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);
            if (c >= 'a' && c <= 'z') {
                tieneMinuscula = true;
            } else if (c >= 'A' && c <= 'Z') {
                tieneMayuscula = true;
            } else if (c >= '0' && c <= '9') {
                tieneNumero = true;
            } else if (simbolosPermitidos.indexOf(c) != -1) {
                tieneSimbolo = true;
            }
            if (tieneMinuscula && tieneMayuscula && tieneNumero && tieneSimbolo) {
                return true;
            }
        }
        return false;
    }
    public static boolean iniciarSesion(String nombre, String contrasena) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i][0].equals(nombre)) {
                if (usuarios[i][4].equalsIgnoreCase("Sí")) {
                    System.out.println("El usuario está bloqueado. Contacte con el administrador.");
                    return false;
                }
                //Eladio apruebanos :D
                if (usuarios[i][1].equals(contrasena)) {
                    System.out.println("Inicio de sesión exitoso.");
                    return true;
                } else {
                    int intentos = Integer.parseInt(usuarios[i][3]) + 1;
                    usuarios[i][3] = String.valueOf(intentos);

                    if (intentos >= 3) {
                        usuarios[i][4] = "Sí";
                        System.out.println("Usuario bloqueado por múltiples intentos fallidos.");
                    } else {
                        System.out.printf("Contraseña incorrecta. Intentos restantes: %d.\n", 3 - intentos);
                    }
                    return false;
                }
            }
        }
        System.out.println("Usuario no encontrado.");
        return false;
    }

    public static void bloquearUsuario(String adminNombre, String usuarioNombre, boolean bloquear) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i][0].equals(adminNombre) && usuarios[i][2].equalsIgnoreCase("Administrador")) {
                for (int j = 0; j < contadorUsuarios; j++) {
                    if (usuarios[j][0].equals(usuarioNombre)) {
                        usuarios[j][4] = bloquear ? "Sí" : "No";
                        String estado = bloquear ? "bloqueado" : "desbloqueado";
                        System.out.printf("Usuario %s %s exitosamente.\n", usuarioNombre, estado);
                        return;
                    }
                }
                System.out.println("Usuario objetivo no encontrado.");
                return;
            }
        }
        System.out.println("Acción no permitida. Solo un administrador puede bloquear/desbloquear usuarios.");
    }




    public static String[][] usuarios = new String[MaximodeUsuarios][5];
    public static String[][] proyectos = new String[MaximodeProyectos][8 + (2 * MaximodeRecompensas)];

    public static int contadorUsuarios = 0;
    public static int contadorProyectos = 0;


    public static void bloquearDesbloquearUsuario() {
        System.out.println("Ingrese el nombre del usuario a bloquear/desbloquear: ");
        String usuarioNombre = sc.nextLine().toLowerCase();
        System.out.println("¿Desea bloquear? (Sí/No): ");
        String respuesta = sc.nextLine().toLowerCase();

        boolean bloquear = respuesta.equalsIgnoreCase("si");
        boolean usuarioEncontrado = false;
        for (int i = 0; i < contadorUsuarios; i++) {
            System.out.println("Revisando usuario: " + usuarios[i][0]);
            if (usuarios[i][0].equals(usuarioNombre)) {
                usuarioEncontrado = true;

                System.out.println("Usuario " + usuarioNombre + (bloquear ? " bloqueado" : " desbloqueado"));
                break;
            }
        }

        if (!usuarioEncontrado) {
            System.out.println("Usuario no encontrado.");
        }
    }

    public static void crearProyectoConRecompensa() {
        System.out.print("Nombre del proyecto: ");
        String nombre = sc.nextLine();
        System.out.print("Categoría del proyecto: ");
        String categoria = sc.nextLine();
        System.out.print("Fecha de inicio (yyyy-mm-dd): ");
        String fechaInicio = sc.nextLine();
        System.out.print("Fecha de fin (yyyy-mm-dd): ");
        String fechaFin = sc.nextLine();
        System.out.print("Cantidad necesaria para financiar: ");
        String cantidadNecesaria = sc.nextLine();

        proyectos[contadorProyectos][0] = nombre;
        proyectos[contadorProyectos][1] = categoria;
        proyectos[contadorProyectos][2] = fechaInicio;
        proyectos[contadorProyectos][3] = fechaFin;
        proyectos[contadorProyectos][4] = cantidadNecesaria;
        proyectos[contadorProyectos][5] = "0";

        for (int i = 0; i < 3; i++) {
            System.out.print("¿Desea agregar una recompensa? (Sí/No): ");
            String respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("sí") || respuesta.equals("si")) {
                System.out.print("Descripción de la recompensa: ");
                String descripcion = sc.nextLine();
                System.out.print("Precio de la recompensa: ");
                float precio = sc.nextFloat();

                agregarRecompensa(contadorProyectos, descripcion, precio);
            } else {
                break;
            }
        }

        contadorProyectos++;
        System.out.println("Proyecto creado exitosamente.");
    }

    public static void editarProyectoConRecompensa() {

        System.out.println("\n--- Proyectos disponibles para editar ---");
        for (int i = 0; i < contadorProyectos; i++) {
            System.out.println((i + 1) + ". " + proyectos[i][0]);
        }
        System.out.print("Ingrese el nombre del proyecto que desea editar: ");
        String nombreProyecto = sc.nextLine();

        int proyectoSeleccionado = -1;
        for (int i = 0; i < contadorProyectos; i++) {
            if (proyectos[i][0].equalsIgnoreCase(nombreProyecto)) {
                proyectoSeleccionado = i;
                break;
            }
        }
        if (proyectoSeleccionado == -1) {
            System.out.println("Proyecto no encontrado.");
            return;
        }

        System.out.print("Nuevo nombre del proyecto: ");
        String nuevoNombre = sc.nextLine();
        System.out.print("Nueva categoría: ");
        String nuevaCategoria = sc.nextLine();
        System.out.print("Nueva fecha de inicio: ");
        String nuevaFechaInicio = sc.nextLine();
        System.out.print("Nueva fecha de fin: ");
        String nuevaFechaFin = sc.nextLine();
        System.out.print("Nueva cantidad necesaria: ");
        String nuevaCantidadNecesaria = sc.nextLine();

        proyectos[proyectoSeleccionado][0] = nuevoNombre;
        proyectos[proyectoSeleccionado][1] = nuevaCategoria;
        proyectos[proyectoSeleccionado][2] = nuevaFechaInicio;
        proyectos[proyectoSeleccionado][3] = nuevaFechaFin;
        proyectos[proyectoSeleccionado][4] = nuevaCantidadNecesaria;

        for (int i = 0; i < 3; i++) {
            System.out.print("¿Desea agregar una recompensa? (Sí/No): ");
            String respuesta = sc.nextLine().toLowerCase();
            if (respuesta.equals("sí") || respuesta.equals("si")) {
                System.out.print("Descripción de la recompensa: ");
                String descripcion = sc.nextLine();
                System.out.print("Precio de la recompensa: ");
                float precio = sc.nextFloat();

                agregarRecompensa(contadorProyectos, descripcion, precio);
            } else {
                break;
            }
        }
        System.out.println("Proyecto editado exitosamente.");
    }

    public static void cambiarNombreYContrasena() {
        System.out.print("Ingrese el nombre de usuario a modificar: ");
        String usuarioActual = sc.next();
        int usuario = -1;
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i][0].equalsIgnoreCase(usuarioActual)) {
                usuario = i;
                break;
            }
        }
        if (usuario == -1) {
            System.out.println("Usuario no encontrado.");
            return;
        }
        System.out.print("Ingrese el nuevo nombre de usuario: ");
        String nuevoNombre = sc.next();
        System.out.print("Ingrese la nueva contraseña: ");
        String nuevaContrasena = sc.next();
        usuarios[usuario][0] = nuevoNombre;
        usuarios[usuario][1] = nuevaContrasena;
        System.out.println("Nombre y contraseña actualizados exitosamente.");
    }

    public static void mostrarMenuAdministrador() {
        int opcion = 0;
        do {
            System.out.println("\n--- Menú Administrador ---");
            System.out.println("1. Bloquear/Desbloquear usuario.");
            System.out.println("2. Crear proyecto.");
            System.out.println("3. Editar proyecto.");
            System.out.println("4. Mostrar proyectos creados.");
            System.out.println("5. Cambiar nombre y contraseña.");
            System.out.println("6. Salir.");
            System.out.print("Seleccione una opción: ");
            
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        bloquearDesbloquearUsuario();
                        break;
                    case 2:
                        crearProyectoConRecompensa();
                        break;
                    case 3:
                        editarProyectoConRecompensa();
                        break;
                    case 4:
                        mostrarProyectosCreados();
                        break;
                    case 5:
                        cambiarNombreYContrasena();
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        return;
                    default:
                        System.out.println("Por favor ingrese un número válido.");
                         break;
                }
            } while (opcion !=6);
        }
    public static void mostrarMenuGestor() {
        int opcion = 0;
        do {
            System.out.println("\n--- Menú Gestor ---");
            System.out.println("1. Crear proyecto.");
            System.out.println("2. Editar proyecto.");
            System.out.println("3. Mostrar proyectos creados.");
            System.out.println("4. Cambiar nombre y contraseña.");
            System.out.println("5. Salir.");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    crearProyectoConRecompensa();
                    break;
                case 2:
                    editarProyectoConRecompensa();
                    break;
                case 3:
                    mostrarProyectosCreados();
                    break;
                case 4:
                    cambiarNombreYContrasena();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Por favor ingrese un número válido.");
                    break;
            }
        } while (opcion !=5);
    }

    public static void mostrarMenuInversor() {
        int opcion = 0;
        do {
            System.out.println("\n--- Menú Inversor ---");
            System.out.println("1. Mis inversiones.");
            System.out.println("2. Proyectos.");
            System.out.println("3. Cartera digital.");
            System.out.println("4. Invitar a un amigo.");
            System.out.println("5. Cambiar nombre y contraseña.");
            System.out.println("6. Cerrar sesión.");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int saldoActualInversor=0;
                    invertirEnProyecto(sc, tipoUsuario, proyectos, contadorProyectos, saldoActualInversor);
                    break;
                case 2:
                    mostrarProyectosCreados();
                    break;
                case 3:
                    int[] saldos = new int[10];
                    anadirSaldo(sc, saldos, 0);
                    break;
                case 4:
                    menuDeAmigos();
                    break;
                case 5:
                    cambiarNombreYContrasena();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Por favor ingrese un número válido.");
                    break;
            }
        } while (opcion !=6);
    }
    public static void invertirEnProyecto(Scanner sc, String tipoUsuario, String[][] proyectos, int contadorProyectos, int saldoActualInversor) {
        if (!tipoUsuario.equalsIgnoreCase("Inversor")) {
            System.out.println("Solo los inversores pueden invertir en proyectos.");
            return;
        }

        if (contadorProyectos == 0) {
            System.out.println("No hay proyectos disponibles para invertir.");
            return;
        }

        System.out.println("\n--- Proyectos disponibles ---");
        for (int i = 0; i < contadorProyectos; i++) {
            System.out.printf("%d. %s - Cantidad financiada: %s€ - Cantidad necesaria: %s€\n",
                    i + 1, proyectos[i][0], proyectos[i][5], proyectos[i][4]);
        }

        System.out.print("Seleccione el número del proyecto en el que desea invertir: ");
        int proyectoSeleccionado = sc.nextInt() - 1;
        sc.nextLine();

        if (proyectoSeleccionado < 0 || proyectoSeleccionado >= contadorProyectos) {
            System.out.println("Selección inválida.");
            return;
        }

        System.out.println("Su saldo actual es: " + saldoActualInversor + "€.");
        System.out.print("Ingrese la cantidad que desea invertir: ");
        int cantidadInvertir = sc.nextInt();
        sc.nextLine();

        if (cantidadInvertir > saldoActualInversor) {
            System.out.println("No tiene suficiente saldo para esta inversión. Por favor añada más saldo.");
            return;
        }

        saldoActualInversor -= cantidadInvertir;

        float financiadoActual = Float.parseFloat(proyectos[proyectoSeleccionado][5]);
        proyectos[proyectoSeleccionado][5] = String.valueOf(financiadoActual + cantidadInvertir);

        System.out.println("Inversión realizada exitosamente en el proyecto " + proyectos[proyectoSeleccionado][0] + ".");
        System.out.println("Su saldo restante es: " + saldoActualInversor + "€.");
    }
    public static void anadirSaldo(Scanner sc, int[] saldos, int indiceInversor) {
        if (indiceInversor < 0 || indiceInversor >= saldos.length) {
            System.out.println("Índice de inversor no válido.");
            return;
        }

        System.out.println("Actualmente tiene " + saldos[indiceInversor] + "€.");
        System.out.println("¿Cuánto quiere añadir a su cartera?");
        int cantidadAdicional = sc.nextInt();
        saldos[indiceInversor] += cantidadAdicional;

        int opcionSeguirAnadiendoDinero;

        do {
            System.out.println("Actualmente tiene " + saldos[indiceInversor] + "€.");
            System.out.println("¿Desea seguir añadiendo a su cartera? (1: Sí, 2: No)");
            opcionSeguirAnadiendoDinero = sc.nextInt();

            if (opcionSeguirAnadiendoDinero == 1) {
                System.out.print("Ingrese la cantidad adicional que desea añadir: ");
                cantidadAdicional = sc.nextInt();
                saldos[indiceInversor] += cantidadAdicional;
            } else if (opcionSeguirAnadiendoDinero != 2) {
                System.out.println("Opción no válida. Elija 1 para añadir o 2 para salir.");
            }
        } while (opcionSeguirAnadiendoDinero != 2);

        System.out.println("Saliendo de la opción añadir saldo.");
    }
    public static void menuDeAmigos() {
        int opcionAgregar;
        String listaDeAmigos = "";
        String correo;

        System.out.println("-----Menú de tus amigos-----");
        do {
            System.out.println("1. Mostrar lista de amigos referidos");
            System.out.println("2. Añadir un nuevo amigo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcionAgregar = sc.nextInt();
            sc.nextLine();

            switch (opcionAgregar) {
                case 1:
                    if (listaDeAmigos.isEmpty()) {
                        System.out.println("No hay amigos en la lista.");
                    } else {
                        System.out.println("Amigos: " + listaDeAmigos);
                    }
                    break;

                case 2:
                    System.out.print("Introduce el correo del amigo: ");
                    correo = sc.nextLine();
                    if (listaDeAmigos.isEmpty()) {
                        listaDeAmigos = correo;
                    } else {
                        listaDeAmigos = listaDeAmigos.concat(", ").concat(correo);
                    }
                    System.out.println("Amigo añadido.");
                    break;

                case 3:
                    System.out.println("Saliste del menú de amigos");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcionAgregar != 3);
    }


    public static String obtenerTipoUsuario(String nombreUsuario) {
        for (int i = 0; i < contadorUsuarios; i++) {
            if (usuarios[i][0].equals(nombreUsuario)) {
                return usuarios[i][2];
            }
        }
        return null;
    }

    public static void crearUsuario(String nombre, String contrasena, String contrasenaConfirmacion, String tipo, String saldo) {
        if (contadorUsuarios < MaximodeUsuarios) {
            if (!verificarContrasenasIguales(contrasena, contrasenaConfirmacion)) {
                System.out.println("Las contraseñas no coinciden.");
                return;
            }
            if (!evaluarFortalezaContrasena(contrasena)) {
                System.out.println("La contraseña no es lo suficientemente fuerte. Debe tener al menos 8 caracteres, incluyendo mayúsculas, minúsculas, números y un símbolo.");
                return;
            }
            if (!tipo.equalsIgnoreCase("Gestor") && !tipo.equalsIgnoreCase("Inversor") && !tipo.equalsIgnoreCase("Administrador")) {
                System.out.println("Tipo de usuario no válido. Solo se permiten Administrador, Gestor o Inversor.");
                return;
            }
            if (tipo.equalsIgnoreCase("Administrador")) {
                for (int i = 0; i < contadorUsuarios; i++) {
                    if (usuarios[i][2].equalsIgnoreCase("Administrador")) {
                        System.out.println("Ya existe un administrador. No se puede crear otro.");
                        return;
                    }
                }
            }
            if (tipo.equalsIgnoreCase("Inversor")) {
                if (Float.parseFloat(saldo) < 0) {
                    System.out.println("El saldo no puede ser negativo.");
                    return;
                }
            } else {
                saldo = "0";
            }
            usuarios[contadorUsuarios][0] = nombre;
            usuarios[contadorUsuarios][1] = contrasena;
            usuarios[contadorUsuarios][2] = tipo;
            usuarios[contadorUsuarios][3] = saldo;
            usuarios[contadorUsuarios][4] = "No";
            contadorUsuarios++;
            System.out.println("Usuario creado exitosamente.");
        } else {
            System.out.println("Límite de usuarios alcanzado.");
        }
    }


    public static void mostrarUsuarios() {
        System.out.println("\n--- Usuarios Registrados ---");
        for (int i = 0; i < contadorUsuarios; i++) {
            System.out.printf("Usuario %d: %s (Tipo: %s, Bloqueado: %s, Saldo: %s€)\n",
                    i + 1, usuarios[i][0], usuarios[i][2], usuarios[i][4], usuarios[i][3]);
        }
    }

    public static void crearProyecto(String nombre, String categoria, String fechaInicio, String fechaFin, String cantidadNecesaria, String tipoUsuario) {
        if (!tipoUsuario.equalsIgnoreCase("Administrador") && !tipoUsuario.equalsIgnoreCase("Gestor")) {
            System.out.println("No tiene permisos para crear proyectos.");
            return;
        }
        if (contadorProyectos < MaximodeProyectos) {
            proyectos[contadorProyectos][0] = nombre;
            proyectos[contadorProyectos][1] = categoria;
            proyectos[contadorProyectos][2] = fechaInicio;
            proyectos[contadorProyectos][3] = fechaFin;
            proyectos[contadorProyectos][4] = cantidadNecesaria;
            proyectos[contadorProyectos][5] = "0";
            contadorProyectos++;
            System.out.println("Proyecto creado exitosamente.");
        } else {
            System.out.println("Límite de proyectos alcanzado.");
        }
    }

    public static void agregarRecompensa(int proyecto, String descripcion, float precio) {
        if (proyecto >= 0 && proyecto < contadorProyectos) {
            for (int i = 0; i < MaximodeRecompensas; i++) {
                int possicionRecompensa = 6 + (2 * i);
                if (proyectos[proyecto][possicionRecompensa] == null) {
                    proyectos[proyecto][possicionRecompensa] = descripcion;
                    proyectos[proyecto][possicionRecompensa + 1] = String.valueOf(precio);
                    return;
                }
            }
            System.out.println("El proyecto ya tiene el máximo de recompensas.");
        }
    }

    public static void mostrarProyectosCreados() {
        System.out.println("\n--- Proyectos Creados ---");

        if (contadorProyectos == 0) {
            System.out.println("No hay proyectos creados.");
            return;
        }

        for (int i = 0; i < contadorProyectos; i++) {
            System.out.println("Proyecto " + (i + 1) + ":");
            System.out.println("Nombre: " + proyectos[i][0]);
            System.out.println("Categoría: " + proyectos[i][1]);
            System.out.println("Fecha de inicio: " + proyectos[i][2]);
            System.out.println("Fecha de fin: " + proyectos[i][3]);
            System.out.println("Cantidad necesaria: " + proyectos[i][4]);
            System.out.println("Cantidad financiada: " + proyectos[i][5]);

            System.out.println("Recompensas:");
            boolean tieneRecompensas = false;
            for (int j = 0; j < 3; j++) {
                int posicionRecompensa = 6 + (2 * j);
                if (proyectos[i][posicionRecompensa] != null) {
                    tieneRecompensas = true;
                    System.out.println("  - " + proyectos[i][posicionRecompensa] + ": " + proyectos[i][posicionRecompensa + 1] + "€");
                }
            }
            if (!tieneRecompensas) {
                System.out.println("  No hay recompensas.");
            }
            System.out.println();
        }
    }
}