package ar.edu.uba.fi.modelo;

public class DineroDigital {
    private int cantidadCreditos;

    public DineroDigital(int cantidadCreditos) {

        this.cantidadCreditos = cantidadCreditos;
    }

    public DineroDigital() {

        this.cantidadCreditos = 0;
    }

    public DineroDigital(String cantidadDeCreditos) {
        this.cantidadCreditos = Integer.parseInt(cantidadDeCreditos);
    }

    public DineroDigital acumular(DineroDigital c) {
        return new DineroDigital(c.cantidadCreditos + cantidadCreditos);
    }

    public int valor() {

        return cantidadCreditos;
    }
}
