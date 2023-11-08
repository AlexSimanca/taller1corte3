import contenido.Contenido;
import contenido.Pelicula;
import contenido.Serie;
import contenido.Temporada;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contenido> listaContenidos = new ArrayList<>();

        Pelicula pelicula1 = new Pelicula("Encanto", 2021, "Byron Howard, Jared Bush", 109);

        Temporada temporada1 = new Temporada(18, 2018, "Seth Gordon");
        List<Temporada> temporadasSerie1 = new ArrayList<>();
        temporadasSerie1.add(temporada1);

        Serie serie1 = new Serie("The Good Doctor", 2018, 1, temporadasSerie1);

        listaContenidos.add(pelicula1);
        listaContenidos.add(serie1);

        for (Contenido contenido : listaContenidos) {
            contenido.MostrarContenido();
            System.out.println();
        }
    }
}
