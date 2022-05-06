/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignaturas;

import Miembros.Estudiante;

/**
 *
 * @author Gustavo
 */
public class Inscripcion {
    private Curso paraEl;
    private Estudiante alumno;
    
    public Inscripcion(Curso c,Estudiante a){
        this.alumno=a;
        this.paraEl=c;
//Pasamos la referencia del new inscripto a delalumno con this, tienen la misma informacion los arreglos 
        c.delAlumno.put(4556, this);
         
    }
    
    public void VerificarInscripto(Estudiante e,Curso c){
        if(this.alumno.getlegajo()==e.getlegajo() && this.paraEl.equals(c)){
             System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    

    public Curso getParaEl() {
        return paraEl;
    }

    public void setParaEl(Curso paraEl) {
        this.paraEl = paraEl;
    }

    public Estudiante getAlumno() {
        return alumno;
    }

    public void setAlumno(Estudiante alumno) {
        this.alumno = alumno;
    }
    
    
}
