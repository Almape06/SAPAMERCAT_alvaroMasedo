package MVC.Model;

import MVC.Exceptions.CodiBarresIncorrecteException;
import MVC.Exceptions.NegatiuException;

public abstract class Productes {
    String nom;
    float preu;
    int codi_barres;

    public Productes(String nom, float preu, int codi_barres) {
        if (preu < 0) {
            throw new NegatiuException("El preu no pot ser negatiu.");
        }
        if (String.valueOf(codi_barres).length() != 6) {
            throw new CodiBarresIncorrecteException("El codi de barres ha de tenir 6 digits.");
        }
        this.nom = nom;
        this.preu = preu;
        this.codi_barres = codi_barres;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPreu() {
        return preu;
    }

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
        if (String.valueOf(codi_barres).length() != 6) {
            throw new CodiBarresIncorrecteException("El codi de barres ha de tenir 6 digits.");
        }
        this.codi_barres = codi_barres;
    }
}
