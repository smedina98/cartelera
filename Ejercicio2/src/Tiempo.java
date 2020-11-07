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
    
    public void setcadena(String aux)
    {
        String tiempo[] = aux.split(":");
        this.setHoras(Integer.parseInt(tiempo[0]));
        this.setMinutos(Integer.parseInt(tiempo[1]));
        this.setSegundos(Integer.parseInt(tiempo[2]));
    }

}
