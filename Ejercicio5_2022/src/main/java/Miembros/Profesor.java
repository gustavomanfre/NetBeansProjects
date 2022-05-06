/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Miembros;
import Asignaturas.*;

/**
 *
 * @author Gustavo
 */
public class Profesor extends Persona{
    private Curso docente;
    
    public Profesor(String n){
        super(n);
    }
    
    public void dicta(Curso c){
        this.docente = c;
    }
    
    public void getdicta(){
        System.out.println("El profesor "+this.nombre);
        System.out.println("dicta el curso "+this.docente.getTitulo());
    }
}
