package ar.edu.uba.fi.modelo;

import java.util.ArrayList;

public class KI2 extends Juego {
    private int creditoEnCreditos;

    public KI2() {
        super("KI2", 30, 0);
    }


    @Override
    public String jugar(ArrayList<Credito> creditos) {

        if (this.creditoEnCreditosNecesarios <= totalCreditosEnCreditos(creditos).valor()) {
            return "Jugando";
        } else {
            throw new SinCredito();
        }

    }

    private Credito totalCreditosEnCreditos(ArrayList<Credito> creditos) {
        Credito total = new DineroDigital();

        for(Credito c : creditos) {
            total = total.acumular(c);
        }
        return total;
    }

}
