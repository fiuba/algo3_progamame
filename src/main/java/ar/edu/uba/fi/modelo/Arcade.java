package ar.edu.uba.fi.modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Arcade {
    private final ArrayList<Juego> juegos;
    private final ArrayList<Credito> creditos;

    public Arcade(Juego ...juegos) {

        this.juegos = new ArrayList<>();
        this.juegos.addAll(Arrays.asList(juegos));

        this.creditos = new ArrayList<>();
    }

    public void agregarFicha(int cantidadFichas) {

        creditos.add(new Ficha(cantidadFichas));
    }

    public void agregarCreditos(int cantidadCreditos) {

        creditos.add(new DineroDigital(cantidadCreditos));
    }

    public void agregarCreditos(String cantidadDeCreditos) {

        creditos.add(new DineroDigital(cantidadDeCreditos));
    }

    public String jugarA(String nombreDelJuego) {

        for( Juego juego : this.juegos) {
            if (juego.mismoNombre(nombreDelJuego)) {
                return juego.jugar(this.creditos);
            }
        }

        throw new SinCredito();

    }


}
