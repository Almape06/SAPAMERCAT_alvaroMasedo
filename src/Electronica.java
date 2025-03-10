public class Electronica extends Productes {
    private int garantia;

    public Electronica(String nom, float preu, int codi_barres, int garantia) {
        super(nom, preu, codi_barres);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
}
