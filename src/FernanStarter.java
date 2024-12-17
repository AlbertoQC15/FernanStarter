import BibliotecaFunciones.Funciones;

import java.util.Scanner;
import static BibliotecaFunciones.Funciones.*;
public class FernanStarter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioPedido = "", contraPedido="";
        int inicioPrograma=0, vistaDetallada=0;

    //Administrador
    String usuarioAdministrador="Administrador", contraAdministrador="1234";

    int opcionAdmi=0,menubloq=0,menuproyec=0,menuconf=0,modificarProyec=0,eliminarModificar=0,eliminarCategoria=0,eliminarCantidadNe=0,
        eliminarCantidadFi=0,eliminarFechaIn=0,eliminarFechaFin=0,eliminarrecompensas=0;

        String nombreUsuario = "";
    //UsuarioGestor
    String usuarioGestor="Gestor", contraGestor="4321";

        int opcionGestor=0,numerosProyectos=0,opcionCrearProyecto1=0,opcionCrearProyecto2=0,opcionCrearProyecto3=0,menuconfGestor=0,
                numRecompensas=0, precioRecompensa1 = 0, precioRecompensa11 = 0, precioRecompensa111 = 0, precioRecompensa2=0, precioRecompensa22=0, precioRecompensa222=0,
            precioRecompensa3=0, precioRecompensa33=0, precioRecompensa333=0;
        boolean bloqueadoGestor=false;
        float cantidadNecesariaProyecto1=0,cantidadFinanciadaProyecto1=0,cantidadNecesariaProyecto2=0,cantidadFinanciadaProyecto2=0,
                 cantidadNecesariaProyecto3=0,cantidadFinanciadaProyecto3=0;

        String nombreProyecto1 ="", categoriaProyecto1="",fechaInicioProyecto1="",fechaFinProyecto1="",recompensasProyecto1="",recompensasProyecto11="",recompensasProyecto111="";
        //---------------------------------
        String nombreProyecto2 ="", categoriaProyecto2="",fechaInicioProyecto2="",fechaFinProyecto2="",recompensasProyecto2 ="", recompensasProyecto22="", recompensasProyecto222="";
        //---------------------------------

        String nombreProyecto3 ="", categoriaProyecto3="",fechaInicioProyecto3="",fechaFinProyecto3="",recompensasProyecto3 ="", recompensasProyecto33="", recompensasProyecto333="";
        //---------------------------------
        String hacerRecompenas = "";
    //UsuarioInversor1
    String inversor1="Inversor1", inversorContra="Inversor1",correo="",listaDeAmigos="";
    int opcionAgregar  = 0,opcionInversor1=0,saldoActualInversor1=0,opcionSaldoCarteraInversor1=0,opcionSeguirAnadiendoDineroInversor1=0,menuConfInversor1=0,
            nuevoSaldoInversor1=0,inversionProyecto1Inversor1=0,inversionProyecto2Inversor1=0,inversionProyecto3Inversor1=0,menuInvertirProyectos=0,
            cantidadInvertidaProyecto1=0,cantidadInvertidaProyecto2=0,cantidadInvertidaProyecto3=0;
    boolean bloqueadoInversor1=false;
    //UsuarioInversor2
    String inversor2="Inversor2", inversor2Contra="Inversor2",correo2="",listaDeAmigos2="";

        int opcionAgregar2  = 0,opcionInversor2=0,saldoActualInversor2=0,opcionSaldoCarteraInversor2=0,opcionSeguirAnadiendoDineroInversor2=0,menuConfInversor2=0,
                nuevoSaldoInversor2=0,inversionProyecto1Inversor2=0,inversionProyecto2Inversor2=0,inversionProyecto3Inversor2=0,menuInvertirProyectos2=0,
                cantidadInvertida2Proyecto1=0,cantidadInvertida2Proyecto2=0,cantidadInvertida2Proyecto3=0;
        boolean bloqueadoInversor2=false;
    int intentos=0,intentosGestor=0,intentosInversor1=0,intentosInversor2=0;
    boolean acceso=false;
    do{
        Funciones.inicioPrograma();
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
                            Funciones.verificacion_Email();
                            System.out.println("Login realizado. Bienvenido " + usuarioAdministrador);
                            acceso = true;
                            //Menu administrador
                            do {
                                Funciones.menuAdministrador();
                                opcionAdmi = sc.nextInt();
                                switch (opcionAdmi) {
                                    case 1:
                                        do {
                                            Funciones.panelControlAdministrador();
                                            menubloq = sc.nextInt();
                                            switch (menubloq) {
                                                case 1:
                                                    Funciones.bloquearUsuario();
                                                    Funciones.mostrarUsuariosBloqueados();
                                                    break;
                                                case 2:
                                                    Funciones.desbloquearUsuario();
                                                    Funciones.mostrarUsuariosBloqueados();
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
                                            Funciones.proyectosControlAdministrador();
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
                                                               Funciones.gestionarProyecto1(sc);
                                                                break;
                                                            case 2 :
                                                                Funciones.gestionarProyecto2(sc);
                                                                break;
                                                            case 3 :
                                                                Funciones.gestionarProyecto3(sc);
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
                                            Funciones.mostrarMenuConfiguracion();
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
                            Funciones.verificacion_Email();
                            System.out.println("Login realizado. Bienvenido " + usuarioGestor);
                            acceso = true;
                            //MENÚ GESTOR.
                            do {
                                Funciones.menuGestor();
                                opcionGestor = sc.nextInt();
                                switch (opcionGestor) {
                                    case 1:
                                        System.out.println("Bienvenido a Mis proyectos.");
                                        System.out.println("Puedes crear un máximo de 3 proyectos.");
                                        System.out.println("Tienes " + Funciones.numerosProyectos + " creados.");
                                        Funciones.gestionarProyectos(sc);
                                        System.out.println("Saliendo de Mis Proyectos.");
                                        break;
                                    case 2:
                                        Funciones.mostrarProyectoConGrafico();
                                        break;
                                    case 3:
                                        if (Funciones.numerosProyectos == 0) {
                                            System.out.println("No hay proyectos disponibles.");
                                            break;
                                        } else{
                                            System.out.println("-----------------------------------------------");
                                            System.out.println("Hay " + Funciones.numerosProyectos + " disponibles");
                                            System.out.println("¿Que proyecto deseas modificar o eliminar?");
                                            System.out.println("Pulsa 1 para modificarlos pulsa 4 para Salir");
                                            System.out.println("-----------------------------------------------");
                                            modificarProyec = sc.nextInt();
                                            switch (modificarProyec){
                                                case 1 :
                                                    Funciones.gestionarProyecto1(sc);
                                                    break;
                                                case 2 :
                                                    Funciones.gestionarProyecto2(sc);
                                                    break;
                                                case 3 :
                                                    Funciones.gestionarProyecto3(sc);
                                                    break;
                                            }
                                        }
                                        break;
                                    case 4:
                                        System.out.println("Bienvenido a la configuración.");
                                           Funciones.mostrarMenuConfiguracionGestor();
                                }
                            } while (opcionGestor != 5);
                            System.out.println("Cerraste sesion exitosamente.");
                            acceso=false;
                            break;

                        } else {
                            System.out.println("Login fallido");
                            intentosGestor++;
                            if (intentosGestor == 3)
                                bloqueadoGestor = true;
                        }
                    } else if (usuarioPedido.equals(inversor1)) {
                        if (bloqueadoInversor1) {
                            System.out.println("Este usuario esta bloqueado, solo el Administrador puede desbloquearlo.");
                        } else if (contraPedido.equals(inversorContra)) {
                            Funciones.verificacion_Email();
                            System.out.println("Login realizado. Bienvenido " + inversor1);
                            acceso = true;
                            //MENÚ INVERSOR 1
                            do {
                                System.out.println("------MENÚ INVERSOR 1------");
                                Funciones.menuInversores();
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
                                                Funciones.anadirSaldo(sc);
                                            case 2:
                                                    if (numerosProyectos==0){
                                                        System.out.println("No hay ningún proyecto para invertir.");
                                                    }else if (numerosProyectos==1) {
                                                        Funciones.menuInvertirProyectos1();
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
                                                        Funciones.menuInvertirProyectos2();
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
                                                        Funciones.menuInvertirProyectos3();
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
                                            Funciones.menuInversoresAmigos();
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
                                        Funciones.mostrarMenuConfiguracionInversor1();                                }
                            }while (opcionInversor1 != 6);
                            System.out.println("Cerraste sesión.");
                            acceso=false;
                        } else {
                            System.out.println("Login fallido");
                            intentosInversor1++;
                            if (intentosInversor1 == 3)
                                bloqueadoInversor1 = true;
                        }
                    } else if (usuarioPedido.equals(inversor2)) {
                        if (bloqueadoInversor2) {
                            System.out.println("Este usuario esta bloqueado, solo el Administrador puede desbloquearlo.");
                        } else if (contraPedido.equals(inversor2Contra)) {
                            Funciones.verificacion_Email();
                            System.out.println("Login realizado. Bienvenido " + inversor2);
                            acceso = true;
                            //MENÚ INVERSOR 2
                            do {
                                System.out.println("------MENÚ INVERSOR 2------");
                                Funciones.menuInversores();
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
                                                Funciones.anadirSaldo2(sc);
                                            case 2:
                                                if (numerosProyectos==0){
                                                    System.out.println("No hay ningún proyecto para invertir.");
                                                }else if (numerosProyectos==1) {
                                                    Funciones.menuInvertirProyectos1();
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
                                                    Funciones.menuInvertirProyectos2();
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
                                                    Funciones.menuInvertirProyectos3();
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
                                            Funciones.menuInversoresAmigos();
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
                                        Funciones.mostrarMenuConfiguracionInversor2();
                                }
                            }while (opcionInversor2 != 6);
                            System.out.println("Cerraste sesión.");
                            acceso=false;
                        } else {
                            System.out.println("Login fallido");
                            intentosInversor2++;
                            if (intentosInversor2 == 3)
                                bloqueadoInversor2 = true;
                            break;
                        }
                        break;
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