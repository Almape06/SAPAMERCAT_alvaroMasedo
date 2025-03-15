package MVC.Vista;

/**
 * Classe vista on guardem funcions amb els menús principals
 * Guardem els menús principal, gestió del magatzem i Productes
 */

public class Vista {
    public static void mostrarMenuPrincipal(){
        System.out.println("\nBENVINGUT AL SAPAMERCAT");
        System.out.println("------------");
        System.out.println("---INICI---");
        System.out.println("------------");
        System.out.println("1) Gestió Magatzem i Compres");
        System.out.println("2) Introduir Producte");
        System.out.println("3) Passar per caixa");
        System.out.println("4) Mostrar carret de compra");
        System.out.println("0) Acabar");
    }

    public static void mostrarMenuGestioMagatzem(){
        System.out.println("-------------------------");
        System.out.println("---MAGATZEM I COMPRES---");
        System.out.println("-------------------------");
        System.out.println("1) Caducitat");
        System.out.println("2) Tiquets de Compra");
        System.out.println("3) Composició Tèxtil");
        System.out.println("0) Tornar");
    }

    public static void mostrarMenuProducte(){
        System.out.println("---------------");
        System.out.println("---PRODUCTES---");
        System.out.println("---------------");
        System.out.println("1) Alimentació");
        System.out.println("2) Tèxtil");
        System.out.println("3) Electrònica");
        System.out.println("0) Tornar");
    }

}
