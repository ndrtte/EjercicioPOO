package Clases;

import java.util.LinkedList;

import Interfaces.IMetodoPago;

public class Pedidos {
    LinkedList <Producto> listaDeProductos = new LinkedList<>();
    double total=0;
    public void agregar_producto(Producto producto,int cantidad){
        if(producto instanceof ProductoAlimenticio){
            if(((ProductoAlimenticio) producto).getFecha_expiracion()<23){
                System.out.println("No se puede agregar el producto porque ya expiro.");
            }
            else{
                int i=1;
                while (i < cantidad){
                listaDeProductos.add(producto);
                i++;}
            }
        }
        else{
            int i=1;
            while (i < cantidad){
            listaDeProductos.add(producto);
            i++;
        }
        }
    }

    public double calcular_total(){
        if (listaDeProductos == null){
            this.total = 0;
        }
        else{
            for (Producto producto : listaDeProductos) {
                this.total+=producto.getPrecio();
            }
        }
        return this.total;
    }

    public void procesar_pedido(IMetodoPago metodo_pago) {
        if (metodo_pago.procesar_pago(calcular_total())){
            metodo_pago.procesar_pago(calcular_total());
            listaDeProductos.clear();
            System.out.println("El pedido ha sido completado");
        }
        else{
            System.out.println("El pedido no se puedo realizar, saldo insuficientes.");
        }
    }
}
