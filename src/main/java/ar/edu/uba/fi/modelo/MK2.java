package ar.edu.uba.fi.modelo;

public class MK2 extends Juego {

    public MK2() {
        super("MK2", 0, 2);
    }

    public String jugar(Ficha creditoEnFichas, DineroDigital creditoEnCreditos) {
        if ( this.creditoEnFichasNecesarios <= creditoEnFichas.valor() ){
            return "Jugando";

        } else{

            throw new SinCredito();
        }

    }
}
