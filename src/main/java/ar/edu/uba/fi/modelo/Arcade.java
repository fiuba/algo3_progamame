package ar.edu.uba.fi.modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Arcade {
    private final ArrayList<Juego> juegos;
    private final ArrayList<Ficha> creditoEnFichas;
    private final ArrayList<DineroDigital> creditoEnCreditos;

    public Arcade(Juego ...juegos) {

        this.juegos = new ArrayList<>();
        this.juegos.addAll(Arrays.asList(juegos));

        this.creditoEnFichas = new ArrayList<>();
        this.creditoEnCreditos = new ArrayList<>();
    }

    public void agregarFicha(int cantidadFichas) {

        this.creditoEnFichas.add(new Ficha(cantidadFichas));
    }

    public void agregarCreditos(int cantidadCreditos) {

        this.creditoEnCreditos.add(new DineroDigital(cantidadCreditos));
    }

    public void agregarCreditos(String cantidadDeCreditos) {

        this.creditoEnCreditos.add(new DineroDigital(cantidadDeCreditos));
    }

    public String jugarA(String nombreDelJuego) {

        for( Juego juego : this.juegos) {
            if (juego.mismoNombre(nombreDelJuego)) {
                return juego.jugar(totalCreditosEnFichas(), totalCreditosEnCreditos());
            }
        }

        throw new SinCredito();

    }

    private int totalCreditosEnCreditos() {
        DineroDigital total = new DineroDigital();

        for(DineroDigital c : this.creditoEnCreditos) {
            total = total.acumular(c);
        }
        return total.valor();
    }

    private int totalCreditosEnFichas() {
        Ficha total = new Ficha();

        for(Ficha f : this.creditoEnFichas) {
            total = total.acumular(f);
        }
        return total.valor();
    }

}
