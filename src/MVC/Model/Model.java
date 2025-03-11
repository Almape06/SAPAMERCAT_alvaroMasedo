package MVC.Model;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Model {
     static List<Productes> magatzem = new LinkedList<>();

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
}

