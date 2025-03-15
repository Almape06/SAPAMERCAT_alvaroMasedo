package MVC;
import MVC.Exceptions.LimitProductesException;
import MVC.Model.Model;
import MVC.Model.RegistreTiquet;
import MVC.Vista.Vista;
import java.util.Scanner;

/**
 * Classe Controlador que gestiona la lògica de les interaccions entre la vista i el model.
 * Controla el flux de l'aplicació a través de diversos menús per interactuar amb els productes, tiquets i magatzem.
 */

public class Controlador {
    private Vista view;
    private Model model1;

    /**
     * Constructor per inicialitzar la vista i el model.
     *
     * @param view Instància de la vista
     * @param model1 Instància del model
     */
    public Controlador(Vista view, Model model1) {
        this.view = view;
        this.model1 = model1;
    }

    /**
     * Mètode principal que gestiona el mnú de l'aplicació mitjançant un menú principal.
     * Permet escollir diverses opcions relacionades amb la gestió de productes, tiquets i magatzem.
     * Un switch case per escollir les opcións
     *
     * @param args Arguments de la línia de comandes
     * @throws LimitProductesException Llença una excepció si s'arriba al límit de productes
     */
    public static void main(String[] args) throws LimitProductesException {
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
                    menuProductes();
                    break;
                case 3:
                    Model.menuTiquet();
                    break;
                case 4:
                    Model.mostrarCarro();
                    break;
            }
        }
    }

    /**
     * Mètode que gestiona el menú per gestionar el magatzem, permet afegir o ordenar productes.
     */
    public static void menuMagatzem(){
        Vista vista = new Vista();
        Scanner scan = new Scanner(System.in);
        Model model = new Model();
        RegistreTiquet registro = new RegistreTiquet();

        int num = -10;
        while (num != 0){
            vista.mostrarMenuGestioMagatzem();
            num = scan.nextInt();
            switch(num){
                case 1:
                    Model.ordenarAliments();
                    break;
                case 2:
                    registro.mostrarTiquets();
                    break;
                case 3:
                    Model.ordenarTextil();
                    break;
            }
        }

    }

    /**
     * Mètode que gestiona el menú per afegir productes a la llista de productes.
     */
    public static void menuProductes(){
        Vista vista = new Vista();
        Scanner scan = new Scanner(System.in);

        int num = -10;
        while (num != 0){
            vista.mostrarMenuProducte();
            num = scan.nextInt();
            switch(num){
                case 1:
                    menuAlimentacio();
                    break;
                case 2:
                    menuTextil();
                    break;
                case 3:
                    menuElectronica();
                    break;
            }
        }
    }

    /**
     * Mètode que gestiona l'afegit de productes d'alimentació al carro.
     */
    public static void menuAlimentacio(){
        Scanner scan = new Scanner(System.in);
        Model model = new Model();
        Model.afegirAliment();
        System.out.println("Vols afegir un altre aliment? Si(S), No(N) ");
        String resposta = scan.nextLine();
        while (resposta.equals("S") || resposta.equals("s") || resposta.equals("Si") || resposta.equals("si") || resposta.equals("SI") ){
            Model.afegirAliment();
            System.out.println("Vols afegir un altre aliment? Si(S), No(N) ");
            resposta = scan.nextLine();
        }
    }

    /**
     * Mètode que gestiona l'afegit de productes tèxtils al carro.
     */
    public static void menuTextil(){
        Scanner scan = new Scanner(System.in);
        Model model = new Model();
        Model.afegirTextil();
        System.out.println("Vols afegir un altre producte tèxtil? Si(S), No(N) ");
        String resposta = scan.nextLine();
        while (resposta.equals("S") || resposta.equals("s") || resposta.equals("Si") || resposta.equals("si") || resposta.equals("SI")){
            Model.afegirTextil();
            System.out.println("Vols afegir un altre producte tèxtil? Si(S), No(N) ");
            resposta = scan.nextLine();
        }
    }

    /**
     * Mètode que gestiona l'afegit de productes electrònics al carro.
     */
    public static void menuElectronica(){
        Scanner scan = new Scanner(System.in);
        Model model = new Model();
        Model.afegirElectronic();
        System.out.println("Vols afegir un altre producte electrònic? Si(S), No(N) ");
        String resposta = scan.nextLine();
        while (resposta.equals("S") || resposta.equals("s") || resposta.equals("Si") || resposta.equals("si") || resposta.equals("SI")){
            Model.afegirElectronic();
            System.out.println("Vols afegir un altre producte electrònic? Si(S), No(N) ");
            resposta = scan.nextLine();
        }
    }
}