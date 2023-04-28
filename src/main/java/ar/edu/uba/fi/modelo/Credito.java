package ar.edu.uba.fi.modelo;

public interface Credito {
    Credito acumular(Credito otro);

    boolean menorOIgual(Credito otro);

}
