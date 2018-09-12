
package AgregacionyComposicion;

public class Llanta {
    
    private String marca;
    private String modelo;
    private int tamanniopulgadas;

    public Llanta(String marca, String modelo, int tamanniopulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanniopulgadas = tamanniopulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanniopulgadas() {
        return tamanniopulgadas;
    }

    public void setTamanniopulgadas(int tamanniopulgadas) {
        this.tamanniopulgadas = tamanniopulgadas;
    }
    
    
    
}
