package ar.edu.uba.fi.modelo;

public class Credito {
    private int cantidadCreditos;

    public Credito(int cantidadCreditos) {

        this.cantidadCreditos = cantidadCreditos;
    }

    public Credito() {

        this.cantidadCreditos = 0;
    }

    public Credito(String cantidadDeCreditos) {
        this.cantidadCreditos = Integer.parseInt(cantidadDeCreditos);
    }

    public Credito acumular(Credito c) {
        return new Credito(c.cantidadCreditos + cantidadCreditos);
    }

    public int valor() {

        return cantidadCreditos;
    }
}
