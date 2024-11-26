import java.util.Scanner;

public class FernanStarter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String usuarioAdministrador="Administrador";
    String contraAdministrador="1234";
    String usuarioGestor="Gestor";
    String contraGestor="4321";
    boolean bloqueadoGestor=false;
    String inversor1="Inversor1";
    String inversorContra="Inversor1";
    boolean bloqueadoInversor1=false;
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
                }else{
                    System.out.println("Login fallido");
                    intentos++;
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
                System.out.println("Número de intentos excedido.");
            }
        }

    }
}