
package Modelos;


public class Usuario {
    
    private String nombreUsuario; 
    private String contraseña; 
    private CuentaBancaria cuenta; 

  
    public Usuario(String nombreUsuario, String contraseña, CuentaBancaria cuenta) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.cuenta = cuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
    //Metodo de verificacion de contraseña
    public boolean verificarContraseña(String intento){
        boolean confirmar = this.contraseña.equals(intento);
        return confirmar;
    }
    
    
    
    
}



