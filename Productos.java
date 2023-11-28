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

}