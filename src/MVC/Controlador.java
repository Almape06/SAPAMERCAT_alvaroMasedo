package MVC;
import MVC.Model.Model;
import MVC.Vista.Vista;
import java.util.Scanner;

public class Controlador {
    private Vista view;
    private Model model1;

    public Controlador(Vista view, Model model1) {
        this.view = view;
        this.model1 = model1;
    }

    public static void main(String[] args) {
        Vista vista = new Vista();
        Model model = new Model();
        Scanner scan = new Scanner(System.in);

        vista.mostrarMenuPrincipal();
        int opcio = scan.nextInt();

        switch (opcio){
            case 0:
                System.out.println("Programa Acabat");
                break;
            case 1:
                vista.mostrarMenuGestioMagatzem();
        }
    }
}