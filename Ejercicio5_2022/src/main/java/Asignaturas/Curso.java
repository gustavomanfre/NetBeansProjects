/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignaturas;

import Miembros.Estudiante;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author Gustavo
 */
public class Curso {
    private String titulo;
    //IMPLEMENTACION ARRAYLIST
    /*private ArrayList <Inscripcion> delAlumno = new ArrayList <Inscripcion>();*/
    
    //IMPLEMENTACION HASHTABLE
    /*El hastable sirve para ir directamente en donde esta guardado el elemento indexado por medio de su clave y no hacerlo de manera secuencial como lo hace el un contenedor simple.*/
    public Hashtable <Integer,Inscripcion> delAlumno  = new Hashtable <Integer,Inscripcion>();
    
    public Curso(String t){
        this.titulo = t;
    }
    
    public void inscriptos(){
        //IMPLEMENTACION ARRAYLIST
/*       
        for(Inscripcion i:delAlumno){
            System.out.println("En el curso "+i.getParaEl().titulo);
            System.out.println("Esta inscripto "+i.getAlumno().getNombre());
            System.out.println("Su numero de legajo es "+i.getAlumno().getLegajo());
        }
*/

        //IMPLEMENTACION HASHTABLE
        Enumeration alumno = delAlumno.elements ();
            //hasMoreElements indica true o false quedan elementos en el contenedor
        while (alumno.hasMoreElements ()){
            //nextElement itera al proximo elemento del arreglo
            Inscripcion i = (Inscripcion)alumno.nextElement();
            Estudiante a = i.getAlumno();
            //"\n" imprimir nueva linea sin usar print.ln
            System.out.println("nombre: " +i.getAlumno().getNombre()+ "\n"+"Legajo: " +i.getAlumno().getLegajo());
      }   
 
    }
  
    public void CantInscriptos(){
        int cantInscriptos=0;
        
        Enumeration alumno = this.delAlumno.elements ();
        while (alumno.hasMoreElements ()){
            //nextElement itera al proximo elemento del arreglo
            Inscripcion i = (Inscripcion)alumno.nextElement();
            if(i.getParaEl().equals(this)){
                cantInscriptos += 1;
            }
                
        } 
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
