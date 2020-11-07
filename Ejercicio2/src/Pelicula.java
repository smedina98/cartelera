
public class Pelicula {

    public static String[] Titulo;
    public static String[] Director;
    public static Tiempo[] Comienzo;
    public static Tiempo[] Duracion;
    public static int[] Sala;
    public static Tiempo[] Terminacion;

    
    public void inicializarVector(int n) {
        Titulo = new String[n];
        Director = new String[n];
        Sala = new int[n];
        Comienzo = new Tiempo[n];
        Terminacion = new Tiempo[n];
        Duracion = new Tiempo[n];
    }
}
