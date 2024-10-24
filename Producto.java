package Clases;

public abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int stock;
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }

    
    
}
