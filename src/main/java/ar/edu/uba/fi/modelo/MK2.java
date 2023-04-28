package ar.edu.uba.fi.modelo;

import java.util.ArrayList;

public class MK2 extends Juego {

    public MK2() {
        super("MK2", 0, 2);
    }

    @Override
    public String jugar(ArrayList<Credito> creditos) {
        if ( this.creditoEnFichasNecesarios <= totalCreditosEnFichas(creditos).valor() ){
            return "Jugando";

        } else{

            throw new SinCredito();
        }
    }

    private Credito totalCreditosEnFichas(ArrayList<Credito> creditos) {
        Credito total = new Ficha();

        for(Credito f : creditos) {
            total = total.acumular(f);
        }
        return total;
    }


}
