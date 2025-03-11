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
        model.afegirProductesLlistes();

        int num = -10;
        while (num != 0) {
            vista.mostrarMenuPrincipal();;
            num = scan.nextInt();
            switch (num) {
                case 1:
                    menuMagatzem();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }

    public static void menuMagatzem(){
        Vista vista = new Vista();
        Scanner scan = new Scanner(System.in);
        Model model = new Model();

        int num = -10;
        while (num != 0){
            vista.mostrarMenuGestioMagatzem();
            num = scan.nextInt();
            switch(num){
                case 1:
                    model.ordenarAliments();
                    break;
                case 2:
                    break;
                case 3:
                    model.ordenarTextil();
                    break;
            }
        }

    }

    public static void menuProductes(){
        Vista vista = new Vista();
        Scanner scan = new Scanner(System.in);
        Model model = new Model();

        int num = -10;
        while (num != 0){
            vista.mostrarMenuProducte();
            num = scan.nextInt();
            switch(num){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }
}