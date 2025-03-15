package MVC.Model;

import MVC.Exceptions.LimitCaracteresException;

/**
 * Classe que representa un producte de tipus tèxtil, que hereta de la classe Productes.
 * A més del nom, preu i codi de barres, inclou un atribut extra anomenat "composició" que descriu els materials del producte.
 * La composició té una longitud màxima de 25 caràcters.
 */
public class Textil extends Productes {
    private String composicio;

    /**
     * Constructor de la classe Textil.
     * Inicialitza els atributs del producte tèxtil, incloent la validació de la composició.
     * Llança una excepció si la composició és buida o té més de 25 caràcters.
     *
     * @param nom Nom del producte tèxtil
     * @param preu Preu del producte tèxtil
     * @param codi_barres Codi de barres del producte tèxtil
     * @param composicio Descripció de la composició del producte tèxtil
     * @throws IllegalArgumentException Si la composició és buida
     * @throws LimitCaracteresException Si la composició té més de 25 caràcters
     */
    public Textil(String nom, float preu, int codi_barres, String composicio) {
        super(nom, preu, codi_barres);
        if (composicio == null || composicio.trim().isEmpty()) {
            throw new IllegalArgumentException("La composició no pot ser buida."); //Llança excepció si la composició és buida
        }
        if (composicio.length() > 25) {
            throw new LimitCaracteresException("La composició no pot ser mes gran de 25 caracters.");//Llança excepció si la composició és massa llarga
        }
        this.composicio = composicio;
    }


    public String getComposicio() {
        return composicio;
    }

    public void setComposicio(String composicio) {
        if (composicio == null || composicio.trim().isEmpty()) {
            throw new IllegalArgumentException("La composició no pot ser buida.");//Llança excepció si la composició és buida
        }
        if (composicio.length() > 25) {
            throw new LimitCaracteresException("La composició no pot ser mes gran de 25 caracters."); //Llança excepció si la composició és massa llarga
        }
        this.composicio = composicio;
    }

    @Override
    public String toString() {
        return "Textil{ " +
                ", nom='" + nom + '\'' +
                ", preu=" + preu +
                "€ , codi_barres=" + codi_barres +
                " composicio='" + composicio + '\'' +
                " }";
    }
}
