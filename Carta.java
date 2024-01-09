
package repaso_martes;

// crear lase abstracta carta co un campo nombre y metodos abstratos jugar() 
// y mostrarDescripcion()
//

// Clase absatracta Carta
public abstract class Carta {
    private String nombre;
    
    
    public Carta(String nombre){
        this.nombre = nombre;
        
    }
    
    public abstract void jugar();
    public abstract void mostrarDescripcion();
    
    //SETTERS Y GETTERS
    
    //GET
    public String getNombre(){
        return nombre;
    }
    
    //SET
   
    public void setNombre(String Nombre){
        this.nombre = nombre;
    }
   
}
