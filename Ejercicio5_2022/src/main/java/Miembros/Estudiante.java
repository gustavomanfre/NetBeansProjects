/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Miembros;
import Asignaturas.*;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Estudiante extends Persona{
    private Integer legajo;
    //IMPLEMENTACION CON ARRAYLIST
    //private ArrayList <Inscripcion> Inscripto = new ArrayList <Inscripcion> ();
    private Inscripcion inscripto[]= new Inscripcion[100];
    
    public Estudiante(Integer l,String n){
        super(n);
        this.legajo = l;
    }
    
    public void inscribir(Curso c){
        for(int i=0;i<inscripto.length;i++){
            if(inscripto[i]==null){
                this.inscripto[i] = new Inscripcion(c,this);
            }
        
        }
    }
    
    public void MostrarCurso(){
        for(Inscripcion i:inscripto){
            System.out.println("El alumno esta inscripto en el curso "+i.getParaEl().getTitulo());
        }
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
