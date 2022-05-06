/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignaturas;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Gustavo
 */
public class Curso {
    private String titulo;
/*  IMPLEMENTACION CON ARRAYLIST
    private ArrayList <Inscripcion> delAlumno=new ArrayList <Inscripcion>();
*/    
    
/*  IMPLEMENTACION CON HASHTABLE
    El hastable sirve para ir directamente en donde esta guardado el elemento y no hacerlo de manera secuencial como lo hace el vector.
*/    
    public Hashtable delAlumno=new Hashtable();
    
   
/*  IMPLEMENTACION CON ARRAYLIST
    public void Inscriptos(){
        for(Inscripcion i: delAlumno){
            System.out.println("Curso"+i.getParaEl().titulo+"Inscripto"+i.getAlumno().getNombre()+"Legajo"+i.getAlumno().getlegajo());
        }
  
    }

    
    
    Los metodos AddDelAlumno y setDelAlumno son distintos,uno es para agregar inscripcion 
    y el otro es para asignar un arrayList a otro arraylist completo con todo sus objetos
    nosotros usamos el primero

   public void AddDelAlumno(Inscripcion i){
       this.delAlumno.add(i);
               
   }
   
    Los metodos AddDelAlumno y setDelAlumno son distintos,uno es para agregar inscripcion 
    y el otro es para asignar un arrayList a otro arraylist completo con todo sus objetos
    nosotros usamos el primero


    public void setDelAlumno(ArrayList<Inscripcion> delAlumno) {
        this.delAlumno = delAlumno;
    }
    public void CantInscriptos(){
        for(Inscripcion i:delAlumno){
            int cantInscriptos=0;
            if(i.getParaEl().equals(this)){
                cantInscriptos+=1;
            }
                
        } 
    }
*/
     public Curso(String t){
        this.titulo=t;
    }
     public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
   //IMPLEMENTACION HASHTABLE
    public void Inscriptos(){
        Enumeration enumeration= delAlumno.elements();
        while(enumeration.hasMoreElements()){
            System.out.println("hastable valores"+enumeration.nextElement());
        }
    }
    
   

   
    
   
    
    
}
