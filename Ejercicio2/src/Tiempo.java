
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tiempo {

    public int horas;
    public int minutos;
    public int segundos;

    public Tiempo() {
    }

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String devolvercadena() {
        String aux = "";
        if (this.horas < 10) {
            aux += "0" + this.horas;
        } else {
            aux += this.horas;
        }
        aux += ":";
        if (this.minutos < 10) {
            aux += "0" + this.minutos;
        } else {
            aux += this.minutos;
        }
        aux += ":";
        if (this.segundos < 10) {
            aux += "0" + this.segundos;
        } else {
            aux += this.segundos;
        }
        return aux;
    }

    public void setcadena(String aux) {
        String tiempo[] = aux.split(":");
        this.setHoras(Integer.parseInt(tiempo[0]));
        this.setMinutos(Integer.parseInt(tiempo[1]));
        this.setSegundos(Integer.parseInt(tiempo[2]));
    }

    public boolean comprarhoras(String uno, String dos) throws ParseException {
        DateFormat dateF = new SimpleDateFormat("HH:mm:ss");
        Date horaI, horaF;
        horaI = dateF.parse(uno);
        horaF = dateF.parse(dos);
        if (horaF.compareTo(horaI) < 0) {
            return false;
        } else {
            return true;
        }

    }

    public Tiempo sumarhoras(Tiempo uno, Tiempo dos) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
        Date date = df.parse(uno.devolvercadena());
        String horas[] = dos.devolvercadena().split(":");
        int horas_aux[] = new int[horas.length];
        for (int j = 0; j < horas_aux.length; j++) {
            horas_aux[j] = Integer.parseInt(horas[j]);
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, horas_aux[0]);
        cal.add(Calendar.MINUTE, horas_aux[1]);
        cal.add(Calendar.SECOND, horas_aux[2]);
        Tiempo temp = new Tiempo();
        temp.setcadena((cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND)));
        return temp;
    }

}
