import java.util.Scanner;

public class FernanStarter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioPedido = "";
        String contraPedido = "";
        int inicioPrograma=0;
        int vistaDetallada=0;

    //Administrador
    String usuarioAdministrador="Administrador";
    String contraAdministrador="1234";

    int opcionAdmi=0,menubloq=0,menuproyec=0,menuconf=0,modificarProyec=0,eliminarModificar=0,eliminarCategoria=0,eliminarCantidadNe=0,
        eliminarCantidadFi=0,eliminarFechaIn=0,eliminarFechaFin=0,eliminarrecompensas=0;

        String nombreUsuario = "";
    //UsuarioGestor
    String usuarioGestor="Gestor";
    String contraGestor="4321";

        int opcionGestor=0,numerosProyectos=0,opcionCrearProyecto1=0,opcionCrearProyecto2=0,opcionCrearProyecto3=0,menuconfGestor=0,
                numRecompensas=0, precioRecompensa1 = 0, precioRecompensa11 = 0, precioRecompensa111 = 0, precioRecompensa2=0, precioRecompensa22=0, precioRecompensa222=0,
            precioRecompensa3=0, precioRecompensa33=0, precioRecompensa333=0;
        boolean bloqueadoGestor=false;
        float cantidadNecesariaProyecto1=0,cantidadFinanciadaProyecto1=0,cantidadNecesariaProyecto2=0,cantidadFinanciadaProyecto2=0,
                 cantidadNecesariaProyecto3=0,cantidadFinanciadaProyecto3=0;

        String nombreProyecto1 ="";
        String categoriaProyecto1="";
        String fechaInicioProyecto1 ="";
        String fechaFinProyecto1 ="";
        String recompensasProyecto1 ="";
        String recompensasProyecto11 = "";
        String recompensasProyecto111 = "";
        //---------------------------------
        String nombreProyecto2 ="";
        String categoriaProyecto2="";
        String fechaInicioProyecto2 ="";
        String fechaFinProyecto2 ="";
        String recompensasProyecto2 ="", recompensasProyecto22="", recompensasProyecto222="";
        //---------------------------------

        String nombreProyecto3 ="";
        String categoriaProyecto3="";
        String fechaInicioProyecto3 ="";
        String fechaFinProyecto3 ="";
        String recompensasProyecto3 ="", recompensasProyecto33="", recompensasProyecto333="";

        //---------------------------------
        String hacerRecompenas = "";
    //UsuarioInversor1
    String inversor1="Inversor1";
    String inversorContra="Inversor1";
    String correo = "";
    String listaDeAmigos = "";
    int opcionAgregar  = 0;
    int opcionInversor1=0;
    int saldoActualInversor1=0;
    int opcionSaldoCarteraInversor1=0;
    int opcionSeguirAnadiendoDineroInversor1=0;
    int menuConfInversor1=0;
    int nuevoSaldoInversor1=0;
    int inversionProyecto1Inversor1=0;
    int inversionProyecto2Inversor1=0;
    int inversionProyecto3Inversor1=0;
    int menuInvertirProyectos=0;
    int cantidadInvertidaProyecto1=0;
    int cantidadInvertidaProyecto2=0;
    int cantidadInvertidaProyecto3=0;
        boolean bloqueadoInversor1=false;
    //UsuarioInversor2
    String inversor2="Inversor2";
    String inversor2Contra="Inversor2";
        String correo2 = "";
        String listaDeAmigos2 = "";
        int opcionAgregar2  = 0;
        int opcionInversor2=0;
        int saldoActualInversor2=0;
        int opcionSaldoCarteraInversor2=0;
        int opcionSeguirAnadiendoDineroInversor2=0;
        int menuConfInversor2=0;
        int nuevoSaldoInversor2=0;
        int inversionProyecto1Inversor2=0;
        int inversionProyecto2Inversor2=0;
        int inversionProyecto3Inversor2=0;
        int menuInvertirProyectos2=0;
        int cantidadInvertida2Proyecto1=0;
        int cantidadInvertida2Proyecto2=0;
        int cantidadInvertida2Proyecto3=0;
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
                                                    break;
                                            }
                                            break;
                                        } while (menubloq != 3);
                                            break;
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
                                                        System.out.println("Tienes que crear un proyecto antes.");
                                                        break;
                                                    } else if (numerosProyectos == 1) {
                                                        System.out.println("-----PROYECTO 1-----");
                                                        System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                                + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1);
                                                        if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                        }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                            System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                                        }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                            System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                                            System.out.println(recompensasProyecto111 + ", " + precioRecompensa111 + "€");
                                                        }else {
                                                            System.out.println("No tienes recompensas");
                                                        }
                                                        System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                                        float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                                        for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                            System.out.print("█");
                                                        }
                                                        System.out.printf(" %.1f\n", porcentajeProyecto1);
                                                        break;
                                                    } else if (numerosProyectos == 2) {
                                                        System.out.println("-----PROYECTO 1-----");
                                                        System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                                + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1);
                                                        if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                        }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                            System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                                        }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                            System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                                            System.out.println(recompensasProyecto111 + ", " + precioRecompensa111 + "€");
                                                        }else {
                                                            System.out.println("No tienes recompensas");
                                                        }
                                                        System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                                        float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                                        for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                            System.out.print("█");
                                                        }
                                                        System.out.printf(" %.1f\n", porcentajeProyecto1);
                                                        System.out.println();
                                                        System.out.println("-----PROYECTO 2-----");
                                                        System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                                + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2);
                                                        if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                        }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                            System.out.println(recompensasProyecto22 + ", " + precioRecompensa22 + "€");
                                                        }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                            System.out.println(recompensasProyecto22 + ", " + precioRecompensa22 + "€");
                                                            System.out.println(recompensasProyecto222 + ", " + precioRecompensa222 + "€");
                                                        }else {
                                                            System.out.println("No tienes recompensas");
                                                        }
                                                        System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                                        float porcentajeProyecto2=((cantidadFinanciadaProyecto2 + (inversionProyecto2Inversor1 + inversionProyecto2Inversor2)) /cantidadNecesariaProyecto2)*100;
                                                        for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                            System.out.print("█");
                                                        }
                                                        System.out.printf(" %.1f\n", porcentajeProyecto2);
                                                        break;
                                                    } else if (numerosProyectos == 3) {
                                                        System.out.println("-----PROYECTO 1-----");
                                                        System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                                + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1);
                                                        if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                        }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                            System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                                        }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                            System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                                            System.out.println(recompensasProyecto111 + ", " + precioRecompensa111 + "€");
                                                        }else {
                                                            System.out.println("No tienes recompensas");
                                                        }
                                                        System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                                        float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                                        for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                            System.out.print("█");
                                                        }
                                                        System.out.printf(" %.1f\n", porcentajeProyecto1);
                                                        System.out.println();
                                                        System.out.println("-----PROYECTO 2-----");
                                                        System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                                + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2);
                                                        if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                        }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                            System.out.println(recompensasProyecto22 + ", " + precioRecompensa22 + "€");
                                                        }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                            System.out.println(recompensasProyecto22 + ", " + precioRecompensa22 + "€");
                                                            System.out.println(recompensasProyecto222 + ", " + precioRecompensa222 + "€");
                                                        }else {
                                                            System.out.println("No tienes recompensas");
                                                        }
                                                        System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                                        float porcentajeProyecto2=((cantidadFinanciadaProyecto2 + (inversionProyecto2Inversor1 + inversionProyecto2Inversor2)) /cantidadNecesariaProyecto2)*100;
                                                        for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                            System.out.print("█");
                                                        }
                                                        System.out.printf(" %.1f\n", porcentajeProyecto2);
                                                        System.out.println();
                                                        System.out.println("-----PROYECTO 3-----");
                                                        System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 + "\nCantidad necesaria: " + cantidadNecesariaProyecto3
                                                                + " \nCantidad financiada: " + cantidadFinanciadaProyecto3 + " \nFecha inicio proyecto: " + fechaInicioProyecto3 + " \nFecha fin proyecto: " + fechaFinProyecto3);
                                                        if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto3 + ", " + precioRecompensa3 + "€");
                                                        }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto3 + ", " + precioRecompensa3 + "€");
                                                            System.out.println(recompensasProyecto33 + ", " + precioRecompensa33 + "€");
                                                        }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                            System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto3 + ", " + precioRecompensa3 + "€");
                                                            System.out.println(recompensasProyecto33 + ", " + precioRecompensa33 + "€");
                                                            System.out.println(recompensasProyecto333 + ", " + precioRecompensa333 + "€");
                                                        }else {
                                                            System.out.println("No tienes recompensas");
                                                        }
                                                        System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 3.*******");
                                                        float porcentajeProyecto3=((cantidadFinanciadaProyecto3 + (inversionProyecto3Inversor1 + inversionProyecto3Inversor2)) /cantidadNecesariaProyecto3)*100;
                                                        for (int i = 0; i <porcentajeProyecto3 ; i+=2) {
                                                            System.out.print("█");
                                                        }
                                                        System.out.printf(" %.1f\n", porcentajeProyecto3);
                                                        break;
                                                    }
                                                case 2 :
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
                                                                System.out.println("Deseas eliminar o modificar recompensas del proyecto. "+recompensasProyecto1 +recompensasProyecto11+recompensasProyecto111);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarrecompensas = sc.nextInt();
                                                                switch (eliminarrecompensas){
                                                                    case 1 :
                                                                        if (numRecompensas==1){
                                                                            System.out.println("Nuevas recompensas del Proyecto 1.");
                                                                            System.out.println("Recompensa 1.");
                                                                            recompensasProyecto1 = sc.next();
                                                                            System.out.println("Precio de Recompensa 1 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa1=sc.nextInt();
                                                                            break;
                                                                        } else if (numRecompensas==2) {
                                                                            System.out.println("Nuevas recompensas del Proyecto 1.");
                                                                            System.out.println("Recompensa 1.");
                                                                            recompensasProyecto1 = sc.next();
                                                                            System.out.println("Precio de Recompensa 1 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa1=sc.nextInt();
                                                                            System.out.println("Recompensa 2.");
                                                                            recompensasProyecto11 = sc.next();
                                                                            System.out.println("Precio de Recompensa 2 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa11=sc.nextInt();
                                                                            break;
                                                                        } else if (numRecompensas==3) {
                                                                            System.out.println("Nuevas recompensas del Proyecto 1.");
                                                                            System.out.println("Recompensa 1.");
                                                                            recompensasProyecto1 = sc.next();
                                                                            System.out.println("Precio de Recompensa 1 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa1=sc.nextInt();
                                                                            System.out.println("Recompensa 2.");
                                                                            recompensasProyecto11 = sc.next();
                                                                            System.out.println("Precio de Recompensa 2 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa11=sc.nextInt();
                                                                            System.out.println("Recompensa 3.");
                                                                            recompensasProyecto111 = sc.next();
                                                                            System.out.println("Precio de Recompensa 3 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa111=sc.nextInt();
                                                                            break;
                                                                        } else if (numRecompensas==0) {
                                                                            System.out.println("Este proyecto no tiene recompensas.");
                                                                            break;
                                                                        }
                                                                    case 2 :
                                                                        recompensasProyecto1 = "";
                                                                        recompensasProyecto11 = "";
                                                                        recompensasProyecto111 = "";
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
                                                                        System.out.println("Nueva cantidad fecha fin apertura del proyecto.");
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
                                                                System.out.println("Deseas eliminar o modificar recompensas del proyecto. "+recompensasProyecto2+recompensasProyecto22+recompensasProyecto222);
                                                                System.out.println("1. Modificar");
                                                                System.out.println("2. Eliminar");
                                                                System.out.println("3. Salir");
                                                                eliminarrecompensas = sc.nextInt();
                                                                switch (eliminarrecompensas){
                                                                    case 1 :
                                                                        if (numRecompensas==1){
                                                                            System.out.println("Nuevas recompensas del Proyecto 2.");
                                                                            System.out.println("Recompensa 1.");
                                                                            recompensasProyecto1 = sc.next();
                                                                            System.out.println("Precio de Recompensa 1 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa1=sc.nextInt();
                                                                            break;
                                                                        } else if (numRecompensas==2) {
                                                                            System.out.println("Nuevas recompensas del Proyecto 2.");
                                                                            System.out.println("Recompensa 1.");
                                                                            recompensasProyecto1 = sc.next();
                                                                            System.out.println("Precio de Recompensa 1 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa1=sc.nextInt();
                                                                            System.out.println("Recompensa 2.");
                                                                            recompensasProyecto11 = sc.next();
                                                                            System.out.println("Precio de Recompensa 2 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa11=sc.nextInt();
                                                                            break;
                                                                        } else if (numRecompensas==3) {
                                                                            System.out.println("Nuevas recompensas del Proyecto 2.");
                                                                            System.out.println("Recompensa 1.");
                                                                            recompensasProyecto2 = sc.next();
                                                                            System.out.println("Precio de Recompensa 1 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa2=sc.nextInt();
                                                                            System.out.println("Recompensa 2.");
                                                                            recompensasProyecto22 = sc.next();
                                                                            System.out.println("Precio de Recompensa 2 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa22=sc.nextInt();
                                                                            System.out.println("Recompensa 3.");
                                                                            recompensasProyecto222 = sc.next();
                                                                            System.out.println("Precio de Recompensa 3 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa222=sc.nextInt();
                                                                            break;
                                                                        } else if (numRecompensas==0) {
                                                                            System.out.println("Este proyecto no tiene recompensas.");
                                                                            break;
                                                                        }
                                                                    case 2 :
                                                                        recompensasProyecto2 = "";
                                                                        recompensasProyecto22="";
                                                                        recompensasProyecto222="";
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
                                                                        System.out.println("Nueva cantidad fecha fin apertura del proyecto.");
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
                                                                        if (numRecompensas==1){
                                                                            System.out.println("Nuevas recompensas del Proyecto 3.");
                                                                            System.out.println("Recompensa 1.");
                                                                            recompensasProyecto3 = sc.next();
                                                                            System.out.println("Precio de Recompensa 1 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa3=sc.nextInt();
                                                                            break;
                                                                        } else if (numRecompensas==2) {
                                                                            System.out.println("Nuevas recompensas del Proyecto 3.");
                                                                            System.out.println("Recompensa 1.");
                                                                            recompensasProyecto3 = sc.next();
                                                                            System.out.println("Precio de Recompensa 1 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa3=sc.nextInt();
                                                                            System.out.println("Recompensa 2.");
                                                                            recompensasProyecto33 = sc.next();
                                                                            System.out.println("Precio de Recompensa 2 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa33=sc.nextInt();
                                                                            break;
                                                                        } else if (numRecompensas==3) {
                                                                            System.out.println("Nuevas recompensas del Proyecto 3.");
                                                                            System.out.println("Recompensa 1.");
                                                                            recompensasProyecto3 = sc.next();
                                                                            System.out.println("Precio de Recompensa 1 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa3=sc.nextInt();
                                                                            System.out.println("Recompensa 2.");
                                                                            recompensasProyecto33 = sc.next();
                                                                            System.out.println("Precio de Recompensa 2 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa33=sc.nextInt();
                                                                            System.out.println("Recompensa 3.");
                                                                            recompensasProyecto333   = sc.next();
                                                                            System.out.println("Precio de Recompensa 3 actual.");
                                                                            System.out.println("Nuevo precio: ");
                                                                            precioRecompensa333 =sc.nextInt();
                                                                            break;
                                                                        } else if (numRecompensas==0) {
                                                                            System.out.println("Este proyecto no tiene recompensas.");
                                                                            break;
                                                                        }
                                                                    case 2 :
                                                                        recompensasProyecto3 = "";
                                                                        recompensasProyecto33="";
                                                                        recompensasProyecto333="";
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
                                                    if (menuconf>3 || menuconf<=0)
                                                    System.out.println("Tienes que elegir una de las opciones");
                                            }
                                        } while (menuconf != 3);
                                        System.out.println("Saliendo de la configuración.");
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
                                                    System.out.println("Deseas hacer recompensas (si/no)");
                                                    hacerRecompenas = sc.next().toLowerCase();
                                                    if (hacerRecompenas.equals("si")) {
                                                        System.out.println("Cuantas recompensas deseas hacer (Máximo 3)");
                                                        numRecompensas = sc.nextInt();
                                                        if (numRecompensas == 1 || numRecompensas == 2 || numRecompensas ==3){
                                                            switch (numRecompensas){
                                                                case 1:
                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    sc.nextLine();
                                                                    recompensasProyecto1 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa1 = sc.nextInt();
                                                                    sc.nextLine();
                                                                    break;
                                                                case 2:
                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    sc.nextLine();
                                                                    recompensasProyecto1 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa1 = sc.nextInt();
                                                                    sc.nextLine();

                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    recompensasProyecto11 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa11 = sc.nextInt();
                                                                    sc.nextLine();
                                                                    break;
                                                                case 3:
                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    sc.nextLine();
                                                                    recompensasProyecto1 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa1 = sc.nextInt();
                                                                    sc.nextLine();

                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    recompensasProyecto11 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa11 = sc.nextInt();
                                                                    sc.nextLine();

                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    recompensasProyecto111 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa111 = sc.nextInt();
                                                                    sc.nextLine();
                                                                    break;
                                                            }
                                                        }else {
                                                            System.out.println("Número no valido.");
                                                            break;
                                                        }
                                                    }else if (hacerRecompenas.equals("no")) {
                                                        System.out.println("No tienes recompensas");
                                                    }
                                                    System.out.println("PROYECTO " + numerosProyectos + ".");
                                                    System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1);
                                                    if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                    System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                    }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                        System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                        System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                                    }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                        System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                        System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                                        System.out.println(recompensasProyecto111 + ", " + precioRecompensa111 + "€");
                                                    }else {
                                                        System.out.println("No tienes recompensas");
                                                    }
                                                    System.out.println("-----------------------------------------------------------");
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
                                                    System.out.println("Deseas hacer recompensas (si/no)");
                                                    hacerRecompenas = sc.next().toLowerCase();
                                                    if (hacerRecompenas.equals("si")) {
                                                        System.out.println("Cuantas recompensas deseas hacer (Máximo 3)");
                                                        numRecompensas = sc.nextInt();
                                                        if (numRecompensas == 1 || numRecompensas == 2 || numRecompensas ==3){
                                                            switch (numRecompensas){
                                                                case 1:
                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    sc.nextLine();
                                                                    recompensasProyecto2 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa2 = sc.nextInt();
                                                                    sc.nextLine();
                                                                    break;
                                                                case 2:
                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    sc.nextLine();
                                                                    recompensasProyecto2 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa2 = sc.nextInt();
                                                                    sc.nextLine();

                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    recompensasProyecto22 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa22 = sc.nextInt();
                                                                    sc.nextLine();
                                                                    break;
                                                                case 3:
                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    sc.nextLine();
                                                                    recompensasProyecto2 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa2 = sc.nextInt();

                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    recompensasProyecto22 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa22 = sc.nextInt();
                                                                    sc.nextLine();

                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    recompensasProyecto222 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa222 = sc.nextInt();
                                                                    sc.nextLine();
                                                                    break;

                                                            }
                                                        }else {
                                                            System.out.println("Número no valido.");
                                                            break;
                                                        }
                                                    }else if (hacerRecompenas.equals("no")) {
                                                        System.out.println("No tienes recompensas");
                                                    }

                                                    System.out.println("PROYECTO " + numerosProyectos + ".");
                                                    System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2);
                                                    if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                        System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                    }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                        System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                        System.out.println(recompensasProyecto22 + ", " + precioRecompensa22 + "€");
                                                    }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                        System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                        System.out.println(recompensasProyecto22 + ", " + precioRecompensa22 + "€");
                                                        System.out.println(recompensasProyecto222 + ", " + precioRecompensa222 + "€");
                                                    }else {
                                                        System.out.println("No tienes recompensas");
                                                    }
                                                    System.out.println("-----------------------------------------------------------");
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
                                                    System.out.println("Deseas hacer recompensas (si/no)");
                                                    hacerRecompenas = sc.next().toLowerCase();
                                                    if (hacerRecompenas.equals("si")) {
                                                        System.out.println("Cuantas recompensas deseas hacer (Máximo 3)");
                                                        numRecompensas = sc.nextInt();
                                                        if (numRecompensas == 1 || numRecompensas == 2 || numRecompensas ==3){
                                                            switch (numRecompensas){
                                                                case 1:
                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    sc.nextLine();
                                                                    recompensasProyecto3 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa3 = sc.nextInt();
                                                                    sc.nextLine();
                                                                    break;
                                                                case 2:
                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    sc.nextLine();
                                                                    recompensasProyecto3 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa3 = sc.nextInt();
                                                                    sc.nextLine();

                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    recompensasProyecto33 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa33 = sc.nextInt();
                                                                    sc.nextLine();
                                                                    break;
                                                                case 3:
                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    sc.nextLine();
                                                                    recompensasProyecto3 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa3 = sc.nextInt();
                                                                    sc.nextLine();

                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    recompensasProyecto33 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa33 = sc.nextInt();
                                                                    sc.nextLine();

                                                                    System.out.println("1. Descripcion de la recompensa");
                                                                    recompensasProyecto333 = sc.nextLine();
                                                                    System.out.println("2. Precio de la Recompensa");
                                                                    precioRecompensa333 = sc.nextInt();
                                                                    sc.nextLine();
                                                                    break;

                                                            }
                                                        }else {
                                                            System.out.println("Número no valido.");
                                                            break;
                                                        }
                                                    }else if (hacerRecompenas.equals("no")) {
                                                        System.out.println("No tienes recompensas");
                                                    }

                                                    System.out.println("PROYECTO " + numerosProyectos + ".");
                                                    System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 + "\nCantidad necesaria: " + cantidadNecesariaProyecto3
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto3 + " \nFecha inicio proyecto: " + fechaInicioProyecto3 + " \nFecha fin proyecto: " + fechaFinProyecto3);
                                                    if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                        System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto3 + ", " + precioRecompensa3 + "€");
                                                    }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                        System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto3 + ", " + precioRecompensa3 + "€");
                                                        System.out.println(recompensasProyecto33 + ", " + precioRecompensa33 + "€");
                                                    }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                        System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto3 + ", " + precioRecompensa3 + "€");
                                                        System.out.println(recompensasProyecto33 + ", " + precioRecompensa33 + "€");
                                                        System.out.println(recompensasProyecto333 + ", " + precioRecompensa333 + "€");
                                                    }else {
                                                        System.out.println("No tienes recompensas");
                                                    }
                                                    System.out.println("-----------------------------------------------------------");
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
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1);
                                            if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                            }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                            }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                                System.out.println(recompensasProyecto111 + ", " + precioRecompensa111 + "€");
                                            }else {
                                                System.out.println("No tienes recompensas");
                                            }
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
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1);
                                            if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                            }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                            }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                                System.out.println(recompensasProyecto111 + ", " + precioRecompensa111 + "€");
                                            }else {
                                                System.out.println("No tienes recompensas");
                                            }
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                            float porcentajeProyecto1=(cantidadFinanciadaProyecto1/cantidadNecesariaProyecto1)*100;
                                            for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto1);
                                            System.out.println();
                                            System.out.println("-----PROYECTO 2-----");
                                            System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2);
                                            if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                            }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                System.out.println(recompensasProyecto22 + ", " + precioRecompensa22 + "€");
                                            }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                System.out.println(recompensasProyecto22 + ", " + precioRecompensa22 + "€");
                                                System.out.println(recompensasProyecto222 + ", " + precioRecompensa222 + "€");
                                            }else {
                                                System.out.println("No tienes recompensas");
                                            }
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
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1);
                                            if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                            }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                            }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto1 + ", " + precioRecompensa1 + "€");
                                                System.out.println(recompensasProyecto11 + ", " + precioRecompensa11 + "€");
                                                System.out.println(recompensasProyecto111 + ", " + precioRecompensa111 + "€");
                                            }else {
                                                System.out.println("No tienes recompensas");
                                            }
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                            float porcentajeProyecto1=(cantidadFinanciadaProyecto1/cantidadNecesariaProyecto1)*100;
                                            for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto1);
                                            System.out.println();
                                            System.out.println("-----PROYECTO 2-----");
                                            System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2);
                                            if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                            }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                System.out.println(recompensasProyecto22 + ", " + precioRecompensa22 + "€");
                                            }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto2 + ", " + precioRecompensa2 + "€");
                                                System.out.println(recompensasProyecto22 + ", " + precioRecompensa22 + "€");
                                                System.out.println(recompensasProyecto222 + ", " + precioRecompensa222 + "€");
                                            }else {
                                                System.out.println("No tienes recompensas");
                                            }
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                            float porcentajeProyecto2=(cantidadFinanciadaProyecto2/cantidadNecesariaProyecto2)*100;
                                            for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto2);
                                            System.out.println();
                                            System.out.println("-----PROYECTO 3-----");
                                            System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 + "\nCantidad necesaria: " + cantidadNecesariaProyecto3
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto3 + " \nFecha inicio proyecto: " + fechaInicioProyecto3 + " \nFecha fin proyecto: " + fechaFinProyecto3);
                                            if (hacerRecompenas.equals("si") && numRecompensas == 1){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto3 + ", " + precioRecompensa3 + "€");
                                            }else if (hacerRecompenas.equals("si") && numRecompensas == 2){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto3 + ", " + precioRecompensa3 + "€");
                                                System.out.println(recompensasProyecto33 + ", " + precioRecompensa33 + "€");
                                            }else if (hacerRecompenas.equals("si") && numRecompensas == 3){
                                                System.out.println("Recompensas del proyecto y su precio: " + recompensasProyecto3 + ", " + precioRecompensa3 + "€");
                                                System.out.println(recompensasProyecto33 + ", " + precioRecompensa33 + "€");
                                                System.out.println(recompensasProyecto333 + ", " + precioRecompensa333 + "€");
                                            }else {
                                                System.out.println("No tienes recompensas");
                                            }
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
                                                            System.out.println("Nueva cantidad fecha fin apertura del proyecto.");
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
                                                    System.out.println("Deseas eliminar o modificar recompensas del proyecto. "+recompensasProyecto1+recompensasProyecto11+recompensasProyecto111);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarrecompensas = sc.nextInt();
                                                    switch (eliminarrecompensas){
                                                        case 1 :
                                                            if (numRecompensas==1){
                                                                System.out.println("Nuevas recompensas del Proyecto 1.");
                                                                System.out.println("Recompensa 1.");
                                                                recompensasProyecto1 = sc.next();
                                                                System.out.println("Precio de Recompensa 1 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa1=sc.nextInt();
                                                                break;
                                                            } else if (numRecompensas==2) {
                                                                System.out.println("Nuevas recompensas del Proyecto 1.");
                                                                System.out.println("Recompensa 1.");
                                                                recompensasProyecto1 = sc.next();
                                                                System.out.println("Precio de Recompensa 1 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa1=sc.nextInt();
                                                                System.out.println("Recompensa 2.");
                                                                recompensasProyecto11 = sc.next();
                                                                System.out.println("Precio de Recompensa 2 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa11=sc.nextInt();
                                                                break;
                                                            } else if (numRecompensas==3) {
                                                                System.out.println("Nuevas recompensas del Proyecto 1.");
                                                                System.out.println("Recompensa 1.");
                                                                recompensasProyecto1 = sc.next();
                                                                System.out.println("Precio de Recompensa 1 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa1=sc.nextInt();
                                                                System.out.println("Recompensa 2.");
                                                                recompensasProyecto11 = sc.next();
                                                                System.out.println("Precio de Recompensa 2 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa11=sc.nextInt();
                                                                System.out.println("Recompensa 3.");
                                                                recompensasProyecto111 = sc.next();
                                                                System.out.println("Precio de Recompensa 3 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa111=sc.nextInt();
                                                                break;
                                                            } else if (numRecompensas==0) {
                                                                System.out.println("Este proyecto no tiene recompensas.");
                                                                break;
                                                            }
                                                        case 2 :
                                                            recompensasProyecto1 = "";
                                                            recompensasProyecto11 = "";
                                                            recompensasProyecto111 = "";
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
                                                            System.out.println("Nueva cantidad financiada del proyecto.");
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
                                                            System.out.println("Nueva cantidad fecha fin apertura del proyecto.");
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
                                                    System.out.println("Deseas eliminar o modificar recompensas del proyecto. "+recompensasProyecto2+recompensasProyecto22+recompensasProyecto222);
                                                    System.out.println("1. Modificar");
                                                    System.out.println("2. Eliminar");
                                                    System.out.println("3. Salir");
                                                    eliminarrecompensas = sc.nextInt();
                                                    switch (eliminarrecompensas){
                                                        case 1 :
                                                            if (numRecompensas==1){
                                                                System.out.println("Nuevas recompensas del Proyecto 2.");
                                                                System.out.println("Recompensa 1.");
                                                                recompensasProyecto2 = sc.next();
                                                                System.out.println("Precio de Recompensa 1 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa2=sc.nextInt();
                                                                break;
                                                            } else if (numRecompensas==2) {
                                                                System.out.println("Nuevas recompensas del Proyecto 2.");
                                                                System.out.println("Recompensa 1.");
                                                                recompensasProyecto2 = sc.next();
                                                                System.out.println("Precio de Recompensa 1 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa2=sc.nextInt();
                                                                System.out.println("Recompensa 2.");
                                                                recompensasProyecto22 = sc.next();
                                                                System.out.println("Precio de Recompensa 2 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa22=sc.nextInt();
                                                                break;
                                                            } else if (numRecompensas==3) {
                                                                System.out.println("Nuevas recompensas del Proyecto 2.");
                                                                System.out.println("Recompensa 1.");
                                                                recompensasProyecto2 = sc.next();
                                                                System.out.println("Precio de Recompensa 1 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa2=sc.nextInt();
                                                                System.out.println("Recompensa 2.");
                                                                recompensasProyecto22 = sc.next();
                                                                System.out.println("Precio de Recompensa 2 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa22=sc.nextInt();
                                                                System.out.println("Recompensa 3.");
                                                                recompensasProyecto222 = sc.next();
                                                                System.out.println("Precio de Recompensa 3 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa222=sc.nextInt();
                                                                break;
                                                            } else if (numRecompensas==0) {
                                                                System.out.println("Este proyecto no tiene recompensas.");
                                                                break;
                                                            }
                                                        case 2 :
                                                            recompensasProyecto2 = "";
                                                            recompensasProyecto22 = "";
                                                            recompensasProyecto222 = "";
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
                                                            System.out.println("Nueva cantidad fecha fin apertura del proyecto.");
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
                                                            if (numRecompensas==1){
                                                                System.out.println("Nuevas recompensas del Proyecto 3.");
                                                                System.out.println("Recompensa 1.");
                                                                recompensasProyecto3 = sc.next();
                                                                System.out.println("Precio de Recompensa 1 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa3=sc.nextInt();
                                                                break;
                                                            } else if (numRecompensas==2) {
                                                                System.out.println("Nuevas recompensas del Proyecto 3.");
                                                                System.out.println("Recompensa 1.");
                                                                recompensasProyecto3 = sc.next();
                                                                System.out.println("Precio de Recompensa 1 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa3=sc.nextInt();
                                                                System.out.println("Recompensa 2.");
                                                                recompensasProyecto33 = sc.next();
                                                                System.out.println("Precio de Recompensa 2 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa33=sc.nextInt();
                                                                break;
                                                            } else if (numRecompensas==3) {
                                                                System.out.println("Nuevas recompensas del Proyecto 3.");
                                                                System.out.println("Recompensa 1.");
                                                                recompensasProyecto3 = sc.next();
                                                                System.out.println("Precio de Recompensa 1 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa3=sc.nextInt();
                                                                System.out.println("Recompensa 2.");
                                                                recompensasProyecto33 = sc.next();
                                                                System.out.println("Precio de Recompensa 2 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa33=sc.nextInt();
                                                                System.out.println("Recompensa 3.");
                                                                recompensasProyecto333 = sc.next();
                                                                System.out.println("Precio de Recompensa 3 actual.");
                                                                System.out.println("Nuevo precio: ");
                                                                precioRecompensa333=sc.nextInt();
                                                                break;
                                                            } else if (numRecompensas==0) {
                                                                System.out.println("Este proyecto no tiene recompensas.");
                                                                break;
                                                            }
                                                        case 2 :
                                                            recompensasProyecto3 = "";
                                                            recompensasProyecto33="";
                                                            recompensasProyecto333="";
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
                                        break;
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
                                                    if (menuconfGestor>3 || menuconfGestor<=0)
                                                        System.out.println("Tienes que elegir una de las opciones");
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
                            //MENÚ INVERSOR 1
                            do {
                                System.out.println("------MENÚ INVERSOR 1------");
                                System.out.println("1. Mis inversiones.");
                                System.out.println("2. Proyectos.");
                                System.out.println("3. Cartera digital.");
                                System.out.println("4. Invitar a un amigo.");
                                System.out.println("5. Configuración.");
                                System.out.println("6. Cerrar sesión.");
                                opcionInversor1 = sc.nextInt();
                                switch (opcionInversor1) {
                                    case 1:
                                        System.out.println("Bienvenido a Mis Inversiones.");
                                        if (inversionProyecto1Inversor1==0&&inversionProyecto2Inversor1==0&&inversionProyecto3Inversor1==0) {
                                            System.out.println("No has invertido en ningún proyecto.");
                                        } else if (inversionProyecto1Inversor1>0&&inversionProyecto2Inversor1==0&&inversionProyecto3Inversor1==0) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 +"Cantidad invertida: "+inversionProyecto1Inversor1);
                                            System.out.println("¿Quieres ver una vista detallada del proyecto?(1 si, 2 no)");
                                            vistaDetallada=sc.nextInt();
                                            switch (vistaDetallada){
                                                case 1:
                                                    System.out.println("-----PROYECTO 1-----");
                                                    System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + inversionProyecto1Inversor1 + inversionProyecto1Inversor2 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                                    System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                                    float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                                    for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                        System.out.print("█");
                                                    }
                                                    System.out.printf(" %.1f\n", porcentajeProyecto1);
                                                    break;
                                                case 2:
                                                    break;
                                            }
                                        } else if (inversionProyecto1Inversor1>0&&inversionProyecto2Inversor1>2&&inversionProyecto3Inversor1==0) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 +"Cantidad invertida: "+inversionProyecto1Inversor1);
                                            System.out.println("-----PROYECTO 2-----");
                                            System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 +"Cantidad invertida: "+inversionProyecto2Inversor1);
                                            System.out.println("¿Quieres ver una vista detallada de los proyecto?(1 si, 2 no)");
                                            vistaDetallada=sc.nextInt();
                                            switch (vistaDetallada){
                                                case 1:
                                                    System.out.println("-----PROYECTO 1-----");
                                                    System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + inversionProyecto1Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                                    System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                                    float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                                    for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                        System.out.print("█");
                                                    }
                                                    System.out.printf(" %.1f\n", porcentajeProyecto1);
                                                    System.out.println("-----PROYECTO 2-----");
                                                    System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + inversionProyecto2Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                                    System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                                    float porcentajeProyecto2=((cantidadFinanciadaProyecto2 + (inversionProyecto2Inversor1 + inversionProyecto2Inversor2)) /cantidadNecesariaProyecto2)*100;
                                                    for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                        System.out.print("█");
                                                    }
                                                    System.out.printf(" %.1f\n", porcentajeProyecto2);
                                                    break;
                                                case 2:
                                                    break;
                                            }
                                        } else if (inversionProyecto1Inversor1>0&&inversionProyecto2Inversor1>2&&inversionProyecto3Inversor1>0) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 +"Cantidad invertida: "+inversionProyecto1Inversor1);
                                            System.out.println("-----PROYECTO 2-----");
                                            System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 +"Cantidad invertida: "+inversionProyecto2Inversor1);
                                            System.out.println("-----PROYECTO 3-----");
                                            System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 +"Cantidad invertida: "+inversionProyecto3Inversor1);
                                            System.out.println("¿Quieres ver una vista detallada de los proyecto?(1 si, 2 no)");
                                            vistaDetallada=sc.nextInt();
                                            switch (vistaDetallada){
                                                case 1:
                                                    System.out.println("-----PROYECTO 1-----");
                                                    System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + inversionProyecto1Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                                    System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                                    float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                                    for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                        System.out.print("█");
                                                    }
                                                    System.out.printf(" %.1f\n", porcentajeProyecto1);
                                                    System.out.println("-----PROYECTO 2-----");
                                                    System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + inversionProyecto2Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                                    System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                                    float porcentajeProyecto2=((cantidadFinanciadaProyecto2 + (inversionProyecto2Inversor1 + inversionProyecto2Inversor2)) /cantidadNecesariaProyecto2)*100;
                                                    for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                        System.out.print("█");
                                                    }
                                                    System.out.printf(" %.1f\n", porcentajeProyecto2);
                                                    System.out.println("-----PROYECTO 3-----");
                                                    System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 + "\nCantidad necesaria: " + cantidadNecesariaProyecto3
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto3 + inversionProyecto3Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto3 + " \nFecha fin proyecto: " + fechaFinProyecto3
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto3);
                                                    System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 3.*******");
                                                    float porcentajeProyecto3=((cantidadFinanciadaProyecto3 + (inversionProyecto3Inversor1 + inversionProyecto3Inversor2)) /cantidadNecesariaProyecto3)*100;
                                                    for (int i = 0; i <porcentajeProyecto3 ; i+=2) {
                                                        System.out.print("█");
                                                    }
                                                    System.out.printf(" %.1f\n", porcentajeProyecto3);
                                                    break;
                                                case 2:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("----Listado de los actuales proyectos creados-----");
                                        if (numerosProyectos == 0) {
                                            System.out.println("No hay proyectos creados actualmente.");
                                            break;
                                        } else if (numerosProyectos == 1) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + inversionProyecto1Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                            float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                            for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto1);

                                            break;
                                        } else if (numerosProyectos == 2) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + inversionProyecto1Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                            float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                            for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto1);
                                            System.out.println("-----PROYECTO 2-----");
                                            System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + inversionProyecto2Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                            float porcentajeProyecto2=((cantidadFinanciadaProyecto2 + (inversionProyecto2Inversor1 + inversionProyecto2Inversor2)) /cantidadNecesariaProyecto2)*100;
                                            for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto2);
                                            break;
                                        } else if (numerosProyectos == 3) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + inversionProyecto1Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                            float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                            for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto1);
                                            System.out.println("-----PROYECTO 2-----");
                                            System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + inversionProyecto2Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                            float porcentajeProyecto2=((cantidadFinanciadaProyecto2 + (inversionProyecto2Inversor1 + inversionProyecto2Inversor2)) /cantidadNecesariaProyecto2)*100;
                                            for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto2);
                                            System.out.println("-----PROYECTO 3-----");
                                            System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 + "\nCantidad necesaria: " + cantidadNecesariaProyecto3
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto3 + inversionProyecto3Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto3 + " \nFecha fin proyecto: " + fechaFinProyecto3
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto3);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 3.*******");
                                            float porcentajeProyecto3=((cantidadFinanciadaProyecto3 + (inversionProyecto3Inversor1 + inversionProyecto3Inversor2)) /cantidadNecesariaProyecto3)*100;
                                            for (int i = 0; i <porcentajeProyecto3 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto3);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Bienvenido a tu cartera digital.");
                                        System.out.println("Tu saldo actual es de "+saldoActualInversor1+"€");
                                        System.out.println("1. Añadir saldo.");
                                        System.out.println("2. Invertir en los proyectos.");
                                        System.out.println("3. Salir.");
                                        opcionSaldoCarteraInversor1=sc.nextInt();
                                        switch (opcionSaldoCarteraInversor1) {
                                            case 1:
                                                System.out.println("¿Cuánto quiere añadir a su cartera?");
                                                saldoActualInversor1=sc.nextInt();
                                                do{
                                                    System.out.println("Actualmente tiene "+saldoActualInversor1+"€.");
                                                    System.out.println("¿Desea seguir añadiendo a su cartera?(1 Si 2 No)");
                                                    opcionSeguirAnadiendoDineroInversor1=sc.nextInt();
                                                    switch (opcionSeguirAnadiendoDineroInversor1){
                                                        case 1:
                                                            System.out.println("¿Cuánto quieres añadir?");
                                                            nuevoSaldoInversor1=sc.nextInt();
                                                            if (nuevoSaldoInversor1>0) {
                                                                saldoActualInversor1+=nuevoSaldoInversor1;
                                                                System.out.println("Se han añadido exitosamente a tu cuenta");
                                                                break;
                                                            }else {
                                                                System.out.println("El saldo no se ha podido añadir, no se admiten números negativos");
                                                                break;
                                                            }
                                                    }
                                                }while (opcionSeguirAnadiendoDineroInversor1!=2);
                                                System.out.println("Saliendo de la opcion añadir saldo");
                                                break;
                                            case 2:
                                                    if (numerosProyectos==0){
                                                        System.out.println("No hay ningún proyecto para invertir.");
                                                    }else if (numerosProyectos==1) {
                                                        System.out.println("¿En qué proyecto quieres invertir?");
                                                        System.out.println("1. Invertir en el proyecto 1.");
                                                        System.out.println("2. Salir.");
                                                        menuInvertirProyectos = sc.nextInt();
                                                        switch (menuInvertirProyectos) {
                                                            case 1:
                                                                if (saldoActualInversor1 <= 0) {
                                                                    System.out.println("No tienes saldo en la cartera.");
                                                                    break;
                                                                } else if (saldoActualInversor1 > cantidadNecesariaProyecto1 || saldoActualInversor1 < cantidadNecesariaProyecto1 || saldoActualInversor1==cantidadNecesariaProyecto1) {
                                                                    System.out.println("¿Cuánto quieres invertir?");
                                                                    inversionProyecto1Inversor1 = sc.nextInt();
                                                                    System.out.println("Has invertido " + inversionProyecto1Inversor1 + "€");
                                                                    inversionProyecto1Inversor1 += cantidadFinanciadaProyecto1;
                                                                    saldoActualInversor1 -= inversionProyecto1Inversor1;
                                                                    break;
                                                                }
                                                            case 2:
                                                                System.out.println("Saliendo de invertir proyectos.");
                                                                break;
                                                        }
                                                    } else if (numerosProyectos==2) {
                                                        System.out.println("¿En qué proyecto quieres invertir?");
                                                        System.out.println("1. Invertir en el proyecto 1.");
                                                        System.out.println("2. Invertir en el proyecto 2.");
                                                        System.out.println("3. Salir.");
                                                        menuInvertirProyectos = sc.nextInt();
                                                        switch (menuInvertirProyectos) {
                                                            case 1:
                                                                if (saldoActualInversor1 <= 0) {
                                                                    System.out.println("No tienes saldo en la cartera.");
                                                                    break;
                                                                } else if (saldoActualInversor1 > cantidadNecesariaProyecto1 || saldoActualInversor1 < cantidadNecesariaProyecto1 ||saldoActualInversor1==cantidadNecesariaProyecto1) {
                                                                    System.out.println("¿Cuánto quieres invertir?");
                                                                    inversionProyecto1Inversor1 = sc.nextInt();
                                                                    System.out.println("Has invertido " + inversionProyecto1Inversor1 + "€");
                                                                    inversionProyecto1Inversor1 += cantidadFinanciadaProyecto1;
                                                                    saldoActualInversor1 -= inversionProyecto1Inversor1;
                                                                    break;
                                                                }
                                                            case 2:
                                                                if (saldoActualInversor1 <= 0) {
                                                                    System.out.println("No tienes saldo en la cartera.");
                                                                    break;
                                                                } else if (saldoActualInversor1 > cantidadNecesariaProyecto2 || saldoActualInversor1 < cantidadNecesariaProyecto2||saldoActualInversor1==cantidadFinanciadaProyecto2) {
                                                                    System.out.println("¿Cuánto quieres invertir?");
                                                                    inversionProyecto2Inversor1 = sc.nextInt();
                                                                    System.out.println("Has invertido " + inversionProyecto1Inversor1 + "€");
                                                                    inversionProyecto2Inversor1 += cantidadFinanciadaProyecto2;
                                                                    saldoActualInversor1 -= inversionProyecto2Inversor1;
                                                                    break;
                                                                }
                                                            case 3:
                                                                System.out.println("Saliendo de invertir proyectos.");
                                                                break;
                                                        }
                                                    } else if (numerosProyectos==3) {
                                                        System.out.println("¿En qué proyecto quieres invertir?");
                                                        System.out.println("1. Invertir en el proyecto 1.");
                                                        System.out.println("2. Invertir en el proyecto 2.");
                                                        System.out.println("3. Invertir en el proyecto 3.");
                                                        System.out.println("4. Salir.");
                                                        menuInvertirProyectos = sc.nextInt();
                                                        switch (menuInvertirProyectos) {
                                                            case 1:
                                                                if (saldoActualInversor1 <= 0) {
                                                                    System.out.println("No tienes saldo en la cartera.");
                                                                    break;
                                                                } else if (saldoActualInversor1 > cantidadNecesariaProyecto1 || saldoActualInversor1 < cantidadNecesariaProyecto1||saldoActualInversor1==cantidadNecesariaProyecto1) {
                                                                    System.out.println("¿Cuánto quieres invertir?");
                                                                    inversionProyecto1Inversor1 = sc.nextInt();
                                                                    System.out.println("Has invertido " + inversionProyecto1Inversor1 + "€");
                                                                    inversionProyecto1Inversor1 += cantidadFinanciadaProyecto1;
                                                                    saldoActualInversor1 -= inversionProyecto1Inversor1;
                                                                    break;
                                                                }
                                                            case 2:
                                                                if (saldoActualInversor1 <= 0) {
                                                                    System.out.println("No tienes saldo en la cartera.");
                                                                    break;
                                                                } else if (saldoActualInversor1 > cantidadNecesariaProyecto2 || saldoActualInversor1 < cantidadNecesariaProyecto2||saldoActualInversor1==cantidadNecesariaProyecto2) {
                                                                    System.out.println("¿Cuánto quieres invertir?");
                                                                    inversionProyecto2Inversor1 = sc.nextInt();
                                                                    System.out.println("Has invertido " + inversionProyecto2Inversor1 + "€");
                                                                    inversionProyecto2Inversor1 += cantidadFinanciadaProyecto2;
                                                                    saldoActualInversor1 -= inversionProyecto2Inversor1;
                                                                    break;
                                                                }
                                                            case 3:
                                                                if (saldoActualInversor1 <= 0) {
                                                                    System.out.println("No tienes saldo en la cartera.");
                                                                    break;
                                                                } else if (saldoActualInversor1 > cantidadNecesariaProyecto3 || saldoActualInversor1 < cantidadNecesariaProyecto3||saldoActualInversor1==cantidadNecesariaProyecto3) {
                                                                    System.out.println("¿Cuánto quieres invertir?");
                                                                    inversionProyecto3Inversor1 = sc.nextInt();
                                                                    System.out.println("Has invertido " + inversionProyecto3Inversor1 + "€");
                                                                    inversionProyecto3Inversor1 += cantidadFinanciadaProyecto3;
                                                                    saldoActualInversor1 -= inversionProyecto3Inversor1;
                                                                    break;
                                                                }
                                                            case 4:
                                                                System.out.println("Saliendo de invertir proyectos.");
                                                                break;
                                                        }
                                                    }
                                            case 3:
                                                System.out.println("Saliendo de su cartera digital.");
                                                break;
                                        }
                                        break;
                                    case 4:
                                        System.out.println("-----Menú de tus amigos-----");
                                        do {
                                            System.out.println("1. Mostrar lista de amigos referidos");
                                            System.out.println("2. Añadir un nuevo amigo");
                                            System.out.println("3. Salir");
                                            System.out.println("Seleccione una opción: ");
                                            opcionAgregar = sc.nextInt();
                                            switch (opcionAgregar) {
                                                case 1:
                                                    if (listaDeAmigos.length() == 0) {
                                                        System.out.println("No hay amigos en la lista.");
                                                    } else {
                                                        System.out.println("Amigos: " + listaDeAmigos);
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.print("Introduce el correo del amigo: ");
                                                    correo = sc.next();
                                                    if (listaDeAmigos.length() == 0) {
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
                                        break;
                                    case 5:
                                        System.out.println("Bienvenido a la configuración.");
                                        do {
                                            System.out.println("1. Cambiar nombre de usuario.");
                                            System.out.println("2. Cambiar la contraseña de usuario.");
                                            System.out.println("3. Salir.");
                                            menuConfInversor1 = sc.nextInt();
                                            switch (menuConfInversor1) {
                                                case 1:
                                                    System.out.println("Tu nombre actual es: " + inversor1);
                                                    System.out.print("Pon tu nuevo nombre: ");
                                                    inversor1 = sc.next();
                                                    System.out.println("Cambiaste tu nombre a: " + inversor1);
                                                    break;
                                                case 2:
                                                    System.out.println("Tu contraseña actual es: " + inversorContra);
                                                    System.out.print("Pon tu nueva contraseña: ");
                                                    inversorContra = sc.next();
                                                    System.out.println("Cambiaste tu contraseña a: " + inversorContra);
                                                    break;
                                                default:
                                                    if (menuConfInversor1>3 || menuConfInversor1<=0)
                                                        System.out.println("Tienes que elegir una de las opciones");
                                            }
                                        } while (menuConfInversor1 != 3);
                                        System.out.println("Saliendo de configuración.");
                                }
                            }while (opcionInversor1 != 6);
                            System.out.println("Cerraste sesión.");
                            acceso=false;
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
                            //MENÚ INVERSOR 2
                            do {
                                System.out.println("------MENÚ INVERSOR 2------");
                                System.out.println("1. Mis inversiones.");
                                System.out.println("2. Proyectos.");
                                System.out.println("3. Cartera digital.");
                                System.out.println("4. Invitar a un amigo.");
                                System.out.println("5. Configuración.");
                                System.out.println("6. Cerrar sesión.");
                                opcionInversor2 = sc.nextInt();
                                switch (opcionInversor2) {
                                    case 1:
                                        System.out.println("Bienvenido a Mis Inversiones.");
                                        if (inversionProyecto1Inversor2==0&&inversionProyecto2Inversor2==0&&inversionProyecto3Inversor2==0) {
                                            System.out.println("No has invertido en ningún proyecto.");
                                        } else if (inversionProyecto1Inversor2>0&&inversionProyecto2Inversor2==0&&inversionProyecto3Inversor2==0) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 +"Cantidad invertida: "+inversionProyecto1Inversor2);
                                            System.out.println("¿Quieres ver una vista detallada del proyecto?(1 si, 2 no)");
                                            vistaDetallada=sc.nextInt();
                                            switch (vistaDetallada){
                                                case 1:
                                                    System.out.println("-----PROYECTO 1-----");
                                                    System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + inversionProyecto1Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                                    System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                                    float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                                    for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                        System.out.print("█");
                                                    }
                                                    System.out.printf(" %.1f\n", porcentajeProyecto1);
                                                    break;
                                                case 2:
                                                    break;
                                            }
                                        } else if (inversionProyecto1Inversor2>0&&inversionProyecto2Inversor2>2&&inversionProyecto3Inversor2==0) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 +"Cantidad invertida: "+inversionProyecto1Inversor2);
                                            System.out.println("-----PROYECTO 2-----");
                                            System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 +"Cantidad invertida: "+inversionProyecto2Inversor2);
                                            System.out.println("¿Quieres ver una vista detallada de los proyecto?(1 si, 2 no)");
                                            vistaDetallada=sc.nextInt();
                                            switch (vistaDetallada){
                                                case 1:
                                                    System.out.println("-----PROYECTO 1-----");
                                                    System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + inversionProyecto1Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                                    System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                                    float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                                    for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                        System.out.print("█");
                                                    }
                                                    System.out.printf(" %.1f\n", porcentajeProyecto1);
                                                    System.out.println("-----PROYECTO 2-----");
                                                    System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + inversionProyecto2Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                                    System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                                    float porcentajeProyecto2=((cantidadFinanciadaProyecto2 + (inversionProyecto2Inversor1 + inversionProyecto2Inversor2)) /cantidadNecesariaProyecto2)*100;
                                                    for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                        System.out.print("█");
                                                    }
                                                    System.out.printf(" %.1f\n", porcentajeProyecto2);
                                                    break;
                                                case 2:
                                                    break;
                                            }
                                        } else if (inversionProyecto1Inversor2>0&&inversionProyecto2Inversor2>0&&inversionProyecto3Inversor2>0) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 +"Cantidad invertida: "+inversionProyecto1Inversor1);
                                            System.out.println("-----PROYECTO 2-----");
                                            System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 +"Cantidad invertida: "+inversionProyecto2Inversor1);
                                            System.out.println("-----PROYECTO 3-----");
                                            System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 +"Cantidad invertida: "+inversionProyecto3Inversor1);
                                            System.out.println("¿Quieres ver una vista detallada de los proyecto?(1 si, 2 no)");
                                            vistaDetallada=sc.nextInt();
                                            switch (vistaDetallada){
                                                case 1:
                                                    System.out.println("-----PROYECTO 1-----");
                                                    System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + inversionProyecto1Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                                    System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                                    float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                                    for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                        System.out.print("█");
                                                    }
                                                    System.out.printf(" %.1f\n", porcentajeProyecto1);
                                                    System.out.println("-----PROYECTO 2-----");
                                                    System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + inversionProyecto2Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                                    System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                                    float porcentajeProyecto2=((cantidadFinanciadaProyecto2 + (inversionProyecto2Inversor1 + inversionProyecto2Inversor2)) /cantidadNecesariaProyecto2)*100;
                                                    for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                        System.out.print("█");
                                                    }
                                                    System.out.printf(" %.1f\n", porcentajeProyecto2);
                                                    System.out.println("-----PROYECTO 3-----");
                                                    System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 + "\nCantidad necesaria: " + cantidadNecesariaProyecto3
                                                            + " \nCantidad financiada: " + cantidadFinanciadaProyecto3 + inversionProyecto3Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto3 + " \nFecha fin proyecto: " + fechaFinProyecto3
                                                            + "\nRecompensas del proyecto: " + recompensasProyecto3);
                                                    System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 3.*******");
                                                    float porcentajeProyecto3=((cantidadFinanciadaProyecto3 + (inversionProyecto3Inversor1 + inversionProyecto3Inversor2)) /cantidadNecesariaProyecto3)*100;
                                                    for (int i = 0; i <porcentajeProyecto3 ; i+=2) {
                                                        System.out.print("█");
                                                    }
                                                    System.out.printf(" %.1f\n", porcentajeProyecto3);
                                                    break;
                                                case 2:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("----Listado de los actuales proyectos creados-----");
                                        if (numerosProyectos == 0) {
                                            System.out.println("No hay proyectos creados actualmente.");
                                            break;
                                        } else if (numerosProyectos == 1) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + inversionProyecto1Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                            float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                            for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto1);
                                            break;
                                        } else if (numerosProyectos == 2) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + inversionProyecto1Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                            float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                            for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto1);
                                            System.out.println("-----PROYECTO 2-----");
                                            System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + inversionProyecto2Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                            float porcentajeProyecto2=((cantidadFinanciadaProyecto2 + (inversionProyecto2Inversor1 + inversionProyecto2Inversor2)) /cantidadNecesariaProyecto2)*100;
                                            for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto2);
                                            break;
                                        } else if (numerosProyectos == 3) {
                                            System.out.println("-----PROYECTO 1-----");
                                            System.out.println("Nombre: " + nombreProyecto1 + "\nCategoria: " + categoriaProyecto1 + "\nCantidad necesaria: " + cantidadNecesariaProyecto1
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto1 + inversionProyecto1Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto1 + " \nFecha fin proyecto: " + fechaFinProyecto1
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto1);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 1.*******");
                                            float porcentajeProyecto1=((cantidadFinanciadaProyecto1 + (inversionProyecto1Inversor1 + inversionProyecto1Inversor2)) /cantidadNecesariaProyecto1)*100;
                                            for (int i = 0; i <porcentajeProyecto1 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto1);
                                            System.out.println("-----PROYECTO 2-----");
                                            System.out.println("Nombre: " + nombreProyecto2 + "\nCategoria: " + categoriaProyecto2 + "\nCantidad necesaria: " + cantidadNecesariaProyecto2
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto2 + inversionProyecto2Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto2 + " \nFecha fin proyecto: " + fechaFinProyecto2
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto2);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 2.*******");
                                            float porcentajeProyecto2=((cantidadFinanciadaProyecto2 + (inversionProyecto2Inversor1 + inversionProyecto2Inversor2)) /cantidadNecesariaProyecto2)*100;
                                            for (int i = 0; i <porcentajeProyecto2 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto2);
                                            System.out.println("-----PROYECTO 3-----");
                                            System.out.println("Nombre: " + nombreProyecto3 + "\nCategoria: " + categoriaProyecto3 + "\nCantidad necesaria: " + cantidadNecesariaProyecto3
                                                    + " \nCantidad financiada: " + cantidadFinanciadaProyecto3 + inversionProyecto3Inversor1 + " \nFecha inicio proyecto: " + fechaInicioProyecto3 + " \nFecha fin proyecto: " + fechaFinProyecto3
                                                    + "\nRecompensas del proyecto: " + recompensasProyecto3);
                                            System.out.println("*******Gráfico de Barras de la financiaciación del proyecto 3.*******");
                                            float porcentajeProyecto3=((cantidadFinanciadaProyecto3 + (inversionProyecto3Inversor1 + inversionProyecto3Inversor2)) /cantidadNecesariaProyecto3)*100;
                                            for (int i = 0; i <porcentajeProyecto3 ; i+=2) {
                                                System.out.print("█");
                                            }
                                            System.out.printf(" %.1f\n", porcentajeProyecto3);
                                            break;
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Bienvenido a tu cartera digital.");
                                        System.out.println("Tu saldo actual es de "+saldoActualInversor2+"€");
                                        System.out.println("1. Añadir saldo.");
                                        System.out.println("2. Invertir en los proyectos.");
                                        System.out.println("3. Salir.");
                                        opcionSaldoCarteraInversor2=sc.nextInt();
                                        switch (opcionSaldoCarteraInversor2) {
                                            case 1:
                                                System.out.println("¿Cuánto quiere añadir a su cartera?");
                                                saldoActualInversor2=sc.nextInt();
                                                do{
                                                    System.out.println("Actualmente tiene "+saldoActualInversor2+"€.");
                                                    System.out.println("¿Desea seguir añadiendo a su cartera?(1 Si 2 No)");
                                                    opcionSeguirAnadiendoDineroInversor2=sc.nextInt();
                                                    switch (opcionSeguirAnadiendoDineroInversor2){
                                                        case 1:
                                                            System.out.println("¿Cuánto quieres añadir?");
                                                            nuevoSaldoInversor2=sc.nextInt();
                                                            if (nuevoSaldoInversor2>0) {
                                                                saldoActualInversor2+=nuevoSaldoInversor2;
                                                                System.out.println("Se han añadido exitosamente a tu cuenta");
                                                                break;
                                                            }else {
                                                                System.out.println("El saldo no se ha podido añadir, no se admiten números negativos");
                                                                break;
                                                            }
                                                    }
                                                }while (opcionSeguirAnadiendoDineroInversor2!=2);
                                                System.out.println("Saliendo de la opcion añadir saldo");
                                                break;
                                            case 2:
                                                if (numerosProyectos==0){
                                                    System.out.println("No hay ningún proyecto para invertir.");
                                                }else if (numerosProyectos==1) {
                                                    System.out.println("¿En qué proyecto quieres invertir?");
                                                    System.out.println("1. Invertir en el proyecto 1.");
                                                    System.out.println("2. Salir.");
                                                    menuInvertirProyectos2 = sc.nextInt();
                                                    switch (menuInvertirProyectos2) {
                                                        case 1:
                                                            if (saldoActualInversor2 <= 0) {
                                                                System.out.println("No tienes saldo en la cartera.");
                                                                break;
                                                            } else if (saldoActualInversor2 > cantidadNecesariaProyecto3 || saldoActualInversor2 < cantidadNecesariaProyecto3||saldoActualInversor2==cantidadNecesariaProyecto3) {
                                                                System.out.println("¿Cuánto quieres invertir?");
                                                                inversionProyecto1Inversor2 = sc.nextInt();
                                                                System.out.println("Has invertido " + inversionProyecto1Inversor2 + "€");
                                                                inversionProyecto1Inversor2 += cantidadFinanciadaProyecto1;
                                                                saldoActualInversor2 -= inversionProyecto1Inversor2;
                                                                break;
                                                            }
                                                        case 2:
                                                            System.out.println("Saliendo de invertir proyectos.");
                                                            break;
                                                    }
                                                } else if (numerosProyectos==2) {
                                                    System.out.println("¿En qué proyecto quieres invertir?");
                                                    System.out.println("1. Invertir en el proyecto 1.");
                                                    System.out.println("2. Invertir en el proyecto 2.");
                                                    System.out.println("3. Salir.");
                                                    menuInvertirProyectos = sc.nextInt();
                                                    switch (menuInvertirProyectos) {
                                                        case 1:
                                                            if (saldoActualInversor2 <= 0) {
                                                                System.out.println("No tienes saldo en la cartera.");
                                                                break;
                                                            } else if (saldoActualInversor2 > cantidadNecesariaProyecto3 || saldoActualInversor2 < cantidadNecesariaProyecto3||saldoActualInversor2==cantidadNecesariaProyecto3) {
                                                                System.out.println("¿Cuánto quieres invertir?");
                                                                inversionProyecto1Inversor2 = sc.nextInt();
                                                                System.out.println("Has invertido " + inversionProyecto1Inversor2 + "€");
                                                                inversionProyecto1Inversor2 += cantidadFinanciadaProyecto1;
                                                                saldoActualInversor2 -= inversionProyecto1Inversor2;
                                                                break;
                                                            }
                                                        case 2:
                                                            if (saldoActualInversor2 <= 0) {
                                                                System.out.println("No tienes saldo en la cartera.");
                                                                break;
                                                            } else if (saldoActualInversor2 > cantidadNecesariaProyecto3 || saldoActualInversor2 < cantidadNecesariaProyecto3||saldoActualInversor2==cantidadNecesariaProyecto3) {
                                                                System.out.println("¿Cuánto quieres invertir?");
                                                                inversionProyecto2Inversor2 = sc.nextInt();
                                                                System.out.println("Has invertido " + inversionProyecto2Inversor2 + "€");
                                                                inversionProyecto2Inversor2 += cantidadFinanciadaProyecto2;
                                                                saldoActualInversor2 -= inversionProyecto2Inversor2;
                                                                break;
                                                            }
                                                        case 3:
                                                            System.out.println("Saliendo de invertir proyectos.");
                                                            break;
                                                    }
                                                } else if (numerosProyectos==3) {
                                                    System.out.println("¿En qué proyecto quieres invertir?");
                                                    System.out.println("1. Invertir en el proyecto 1.");
                                                    System.out.println("2. Invertir en el proyecto 2.");
                                                    System.out.println("3. Invertir en el proyecto 3.");
                                                    System.out.println("4. Salir.");
                                                    menuInvertirProyectos = sc.nextInt();
                                                    switch (menuInvertirProyectos) {
                                                        case 1:
                                                            if (saldoActualInversor2 <= 0) {
                                                                System.out.println("No tienes saldo en la cartera.");
                                                                break;
                                                            } else if (saldoActualInversor2 > cantidadNecesariaProyecto3 || saldoActualInversor2 < cantidadNecesariaProyecto3||saldoActualInversor2==cantidadNecesariaProyecto3) {
                                                                System.out.println("¿Cuánto quieres invertir?");
                                                                inversionProyecto1Inversor2 = sc.nextInt();
                                                                System.out.println("Has invertido " + inversionProyecto1Inversor2 + "€");
                                                                inversionProyecto1Inversor2 += cantidadFinanciadaProyecto1;
                                                                saldoActualInversor2 -= inversionProyecto1Inversor2;
                                                                break;
                                                            }
                                                        case 2:
                                                            if (saldoActualInversor2 <= 0) {
                                                                System.out.println("No tienes saldo en la cartera.");
                                                                break;
                                                            } else if (saldoActualInversor2 > cantidadNecesariaProyecto3 || saldoActualInversor2 < cantidadNecesariaProyecto3||saldoActualInversor2==cantidadNecesariaProyecto3) {
                                                                System.out.println("¿Cuánto quieres invertir?");
                                                                inversionProyecto2Inversor2 = sc.nextInt();
                                                                System.out.println("Has invertido " + inversionProyecto2Inversor2 + "€");
                                                                inversionProyecto2Inversor2 += cantidadFinanciadaProyecto2;
                                                                saldoActualInversor2 -= inversionProyecto2Inversor2;
                                                                break;
                                                            }
                                                        case 3:
                                                            if (saldoActualInversor2 <= 0) {
                                                                System.out.println("No tienes saldo en la cartera.");
                                                                break;
                                                            } else if (saldoActualInversor2 > cantidadNecesariaProyecto3 || saldoActualInversor2 < cantidadNecesariaProyecto3||saldoActualInversor2==cantidadNecesariaProyecto3) {
                                                                System.out.println("¿Cuánto quieres invertir?");
                                                                inversionProyecto3Inversor1 = sc.nextInt();
                                                                System.out.println("Has invertido " + inversionProyecto3Inversor2 + "€");
                                                                inversionProyecto3Inversor2 += cantidadFinanciadaProyecto3;
                                                                saldoActualInversor2 -= inversionProyecto3Inversor2;
                                                                break;
                                                            }
                                                        case 4:
                                                            System.out.println("Saliendo de invertir proyectos.");
                                                            break;
                                                    }
                                                }
                                            case 3:
                                                System.out.println("Saliendo de su cartera digital.");
                                                break;
                                        }
                                        break;
                                    case 4:
                                        System.out.println("-----Menú de tus amigos-----");
                                        do {
                                            System.out.println("1. Mostrar lista de amigos referidos");
                                            System.out.println("2. Añadir un nuevo amigo");
                                            System.out.println("3. Salir");
                                            System.out.println("Seleccione una opción: ");
                                            opcionAgregar2 = sc.nextInt();
                                            switch (opcionAgregar2) {
                                                case 1:
                                                    if (listaDeAmigos2.length() == 0) {
                                                        System.out.println("No hay amigos en la lista.");
                                                    } else {
                                                        System.out.println("Amigos: " + listaDeAmigos2);
                                                    }
                                                    break;
                                                case 2:
                                                    System.out.print("Introduce el correo del amigo: ");
                                                    correo2 = sc.next();
                                                    if (listaDeAmigos2.length() == 0) {
                                                        listaDeAmigos2 = correo2;
                                                    } else {
                                                        listaDeAmigos2 = listaDeAmigos2.concat(", ").concat(correo);
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
                                        } while (opcionAgregar2 != 3);
                                        break;
                                    case 5:
                                        System.out.println("Bienvenido a la configuración.");
                                        do {
                                            System.out.println("1. Cambiar nombre de usuario.");
                                            System.out.println("2. Cambiar la contraseña de usuario.");
                                            System.out.println("3. Salir.");
                                            menuConfInversor2 = sc.nextInt();
                                            switch (menuConfInversor2) {
                                                case 1:
                                                    System.out.println("Tu nombre actual es: " + inversor2);
                                                    System.out.print("Pon tu nuevo nombre: ");
                                                    inversor2 = sc.next();
                                                    System.out.println("Cambiaste tu nombre a: " + inversor2);
                                                    break;
                                                case 2:
                                                    System.out.println("Tu contraseña actual es: " + inversor2Contra);
                                                    System.out.print("Pon tu nueva contraseña: ");
                                                    inversor2Contra = sc.next();
                                                    System.out.println("Cambiaste tu contraseña a: " + inversor2Contra);
                                                    break;
                                                default:
                                                    if (menuConfInversor2>3 || menuConfInversor2<=0)
                                                        System.out.println("Tienes que elegir una de las opciones");
                                            }
                                        } while (menuConfInversor2 != 3);
                                        System.out.println("Saliendo de configuración.");
                                }
                            }while (opcionInversor2 != 6);
                            System.out.println("Cerraste sesión.");
                            acceso=false;
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
                break;
        }
    }while (inicioPrograma!=2);
        System.out.println("Saliendo del programa.");
        }
    }
