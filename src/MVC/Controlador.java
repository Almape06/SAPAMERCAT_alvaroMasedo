package MVC;

import MVC.Vista.Vista;

import java.util.Scanner;

public class Controlador {
    private Vista view;

    public Controlador(Vista view) {
        this.view = view;
    }

    public static void main(String[] args) {
        Vista vista = new Vista();
        Scanner scan = new Scanner(System.in);

        vista.mostrarMenuPrincipal();
        int opcio = scan.nextInt();

        switch (opcio){
            case 0:
                System.out.println("Programa Acabat");
                break;
        }
    }
}