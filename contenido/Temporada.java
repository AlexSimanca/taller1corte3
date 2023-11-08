package contenido;

public class Temporada {
    private int cantidadCapitulos;
    private int añoLanzamientoTemporada;
    private String directorTemporada;

    public Temporada(int cantidadCapitulos, int añoLanzamientoTemporada, String directorTemporada) {
        this.cantidadCapitulos = cantidadCapitulos;
        this.añoLanzamientoTemporada = añoLanzamientoTemporada;
        this.directorTemporada = directorTemporada;
    }

    public int getCantidadCapitulos() {
        return cantidadCapitulos;
    }

    public int getAñoLanzamientoTemporada() {
        return añoLanzamientoTemporada;
    }

    public String getDirectorTemporada() {
        return directorTemporada;
    }
}
