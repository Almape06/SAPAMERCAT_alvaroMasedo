package MVC.Model;
import java.time.LocalDate;
import java.util.Map;

/**
 * Classe que representa un tiquet de compra. El tiquet conté la data de la compra,
 * els productes comprats (emmagatzemats en un mapa) i el total de la compra.
 */
public class Tiquet {
    private LocalDate data;
    private Map<String, Object[]> productes;
    private float total;

    /**
     * Constructor per inicialitzar un tiquet amb la data, els productes i el total.
     * Llença una excepció si la llista de productes està buida o és nul·la.
     *
     * @param data La data de la compra
     * @param productes El mapa de productes amb el nom, la quantitat i el preu unitari
     * @param total El total de la compra
     * @throws IllegalArgumentException Si la llista de productes està buida o és nul·la
     */
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

    /**
     * Mètode que genera una representació en cadena del tiquet de compra.
     *
     * @return Mostra la cadena amb els detalls del tiquet, incloent-hi la data, els productes i el total
     */
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
