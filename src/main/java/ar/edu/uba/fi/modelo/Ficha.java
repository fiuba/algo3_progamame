package ar.edu.uba.fi.modelo;

public class Ficha extends Credito {
    private int cantidadFichas;

    public Ficha(int cantidadFichas) {

        this.cantidadFichas = cantidadFichas;
    }

    public Ficha() {

        this.cantidadFichas = 0;
    }

    @Override
    public Credito acumular(Credito c) {

        if ( !c.getClass().equals(this.getClass())) {

            return new Ficha();

        }
        Ficha otro = (Ficha) c;

        return new Ficha(otro.cantidadFichas + cantidadFichas);
    }

    public int valor() {
        return cantidadFichas;
    }
}
