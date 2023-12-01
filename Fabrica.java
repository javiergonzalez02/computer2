public class Fabrica {
    private String nombreFabrica;
    private int anoApertura;
    private Trabajador trabajador;

    public Fabrica(String nombreFabrica, int anoApertura, Trabajador trabajador){
        this.nombreFabrica = nombreFabrica;
        this.anoApertura = anoApertura;
        this.trabajador = trabajador;
    }

    public String getNombreFabrica() {
        return nombreFabrica;
    }

    public int getAnoApertura() {
        return anoApertura;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }
}
