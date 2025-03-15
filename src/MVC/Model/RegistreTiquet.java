package MVC.Model;
import MVC.Exceptions.LimitProductesException;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa un registre de tiquets. Aquesta classe permet afegir tiquets a la llista
 * i mostrar-los. També estableix un límit de tiquets per evitar que es puguin afegir més tiquets
 * del límit establert.
 */
public class RegistreTiquet {
    private List<Tiquet> tiquets = new ArrayList<>();
    int limitTiquets = 15;   // Límit màxim de tiquets que es poden afegir al registre

    /**
     * Afegeix un tiquet al registre si no s'ha arribat al límit de tiquets.
     * Si s'ha arribat al límit, llança una excepció LimitProductesException.
     *
     * @param tiquet El tiquet a afegir al registre
     * @throws LimitProductesException Si s'ha arribat al límit de tiquets
     */
    public void afegirTiquet(Tiquet tiquet) throws LimitProductesException {
        if (tiquets.size() >= limitTiquets) {
            throw new LimitProductesException("S'ha arribat al límit de tiquets");
        }
        tiquets.add(tiquet);
    }

    /**
     * Mostra tots els tiquets emmagatzemats en el registre.
     * Si no hi ha tiquets, mostra un missatge indicant-ho.
     */
    public void mostrarTiquets() {
        if (tiquets.isEmpty()) {
            System.out.println("No hi ha tiquets per mostrar.");
            return;
        }
        for (Tiquet tiquet : tiquets) {
            System.out.println(tiquet);
        }
    }

    /**
     * Retorna la llista de tiquets.
     *
     * @return La llista de tiquets emmagatzemats
     */
    public List<Tiquet> getTiquets() {
        return tiquets;
    }
}
