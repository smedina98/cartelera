
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pelicula {

    public static String[] Titulo;
    public static String[] Director;
    public static Tiempo[] Comienzo;
    public static Tiempo[] Duracion;
    public static int[] Sala;
    public static Tiempo[] Terminacion;
    public static Tiempo[] ord;

    public void cargarterminacion() throws ParseException {
        for (int i = 0; i < this.Titulo.length; i++) {
            Tiempo temp = new Tiempo();
            temp = temp.sumarhoras(Comienzo[i], Duracion[i]);
            this.Terminacion[i] = temp;
        }
    }

    public void ordvectores() throws ParseException {
        Tiempo tiempito = new Tiempo();
        for (int k = 0; k < this.Titulo.length; k++) {
            for (int f = 0; f < this.Titulo.length - 1 - k; f++) {
                if (tiempito.comprarhoras(this.Comienzo[f].devolvercadena(), this.Comienzo[f + 1].devolvercadena())) {
                } else {
                    String auxcomienzo;
                    auxcomienzo = this.Comienzo[f].devolvercadena();
                    this.Comienzo[f] = this.Comienzo[f + 1];
                    Tiempo temp = new Tiempo();
                    temp.setcadena(auxcomienzo);
                    this.Comienzo[f + 1] = temp;
                    //--
                    String auxtitulo;
                    auxtitulo = this.Titulo[f];
                    this.Titulo[f] = this.Titulo[f + 1];
                    this.Titulo[f + 1] = auxtitulo;
                    //--
                    String auxdirector;
                    auxdirector = this.Director[f];
                    this.Director[f] = this.Director[f + 1];
                    this.Director[f + 1] = auxdirector;
                    //--
                    int auxsala;
                    auxsala = this.Sala[f];
                    this.Sala[f] = this.Sala[f + 1];
                    this.Sala[f + 1] = auxsala;
                    //--
                    String auxduracion;
                    auxduracion = this.Duracion[f].devolvercadena();
                    this.Duracion[f] = this.Duracion[f + 1];
                    Tiempo temp2 = new Tiempo();
                    temp2.setcadena(auxduracion);
                    this.Duracion[f + 1] = temp2;

                }
            }
        }
    }

    public int[] solucionvoraz(int[] vecter) throws ParseException {
        int[] vec = new int[this.Comienzo.length];
        Tiempo tiempito = new Tiempo();
        int posi = 0;
        vec[0] = 0;
        for (int i = 1; i < this.Comienzo.length - 1; i++) {
            if (tiempito.comprarhoras(this.Terminacion[vecter[posi]].devolvercadena(), this.Comienzo[vecter[i]].devolvercadena())) {
                vec[i] = vecter[i];
                posi = vecter[i];

            } else {
                vec[i] = -1;
            }
        }
        return vec;
    }

    public int[] ordtermincacion() throws ParseException {
        int[] vec = new int[this.Comienzo.length];
         Tiempo tiempito = new Tiempo();
        Tiempo[] temp = new Tiempo[this.Comienzo.length];
        for (int i = 0; i < vec.length; i++) {
            temp[i] = Pelicula.Terminacion[i];
        }

        for (int i = 0; i < vec.length; i++) {

            vec[i] = i;
        }

        for (int k = 0; k < this.Titulo.length; k++) {
            for (int f = 0; f < this.Titulo.length - 1 - k; f++) {
                if (tiempito.comprarhoras(temp[f].devolvercadena(), temp[f + 1].devolvercadena())) {
                } else {

                    String auxduracion;
                    auxduracion = temp[f].devolvercadena();
                    temp[f] = temp[f + 1];
                    Tiempo temp2 = new Tiempo();
                    temp2.setcadena(auxduracion);
                    temp[f + 1] = temp2;

                    int tempp;
                    tempp = vec[f];
                    vec[f] = vec[f + 1];
                    vec[f + 1] = tempp;

                }
            }
        }

        return vec;
    }

    public void inicializarVector(int n) {
        Titulo = new String[n];
        Director = new String[n];
        Sala = new int[n];
        Comienzo = new Tiempo[n];
        Terminacion = new Tiempo[n];
        Duracion = new Tiempo[n];
    }
}
