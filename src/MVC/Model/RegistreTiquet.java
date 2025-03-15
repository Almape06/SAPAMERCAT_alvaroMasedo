package MVC.Model;
import MVC.Exceptions.LimitProductesException;

import java.util.ArrayList;
import java.util.List;

public class RegistreTiquet {
    private List<Tiquet> tiquets = new ArrayList<>();
    int limitTiquets = 15;

    public void afegirTiquet(Tiquet tiquet) throws LimitProductesException {
        if (tiquets.size() >= limitTiquets) {
            throw new LimitProductesException("S'ha arribat al límit de tiquets");
        }
        tiquets.add(tiquet);
    }

    public void mostrarTiquets() {
        if (tiquets.isEmpty()) {
            System.out.println("No hi ha tiquets per mostrar.");
            return;
        }
        for (Tiquet tiquet : tiquets) {
            System.out.println(tiquet);
        }
    }

    public List<Tiquet> getTiquets() {
        return tiquets;
    }
}
