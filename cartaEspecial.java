
package repaso_martes;

import java.util.Random;

public abstract class cartaEspecial extends Carta{
    
    public cartaEspecial(String nombre){
        super(nombre);
    }
    
    @Override
    public void jugar(){
        System.out.println("Activando el efecto especial de la carta " + getNombre());
        
    }
    
    @Override 
    public void mostrarDescripcion(){
        System.out.println("Carta especial: " + getNombre());
    }
    
    public static void main(String[] args){
        activarefectoEspecial();
    }
    
    // declaramos un metodo publico y estatico
    // puede ser invocado sin necesidad de de crear un objeto de la clase.
    public static void activarefectoEspecial(){
        
        Random random = new Random();
        int numrandom = random.nextInt(13) +1; //genera un numero aleatorio entre el 1 y 13
        
        Carta carta;
        if (numrandom == 1 || numrandom == 11 || numrandom == 12 || numrandom == 13){
            carta = new cartaEspecial("Carta " + numrandom) {};
            System.out.println("!Has obtenido una carta especial! ");
        }else{
            //NO ES UNA CARTA ESPECIAL
            carta = new cartaNumerica("Carta " + numrandom, numrandom);
            
        }
        
        carta.mostrarDescripcion();
        carta.jugar();
        
    }
    
}
