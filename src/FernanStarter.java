import java.util.Scanner;

public class FernanStarter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //Administrador
    String usuarioAdministrador="Administrador";
    String contraAdministrador="1234";
        int opcionAdmi = 0;
        int menubloq = 0;
        int menuconf = 0;
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
        String cantidadNecesariaProyecto1 ="";
        String cantidadFinanciadaProyecto1 ="";
        String fechaInicioProyecto1 ="";
        String fechaFinProyecto1 ="";
        String recompensasProyecto1 ="";
        String nombreProyecto2 ="";
        String categoriaProyecto2="";
        String cantidadNecesariaProyecto2 ="";
        String cantidadFinanciadaProyecto2 ="";
        String fechaInicioProyecto2 ="";
        String fechaFinProyecto2 ="";
        String recompensasProyecto2 ="";
        String nombreProyecto3 ="";
        String categoriaProyecto3="";
        String cantidadNecesariaProyecto3 ="";
        String cantidadFinanciadaProyecto3 ="";
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

        System.out.println("Bienvenidos al sistema de acceso:");
        while(intentos<3 && !acceso){
            System.out.println("Ingrese el nombre del usuario: ");
            String usuarioPedido = sc.nextLine();
            System.out.println("Ingrese la contraseña de usuario:");
            String contraPedido = sc.nextLine();
            if (usuarioPedido.equals(usuarioAdministrador)){
                if(contraPedido.equals(contraAdministrador)){
                    System.out.println("Login realizado. Bienvenido "+usuarioAdministrador);
                    acceso=true;
                    //Menu administrador
                    do {
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
                                    }while (menubloq != 3);

                                case 2:
                                    System.out.println("Bienvenido a Proyectos que deseas");
                                    break;
                                case 3:
                                    System.out.println("Bienvenido a la Configuración que deseas");

                                    do {
                                        System.out.println("1. Cambiar nombre de usuario");
                                        System.out.println("2. Cambiar contraseña");
                                        System.out.println("3. Salir");
                                        menuconf = sc.nextInt();
                                        switch (menuconf){
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
                                    }while (menuconf != 3);
                                    break;
                            }
                    }while (opcionAdmi != 4);
                    System.out.println("Cerraste sesion exitosamente");
                }else{
                    System.out.println("Login fallido");
                }
            }else if(usuarioPedido.equals(usuarioGestor)){
                if(bloqueadoGestor){
                    System.out.println("Este usuario esta bloqueado, solo el Administrador puede desbloquearlo.");
                } else if (contraPedido.equals(contraGestor)) {
                    System.out.println("Login realizado. Bienvenido "+usuarioGestor);
                    acceso=true;
                    //MENÚ GESTOR.
                    do {
                        System.out.println("1. Mis proyectos.");
                        System.out.println("2. Configuración.");
                        System.out.println("3. Cerrar sesión.");
                        opcionGestor=sc.nextInt();
                        switch (opcionGestor){
                            case 1:
                                System.out.println("Bienvenido a Mis proyectos.");
                                System.out.println("Puedes crear un máximo de 3 proyectos.");
                                System.out.println("Tienes "+numerosProyectos+" creados.");
                                System.out.println("¿Quieres crear algun proyecto (1 si, 2 no)?");
                                opcionCrearProyecto1 = sc.nextInt();
                                do {
                                    switch (opcionCrearProyecto1){
                                        case 1:
                                            numerosProyectos++;
                                            System.out.println("Dime el nombre del proyecto:");
                                            nombreProyecto1 = sc.next();
                                            System.out.println("Dime la categoria del proyecto (arte, tecnología, cine, música, juegos, comida, moda…)");
                                            categoriaProyecto1= sc.next();
                                            System.out.println("Cantidad necesaria del proyecto.");
                                            cantidadNecesariaProyecto1= sc.next();
                                            System.out.println("Cantidad financiada del proyecto.");
                                            cantidadFinanciadaProyecto1= sc.next();
                                            System.out.println("Fecha inicio apertura del proyecto.");
                                            fechaInicioProyecto1= sc.next();
                                            System.out.println("Fecha fin apertura del proyecto.");
                                            fechaFinProyecto1= sc.next();
                                            System.out.println("Recompensas del proyecto.");
                                            recompensasProyecto1= sc.next();
                                            System.out.println("PROYECTO "+numerosProyectos+".");
                                            System.out.println("Nombre: "+nombreProyecto1+"\nCategoria: "+categoriaProyecto1+"\nCantidad necesaria: "+cantidadNecesariaProyecto1
                                            +" \nCantidad financiada: "+cantidadFinanciadaProyecto1+ " \nFecha inicio proyecto: "+fechaInicioProyecto1+" \nFecha fin proyecto: "+fechaFinProyecto1
                                            +"\nRecompensas del proyecto: "+recompensasProyecto1);
                                            System.out.println("¿Quieres crear otro proyecto (1 si, 2 no)?");
                                            opcionCrearProyecto2 = sc.nextInt();
                                            switch (opcionCrearProyecto2) {
                                                case 1:
                                                    numerosProyectos++;
                                                    System.out.println("Dime el nombre del proyecto:");
                                                    nombreProyecto2 = sc.next();
                                                    System.out.println("Dime la categoria del proyecto (arte, tecnología, cine, música, juegos, comida, moda…)");
                                                    categoriaProyecto2 = sc.next();
                                                    System.out.println("Cantidad necesaria del proyecto.");
                                                    cantidadNecesariaProyecto2 = sc.next();
                                                    System.out.println("Cantidad financiada del proyecto.");
                                                    cantidadFinanciadaProyecto2 = sc.next();
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
                                                    System.out.println("¿Quieres crear otro proyecto (1 si, 2 no)?");
                                                    opcionCrearProyecto3 = sc.nextInt();
                                                    switch (opcionCrearProyecto3) {
                                                        case 1:
                                                            numerosProyectos++;
                                                            System.out.println("Dime el nombre del proyecto:");
                                                            nombreProyecto3 = sc.next();
                                                            System.out.println("Dime la categoria del proyecto (arte, tecnología, cine, música, juegos, comida, moda…)");
                                                            categoriaProyecto3 = sc.next();
                                                            System.out.println("Cantidad necesaria del proyecto.");
                                                            cantidadNecesariaProyecto3 = sc.next();
                                                            System.out.println("Cantidad financiada del proyecto.");
                                                            cantidadFinanciadaProyecto3 = sc.next();
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
                                                            if (numerosProyectos==3){
                                                                System.out.println("Has creado la cantidad máxima de proyectos.");
                                                            }
                                                            break;
                                                        case 2:
                                                            System.out.println("Saliendo de Mis proyectos.");
                                                            break;
                                                    }
                                                case 2:
                                                    System.out.println("Saliendo de Mis Proyectos.");
                                                    break;
                                            }
                                        case 2:
                                            System.out.println("Saliendo de Mis proyectos.");
                                            break;
                                    }
                                }while (opcionCrearProyecto1 !=2);
                                break;
                            case 2:
                                System.out.println("Bienvenido a la configuración.");
                                do {
                                    System.out.println("1. Cambiar nombre de usuario.");
                                    System.out.println("2. Cambiar la contraseña de usuario.");
                                    System.out.println("3. Salir.");
                                    menuconfGestor= sc.nextInt();
                                    switch (menuconfGestor){
                                        case 1:
                                            System.out.println("Tu nombre actual es: " + usuarioGestor);
                                            System.out.print("Pon tu nuevo nombre: ");
                                            usuarioGestor = sc.next();
                                            System.out.println("Cambiaste tu nombre a: " + usuarioAdministrador);
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
                                }while (menuconfGestor!=3);
                                System.out.println("Saliendo de configuración.");
                                break;
                        }
                    }while (opcionGestor!=3);
                    System.out.println("Cerraste sesion exitosamente.");
                }else {
                    System.out.println("Login fallido");
                    intentos++;
                    if (intentos==3)
                        bloqueadoGestor=true;
                }
            }else if(usuarioPedido.equals(inversor1)){
                if(bloqueadoInversor1){
                    System.out.println("Este usuario esta bloqueado, solo el Administrador puede desbloquearlo.");
                } else if (contraPedido.equals(inversorContra)) {
                    System.out.println("Login realizado. Bienvenido "+inversor1);
                    acceso=true;
                }else {
                    System.out.println("Login fallido");
                    intentos++;
                    if (intentos==3)
                        bloqueadoInversor1=true;
                }
            }else if(usuarioPedido.equals(inversor2)){
                if(bloqueadoInversor2){
                    System.out.println("Este usuario esta bloqueado, solo el Administrador puede desbloquearlo.");
                }else if (contraPedido.equals(inversor2Contra)) {
                    System.out.println("Login realizado. Bienvenido "+inversor2);
                    acceso=true;
                }else{
                    System.out.println("Login fallido");
                    intentos++;
                    if (intentos==3)
                        bloqueadoInversor2=true;
                }
            }else{
                System.out.println("No hay ningun usuario con ese nombre o contraseña");
                intentos++;
            }
            if (intentos==3 && !acceso){
                System.out.println("Número de intentos excedido (Estás bloqueado).");
            }
        }
    }
}