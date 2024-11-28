import java.util.Scanner;

public class FernanStarter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioPedido = "";
        String contraPedido = "";
        int inicioPrograma=0;

    //Administrador
    String usuarioAdministrador="Administrador";
    String contraAdministrador="1234";
        int opcionAdmi = 0;
        int menubloq = 0;
        int menuproyec = 0;
        int menuconf = 0;
        int modificarProyec = 0;
        int eliminarModificar = 0;
        int eliminarCategoria = 0;
        int eliminarCantidadNe = 0;
        int eliminarCantidadFi = 0;
        int eliminarFechaIn = 0;
        int eliminarFechaFin = 0;
        int eliminarrecompensas = 0;
        String nombreUsuario = "";
    //UsuarioGestor
    String usuarioGestor="Gestor";
    String contraGestor="4321";
        int opcionGestor=0;
        boolean bloqueadoGestor=false;
        int numerosProyectos=0;
        int opcionCrearProyecto1 =0;
        int opcionCrearProyecto2 =0;
        int opcionCrearProyecto3 =0;
        int menuconfGestor=0;
        String nombreProyecto1 ="";
        String categoriaProyecto1="";
        float  cantidadNecesariaProyecto1=0;
        float cantidadFinanciadaProyecto1=0;
        String fechaInicioProyecto1 ="";
        String fechaFinProyecto1 ="";
        String recompensasProyecto1 ="";
        String nombreProyecto2 ="";
        String categoriaProyecto2="";
        float cantidadNecesariaProyecto2=0;
        float cantidadFinanciadaProyecto2=0;
        String fechaInicioProyecto2 ="";
        String fechaFinProyecto2 ="";
        String recompensasProyecto2 ="";
        String nombreProyecto3 ="";
        String categoriaProyecto3="";
        float cantidadNecesariaProyecto3=0;
        float cantidadFinanciadaProyecto3=0;
        String fechaInicioProyecto3 ="";
        String fechaFinProyecto3 ="";
        String recompensasProyecto3 ="";
    //UsuarioInversor1
    String inversor1="Inversor1";
    String inversorContra="Inversor1";
        boolean bloqueadoInversor1=false;
    //UsuarioInversor2
    String inversor2="Inversor2";
    String inversor2Contra="Inversor2";
        boolean bloqueadoInversor2=false;
    int intentos=0;
    boolean acceso=false;
    do{
        System.out.println("*****Bienvenidos al sistema de acceso*****");
        System.out.println("Si quiere hacer login pulse 1, si quiere salir del programa 2.");
        inicioPrograma=sc.nextInt();
        switch(inicioPrograma){
            case 1:
                while (intentos < 3 && !acceso) {
                    System.out.println("Ingrese el nombre del usuario: ");
                    usuarioPedido = sc.next();
                    System.out.println("Ingrese la contraseña de usuario:");
                    contraPedido = sc.next();
                    if (usuarioPedido.equals(usuarioAdministrador)) {
                        if (contraPedido.equals(contraAdministrador)) {
                            System.out.println("Login realizado. Bienvenido " + usuarioAdministrador);
                            acceso = true;
                            //Menu administrador
                            do {
                                System.out.println("-----Menú Administrador-----");
                                System.out.println("1. Panel de control");
                                System.out.println("2. Proyectos");
                                System.out.println("3. Configuración");
                                System.out.println("4. Cerrar sesión");
                                opcionAdmi = sc.nextInt();

                                switch (opcionAdmi) {
                                    case 1:
                                        do {
                                            System.out.println("Bienvenido al Panel de control que deseas");
                                            System.out.println("1.Bloquear");
                                            System.out.println("2.Desbloquear");
                                            System.out.println("3.Salir");
                                            menubloq = sc.nextInt();
                                            switch (menubloq) {
                                                case 1:
                                                    System.out.println("A quien deseas bloquear " + usuarioGestor + ", " + inversor1 + ", " + inversor2);
                                                    nombreUsuario = sc.next();
                                                    if (nombreUsuario.equals(usuarioGestor)) {
                                                        bloqueadoGestor = true;
                                                        System.out.println("Se ha bloqueado exitosamente al " + usuarioGestor);
                                                    } else if (nombreUsuario.equals(inversor1)) {
                                                        bloqueadoInversor1 = true;
                                                        System.out.println("Se ha bloqueado exitosamente al " + inversor1);
                                                    } else if (nombreUsuario.equals(inversor2)) {
                                                        bloqueadoInversor2 = true;
                                                        System.out.println("Se ha bloqueado exitosamente al " + inversor2);
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.println("A quien deseas desbloquear " + usuarioGestor + ", " + inversor1 + ", " + inversor2);
                                                    nombreUsuario = sc.next();
                                                    if (nombreUsuario.equals(usuarioGestor)) {
                                                        bloqueadoGestor = false;
                                                        System.out.println("Se ha desbloqueado exitosamente al " + usuarioGestor);
                                                    } else if (nombreUsuario.equals(inversor1)) {
                                                        bloqueadoInversor1 = false;
                                                        System.out.println("Se ha desbloqueado exitosamente al " + inversor1);
                                                    } else if (nombreUsuario.equals(inversor2)) {
                                                        bloqueadoInversor2 = false;
                                                        System.out.println("Se ha desbloqueado exitosamente al " + inversor2);
                                                    }
                                                    break;
                                                case 3:
                                                    System.out.println("Saliste satisfactoriamente del Panel de control");
                                                    break;
                                                default:
                                                    System.out.println("Tienes que elegir una de las opciones");
                                            }
                                        } while (menubloq != 3);

                                    case 2:
                                        System.out.println("Bienvenido a Proyectos que deseas");
                                        do {
                                            System.out.println("--------------------------------------");
                                            System.out.println("1. Visualizar Proyectos creados");
                                            System.out.println("2. Modificar o eliminar Proyectos");
                                            System.out.println("3. Salir");
                                            System.out.println("--------------------------------------");
                                            menuproyec = sc.nextInt();

                                            switch (menuproyec){
                                                case 1:
                                                    if (numerosProyectos == 0) {
                                                        System.out.println("No hay proyectos disponibles.");
                                                        break;
                                                    } else if (numerosProyectos == 1) {
                                                        System.out.println("-----PROYECTO 1-----");
                                                        System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                                + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                                + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                                        System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                                        float porcentajeProyecto1=(cantidadFinanciadaProyecto1/cantidadNecesariaProyecto1)*100;
                                                        for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                            System.out.print("█");
                                                        }
                                                        System.out.printf(" %.1f\n", porcentajeProyecto1);
                                                        break;
                                                    } else if (numerosProyectos == 2) {
                                                        System.out.println("-----PROYECTO 1-----");
                                                        System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                                + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                                + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                                        System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                                        float porcentajeProyecto1=(cantidadFinanciadaProyecto1/cantidadNecesariaProyecto1)*100;
                                                        for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                            System.out.print("█");
                                                        }
                                                        System.out.printf(" %.1f\n", porcentajeProyecto1);
                                                        System.out.println();
                                                        System.out.println("-----PROYECTO 2-----");
                                                        System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                                + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                                + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                                        System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                                        float porcentajeProyecto2=(cantidadFinanciadaProyecto2/cantidadNecesariaProyecto2)*100;
                                                        for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                            System.out.print("█");
                                                        }
                                                        System.out.printf(" %.1f\n", porcentajeProyecto2);
                                                        break;
                                                    } else if (numerosProyectos == 3) {
                                                        System.out.println("-----PROYECTO 1-----");
                                                        System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                                + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                                + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                                        System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                                        float porcentajeProyecto1=(cantidadFinanciadaProyecto1/cantidadNecesariaProyecto1)*100;
                                                        for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                            System.out.print("█");
                                                        }
                                                        System.out.printf(" %.1f\n", porcentajeProyecto1);
                                                        System.out.println();
                                                        System.out.println("-----PROYECTO 2-----");
                                                        System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                                + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                                + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                                        System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                                        float porcentajeProyecto2=(cantidadFinanciadaProyecto2/cantidadNecesariaProyecto2)*100;
                                                        for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                            System.out.print("█");
                                                        }
                                                        System.out.printf(" %.1f\n", porcentajeProyecto2);
                                                        System.out.println();
                                                        System.out.println("-----PROYECTO 3-----");
                                                        System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 + "\nCantidad necesaria: " + cantidadNecesariaProyecto3
                                                                + " \nCantidad financiada: " + cantidadFinanciadaProyecto3 + " \nFecha inicio proyecto: " + fechaInicioProyecto3 + " \nFecha fin proyecto: " + fechaFinProyecto3
                                                                + "\nRecompensas del proyecto: " + recompensasProyecto3);
                                                        float porcentajeProyecto3=(cantidadFinanciadaProyecto3/cantidadNecesariaProyecto3)*100;
                                                        System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 3.*******");
                                                        for (int i = 0; i <porcentajeProyecto3 ; i+=2) {
                                                            System.out.print("█");
                                                        }
                                                        System.out.printf(" %.1f\n", porcentajeProyecto3);
                                                        break;
                                                    }
                                                    break;
                                                case 2 :
                                                    if (numerosProyectos == 0) {
                                                        System.out.println("No hay proyectos disponibles.");
                                                        break;
                                                    } else{
                                                        System.out.println("-----------------------------------------------");
                                                        System.out.println("Hay " + numerosProyectos + " disponibles");
                                                        System.out.println("¿Que proyecto deseas modificar o eliminar?");
                                                        System.out.println("Pulsa 1 para modificar o 4 para Salir");
                                                        System.out.println("-----------------------------------------------");
                                                        modificarProyec = sc.nextInt();
                                                        switch (modificarProyec){
                                                            case 1 :
                                                                System.out.println("Deseas eliminar o modificar el nombre del proyecto: "+nombreProyecto1);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarModificar = sc.nextInt();
                                                                switch (eliminarModificar){
                                                                    case 1 :
                                                                        System.out.println("Nuevo nombre del proyecto");
                                                                        nombreProyecto1 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        nombreProyecto1 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar la categoria del proyecto (arte, tecnología, cine, música, juegos, comida, moda…) "+categoriaProyecto1);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarCategoria = sc.nextInt();
                                                                switch (eliminarCategoria){
                                                                    case 1 :
                                                                        System.out.println("Nueva categoria del proyecto");
                                                                        categoriaProyecto1 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        categoriaProyecto1 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar cantidad necesaria del proyecto. "+cantidadNecesariaProyecto1);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarCantidadNe = sc.nextInt();
                                                                switch (eliminarCantidadNe){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad necesaria del proyecto.");
                                                                        cantidadNecesariaProyecto1 = sc.nextFloat();
                                                                        break;
                                                                    case 2 :
                                                                        cantidadNecesariaProyecto1 = 0;
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar cantidad financiada del proyecto. "+cantidadFinanciadaProyecto1);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarCantidadFi = sc.nextInt();
                                                                switch (eliminarCantidadFi){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad necesaria del proyecto.");
                                                                        cantidadFinanciadaProyecto1 = sc.nextFloat();
                                                                        break;
                                                                    case 2 :
                                                                        cantidadFinanciadaProyecto1 = 0;
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar fecha inicio apertura del proyecto. "+fechaInicioProyecto1);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarFechaIn = sc.nextInt();
                                                                switch (eliminarFechaIn){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                                        fechaInicioProyecto1 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        fechaInicioProyecto1 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar fecha fin apertura del proyecto. "+fechaInicioProyecto2);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarFechaFin = sc.nextInt();
                                                                switch (eliminarFechaFin){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                                        fechaFinProyecto1 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        fechaFinProyecto1 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar recompensas del proyecto. " +recompensasProyecto1);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarrecompensas = sc.nextInt();
                                                                switch (eliminarrecompensas){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                                        recompensasProyecto1 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        recompensasProyecto1 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("PROYECTO " + numerosProyectos + ".");
                                                                System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                                        + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                                        + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                                                break;
                                                            case 2 :
                                                                System.out.println("Deseas eliminar o modificar el nombre del proyecto: "+nombreProyecto2);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarModificar = sc.nextInt();
                                                                switch (eliminarModificar){
                                                                    case 1 :
                                                                        System.out.println("Nuevo nombre del proyecto");
                                                                        nombreProyecto2 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        nombreProyecto2 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar la categoria del proyecto (arte, tecnología, cine, música, juegos, comida, moda…) "+categoriaProyecto2);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarCategoria = sc.nextInt();
                                                                switch (eliminarCategoria){
                                                                    case 1 :
                                                                        System.out.println("Nueva categoria del proyecto");
                                                                        categoriaProyecto2 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        categoriaProyecto2 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar cantidad necesaria del proyecto. "+cantidadNecesariaProyecto2);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarCantidadNe = sc.nextInt();
                                                                switch (eliminarCantidadNe){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad necesaria del proyecto.");
                                                                        cantidadNecesariaProyecto2 = sc.nextFloat();
                                                                        break;
                                                                    case 2 :
                                                                        cantidadNecesariaProyecto2 = 0;
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar cantidad financiada del proyecto. "+cantidadFinanciadaProyecto2);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarCantidadFi = sc.nextInt();
                                                                switch (eliminarCantidadFi){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad necesaria del proyecto.");
                                                                        cantidadFinanciadaProyecto2 = sc.nextFloat();
                                                                        break;
                                                                    case 2 :
                                                                        cantidadFinanciadaProyecto2 = 0;
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar fecha inicio apertura del proyecto. "+fechaInicioProyecto2);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarFechaIn = sc.nextInt();
                                                                switch (eliminarFechaIn){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                                        fechaInicioProyecto2 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        fechaInicioProyecto2 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar fecha fin apertura del proyecto. "+fechaFinProyecto2);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarFechaFin = sc.nextInt();
                                                                switch (eliminarFechaFin){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                                        fechaFinProyecto2 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        fechaFinProyecto2 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar recompensas del proyecto. "+recompensasProyecto2);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarrecompensas = sc.nextInt();
                                                                switch (eliminarrecompensas){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                                        recompensasProyecto2 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        recompensasProyecto2 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("PROYECTO " + numerosProyectos + ".");
                                                                System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                                        + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                                        + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                                                break;
                                                            case 3 :
                                                                System.out.println("Deseas eliminar o modificar el nombre del proyecto: "+nombreProyecto3);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarModificar = sc.nextInt();
                                                                switch (eliminarModificar){
                                                                    case 1 :
                                                                        System.out.println("Nuevo nombre del proyecto");
                                                                        nombreProyecto3 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        nombreProyecto3 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar la categoria del proyecto (arte, tecnología, cine, música, juegos, comida, moda…) "+categoriaProyecto3);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarCategoria = sc.nextInt();
                                                                switch (eliminarCategoria){
                                                                    case 1 :
                                                                        System.out.println("Nueva categoria del proyecto");
                                                                        categoriaProyecto3 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        categoriaProyecto3 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar cantidad necesaria del proyecto. "+cantidadNecesariaProyecto3);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarCantidadNe = sc.nextInt();
                                                                switch (eliminarCantidadNe){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad necesaria del proyecto.");
                                                                        cantidadNecesariaProyecto3 = sc.nextFloat();
                                                                        break;
                                                                    case 2 :
                                                                        cantidadNecesariaProyecto3 = 0;
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar cantidad financiada del proyecto. "+cantidadFinanciadaProyecto3);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarCantidadFi = sc.nextInt();
                                                                switch (eliminarCantidadFi){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad necesaria del proyecto.");
                                                                        cantidadFinanciadaProyecto3 = sc.nextFloat();
                                                                        break;
                                                                    case 2 :
                                                                        cantidadFinanciadaProyecto3 = 0;
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar fecha inicio apertura del proyecto. "+fechaInicioProyecto3);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarFechaIn = sc.nextInt();
                                                                switch (eliminarFechaIn){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                                        fechaInicioProyecto3 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        fechaInicioProyecto3 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar fecha fin apertura del proyecto. "+fechaFinProyecto3);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarFechaFin = sc.nextInt();
                                                                switch (eliminarFechaFin){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                                        fechaFinProyecto3 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        fechaFinProyecto3 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("Deseas eliminar o modificar recompensas del proyecto. "+recompensasProyecto3);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarrecompensas = sc.nextInt();
                                                                switch (eliminarrecompensas){
                                                                    case 1 :
                                                                        System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                                        recompensasProyecto3 = sc.next();
                                                                        break;
                                                                    case 2 :
                                                                        recompensasProyecto3 = "";
                                                                        break;
                                                                    case 3 :
                                                                        System.out.println("Saliste exitosamente.");
                                                                        break;
                                                                    default:
                                                                        System.out.println("Tienes que meter una de las opciones");
                                                                        break;
                                                                }
                                                                System.out.println("PROYECTO " + numerosProyectos + ".");
                                                                System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 + "\nCantidad necesaria: " + cantidadNecesariaProyecto3
                                                                        + " \nCantidad financiada: " + cantidadFinanciadaProyecto3 + " \nFecha inicio proyecto: " + fechaInicioProyecto3 + " \nFecha fin proyecto: " + fechaFinProyecto3
                                                                        + "\nRecompensas del proyecto: " + recompensasProyecto3);
                                                                break;
                                                        }
                                                    }
                                                case 3 :
                                                    System.out.println("Saliste del Menú de Proyectos");
                                                    break;
                                            }
                                        }while(menuproyec != 3);
                                        break;
                                    case 3:
                                        System.out.println("Bienvenido a la Configuración que deseas");

                                        do {
                                            System.out.println("1. Cambiar nombre de usuario");
                                            System.out.println("2. Cambiar contraseña");
                                            System.out.println("3. Salir");
                                            menuconf = sc.nextInt();
                                            switch (menuconf) {
                                                case 1:
                                                    System.out.println("Tu nombre actual es: " + usuarioAdministrador);
                                                    System.out.print("Pon tu nuevo nombre: ");
                                                    usuarioAdministrador = sc.next();
                                                    System.out.println("Cambiaste tu nombre a: " + usuarioAdministrador);
                                                    break;
                                                case 2:
                                                    System.out.println("Tu contraseña actual es: " + contraAdministrador);
                                                    System.out.print("Pon tu nueva contraseña: ");
                                                    contraAdministrador = sc.next();
                                                    System.out.println("Cambiaste tu contraseña a: " + contraAdministrador);
                                                    break;
                                                default:
                                                    System.out.println("Tienes que elegir una de las opciones");
                                            }
                                        } while (menuconf != 3);
                                        break;
                                }
                            } while (opcionAdmi != 4);
                            System.out.println("Cerraste sesion exitosamente");
                            acceso=false;
                        } else {
                            System.out.println("Login fallido");
                        }
                    } else if (usuarioPedido.equals(usuarioGestor)) {
                        if (bloqueadoGestor) {
                            System.out.println("Este usuario esta bloqueado, solo el Administrador puede desbloquearlo.");
                        } else if (contraPedido.equals(contraGestor)) {
                            System.out.println("Login realizado. Bienvenido " + usuarioGestor);
                            acceso = true;
                            //MENÚ GESTOR.
                            do {
                                System.out.println("-----Menú Gestor-----");
                                System.out.println("1. Mis proyectos.");
                                System.out.println("2. Vista detallada de los proyectos.");
                                System.out.println("3. Modificar o eliminar datos de los proyectos.");
                                System.out.println("4. Configuración.");
                                System.out.println("5. Cerrar sesión.");
                                opcionGestor = sc.nextInt();
                                switch (opcionGestor) {
                                    case 1:
                                        System.out.println("Bienvenido a Mis proyectos.");
                                        System.out.println("Puedes crear un máximo de 3 proyectos.");
                                        System.out.println("Tienes " + numerosProyectos + " creados.");
                                        if (numerosProyectos < 3) {
                                            System.out.println("¿Quieres crear algun proyecto (1 si, 2 no)?");
                                            opcionCrearProyecto1 = sc.nextInt();
                                            while (opcionCrearProyecto1 == 1 && numerosProyectos < 3) {
                                                numerosProyectos++;
                                                if (numerosProyectos == 1) {
                                                    System.out.println("Dime el nombre del proyecto:");
                                                    nombreProyecto1 = sc.next();
                                                    System.out.println("Dime la categoria del proyecto (arte, tecnología, cine, música, juegos, comida, moda…)");
                                                    categoriaProyecto1 = sc.next();
                                                    System.out.println("Cantidad necesaria del proyecto.");
                                                    cantidadNecesariaProyecto1 = sc.nextFloat();
                                                    System.out.println("Cantidad financiada del proyecto.");
                                                    cantidadFinanciadaProyecto1 = sc.nextFloat();
                                                    System.out.println("Fecha inicio apertura del proyecto.");
                                                    fechaInicioProyecto1 = sc.next();
                                                    System.out.println("Fecha fin apertura del proyecto.");
                                                    fechaFinProyecto1 = sc.next();
                                                    System.out.println("Recompensas del proyecto.");
                                                    recompensasProyecto1 = sc.next();
                                                    System.out.println("PROYECTO " + numerosProyectos + ".");
                                                    System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                                } else if (numerosProyectos == 2) {
                                                    System.out.println("Dime el nombre del proyecto:");
                                                    nombreProyecto2 = sc.next();
                                                    System.out.println("Dime la categoria del proyecto (arte, tecnología, cine, música, juegos, comida, moda…)");
                                                    categoriaProyecto2 = sc.next();
                                                    System.out.println("Cantidad necesaria del proyecto.");
                                                    cantidadNecesariaProyecto2 = sc.nextFloat();
                                                    System.out.println("Cantidad financiada del proyecto.");
                                                    cantidadFinanciadaProyecto2 = sc.nextFloat();
                                                    System.out.println("Fecha inicio apertura del proyecto.");
                                                    fechaInicioProyecto2 = sc.next();
                                                    System.out.println("Fecha fin apertura del proyecto.");
                                                    fechaFinProyecto2 = sc.next();
                                                    System.out.println("Recompensas del proyecto.");
                                                    recompensasProyecto2 = sc.next();
                                                    System.out.println("PROYECTO " + numerosProyectos + ".");
                                                    System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                                } else if (numerosProyectos == 3) {
                                                    System.out.println("Dime el nombre del proyecto:");
                                                    nombreProyecto3 = sc.next();
                                                    System.out.println("Dime la categoria del proyecto (arte, tecnología, cine, música, juegos, comida, moda…)");
                                                    categoriaProyecto3 = sc.next();
                                                    System.out.println("Cantidad necesaria del proyecto.");
                                                    cantidadNecesariaProyecto3 = sc.nextFloat();
                                                    System.out.println("Cantidad financiada del proyecto.");
                                                    cantidadFinanciadaProyecto3 = sc.nextFloat();
                                                    System.out.println("Fecha inicio apertura del proyecto.");
                                                    fechaInicioProyecto3 = sc.next();
                                                    System.out.println("Fecha fin apertura del proyecto.");
                                                    fechaFinProyecto3 = sc.next();
                                                    System.out.println("Recompensas del proyecto.");
                                                    recompensasProyecto3 = sc.next();
                                                    System.out.println("PROYECTO " + numerosProyectos + ".");
                                                    System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 + "\nCantidad necesaria: " + cantidadNecesariaProyecto3
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto3 + " \nFecha inicio proyecto: " + fechaInicioProyecto3 + " \nFecha fin proyecto: " + fechaFinProyecto3
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto3);
                                                }
                                                if (numerosProyectos < 3) {
                                                    System.out.println("¿Quieres crear algun proyecto (1 si, 2 no)?");
                                                    opcionCrearProyecto1 = sc.nextInt();
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            System.out.println("Cantidad máxima de proyectos creados.");
                                        }
                                        System.out.println("Saliendo de Mis Proyectos.");
                                        break;
                                    case 2:
                                        if (numerosProyectos == 0) {
                                            System.out.println("Tienes que crear un proyecto antes.");
                                            break;
                                        } else if (numerosProyectos == 1) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                            float porcentajeProyecto1=(cantidadFinanciadaProyecto1/cantidadNecesariaProyecto1)*100;
                                            for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto1);
                                            break;
                                        } else if (numerosProyectos == 2) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                            float porcentajeProyecto1=(cantidadFinanciadaProyecto1/cantidadNecesariaProyecto1)*100;
                                            for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto1);
                                            System.out.println();
                                            System.out.println("-----PROYECTO 2-----");
                                            System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                            float porcentajeProyecto2=(cantidadFinanciadaProyecto2/cantidadNecesariaProyecto2)*100;
                                            for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto2);
                                            break;
                                        } else if (numerosProyectos == 3) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                            float porcentajeProyecto1=(cantidadFinanciadaProyecto1/cantidadNecesariaProyecto1)*100;
                                            for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto1);
                                            System.out.println();
                                            System.out.println("-----PROYECTO 2-----");
                                            System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                            float porcentajeProyecto2=(cantidadFinanciadaProyecto2/cantidadNecesariaProyecto2)*100;
                                            for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto2);
                                            System.out.println();
                                            System.out.println("-----PROYECTO 3-----");
                                            System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 + "\nCantidad necesaria: " + cantidadNecesariaProyecto3
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto3 + " \nFecha inicio proyecto: " + fechaInicioProyecto3 + " \nFecha fin proyecto: " + fechaFinProyecto3
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto3);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 3.*******");
                                            float porcentajeProyecto3=(cantidadFinanciadaProyecto3/cantidadNecesariaProyecto3)*100;
                                            for (int i = 0; i <porcentajeProyecto3 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto3);
                                            break;
                                        }
                                    case 3:
                                        if (numerosProyectos == 0) {
                                            System.out.println("No hay proyectos disponibles.");
                                            break;
                                        } else{
                                            System.out.println("-----------------------------------------------");
                                            System.out.println("Hay " + numerosProyectos + " disponibles");
                                            System.out.println("¿Que proyecto deseas modificar o eliminar?");
                                            System.out.println("Pulsa 1 para modificarlos pulsa 4 para Salir");
                                            System.out.println("-----------------------------------------------");
                                            modificarProyec = sc.nextInt();
                                            switch (modificarProyec){
                                                case 1 :
                                                    System.out.println("Deseas eliminar o modificar el nombre del proyecto: "+nombreProyecto1);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarModificar = sc.nextInt();
                                                    switch (eliminarModificar){
                                                        case 1 :
                                                            System.out.println("Nuevo nombre del proyecto");
                                                            nombreProyecto1 = sc.next();
                                                            break;
                                                        case 2 :
                                                            nombreProyecto1 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar la categoria del proyecto (arte, tecnología, cine, música, juegos, comida, moda…) "+categoriaProyecto1);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarCategoria = sc.nextInt();
                                                    switch (eliminarCategoria){
                                                        case 1 :
                                                            System.out.println("Nueva categoria del proyecto");
                                                            categoriaProyecto1 = sc.next();
                                                            break;
                                                        case 2 :
                                                            categoriaProyecto1 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar cantidad necesaria del proyecto. "+cantidadNecesariaProyecto1);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarCantidadNe = sc.nextInt();
                                                    switch (eliminarCantidadNe){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad necesaria del proyecto.");
                                                            cantidadNecesariaProyecto1 = sc.nextFloat();
                                                            break;
                                                        case 2 :
                                                            cantidadNecesariaProyecto1 = 0;
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar cantidad financiada del proyecto. "+cantidadFinanciadaProyecto1);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarCantidadFi = sc.nextInt();
                                                    switch (eliminarCantidadFi){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad necesaria del proyecto.");
                                                            cantidadFinanciadaProyecto1 = sc.nextFloat();
                                                            break;
                                                        case 2 :
                                                            cantidadFinanciadaProyecto1 = 0;
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar fecha inicio apertura del proyecto."+ fechaInicioProyecto1);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarFechaIn = sc.nextInt();
                                                    switch (eliminarFechaIn){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                            fechaInicioProyecto1 = sc.next();
                                                            break;
                                                        case 2 :
                                                            fechaInicioProyecto1 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar fecha fin apertura del proyecto. "+fechaFinProyecto1);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarFechaFin = sc.nextInt();
                                                    switch (eliminarFechaFin){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                            fechaFinProyecto1 = sc.next();
                                                            break;
                                                        case 2 :
                                                            fechaFinProyecto1 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar recompensas del proyecto. "+recompensasProyecto1);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarrecompensas = sc.nextInt();
                                                    switch (eliminarrecompensas){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                            recompensasProyecto1 = sc.next();
                                                            break;
                                                        case 2 :
                                                            recompensasProyecto1 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("PROYECTO " + numerosProyectos + ".");
                                                    System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                                    break;
                                                case 2 :
                                                    System.out.println("Deseas eliminar o modificar el nombre del proyecto: "+nombreProyecto2);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarModificar = sc.nextInt();
                                                    switch (eliminarModificar){
                                                        case 1 :
                                                            System.out.println("Nuevo nombre del proyecto");
                                                            nombreProyecto2 = sc.next();
                                                            break;
                                                        case 2 :
                                                            nombreProyecto2 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar la categoria del proyecto (arte, tecnología, cine, música, juegos, comida, moda…) "+categoriaProyecto2);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarCategoria = sc.nextInt();
                                                    switch (eliminarCategoria){
                                                        case 1 :
                                                            System.out.println("Nueva categoria del proyecto");
                                                            categoriaProyecto2 = sc.next();
                                                            break;
                                                        case 2 :
                                                            categoriaProyecto2 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar cantidad necesaria del proyecto. "+cantidadNecesariaProyecto2);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarCantidadNe = sc.nextInt();
                                                    switch (eliminarCantidadNe){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad necesaria del proyecto.");
                                                            cantidadNecesariaProyecto2 = sc.nextFloat();
                                                            break;
                                                        case 2 :
                                                            cantidadNecesariaProyecto2 = 0;
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar cantidad financiada del proyecto. "+cantidadFinanciadaProyecto2);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarCantidadFi = sc.nextInt();
                                                    switch (eliminarCantidadFi){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad necesaria del proyecto.");
                                                            cantidadFinanciadaProyecto2 = sc.nextFloat();
                                                            break;
                                                        case 2 :
                                                            cantidadFinanciadaProyecto2 = 0;
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar fecha inicio apertura del proyecto. "+fechaInicioProyecto2);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarFechaIn = sc.nextInt();
                                                    switch (eliminarFechaIn){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                            fechaInicioProyecto2 = sc.next();
                                                            break;
                                                        case 2 :
                                                            fechaInicioProyecto2 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar fecha fin apertura del proyecto. "+fechaFinProyecto2);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarFechaFin = sc.nextInt();
                                                    switch (eliminarFechaFin){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                            fechaFinProyecto2 = sc.next();
                                                            break;
                                                        case 2 :
                                                            fechaFinProyecto2 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar recompensas del proyecto. "+recompensasProyecto2);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarrecompensas = sc.nextInt();
                                                    switch (eliminarrecompensas){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                            recompensasProyecto2 = sc.next();
                                                            break;
                                                        case 2 :
                                                            recompensasProyecto2 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("PROYECTO " + numerosProyectos + ".");
                                                    System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                                    break;
                                                case 3 :
                                                    System.out.println("Deseas eliminar o modificar el nombre del proyecto: "+nombreProyecto3);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarModificar = sc.nextInt();
                                                    switch (eliminarModificar){
                                                        case 1 :
                                                            System.out.println("Nuevo nombre del proyecto");
                                                            nombreProyecto3 = sc.next();
                                                            break;
                                                        case 2 :
                                                            nombreProyecto3 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar la categoria del proyecto (arte, tecnología, cine, música, juegos, comida, moda…) "+categoriaProyecto3);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarCategoria = sc.nextInt();
                                                    switch (eliminarCategoria){
                                                        case 1 :
                                                            System.out.println("Nueva categoria del proyecto");
                                                            categoriaProyecto3 = sc.next();
                                                            break;
                                                        case 2 :
                                                            categoriaProyecto3 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar cantidad necesaria del proyecto. "+cantidadNecesariaProyecto3);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarCantidadNe = sc.nextInt();
                                                    switch (eliminarCantidadNe){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad necesaria del proyecto.");
                                                            cantidadNecesariaProyecto3 = sc.nextFloat();
                                                            break;
                                                        case 2 :
                                                            cantidadNecesariaProyecto3 = 0;
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar cantidad financiada del proyecto. "+cantidadFinanciadaProyecto3);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarCantidadFi = sc.nextInt();
                                                    switch (eliminarCantidadFi){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad necesaria del proyecto.");
                                                            cantidadFinanciadaProyecto3 = sc.nextFloat();
                                                            break;
                                                        case 2 :
                                                            cantidadFinanciadaProyecto3 = 0;
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar fecha inicio apertura del proyecto. "+fechaInicioProyecto3);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarFechaIn = sc.nextInt();
                                                    switch (eliminarFechaIn){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                            fechaInicioProyecto3 = sc.next();
                                                            break;
                                                        case 2 :
                                                            fechaInicioProyecto3 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar fecha fin apertura del proyecto. "+fechaFinProyecto3);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarFechaFin = sc.nextInt();
                                                    switch (eliminarFechaFin){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                            fechaFinProyecto3 = sc.next();
                                                            break;
                                                        case 2 :
                                                            fechaFinProyecto3 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("Deseas eliminar o modificar recompensas del proyecto. "+recompensasProyecto3);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarrecompensas = sc.nextInt();
                                                    switch (eliminarrecompensas){
                                                        case 1 :
                                                            System.out.println("Nueva cantidad fecha inicio apertura del proyecto.");
                                                            recompensasProyecto3 = sc.next();
                                                            break;
                                                        case 2 :
                                                            recompensasProyecto3 = "";
                                                            break;
                                                        case 3 :
                                                            System.out.println("Saliste exitosamente.");
                                                            break;
                                                        default:
                                                            System.out.println("Tienes que meter una de las opciones");
                                                            break;
                                                    }
                                                    System.out.println("PROYECTO " + numerosProyectos + ".");
                                                    System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 + "\nCantidad necesaria: " + cantidadNecesariaProyecto3
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto3 + " \nFecha inicio proyecto: " + fechaInicioProyecto3 + " \nFecha fin proyecto: " + fechaFinProyecto3
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto3);
                                                    break;
                                            }
                                        }
                                    case 4:
                                        System.out.println("Bienvenido a la configuración.");
                                        do {
                                            System.out.println("1. Cambiar nombre de usuario.");
                                            System.out.println("2. Cambiar la contraseña de usuario.");
                                            System.out.println("3. Salir.");
                                            menuconfGestor = sc.nextInt();
                                            switch (menuconfGestor) {
                                                case 1:
                                                    System.out.println("Tu nombre actual es: " + usuarioGestor);
                                                    System.out.print("Pon tu nuevo nombre: ");
                                                    usuarioGestor = sc.next();
                                                    System.out.println("Cambiaste tu nombre a: " + usuarioGestor);
                                                    break;
                                                case 2:
                                                    System.out.println("Tu contraseña actual es: " + contraGestor);
                                                    System.out.print("Pon tu nueva contraseña: ");
                                                    contraGestor = sc.next();
                                                    System.out.println("Cambiaste tu contraseña a: " + contraGestor);
                                                    break;
                                                default:
                                                    System.out.println("Tienes que elegir una de las opciones.");
                                            }
                                        } while (menuconfGestor != 3);
                                        System.out.println("Saliendo de configuración.");

                                }
                            } while (opcionGestor != 5);
                            System.out.println("Cerraste sesion exitosamente.");
                            acceso=false;
                            break;

                        } else {
                            System.out.println("Login fallido");
                            intentos++;
                            if (intentos == 3)
                                bloqueadoGestor = true;
                        }
                    } else if (usuarioPedido.equals(inversor1)) {
                        if (bloqueadoInversor1) {
                            System.out.println("Este usuario esta bloqueado, solo el Administrador puede desbloquearlo.");
                        } else if (contraPedido.equals(inversorContra)) {
                            System.out.println("Login realizado. Bienvenido " + inversor1);
                            acceso = true;
                        } else {
                            System.out.println("Login fallido");
                            intentos++;
                            if (intentos == 3)
                                bloqueadoInversor1 = true;
                        }
                    } else if (usuarioPedido.equals(inversor2)) {
                        if (bloqueadoInversor2) {
                            System.out.println("Este usuario esta bloqueado, solo el Administrador puede desbloquearlo.");
                        } else if (contraPedido.equals(inversor2Contra)) {
                            System.out.println("Login realizado. Bienvenido " + inversor2);
                            acceso = true;
                        } else {
                            System.out.println("Login fallido");
                            intentos++;
                            if (intentos == 3)
                                bloqueadoInversor2 = true;
                        }
                    } else {
                        System.out.println("No hay ningun usuario con ese nombre o contraseña");
                        intentos++;
                    }
                    if (intentos == 3 && !acceso) {
                        System.out.println("Número de intentos excedido (Estás bloqueado).");
                    }
                    break;
                }
        }
    }while (inicioPrograma!=2);
        System.out.println("Saliendo del programa.");
        }

    }
