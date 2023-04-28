package ar.edu.uba.fi.modelo;

public class WonderBoy extends Juego {

    public WonderBoy() {
        super("Wonderboy", 0, 1);
    }

    public String jugar(int creditoEnFichas, int creditoEnCreditos) {
        if ( this.creditoEnFichasNecesarios <= creditoEnFichas ){
            return "Jugando";

        } else{

            throw new SinCredito();
        }

    }
}
