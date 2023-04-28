package ar.edu.uba.fi.modelo;

public class DineroDigital extends Credito {
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

    public DineroDigital acumular(Credito c) {

        if ( !c.getClass().equals(this.getClass())) {
            return new DineroDigital();
        }

        DineroDigital otro = (DineroDigital) c;

        return new DineroDigital(otro.cantidadCreditos + cantidadCreditos);
    }

    public int valor() {

        return cantidadCreditos;
    }
}
