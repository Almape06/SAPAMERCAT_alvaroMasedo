package MVC.Model;

import MVC.Exceptions.LimitProductesException;
import MVC.Exceptions.NegatiuException;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class Model {
     static List<Productes> magatzem = new LinkedList<>();

    static Map<Alimentacio, Integer> detallAlimentacio = new HashMap<>();
    static Map<Textil, Integer> detallTextil = new HashMap<>();
    static Map<Electronica, Integer> detallElectronica = new HashMap<>();
    static Map<String, Integer> productes = new HashMap<>();

    public static void afegirProductesLlistes(){
        LocalDate data1 = LocalDate.of(2025, 06, 15);
        LocalDate data2 = LocalDate.of(2025, 07, 16);
        LocalDate data3 = LocalDate.of(2025, 05, 25);
        LocalDate data4 = LocalDate.of(2025, 04, 12);

        magatzem.add(new Alimentacio("Tomaquet", 2.5f, 120021,data1));
        magatzem.add(new Alimentacio("Tomaquet", 2.5f, 120021,data2));
        magatzem.add(new Alimentacio("Tomaquet", 2.5f, 120021,data3));
        magatzem.add(new Alimentacio("Tomaquet", 2.5f, 120021,data4));
        magatzem.add(new Alimentacio("Tomaquet", 2.5f, 120021,data4));
        magatzem.add(new Alimentacio("Tomaquet", 2.5f, 120021,data2));
        magatzem.add(new Alimentacio("Formatge", 3.7f, 324523,data3));
        magatzem.add(new Alimentacio("Formatge", 3.7f, 324523,data3));
        magatzem.add(new Alimentacio("Formatge", 3.7f, 324523,data1));
        magatzem.add(new Alimentacio("Formatge", 3.7f, 324523,data1));
        magatzem.add(new Alimentacio("Formatge", 3.7f, 324523,data3));
        magatzem.add(new Alimentacio("Formatge", 3.7f, 324523,data3));
        magatzem.add(new Alimentacio("Formatge", 3.7f, 324523,data3));
        magatzem.add(new Alimentacio("Formatge", 3.7f, 324523,data2));
        magatzem.add(new Alimentacio("Formatge", 3.7f, 324523,data2));
        magatzem.add(new Alimentacio("Formatge", 3.7f, 324523,data2));
        magatzem.add(new Alimentacio("LLet", 2.3f, 110911,data1));
        magatzem.add(new Alimentacio("LLet", 2.3f, 110911,data1));
        magatzem.add(new Alimentacio("LLet", 2.3f, 110911,data1));
        magatzem.add(new Alimentacio("LLet", 2.3f, 110911,data3));
        magatzem.add(new Alimentacio("LLet", 2.3f, 110911,data2));
        magatzem.add(new Alimentacio("LLet", 2.3f, 110911,data2));
        magatzem.add(new Alimentacio("LLet", 2.3f, 110911,data4));
        magatzem.add(new Alimentacio("LLet", 2.3f, 110911,data4));
        magatzem.add(new Alimentacio("Meló", 5.8f, 870097,data4));
        magatzem.add(new Alimentacio("Meló", 5.8f, 870097,data1));
        magatzem.add(new Alimentacio("Meló", 5.8f, 870097,data3));
        magatzem.add(new Alimentacio("Meló", 5.8f, 870097,data2));
        magatzem.add(new Alimentacio("Meló", 5.8f, 870097,data2));
        magatzem.add(new Alimentacio("Meló", 5.8f, 870097,data4));
        magatzem.add(new Electronica("Auriculars",7.6f,123321,30));
        magatzem.add(new Electronica("Auriculars",7.6f,123321,30));
        magatzem.add(new Electronica("Auriculars",7.6f,123321,30));
        magatzem.add(new Electronica("Auriculars",7.6f,123321,30));
        magatzem.add(new Electronica("Auriculars",7.6f,123321,30));
        magatzem.add(new Electronica("Auriculars",7.6f,123321,30));
        magatzem.add(new Electronica("Auriculars",7.6f,123321,30));
        magatzem.add(new Electronica("Auriculars",7.6f,123321,30));
        magatzem.add(new Electronica("Auriculars",7.6f,123321,30));
        magatzem.add(new Electronica("Auriculars",7.6f,123321,30));
        magatzem.add(new Electronica("Placa Base",120f,550055,365));
        magatzem.add(new Electronica("Placa Base",120f,550055,365));
        magatzem.add(new Electronica("Placa Base",120f,550055,365));
        magatzem.add(new Electronica("Placa Base",120f,550055,365));
        magatzem.add(new Electronica("Placa Base",120f,550055,365));
        magatzem.add(new Electronica("Placa Base",120f,550055,365));
        magatzem.add(new Electronica("Placa Base",120f,550055,365));
        magatzem.add(new Electronica("Placa Base",120f,550055,365));
        magatzem.add(new Electronica("Placa Base",120f,550055,365));
        magatzem.add(new Electronica("Placa Base",120f,550055,365));
        magatzem.add(new Electronica("Altaveu",55.9f,031130,120));
        magatzem.add(new Electronica("Altaveu",55.9f,031130,120));
        magatzem.add(new Electronica("Altaveu",55.9f,031130,120));
        magatzem.add(new Electronica("Altaveu",55.9f,031130,120));
        magatzem.add(new Electronica("Altaveu",55.9f,031130,120));
        magatzem.add(new Electronica("Altaveu",55.9f,031130,120));
        magatzem.add(new Electronica("Altaveu",55.9f,031130,120));
        magatzem.add(new Electronica("Altaveu",55.9f,031130,120));
        magatzem.add(new Electronica("Altaveu",55.9f,031130,120));
        magatzem.add(new Electronica("Altaveu",55.9f,031130,120));
        magatzem.add(new Textil("samarreta",15.9f,012566,"Polièster"));
        magatzem.add(new Textil("samarreta",15.9f,012566,"Polièster"));
        magatzem.add(new Textil("samarreta",15.9f,012566,"Polièster"));
        magatzem.add(new Textil("samarreta",15.9f,012566,"Polièster"));
        magatzem.add(new Textil("samarreta",13.9f,777666,"Cotó"));
        magatzem.add(new Textil("samarreta",13.9f,777666,"Cotó"));
        magatzem.add(new Textil("samarreta",13.9f,777666,"Cotó"));
        magatzem.add(new Textil("samarreta",11.9f,983322,"Llana"));
        magatzem.add(new Textil("samarreta",11.9f,983322,"Llana"));
        magatzem.add(new Textil("samarreta",11.9f,983322,"Llana"));
        magatzem.add(new Textil("Pantaló",20.5f,987654,"Cotó"));
        magatzem.add(new Textil("Pantaló",20.5f,987654,"Cotó"));
        magatzem.add(new Textil("Pantaló",20.5f,987654,"Cotó"));
        magatzem.add(new Textil("Pantaló",20.5f,987654,"Cotó"));
        magatzem.add(new Textil("Pantaló",20.5f,987654,"Cotó"));
        magatzem.add(new Textil("Camisa",33.9f,001234,"Cotó"));
        magatzem.add(new Textil("Camisa",33.9f,001234,"Cotó"));
        magatzem.add(new Textil("Camisa",33.9f,001234,"Cotó"));
        magatzem.add(new Textil("Camisa",29.9f,887766,"Polièster"));
        magatzem.add(new Textil("Camisa",29.9f,887766,"Polièster"));
        magatzem.add(new Textil("Gorra",8.9f,457633,"Llana"));
        magatzem.add(new Textil("Gorra",8.9f,457633,"Llana"));
        magatzem.add(new Textil("Gorra",8.9f,457633,"Llana"));
        magatzem.add(new Textil("Gorra",8.9f,457633,"Llana"));
        magatzem.add(new Textil("Camisa",32.9f,788796,"Lli"));
        magatzem.add(new Textil("Camisa",32.9f,788796,"Lli"));
        magatzem.add(new Textil("Camisa",32.9f,788796,"Lli"));
        magatzem.add(new Textil("Camisa",32.9f,788796,"Lli"));
        magatzem.add(new Textil("Camisa",32.9f,788796,"Lli"));
        magatzem.add(new Textil("Camisa",32.9f,788796,"Lli"));
        magatzem.add(new Textil("Camisa",32.9f,788796,"Lli"));
    }

    public static void ordenarAliments(){
        List<Alimentacio> aliments = new LinkedList<>();
        for (Object objecte : magatzem){
            if (objecte instanceof Alimentacio){
                aliments.add((Alimentacio)objecte);
            }
        }

        Collections.sort(aliments, Comparator.comparing(Alimentacio::getData_caducitat));

        for (Alimentacio aliment : aliments){
            System.out.println(aliment);
        }
    }

    public static void ordenarTextil(){
        List<Textil> textil = new LinkedList<>();
        for(Object objecte : magatzem){
            if (objecte instanceof Textil){
                textil.add((Textil) objecte);
            }
        }
        Collections.sort(textil, Comparator.comparing(Textil::getComposicio));

        for (Textil textils : textil){
            System.out.println(textils);
        }
    }


    public static void afegirAliment(){
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Afegir aliment");
            System.out.println("Nom producte: ");
            String nom = scan.nextLine();

            System.out.println("Preu: ");
            float preu = scan.nextFloat();
            if (preu < 0) {
                throw new NegatiuException("El preu no pot ser negatiu");
            }
            scan.nextLine();

            System.out.println("Codi de barres (6 digits): ");
            int codiBarres = scan.nextInt();

            scan.nextLine();

            System.out.println("Data de caducitat (yyyy-mm-dd): ");
            LocalDate dataCaducitat = LocalDate.parse(scan.nextLine().trim());

            int cantidad = productes.getOrDefault(nom, 0) + 1;
            Alimentacio producte = new Alimentacio(nom, preu, codiBarres, dataCaducitat);
            afegirCarroAliment(producte, cantidad);
            System.out.println("Producte afegit correctament");

        }catch (InputMismatchException e) {
            System.out.println("Error: Entrada incorrecta. Introdueix un numero válid.");
        } catch (NegatiuException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void afegirCarroAliment(Alimentacio a, int quantitat){
        detallAlimentacio.put(a,quantitat);
    }

    public static void afegirTextil(){
        try{    Scanner scan = new Scanner(System.in);
                System.out.println("Afegir tèxtil");
                System.out.println("Nom producte: ");
                String nom = scan.nextLine();

                System.out.println("Preu: ");
                float preu = scan.nextFloat();
                if (preu < 0) {
                    throw new NegatiuException("El preu no pot ser negatiu");
                }
                scan.nextLine();

                System.out.println("Codi de barres (6 digits): ");
                int codiBarres = scan.nextInt();
                scan.nextLine();

                System.out.println("Composició: ");
                String composicio = scan.nextLine();

                int cantidad = productes.getOrDefault(nom, 0) + 1;
                Textil producte = new Textil(nom, preu, codiBarres, composicio);
                afegirCarroTextil(producte, cantidad);
                System.out.println("Producte afegit correctament");

        }catch (InputMismatchException e) {
            System.out.println("Error: Entrada incorrecta. Introdueix un numero válid.");
        } catch (NegatiuException e) {
            System.out.println("Error: " + e.getMessage());
        }
}

    public static void afegirCarroTextil(Textil t, int quantitat){
        detallTextil.put(t,quantitat);
    }

    public static void afegirElectronic(){
        try{
                Scanner scan = new Scanner(System.in);
                System.out.println("Afegir electrònica");
                System.out.println("Nom producte: ");
                String nom = scan.nextLine();

                System.out.println("Preu: ");
                float preu = scan.nextFloat();
                if (preu < 0) {
                    throw new NegatiuException("El preu no pot ser negatiu");
                }
                scan.nextLine();

                System.out.println("Codi de barres (6 digits): ");
                int codiBarres = scan.nextInt();
                scan.nextLine();

                System.out.println("Garantia (dies): ");
                int garantia = scan.nextInt();

                int cantidad = productes.getOrDefault(nom , 0) + 1;
                Electronica producte = new Electronica(nom, preu, codiBarres, garantia);
                afegirCarro(producte, cantidad);
                System.out.println("Producte afegit correctament");

        }catch (InputMismatchException e) {
            System.out.println("Error: Entrada incorrecta. Introdueix un numero válid.");
        } catch (NegatiuException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void afegirCarro(Electronica e, int quantitat){
        detallElectronica.put(e,quantitat);
    }

    public static void mostrarCarro(){
        System.out.println("Carret de compra:");

        if (detallAlimentacio.isEmpty() && detallTextil.isEmpty() && detallElectronica.isEmpty())  {
            System.out.println("El carro está buit.");
            return;
        }
        System.out.println("\nProductes en el carro:\n");
        for (Map.Entry<Alimentacio, Integer> mostrarAliments : detallAlimentacio.entrySet()){
            Alimentacio aliments = mostrarAliments.getKey();
            System.out.println(aliments.nom + " -> " + mostrarAliments.getValue() );
        }

        for (Map.Entry<Electronica, Integer> mostrarElectronica : detallElectronica.entrySet()){
            Electronica electronica = mostrarElectronica.getKey();
            System.out.println(electronica.nom + " -> " + mostrarElectronica.getValue() );
        }

        for (Map.Entry<Textil, Integer> mostrarTextils : detallTextil.entrySet()){
            Textil textils = mostrarTextils.getKey();
            System.out.println(textils.nom + " -> " + mostrarTextils.getValue() );
        }

    }

    public static void menuTiquet() throws LimitProductesException {
        RegistreTiquet registro = new RegistreTiquet();
        LocalDate today = LocalDate.now();
        System.out.println("--------------------------------------------");
        System.out.println("SAPAMERCAT");
        System.out.println("--------------------------------------------");
        System.out.println(today);
        System.out.println("--------------------------------------------");

        Map<Integer, Object[]> contadorAliments = new HashMap<>();
        Map<Integer, Object[]> contadorElectronica = new HashMap<>();
        Map<Integer, Object[]> contadorTextil = new HashMap<>();

        float totalFactura = 0f;

        detallAlimentacio.forEach((producte, quantitat) -> {
            int codiBarres = producte.getCodi_barres();
            float preuUnitari = ((Alimentacio) producte).calcularData(today, ((Alimentacio) producte).getData_caducitat());
            float totalUnitat = preuUnitari * quantitat;

            contadorAliments.putIfAbsent(codiBarres, new Object[]{producte.getNom(), 0, preuUnitari});
            contadorAliments.put(codiBarres, new Object[]{
                    producte.getNom(),
                    (int) contadorAliments.get(codiBarres)[1] + quantitat,
                    preuUnitari});

        });

        detallElectronica.forEach((producte, quantitat) -> {
            int codiBarres = producte.getCodi_barres();
            float preuUnitari = ((Electronica) producte).calcularData();
            float totalUnitat = preuUnitari * quantitat;

            contadorElectronica.putIfAbsent(codiBarres, new Object[]{producte.getNom(), 0, preuUnitari});
            contadorElectronica.put(codiBarres, new Object[]{
                    producte.getNom(),
                    (int) contadorElectronica.get(codiBarres)[1] + quantitat,
                    preuUnitari});

        });

        detallTextil.forEach((producte, quantitat) -> {
            int codiBarres = producte.getCodi_barres();
            float preuUnitari = producte.getPreu();
            float totalUnitat = preuUnitari * quantitat;

            contadorTextil.putIfAbsent(codiBarres, new Object[]{producte.getNom(), 0, producte.getPreu()});
            contadorTextil.put(codiBarres, new Object[]{
                    producte.getNom(),
                    (int) contadorTextil.get(codiBarres)[1] + quantitat,
                    producte.getPreu()});

        });

        Map<String, Object[]> productes = new HashMap<>();
        contadorAliments.forEach((codiBarres, map) -> {
            String nom = (String) map[0];
            int quantitat = (int) map[1];
            float preuUnitari = (float) map[2];
            productes.put(nom, new Object[]{quantitat, preuUnitari});
        });

        contadorElectronica.forEach((codiBarres, map) -> {
            String nom = (String) map[0];
            int quantitat = (int) map[1];
            float preuUnitari = (float) map[2];
            productes.put(nom, new Object[]{quantitat, preuUnitari});
        });

        contadorTextil.forEach((codiBarres, map) -> {
            String nom = (String) map[0];
            int quantitat = (int) map[1];
            float preuUnitari = (float) map[2];
            productes.put(nom, new Object[]{quantitat, preuUnitari});
        });

        Tiquet tiquet = new Tiquet(today, productes, totalFactura);
        registro.afegirTiquet(tiquet);

        contadorAliments.forEach((codiBarres, map) -> {
            String nom = (String) map[0];
            int quantitat = (int) map[1];
            float preuUnitari = (float) map[2];
            float totalUnitat = preuUnitari * quantitat;

            System.out.printf("%-20s %-5d %-8.2f %-8.2f\n", nom, quantitat, preuUnitari, totalUnitat);
        });

        contadorElectronica.forEach((codiBarres, map) -> {
            String nom = (String) map[0];
            int quantitat = (int) map[1];
            float preuUnitari = (float) map[2];
            float totalUnitat = preuUnitari * quantitat;

            System.out.printf("%-20s %-5d %-8.2f %-8.2f\n", nom, quantitat, preuUnitari, totalUnitat);
        });

        contadorTextil.forEach((codiBarres, map) -> {
            String nom = (String) map[0];
            int quantitat = (int) map[1];
            float preuUnitari = (float) map[2];
            float totalUnitat = preuUnitari * quantitat;

            System.out.printf("%-20s %-5d %-8.2f %-8.2f\n", nom, quantitat, preuUnitari, totalUnitat);
        });

        System.out.println("--------------------------------------------");
        System.out.printf("TOTAL: %.2f €\n", totalFactura);
    }
}

