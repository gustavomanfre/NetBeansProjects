/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miembros;

import Asignaturas.Curso;
import Asignaturas.Inscripcion;


/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudiante e=new Estudiante("Manfredi,Gustavo",40389);
       Estudiante e1=new Estudiante("XXXXXXX",48938);
       Profesor p=new Profesor("Oscar Leon");
       Curso c=new Curso("Paradigmas");
       
       e.Inscribir(c);
       e1.Inscribir(c);
       e.EstaInscripto();
       
       //Arreglar demasiados false imprimidos
       for(Inscripcion i:e.getInscripto()){
           i.VerificarInscripto(e,c);
       }
       
       
       c.Inscriptos();
       //c.CantInscriptos();
       
       p.Dicta(c);
       p.QueDicta();
       
       
               
      
       
       
       
       
       
    }
    
}
