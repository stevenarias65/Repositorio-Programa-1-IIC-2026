
package Vistas;

import Modelos.CuentaBancaria;
import Modelos.Usuario;
import java.util.ArrayList;

public class BaseDatosUsuarios {
    
    static final ArrayList<Usuario> usuarios = new ArrayList<>();
    
    static {
        usuarios.add(new Usuario("rarias", "123", 
                new CuentaBancaria("Ronald","CR",12)));
         usuarios.add(new Usuario("fsteven", "123", 
                new CuentaBancaria("Steven","CR",1000)));
        
    }
    
    public static boolean ValidarContraseña(String usuario, String contraseña){
        for(Usuario u : usuarios){
            if (u.getNombreUsuario().equals(usuario) && u.verificarContraseña(contraseña)) {
                return true;
            }
            
        }
        return false;
              
    }
    
    
    
    
    
    
    
}
