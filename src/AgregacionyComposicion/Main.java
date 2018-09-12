
package AgregacionyComposicion;


public class Main {
    
    public static void main(String[] args){
        
        Llanta[] llantas=new Llanta[4];
        
        for (int i=0;i<4;i++){
            Llanta l=new Llanta("a","abc",30);
            llantas[i]=l;
        }
        
        Puerta[] puertas=new Puerta[2];
        
        for (int i=0;i<2;i++){
            Puerta p=new Puerta("metal");
            puertas[i]=p;
        }
        
        Motor motor=new Motor(1234,"abcd");
        
        Automovil ferrari=new Automovil("Ferrari", 2018, "1.0",llantas,puertas,motor);
        
        System.out.println("La llanta 1 del automovil es de la marca "+ferrari.getMarca());
        System.out.println(ferrari.llantas[1].marca());
    }
}
