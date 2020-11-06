
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
        for (int i = 0; i < Pelicula.Sala.length; i++) {
            /*DateFormat dateF = new SimpleDateFormat("hh:mm:ss");
            Date horaI, horaF;
            horaI = dateF.parse(Pelicula.Comienzo[i]);
            horaF = dateF.parse(Pelicula.Duracion[i]);
            Pelicula.Terminacion[i] = horaI. + horaF;*/

            //String time = "2:00 pm";
            SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
            Date date = df.parse(Pelicula.Comienzo[i]);
            String horas[] = Pelicula.Duracion[i].split(":");
            int horas_aux[] = new int[horas.length];
            for (int j = 0; j < horas_aux.length; j++) {
                horas_aux[j] = Integer.parseInt(horas[j]);
            }
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.HOUR, horas_aux[0]);
            cal.add(Calendar.MINUTE, horas_aux[1]);
            cal.add(Calendar.SECOND, horas_aux[2]);
            String res = "Hora" + cal.get(Calendar.HOUR_OF_DAY) + cal.get(Calendar.MINUTE) + cal.get(Calendar.SECOND);
            System.out.println(res);
        }
    }

    public void ordvectores() throws ParseException {

        for (int k = 0; k < Pelicula.Titulo.length; k++) {
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

    public int[] solucionvoraz() throws ParseException {
        int[] vec = new int[Pelicula.Comienzo.length];
        int posi = 0;
        int vecp = 0;
        vec[vecp] = 0;
        vecp++;
        for (int i = 1; i < Pelicula.Comienzo.length - 1; i++) {
            if (this.comprarhoras(Pelicula.Comienzo[i], Pelicula.Terminacion[posi])) {
                vec[vecp] = i;
                posi++;
                vecp++;
            }
        }
        return vec;
    }
}
