/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Asignaturas;
import Miembros.*;

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor p = new Profesor("Oscar Leon");
        Profesor p1 = new Profesor("Pablo Wikilson");
        Profesor p2 = new Profesor("Pablo Cortez");
        
        Estudiante e = new Estudiante(40389,"Manfredi,Gustavo");
        Estudiante e1 = new Estudiante(40390,"Manfredi,Emanuel");
        Estudiante e2 = new Estudiante(40391,"Albarracin,Emanuel");
        
        Curso c = new Curso("Paradigmas");
        Curso c1 = new Curso("Ing.Sociedad");
        Curso c2 = new Curso("S.O");
        Curso c3 = new Curso("Quimica");
        Curso c4 = new Curso("SSL");
         
        e.inscribir(c);
        e.inscribir(c1);
        e.inscribir(c2);
        e.inscribir(c3);
        e.inscribir(c4);
        
        c.inscriptos();
        c1.inscriptos();
        c2.inscriptos();
        c3.inscriptos();
        c4.inscriptos();
        
        p.dicta(c);
        p.dicta(c2);
        p.dicta(c3);
        
        e.MostrarCurso();
        e1.MostrarCurso();
        e2.MostrarCurso();
        
        c.CantInscriptos();
        c1.CantInscriptos();
        c2.CantInscriptos();
        
        
        
        
        
        
        
        
        
        
    }
    
}
