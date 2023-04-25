package ar.edu.uba.fi.modelo;

import java.util.ArrayList;

public class Arcade {
    private int creditoEnFichas;
    private int creditoEnCreditos;

    public Arcade() {

    }

    public void agregarFicha(int cantidadFichas) {

        this.creditoEnFichas = cantidadFichas;
    }

    public void agregarCreditos(int cantidadCreditos) {

        this.creditoEnCreditos = cantidadCreditos;
    }

    public String jugarA(String nombreDelJuego) {

        if ( nombreDelJuego.equals("Wonderboy") && this.creditosParaWonderboy()) {
            return "Jugando";
        }

        if ( nombreDelJuego.equals("MK2") && this.creditosParaMK2()) {
            return "Jugando";
        }

        if ( nombreDelJuego.equals("KI2") && this.creditosParaKI2()) {
            return "Jugando";
        }

        throw new SinCredito();

    }

    private boolean creditosParaKI2() {
        return creditoEnCreditos >= 30;
    }

    private boolean creditosParaMK2() {

        return creditoEnFichas >= 2;
    }

    private boolean creditosParaWonderboy() {

        return creditoEnFichas >= 1;
    }

    public void agregarCreditos(String cantidadDeCreditos) {
        this.creditoEnCreditos = this.creditoEnCreditos + Integer.parseInt(cantidadDeCreditos);
    }
}
