package MVC.Model;
import java.time.LocalDate;
import java.util.Map;

public class Tiquet {
    private LocalDate data;
    private Map<String, Object[]> productes;
    private float total;

    public Tiquet(LocalDate data, Map<String, Object[]> productes, float total) {
        if (productes == null || productes.isEmpty()) {
            throw new IllegalArgumentException("El ha de contenir almenys un producte.");
        }
        this.data = data;
        this.productes = productes;
        this.total = total;
    }

    public LocalDate getData() {
        return data;
    }

    public Map<String, Object[]> getProductes() {
        return productes;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public String toString() {
        String tiquetMostrar = "Tiquet de compra - Data: " + data + "\n";
        for (Map.Entry<String, Object[]> producte : productes.entrySet()) {
            String nom = producte.getKey();
            int quantitat = (int) producte.getValue()[0];
            float preuUnitari = (float) producte.getValue()[1];
            tiquetMostrar += nom + ": " + quantitat + " x " + preuUnitari + " €\n";
        }
        tiquetMostrar += "TOTAL: " + total + " €";
        return tiquetMostrar;
    }
}
