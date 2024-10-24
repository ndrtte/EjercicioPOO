import java.lang.module.Configuration;
import java.util.ArrayList;

import Clases.ConfiguracionTienda;
import Clases.Pedidos;
import Clases.Producto;
import Clases.ProductoAlimenticio;
import Clases.ProductoElectronico;

public class App {
    public static void main(String[] args) throws Exception {
      Producto producto1 = new ProductoAlimenticio("Doritos",300,22);
      Producto producto2 = new ProductoElectronico("Samsung S24", 50000, 30);

      ArrayList <Producto> productos = new ArrayList<>();
      productos.add(producto1);
      productos.add(producto2);

      Pedidos pedido = new Pedidos();
      pedido.agregar_producto(producto1, 2);
      
      Pedidos pedido2 = new Pedidos();
      pedido2.agregar_producto(producto2, 3);
      
        System.out.println("El total es: "+pedido.calcular_total());
        System.out.println("El total del pedido: "+pedido2.calcular_total());
      

      ConfiguracionTienda ct = ConfiguracionTienda.getInstancia();
      ct.setNombreTienda("Walmart");
      ct.setMoneda("Lempiras");
      ct.setDireccion("Cascadas Mall Primer piso.");
      System.out.println(ct.toString());

    }
}
