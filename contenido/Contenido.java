package contenido;

public abstract class Contenido {
    private String titulo;
    private int añoLanzamiento;

    public Contenido(String titulo, int añoLanzamiento) {
        this.titulo = titulo;
        this.añoLanzamiento = añoLanzamiento;
    }

    public abstract void MostrarContenido();

    public String getTitulo() {
        return titulo;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }
}
