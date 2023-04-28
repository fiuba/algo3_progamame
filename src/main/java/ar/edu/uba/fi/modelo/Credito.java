package ar.edu.uba.fi.modelo;

public abstract class Credito {
    public abstract Credito acumular(Credito otro);

    public abstract int valor();

    public abstract boolean menorOIgual(Credito otro);

}
