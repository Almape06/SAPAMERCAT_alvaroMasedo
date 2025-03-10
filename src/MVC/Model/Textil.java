package MVC.Model;

public class Textil extends Productes {
    private String composicio;

    public Textil(String nom, float preu, int codi_barres, String composicio) {
        super(nom, preu, codi_barres);
        this.composicio = composicio;
    }

    public String getComposicio() {
        return composicio;
    }

    public void setComposicio(String composicio) {
        this.composicio = composicio;
    }
}
