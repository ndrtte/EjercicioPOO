package Clases;

public class ConfiguracionTienda {

    private String nombreTienda;
    private String direccion;
    private String moneda;

    private static ConfiguracionTienda configuracionTienda;

    public static ConfiguracionTienda getInstancia() {
        if (configuracionTienda == null) {
            configuracionTienda = new ConfiguracionTienda();
        }
        return configuracionTienda;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public String toString() {
        return "ConfiguracionTienda [nombreTienda=" + nombreTienda + ", direccion=" + direccion + ", moneda=" + moneda
                + "]";
    }

    
}

