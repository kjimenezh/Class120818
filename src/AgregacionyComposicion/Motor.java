
package AgregacionyComposicion;

public class Motor {
    
    private int numeroserie;
    private String cilindros;

    public Motor(int numeroserie, String cilindros) {
        this.numeroserie = numeroserie;
        this.cilindros = cilindros;
    }

    public int getNumeroserie() {
        return numeroserie;
    }

    public void setNumeroserie(int numeroserie) {
        this.numeroserie = numeroserie;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }
    
    
}
