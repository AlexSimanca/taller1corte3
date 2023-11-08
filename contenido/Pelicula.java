package contenido;

public class Pelicula extends Contenido {
    private String director;
    private double duracion;

    public Pelicula(String titulo, int añoLanzamiento, String director, double duracion) {
        super(titulo, añoLanzamiento);
        this.director = director;
        this.duracion = duracion;
    }

    @Override
    public void MostrarContenido() {
        System.out.println("Tipo: Película");
        System.out.println("Título: " + getTitulo());
        System.out.println("Año de lanzamiento: " + getAñoLanzamiento());
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion + " minutos");
    }
}
