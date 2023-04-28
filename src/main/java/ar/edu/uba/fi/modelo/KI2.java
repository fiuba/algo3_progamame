package ar.edu.uba.fi.modelo;

public class KI2 extends Juego {
    private int creditoEnCreditos;

    public KI2() {
        super("KI2", 30, 0);
    }


    public String jugar(Ficha creditoEnFichas, DineroDigital creditoEnCreditos) {
        if (this.creditoEnCreditosNecesarios <= creditoEnCreditos.valor()) {
            return "Jugando";
        } else {
            throw new SinCredito();
        }
    }
}
