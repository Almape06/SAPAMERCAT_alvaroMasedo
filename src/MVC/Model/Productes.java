package MVC.Model;

public abstract class Productes {
    String nom;
    float preu;
    int codi_barres;

    public Productes(String nom, float preu, int codi_barres) {
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
        this.preu = preu;
    }

    public int getCodi_barres() {
        return codi_barres;
    }

    public void setCodi_barres(int codi_barres) {
        this.codi_barres = codi_barres;
    }
}
