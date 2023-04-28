package ar.edu.uba.fi.modelo;

public class WonderBoy extends Juego {

    public WonderBoy() {
        super("Wonderboy", 0, 1);
    }

    public String jugar(Ficha creditoEnFichas, DineroDigital creditoEnCreditos) {
        if ( this.creditoEnFichasNecesarios <= creditoEnFichas.valor() ){
            return "Jugando";

        } else{

            throw new SinCredito();
        }

    }
}
