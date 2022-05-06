/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miembros;

import Asignaturas.Curso;
import Asignaturas.Inscripcion;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Estudiante extends Persona{
    private Integer legajo;
/*  Implementacion con Arreglos Unidimensionales
    private Inscripcion Inscripto []=new Inscripcion[40];
*/
    //Implementacion Con ArrayList
    private ArrayList <Inscripcion> Inscripto=new ArrayList <Inscripcion>();
    
    public Estudiante(String n,Integer l){
        super(n);
        this.legajo=l;
    }
    public Integer getlegajo(){
        return legajo;
    }
    
    public void setlegajo(Integer l){
        this.legajo=l;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Inscripcion> getInscripto() {
        return Inscripto;
    }
    
    
    public void EstaInscripto(){
        for(Inscripcion i:Inscripto){
            System.out.println("El alumno"+this.nombre);
            if(i.getAlumno().equals(this)){
                System.out.println("Esta inscripto en "+i.getParaEl().getTitulo());
            }
        }
    }
 /*IMPLEMENTACION CON ARRAYLIST 
    nos ahorramos recorramos recorrer el indice, ya que add agrega los objetos al final
    de la lista, ademas podemos agregar y eliminar objetos sin limites de tamaño, a diferencia de arreglos que se define
    el tamaño en la declaracion
    */
    
    public void Inscribir(Curso c){
/*      IMPLEMENTACION CON ARRAYLIST
        this.Inscripto.add(new Inscripcion(c,this));
*/
//      IMPLEMENTACION HASHTABLE 
        c.delAlumno.put(40389,new Inscripcion(c,this));
        
    }
    
/*
    IMPLEMENTACION CON ARREGLO UNIDIMENSIONAL
    Tenemos que recorrer con un ciclo for el indice,(a diferencia
    de arraylist que se agregan al ultimo los objetos no hay que recorrer el indice),sino se
    se sobrescriben los objetos, ya que cada vez que llamamos al metodo comienza el indice en 
    cero (int=0),para solucionar eso agregamos el if, mucho mas codigo con arreglo unidimensionales
    ademas de la desventaja que una vez declarado el tamaño no se puede incrementar el tamaño
   
    public void Inscribir(Curso c){
        for(int i=0;i<=Inscripto.length;i++){
            if(Inscripto==null){
                this.Inscripto[i]=new Inscripcion(c,this);
                break;
            }
        }  
    }
*/
        
/*IMPLEMENTACION CON FOR-EACH
  Itera el bucle for each,en cada iteracion del bucle se recupera el ste elemento de la coleccion y se almacena en la varaible de iteracion
  el bucle se repite hasta obtener todos los elementos de la coleccion en orden del indice, eliminamos la necesidad
  la necesidad de establecer un contador de bucle i, y especificar un vi y vf e indexar manualmente la matriz,
  en su lugar itera automaticamente en orden del indice de ppio a fin, ya que los objetos
  son agregados con add en arraylist por el usuario (no va a haber objetos vacios como en arregls unidimensionales),
  siendo un arreglo dinamico y el ciclo for each lee de ppio a fin no va a leer objetos vacios es decir null
  
    public void Inscribir(Curso c){
        for(Inscripcion i:Inscripto){
    
        NO PODEMOS IMPLEMENTARLO,YA QUE NO HACE UN SEGUIMIENTO DEL INDICE,A MENOS QUE
        DECLAREMOS EL INDICE, PERO EN ESE CASO SERIA MAS FACIL IMPLEMENTAR EL CICLO FOR
        NORMAL
    
        }  
    }
*/


}
