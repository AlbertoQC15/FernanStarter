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
        boolean bloqueadoGestor=false;
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