
package Clases;

//esta clase hereda de Persona 
public class Profesor extends Persona{
    
    private String materiaxImpartir;
    
    
    public Profesor(String nombre, String cedula, int edad,String materiaxImpartir) {
        super(nombre, cedula, edad);
        this.materiaxImpartir = materiaxImpartir;
    }

    public String getMateriaxImpartir() {
        return materiaxImpartir;
    }

    public void setMateriaxImpartir(String materiaxImpartir) {
        this.materiaxImpartir = materiaxImpartir;
    }
    
    
    
}
