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
    
    public void cambiarNombreFabrica(String nuevoNombreFabrica){
        nombreFabrica = nuevoNombreFabrica;
    }
    
    public void cambiarCantidadProduccion(int nuevoAnoapertura){
        anoApertura = nuevoAnoapertura;
    }
    
    public void cambiarPlacaBase(Trabajador nuevoTrabajador){
        trabajador = nuevoTrabajador;
    }

     public void imprimirDetalles(){
        System.out.println("Fabrica: "+ nombreFabrica + ", Ano Apertura: " + anoApertura + 
        ", Trabajador: " + trabajador.getNombreTrabajador() + " , Produccion: " + 
        trabajador.getCantidadProduccion());
    }
}
