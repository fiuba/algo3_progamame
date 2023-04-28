package ar.edu.uba.fi.modelo;

public class KI2 extends Juego {
    private int creditoEnCreditos;

    public KI2(int creditosNecesariosParaJugar) {
        super("KI2", creditosNecesariosParaJugar, 0);
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
