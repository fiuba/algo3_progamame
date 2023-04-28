package ar.edu.uba.fi.modelo;

import java.util.ArrayList;

public abstract class Juego {
    private String nombre;
    protected int creditoEnCreditosNecesarios;
    protected int creditoEnFichasNecesarios;

    public Juego(String nombre, int creditoEnCreditosNecesarios, int creditoEnFichasNecesarios) {
        this.nombre = nombre;
        this.creditoEnCreditosNecesarios = creditoEnCreditosNecesarios;
        this.creditoEnFichasNecesarios = creditoEnFichasNecesarios;
    }

    public boolean mismoNombre(String nombre) {

        return this.nombre.equals(nombre);
    }

    public abstract String jugar(ArrayList<Credito> creditos);
}
