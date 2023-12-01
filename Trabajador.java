public class Trabajador {
    private String nombreTrabajador;
    private int cantidadProduccion;
    private Productos producto;

    public Trabajador(String nombreTrabajador, int cantidadProduccion, Productos producto){
        this.nombreTrabajador = nombreTrabajador;
        this.cantidadProduccion = cantidadProduccion;
        this.producto = producto;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public int getCantidadProduccion() {
        return cantidadProduccion;
    }

    public Productos getProducto() {
        return producto;
    }
}
