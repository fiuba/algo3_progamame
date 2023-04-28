package ar.edu.uba.fi.modelo;

import java.util.ArrayList;

public class WonderBoy extends Juego {

    public WonderBoy() {

        super("Wonderboy", new Ficha(1));
    }

    @Override
    public String jugar(ArrayList<Credito> creditos) {

        if ( this.creditoEnFichasNecesarios().menorOIgual(totalCreditosEnFichas(creditos)) ){

            return "Jugando";
        } else{

            throw new SinCredito();
        }
    }

}
