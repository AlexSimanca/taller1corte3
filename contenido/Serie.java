package contenido;

import java.util.List;

public class Serie extends Contenido {
    private int cantidadTemporadas;
    private List<Temporada> temporadas;

    public Serie(String titulo, int añoLanzamiento, int cantidadTemporadas, List<Temporada> temporadas) {
        super(titulo, añoLanzamiento);
        this.cantidadTemporadas = cantidadTemporadas;
        this.temporadas = temporadas;
    }

    @Override
    public void MostrarContenido() {
        System.out.println("Tipo: Serie");
        System.out.println("Título: " + getTitulo());
        System.out.println("Año de lanzamiento: " + getAñoLanzamiento());
        System.out.println("No. de temporadas: " + cantidadTemporadas);

        for (int i = 0; i < cantidadTemporadas; i++) {
            Temporada temporada = temporadas.get(i);
            System.out.println("Temporada " + (i + 1) + ":");
            System.out.println("Capítulos: " + temporada.getCantidadCapitulos());
            System.out.println("Año de lanzamiento: " + temporada.getAñoLanzamientoTemporada());
            System.out.println("Director: " + temporada.getDirectorTemporada());
        }
    }
}
