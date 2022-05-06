/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignaturas;
import Miembros.*;

/**
 *
 * @author Gustavo
 */
public class Inscripcion {
    private Curso paraEl;
    private Estudiante alumno;
    
    public Inscripcion(Curso c,Estudiante e){
        this.paraEl = c;
        this.alumno = e;
        c.delAlumno.put(e.getLegajo(), this);
    }
    
    
    //equals 
    public void EstadoEstudiante(Estudiante e,Curso c){
        if (alumno.getLegajo() == e.getLegajo()&& c.equals(paraEl)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
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
