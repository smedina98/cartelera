
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Sebastián Medina
 */
public class AlgoritmoVoraz {

    public boolean comprarhoras(String uno, String dos) throws ParseException {
        DateFormat dateF = new SimpleDateFormat("HH:mm:ss");
        Date horaI, horaF;
        horaI = dateF.parse(uno);
        horaF = dateF.parse(dos);
        if (horaF.compareTo(horaI) < -1) {
            return false;
        } else {
            return true;
        }

    }

    public void cargarterminacion() throws ParseException {
        for (int i = 0; i < Pelicula.Titulo.length; i++) {
            DateFormat dateF = new SimpleDateFormat("HH:mm:ss");
            Date horaI, horaF;
            horaI = dateF.parse(Pelicula.Comienzo[i]);
            horaF = dateF.parse(Pelicula.Duracion[i]);
            //Pelicula.Terminacion[i] = horaI. + horaF;
        }
    }

    public void ordvectores() throws ParseException {

            for (int f = 0; f < Pelicula.Titulo.length - 1 - k; f++) {
                if (this.comprarhoras(Pelicula.Comienzo[f], Pelicula.Comienzo[f + 1])) {
                } else {
                    String auxcomienzo;
                    auxcomienzo = Pelicula.Comienzo[f];
                    Pelicula.Comienzo[f] = Pelicula.Comienzo[f + 1];
                    Pelicula.Comienzo[f + 1] = auxcomienzo;
                    //--
                    String auxtitulo;
                    auxtitulo = Pelicula.Titulo[f];
                    Pelicula.Titulo[f] = Pelicula.Titulo[f + 1];
                    Pelicula.Titulo[f + 1] = auxtitulo;
                    //--
                    String auxdirector;
                    auxdirector = Pelicula.Director[f];
                    Pelicula.Director[f] = Pelicula.Director[f + 1];
                    Pelicula.Director[f + 1] = auxdirector;
                    //--
                    int auxsala;
                    auxsala = Pelicula.Sala[f];
                    Pelicula.Sala[f] = Pelicula.Sala[f + 1];
                    Pelicula.Sala[f + 1] = auxsala;
                    //--
                    String auxduracion;
                    auxduracion = Pelicula.Duracion[f];
                    Pelicula.Duracion[f] = Pelicula.Duracion[f + 1];
                    Pelicula.Duracion[f + 1] = auxduracion;

                }
            }
        }
    }
    //--------------------------------------------------------------------------
    public int[] solucionvoraz() throws ParseException
    {
        int[] vec = new int[Pelicula.Comienzo.length];
        int posi=0;
        int vecp=0;
        vec[vecp]=0; 
        vecp++;
        for (int i = 1; i < Pelicula.Comienzo.length-1; i++) {
            if (this.comprarhoras(Pelicula.Comienzo[i],Pelicula.Terminacion[posi])) {
                vec[vecp]=i;                
                posi++;
                vecp++;
            }
        }
        return vec;
    }

}
