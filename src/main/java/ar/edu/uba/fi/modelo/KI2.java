package ar.edu.uba.fi.modelo;

import java.util.ArrayList;

public class KI2 extends Juego {

    public KI2() {

        super("KI2", new DineroDigital(30));
    }


    @Override
    public String jugar(ArrayList<Credito> creditos) {

        if ( this.creditoEnCreditosNecesarios().menorOIgual(totalCreditosEnCreditos(creditos)) ){

            return "Jugando";
        } else {

            throw new SinCredito();
        }

    }

}
