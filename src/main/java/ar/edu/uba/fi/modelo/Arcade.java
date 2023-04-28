package ar.edu.uba.fi.modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Arcade {
    private final ArrayList<Juego> juegos;
    private int creditoEnFichas;
    private int creditoEnCreditos;

    public Arcade(Juego ...juegos) {

        this.juegos = new ArrayList<Juego>();
        this.juegos.addAll(Arrays.asList(juegos));
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

        for( Juego juego : this.juegos) {
            if (juego.mismoNombre(nombreDelJuego)) {
                return juego.jugar(this.creditoEnFichas, this.creditoEnCreditos);
            }
        }

        throw new SinCredito();

    }

}
