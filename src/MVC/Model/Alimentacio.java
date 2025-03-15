package MVC.Model;
import MVC.Exceptions.DataCaducitatException;

import java.time.LocalDate;
import java.time.Period;


import static java.time.LocalDate.now;

/**
 * Classe que representa un producte d'alimentació, que hereta de la classe Productes.
 * A més del nom, preu i codi de barres, inclou un atribut addicional anomenat "data_caducitat",
 * que indica la data de caducitat del producte alimentari.
 * La data de caducitat ha de ser posterior a la data actual.
 */
public class Alimentacio extends Productes{
    private LocalDate data_caducitat;

    /**
     * Constructor de la classe Alimentacio.
     * Inicialitza els atributs del producte d'alimentació, incloent la validació de la data de caducitat.
     * Llança una excepció si la data de caducitat és anterior a la data actual.
     *
     * @param nom Nom del producte d'alimentació
     * @param preu Preu del producte d'alimentació
     * @param codi_barres Codi de barres del producte d'alimentació
     * @param data_caducitat Data de caducitat del producte d'alimentació
     * @throws DataCaducitatException Si la data de caducitat és anterior a la data actual
     */
    public Alimentacio(String nom, float preu, int codi_barres, LocalDate data_caducitat) {
        super(nom, preu, codi_barres);
        if (data_caducitat.isBefore(now())) {
            throw new DataCaducitatException("La data de caducitat no pot ser anterior a la data actual.");
        }
        this.data_caducitat = data_caducitat;
    }

    public LocalDate getData_caducitat() {
        return data_caducitat;
    }

    /**
     * Estableix la data de caducitat del producte d'alimentació.
     * Llança excepció si la data de caducitat és anterior a la data actual.
     *
     * @param data_caducitat Data de caducitat del producte d'alimentació
     * @throws DataCaducitatException Si la data de caducitat és anterior a la data actual
     */
    public void setData_caducitat(LocalDate data_caducitat) {
        if (data_caducitat.isBefore(now())) {
            throw new DataCaducitatException("La data de caducitat no pot ser anterior a la data actual.");
        }
        this.data_caducitat = data_caducitat;
    }

    @Override
    public String toString() {
        return "Alimentacio{ " +
                " nom= '" + nom + '\'' +
                ", preu= " + preu +
                "€ , codi_barres= " + codi_barres +
                " data_caducitat= " + data_caducitat +
                " }";
    }


    /**
     * Calcula el preu ajustat en funció de la data de caducitat del producte d'alimentació.
     * Si el producte ja ha caducat, retorna 0. Si no ha caducat, ajusta el preu tenint en compte els dies restants
     * abans de la caducitat. Si el producte té molts dies restants fins a la caducitat, es fa una reducció proporcional.
     *
     * @param data_actual Data actual
     * @param data_Caducitat Data de caducitat del producte
     * @return Preu ajustat segons els dies restants abans de la caducitat
     */
    public float calcularData(LocalDate data_actual, LocalDate data_Caducitat){
        data_actual = now(); //Obtenció de la data actual
        Period dies = Period.between(data_Caducitat, data_actual); //Calcula la diferencia entre la data de caducitat i la data actual
        int diesTotals = dies.getDays(); //Obté la cuantitat total en dies

        if (diesTotals < 0){
            return 0;
        } else {
            float preus = getPreu();
            // El preu es redueix proporcionalment segons els dies restants abans de la caducitat, amb un ajust addicional del 10%
            return (preus - getPreu()*(1f/(diesTotals+1)) + (getPreu()*0.1f));
        }
    }

}
