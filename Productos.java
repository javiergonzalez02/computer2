public class Productos {
    private String nombreProducto;
    private int cantidadProducto;

    public Productos(String nuevoNombreProducto, int nuevaCantidadProducto) {
        nombreProducto = nuevoNombreProducto;
        cantidadProducto = nuevaCantidadProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }
    
    public void cambiarNombreProducto(String nProducto) {
        nombreProducto = nProducto;
    }

    public void cambiarCantidadProducto(int nCantidadProducto) {
        cantidadProducto = nCantidadProducto;
    }
    
    public void imprimirDetalles(){
        System.out.println("Producto: "+ nombreProducto + ", Cantidad: " + cantidadProducto);
    }
}