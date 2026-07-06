/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author centr
 */
public class Estudiante extends Persona{
    
    private String seccion; 

    public Estudiante(String seccion, String nombre, String cedula, int edad) {
        super(nombre, cedula, edad);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    
 
    
}
