package ar.edu.uba.fi.modelo;

public class MK2 extends Juego {
    private int creditoEnFichas;

    public MK2() {
        super("MK2", 0, 2);
    }

    public String jugar(int creditoEnFichas, int creditoEnCreditos) {
        if ( this.creditoEnFichasNecesarios <= creditoEnFichas ){
            return "Jugando";

        } else{

            throw new SinCredito();
        }

    }
}
