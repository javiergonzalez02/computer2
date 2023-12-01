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
    
    public void cambiarNombreTrabajador(String nuevoNombreTrabajador){
        nombreTrabajador = nuevoNombreTrabajador;
    }
    
    public void cambiarCantidadProduccion(int nuevaCantidadProduccion){
        cantidadProduccion = nuevaCantidadProduccion;
    }
    
    public void cambiarPlacaBase(Productos nuevoProducto){
        producto = nuevoProducto;
    }

     public void imprimirDetalles(){
        System.out.println("Nombre Trabajador: "+ nombreTrabajador + ", Produccion: " + cantidadProduccion + 
        ", Producto: " + producto.getNombreProducto() + ", Cantidad: " + producto.getCantidadProducto() );
    }
    
}
