/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miembros;

/**
 *
 * @author Gustavo
 */
public abstract class Persona  {
    protected String nombre;
    
    public Persona(String n){
        this.nombre=n;
    }
    
    public abstract String getNombre();
    public abstract void setNombre(String nombre);
    
    
    
    
}
