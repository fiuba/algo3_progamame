package ar.edu.uba.fi.modelo;

public class Ficha {
    private int cantidadFichas;

    public Ficha(int cantidadFichas) {

        this.cantidadFichas = cantidadFichas;
    }

    public Ficha() {

        this.cantidadFichas = 0;
    }

    public Ficha acumular(Ficha f) {
        return new Ficha(f.cantidadFichas + cantidadFichas);
    }

    public int valor() {
        return cantidadFichas;
    }
}
