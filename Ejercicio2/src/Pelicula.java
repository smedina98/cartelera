
public class Pelicula {

    public static String[] Titulo = new String[99999];
    public static String[] Director;
    public static String[] Comienzo;
    public static String[] Duracion;
    public static int[] Sala;
    public static String[] Terminacion;

    public static String[] getTitulo() {
        return Titulo;
    }

    public static void setTitulo(String[] Titulo) {
        Pelicula.Titulo = Titulo;
    }

    public static String[] getDirector() {
        return Director;
    }

    public static void setDirector(String[] Director) {
        Pelicula.Director = Director;
    }

    public static String[] getComienzo() {
        return Comienzo;
    }

    public static void setComienzo(String[] Comienzo) {
        Pelicula.Comienzo = Comienzo;
    }

    public static String[] getDuracion() {
        return Duracion;
    }

    public static void setDuracion(String[] Duracion) {
        Pelicula.Duracion = Duracion;
    }

    public static int[] getSala() {
        return Sala;
    }

    public static void setSala(int[] Sala) {
        Pelicula.Sala = Sala;
    }

    public static String[] getTerminacion() {
        return Terminacion;
    }

    public static void setTerminacion(String[] Terminacion) {
        Pelicula.Terminacion = Terminacion;
    }

    public void inicializarVector(int n) {
        Titulo = new String[n];
        Director = new String[n];
        Sala = new int[n];
        Comienzo = new String[n];
        Terminacion = new String[n];
        Duracion = new String[n];
    }
}
