
package Profesor;

import AgregacionyComposicion.Llanta;
import AgregacionyComposicion.Motor;
import AgregacionyComposicion.Puerta;


public class Automovilp {
    
    private String marca;
    private int annio;
    private String modelo;
    private Llanta[] llanta;
    private Puerta[] puerta;
    private Motor motor;
    
    //maneras de crear el constructor...
    //Si tengo el automovil base sin llantas, puertas, motor...depende de la informacion que yo tenga de entrada

    public Automovilp(String marca, int annio, String modelo) {
        this.marca = marca;
        this.annio = annio;
        this.modelo = modelo;
        this.llanta = new llanta[4];
        this.puerta = new puerta[5];
    }
    
}
