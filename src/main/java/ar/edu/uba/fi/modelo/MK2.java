package ar.edu.uba.fi.modelo;

import java.util.ArrayList;

public class MK2 extends Juego {

    public MK2() {

        super("MK2", new Ficha(2));
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
