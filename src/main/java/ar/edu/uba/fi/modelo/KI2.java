package ar.edu.uba.fi.modelo;

public class KI2 {
    private int creditoEnCreditos;

    public KI2(int creditoEnCreditos) {
        this.creditoEnCreditos = creditoEnCreditos;
    }

    private boolean creditosParaKI2() {
        return creditoEnCreditos >= 30;
    }


    public String jugar() {
        if ( !creditosParaKI2() ) {
            throw new SinCredito();
        } else {
            return "Jugando";
        }
    }
}
