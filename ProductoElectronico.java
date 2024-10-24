package Clases;

public class ProductoElectronico extends Producto {

    private int garantia;

    public ProductoElectronico(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
        this.stock = 4;
    }

    
    

}
