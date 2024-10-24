package Clases;

import Interfaces.IMetodoPago;

public class PagoTarjetaCredito implements IMetodoPago {

    private String nombre,numTarjeta,fechaExp;
    private double saldo;

    public PagoTarjetaCredito(String nombre, String numTarjeta, String fechaExp) {
        this.nombre = nombre;
        this.numTarjeta = numTarjeta;
        this.fechaExp = fechaExp;
        this.saldo = 100000;
    }

    @Override
    public boolean procesar_pago(double monto) {
        if(monto > saldo){
            return false;
        }
        saldo-=monto;
        return true;
    }

    
    
}
