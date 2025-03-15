package MVC.Model;

import MVC.Exceptions.LimitCaracteresException;

public class Textil extends Productes {
    private String composicio;

    public Textil(String nom, float preu, int codi_barres, String composicio) {
        super(nom, preu, codi_barres);
        if (composicio == null || composicio.trim().isEmpty()) {
            throw new IllegalArgumentException("La composició no pot ser buida.");
        }
        if (composicio.length() > 25) {
            throw new LimitCaracteresException("La composició no pot ser mes gran de 25 caracters.");
        }
        this.composicio = composicio;
    }

    public String getComposicio() {
        return composicio;
    }

    public void setComposicio(String composicio) {
        if (composicio == null || composicio.trim().isEmpty()) {
            throw new IllegalArgumentException("La composició no pot ser buida.");
        }
        if (composicio.length() > 25) {
            throw new LimitCaracteresException("La composició no pot ser mes gran de 25 caracters.");
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
