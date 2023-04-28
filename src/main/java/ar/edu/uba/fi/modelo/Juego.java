package ar.edu.uba.fi.modelo;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Juego {
    private String nombre;

    private ArrayList<Credito> creditoNecesarioParaJugar;

    public Juego(String nombre, Credito ...creditoNecesarioParaJugar) {

        this.nombre = nombre;
        this.creditoNecesarioParaJugar = new ArrayList<>();
        this.creditoNecesarioParaJugar.addAll(Arrays.asList(creditoNecesarioParaJugar));
    }

    public boolean mismoNombre(String nombre) {

        return this.nombre.equals(nombre);
    }

    public abstract String jugar(ArrayList<Credito> creditos);

    protected Credito creditoEnFichasNecesarios() {
        return totalCreditosEnFichas(creditoNecesarioParaJugar);
    }

    protected Credito creditoEnCreditosNecesarios() {
        return this.totalCreditosEnCreditos(creditoNecesarioParaJugar);
    }

    protected Credito totalCreditosEnFichas(ArrayList<Credito> creditos) {
        Credito total = new Ficha();

        for(Credito f : creditos) {
            total = total.acumular(f);
        }
        return total;
    }

    protected Credito totalCreditosEnCreditos(ArrayList<Credito> creditos) {
        Credito total = new DineroDigital();

        for(Credito c : creditos) {
            total = total.acumular(c);
        }
        return total;
    }
}
