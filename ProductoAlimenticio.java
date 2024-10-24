package Clases;

public class ProductoAlimenticio extends Producto{
    private int fecha_expiracion;

    public ProductoAlimenticio(String nombre, double precio, int fecha_expiracion) {
        super(nombre, precio);
        this.fecha_expiracion = fecha_expiracion;
        this.stock = 5;
    }

    public int getFecha_expiracion() {
        return fecha_expiracion;
    }
}
