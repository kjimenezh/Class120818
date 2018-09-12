
package AgregacionyComposicion;


public class Automovil {
    
    private String marca;
    private int annio;
    private String modelo;
    private Llanta[] llanta;
    private Puerta[] puerta;
    private Motor motor;

    public Automovil(String marca, int annio, String modelo, Llanta[] llanta, Puerta[] puerta, Motor motor) {
        this.marca = marca;
        this.annio = annio;
        this.modelo = modelo;
        this.llanta=new Llanta[4];
        this.puerta=new Puerta[2];
        this.motor=motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
   
}
