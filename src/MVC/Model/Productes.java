package MVC.Model;

import MVC.Exceptions.NegatiuException;

/**
 * Classe abstracta que representa un producte.
 * Els productes tindran un nom, un preu i un codi de barres.
 * Aquesta classe serveix com a base per a productes més concrets.
 */
public abstract class Productes {

    //Atributs de la classe Productes
    String nom;
    float preu;
    int codi_barres;

    /**
     * Constructor de la classe Productes.
     * Inicialitza els atributs del producte, llançant una excepció si el preu és negatiu.
     *
     * @param nom Nom del producte
     * @param preu Preu del producte
     * @param codi_barres Codi de barres del producte
     * @throws NegatiuException Si el preu és negatiu
     */
    public Productes(String nom, float preu, int codi_barres) {
        if (preu < 0) {
            throw new NegatiuException("El preu no pot ser negatiu.");
        }
        this.nom = nom;
        this.preu = preu;
        this.codi_barres = codi_barres;
    }

    //Métodes getters i setters per accedir i modificar els atributs

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPreu() {
        return preu;
    }

    /**
     * Estableix el preu del producte.
     * Si el preu és negatiu, llança una excepció.
     *
     * @param preu Preu del producte
     * @throws NegatiuException Si el preu és negatiu
     */
    public void setPreu(float preu) {
        if (preu < 0) {
            throw new NegatiuException("El preu no pot ser negatiu.");
        }
        this.preu = preu;
    }

    public int getCodi_barres() {
        return codi_barres;
    }

    public void setCodi_barres(int codi_barres) {
        this.codi_barres = codi_barres;
    }
}
