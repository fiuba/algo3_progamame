package ar.edu.uba.fi.modelo;

public abstract class Juego {
    private String nombre;
    protected int creditoEnCreditosNecesarios;
    protected int creditoEnFichasNecesarios;

    public Juego(String nombre, int creditoEnCreditosNecesarios, int creditoEnFichasNecesarios) {
        this.nombre = nombre;
        this.creditoEnCreditosNecesarios = creditoEnCreditosNecesarios;
        this.creditoEnFichasNecesarios = creditoEnFichasNecesarios;
    }

    public abstract String jugar(int creditoEnFichas);

    public boolean mismoNombre(String nombre) {

        return this.nombre.equals(nombre);
    }
}
