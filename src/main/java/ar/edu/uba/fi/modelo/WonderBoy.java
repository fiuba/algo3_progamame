package ar.edu.uba.fi.modelo;

public class WonderBoy extends Juego {

    public WonderBoy(int creditosEnFichasNecesarios) {
        super("Wonderboy", 0, creditosEnFichasNecesarios);
    }

    public String jugar(int creditoEnFichas) {
        if ( this.creditoEnFichasNecesarios <= creditoEnFichas ){
            return "Jugando";

        } else{

            throw new SinCredito();
        }

    }
}
