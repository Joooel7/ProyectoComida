package facturarcomida;
import java.util.Scanner;
public class FacturarComida {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        int pcn, pce, pcse, ppf, rf, sp, totalf, E, PR, heg, hdc, sf;
        String detenerFactura = "";
        String detenerPedido = "";
        String x = "";
        String p = "";
        String respuesta = "";
        totalf = 0;
        System.out.println("Bienvenidos a SpeedyUTB:");
        
        while (!detenerFactura.equals("salir")) {
            System.out.println("¿Desea ver nuestro menu(a) o Salir de nuestro sistema(b)?");
            x = scanner.nextLine();
            
            if (x.equals("a")) {
                while (!detenerPedido.equals("salir")) {
                    System.out.println("1.- Perro caliente Normal...............bs4");
                    System.out.println("2.- Perro caliente Especial............bs8");
                    System.out.println("3.- Perro caliente Super Especial......bs10");
                    System.out.println("4.- Servicio de Papas Francesas............bs12");
                    System.out.println("5.- Salchipapa individual......................bs9");
                    System.out.println("6.- Salchipapa familiar.................bs20");
                    System.out.println("7.- Hamburguesa doble carne.............bs25");
                    System.out.println("8.- Hamburguesa EXTRAGRANDE............bs35");
                    System.out.println("9.- Empanada.............bs5");
                    System.out.println("10.- Papa rellena.........bs6");
                    System.out.println("11.- Gaseosa personal.....................................bs2");
                    System.out.println("12.- Borrar Pedido...........................");
                    System.out.println("13.- Procesar Pedido.........................");
                    p = scanner.nextLine();
                    
                    if (p.equals("1")) {
                        System.out.println("¿Cuantos perros caliente normales desea llevar?");
                        pcn = scanner.nextInt();
                        totalf += pcn * 4;
                        clearScreen();
                    } else if (p.equals("2")) {
                        System.out.println("¿Cuantos perros caliente especial desea llevar?");
                        pce = scanner.nextInt();
                        totalf += pce * 8;
                        clearScreen();
                    } else if (p.equals("3")) {
                        System.out.println("¿Cuantos perros caliente super especial desea llevar?");
                        pcse = scanner.nextInt();
                        totalf += pcse * 10;
                        clearScreen();
                    } else if (p.equals("4")) {
                        System.out.println("¿Cuantos servicios de papas fritas desea llevar?");
                        ppf = scanner.nextInt();
                        totalf += ppf * 12;
                    } else if (p.equals("5")) {
                        System.out.println("¿Cuantas salchipapas personales desea llevar?");
                        sp = scanner.nextInt();
                        totalf += sp * 9;
                    } else if (p.equals("6")) {
                        System.out.println("¿Cuantas salchipapas familiares desea llevar?");
                        sf = scanner.nextInt();
                        totalf += sf * 20;
                    } else if (p.equals("7")) {
                        System.out.println("¿Cuantas hamburguesas doble carne desea llevar?");
                        hdc = scanner.nextInt();
                        totalf += hdc * 25;
                    } else if (p.equals("8")) {
                        System.out.println("¿Cuantas hamburguesas EXTRAGRANDE desea llevar?");
                        heg = scanner.nextInt();
                        totalf += heg * 35;
                    } else if (p.equals("9")) {
                        System.out.println("¿Cuantas empanadas desea llevar?");
                        E = scanner.nextInt();
                        totalf += E * 5;
                    } else if (p.equals("10")) {
                        System.out.println("Cuantas papas rellenas desea llevar?");
                        PR = scanner.nextInt();
                        totalf += PR * 6;
                    } else if (p.equals("11")) {
                        System.out.println("¿Cuantas gaseosas desea llevar?");
                        rf = scanner.nextInt();
                        totalf += rf * 2;
                        clearScreen();
                    } else if (p.equals("12")) {
                        System.out.println("¿Estas seguro que deseas eliminar tu pedido?, actualmente tu pedido es de " + totalf + " bs. Escriba SI para borrar o NO para omitir.");
                        respuesta = scanner.nextLine();
                        if (respuesta.equals("si") || respuesta.equals("SI")) {
                            totalf = 0;
                            clearScreen();
                        }
                        clearScreen();
                    } else if (p.equals("13")) {
                        x = "b";
                        detenerPedido = "salir";
                        clearScreen();
                    }
                }
            }
            
            if (x.equals("b")) {
                System.out.println("El Total de su factura es " + totalf + " Bs, Gracias por preferirnos.");
                detenerFactura = "salir";
            }
        }

    }
        private static void clearScreen() {
    }
}
