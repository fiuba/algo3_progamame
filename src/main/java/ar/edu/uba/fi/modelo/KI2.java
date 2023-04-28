package ar.edu.uba.fi.modelo;

public class KI2 extends Juego {
    private int creditoEnCreditos;

    public KI2() {
        super("KI2", 30, 0);
    }

    private boolean creditosParaKI2() {
        return creditoEnCreditos >= 30;
    }


    public String jugar(int creditoEnFichas, int creditoEnCreditos) {
        if (creditoEnCreditos >= 30) {
            return "Jugando";
        } else {
            throw new SinCredito();
        }
    }
}
