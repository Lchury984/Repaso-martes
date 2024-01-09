
package repaso_martes;

//Crear clase cartaNumeric a que hereda de carta y agrega el ccampo numero

public class cartaNumerica extends Carta {
    private int numero;
    
    // se pone primero lo que hereda y luego el atributo propio
    
    public cartaNumerica(String nombre, int numero){
        //primero va super con lo que hereda 
        //luego el this. ... con el atributo propio
        super(nombre);
        this.numero = numero;
        
    }
    
    
    //hacemos una sobrecarga de metodos con @Override
    @Override
    public void jugar(){
        //Realiza una conversion de valores entre tipos
        
        // se convierte el valor de this.numero a un valor double 
        // el uso de this indica que estamos accediendo al atributo "numero"
        // del objeto actual en el que se esta ejecutando el código
        
        // El resultado de la conversion se va a guardar en una variable "resultado"
        // de tipo double.
        double resultado = (double) this.numero *1.5;
        System.out.println("Jugando la carta numerica con numero " + this.numero);
        System.out.println("El resultado de la conversion es: " + resultado);
        
    }
    
    @Override
    public void mostrarDescripcion(){
        //utilizamos getNombre para acceder a la variable nombre que se encuentra
        // en otra clase (Carta).
        System.out.println("Carta numerica: " + getNombre() + ", numero: " + this.numero);
        
    }
    
    //AQUI VAN LOS SETTERS Y GETTERS de la variable numero de la clase cartaNumerica
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
  
}
