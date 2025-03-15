package MVC.Model;
import MVC.Exceptions.DataCaducitatException;

import java.time.LocalDate;
import java.time.Period;


import static java.time.LocalDate.now;

public class Alimentacio extends Productes{
    private LocalDate data_caducitat;


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

    public float calcularData(LocalDate data_actual, LocalDate data_Caducitat){
        data_actual = now();
        Period dies = Period.between(data_Caducitat, data_actual);
        int diesTotals = dies.getDays();

        if (diesTotals < 0){
            return 0;
        } else {
            float preus = getPreu();
            return (preus - getPreu()*(1f/(diesTotals+1)) + (getPreu()*0.1f));
        }
    }

}
