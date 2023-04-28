package ar.edu.uba.fi.modelo;

public class MK2 extends Juego {
    private int creditoEnFichas;

    public MK2(int creditosEnFichasParaPoderJugar) {
        super("MK2", 0, creditosEnFichasParaPoderJugar);
    }

    public String jugar(int creditoEnFichas) {
        if ( this.creditoEnFichasNecesarios <= creditoEnFichas ){
            return "Jugando";

        } else{

            throw new SinCredito();
        }

    }
}
