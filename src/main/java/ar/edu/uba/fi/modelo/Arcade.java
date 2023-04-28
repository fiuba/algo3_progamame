package ar.edu.uba.fi.modelo;

public class Arcade {
    private int creditoEnFichas;
    private int creditoEnCreditos;

    public Arcade() {

    }

    public void agregarFicha(int cantidadFichas) {

        this.creditoEnFichas = cantidadFichas;
    }

    public void agregarCreditos(int cantidadCreditos) {

        this.creditoEnCreditos = cantidadCreditos;
    }

    public void agregarCreditos(String cantidadDeCreditos) {

        this.creditoEnCreditos = this.creditoEnCreditos + Integer.parseInt(cantidadDeCreditos);
    }

    public String jugarA(String nombreDelJuego) {

        {
            WonderBoy juego = new WonderBoy(1);
            if (juego.mismoNombre(nombreDelJuego)) {
                return juego.jugar(this.creditoEnFichas, this.creditoEnCreditos);
            }
        }

        {
            MK2 juego = new MK2(2);
            if (juego.mismoNombre(nombreDelJuego)) {
                return juego.jugar(this.creditoEnFichas, this.creditoEnCreditos);
            }
        }

        {
            KI2 juego = new KI2(30);
            if (juego.mismoNombre(nombreDelJuego)) {
                return juego.jugar(this.creditoEnFichas, this.creditoEnCreditos);
            }
        }

        throw new SinCredito();

    }

    private boolean creditosParaKI2() {
        return creditoEnCreditos >= 30;
    }

}
