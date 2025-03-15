package MVC.Model;

import MVC.Exceptions.NegatiuException;

/**
 * Classe que representa un producte electrònic, que hereta de la classe Productes.
 * A més del nom, preu i codi de barres, inclou un atribut addicional anomenat "garantia",
 * que indica el període de garantia del producte en dies.
 * La garantia ha de ser un valor positiu i inferior o igual a 3650 dies (10 anys).
 */
public class Electronica extends Productes{
    private int garantia;

    /**
     * Constructor de la classe Electronica.
     * Inicialitza els atributs del producte electrònic, incloent la validació de la garantia.
     * Llança una excepció si la garantia és menor o igual a 0 o superior a 3650 dies.
     *
     * @param nom Nom del producte electrònic
     * @param preu Preu del producte electrònic
     * @param codi_barres Codi de barres del producte electrònic
     * @param garantia Durada de la garantia en dies
     * @throws NegatiuException Si la garantia no és positiva o supera els 3650 dies
     */
    public Electronica(String nom, float preu, int codi_barres, int garantia) {
        super(nom, preu, codi_barres);
        if (garantia <= 0 || garantia > 3650) {
            throw new NegatiuException("La ha de ser un valor positiu");
        }
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }


    /**
     * Estableix la durada de la garantia del producte electrònic.
     * Llança excepció si la garantia no és un valor positiu o superior a 3650 dies.
     *
     * @param garantia Durada de la garantia en dies
     * @throws NegatiuException Si la garantia no és positiva o supera els 3650 dies
     */
    public void setGarantia(int garantia) {
        if (garantia <= 0 || garantia > 3650) {
            throw new NegatiuException("La ha de ser un valor positiu");
        }
        this.garantia = garantia;
    }

    /**
     * Calcula el preu ajustat segons la durada de la garantia.
     * El preu es redueix en un 10% per cada any de garantia.
     *
     * @return Preu ajustat del producte electrònic després d'aplicar la reducció per garantia
     */
    public float calcularData(){
        float preus = getPreu();
        return preus - getPreu()*(garantia/365)*0.1f;
    }

    @Override
    public String toString() {
        return "Electronica{" +
                "garantia=" + garantia +
                ", nom='" + nom + '\'' +
                ", preu=" + preu +
                ", codi_barres=" + codi_barres +
                '}';
    }
}
