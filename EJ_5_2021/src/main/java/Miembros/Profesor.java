/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miembros;

import Asignaturas.Curso;

/**
 *
 * @author Gustavo
 */
public class Profesor extends Persona{
    private Curso Docente;
    
    public Profesor(String n){
        super(n);
    
    }
    
    public void Dicta (Curso c){
      this.Docente=c;  
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void QueDicta(){
        System.out.println("El docente"+this.nombre+"Dicta"+this.Docente.getTitulo());
        
    }
    
    
}
