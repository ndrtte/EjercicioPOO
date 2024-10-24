package Clases;

import Interfaces.IMetodoPago;

public class PagoPayPal implements IMetodoPago{
    private String nombre, email;
    private double saldo;
    public PagoPayPal(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
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
