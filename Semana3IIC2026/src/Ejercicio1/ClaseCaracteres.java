package Ejercicio1;

public class ClaseCaracteres {
    //comentario 
    //metodo main
    public static void main(String[] agrs){
        //Tipos de datos primitivos 
        int numero = 12;
        double edad = 18;
        boolean estado = true; 
        //no es un tipo de dato primivito es una clase
        String nombre = "Ronald ";
        String apellidos = "Arias Fallas";
        String correo = "steven@gmail.com";
        
        System.out.println(nombre);
        
        System.out.println(nombre.length());
        System.out.println(apellidos.length());
        
        System.out.println("la letra esta en la posicion " + nombre.indexOf("R"));
       
        if (!nombre.isEmpty()) {
            System.out.println("Si hay nombre");
        }else{
            System.out.println("No hay nombre");
        }
      
        if (nombre.isBlank()){
            System.out.println("Esta vacio");
        }
        
        System.out.println(correo.contains("@"));
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toUpperCase());
        
        System.out.println(nombre.trim());
        
        String ejemplo = "texto";
        String ejemplo2 = "texto ";
        
        System.out.println(ejemplo.equals(ejemplo2.trim()));
        System.out.println(ejemplo.equals(ejemplo2));
        
        
        
    }
    
}
