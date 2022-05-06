/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Gustavo
 */
public class Registro {
    public final float coefAvaluoEdificio;
    public final String municipio;
    private float tasa;
    
      public Lote inmueble[] = new Lote[100];
    //public ArrayList <Lote> inmueble = new ArrayList <Lote> ();
    //HashMap <Integer,Lote> inmueble = new HashMap <Integer,Lote>();
    
    public Registro(float c,String m,float t){
        this.coefAvaluoEdificio = c;
        this.municipio = m;
        this.tasa = t;
    }
    
    public void valuar(){
        for(Lote l:inmueble){
            l.valuar();
        }
    }
    
    
    //Registrar con Arreglo simple - For simple.
    public void registrar(Lote l){
        for(int i=0;i<inmueble.length;i++){
            if(inmueble[i] == null)
                inmueble[i]=l;
                l.inscripto = this;
        }
    }
    
    //Registrar Con Arrreglo Simple - For each.
        //No es posible ya que el bucle for each en un bucle de solo lectura, no es de asignacion en este caso dar de alta.

   
    //Registrar con ArrayList y For simple y/o for each.
        //No es necesario ciclo for simple ni ciclo for each ya que add agrega al final del arreglo
/*    
    public void registrar(Lote l){
        inmueble.add(l);
        l.inscripto = this;
    }
*/

    
//Registrar con HashMap y For Simple y/o for each.
        //No es necesario ciclo for simple ni ciclo for each ya que put agrega al final del arreglo
/*
    public void registrar(Lote l){
        inmueble.put(l.idPadron,l);
        l.inscripto = this;
    }
*/
    
//emitirBoletos()implementado con Arreglo simple ciclo for.
    public void emitirBoletos(){
        for(int i=0;i<inmueble.length;i++){
            System.out.println("El padron es "+inmueble[i].idPadron);
            System.out.println("La superficie es "+inmueble[i].superficie);
            System.out.println("EL domicilio es "+inmueble[i].getDomicilio());
            System.out.println("El avaluo por metro es "+inmueble[i].getAvaluoxmt());
        }
    }
    
//emitirBoletos()implementado con Arreglo simple ciclo for each.
/*
    public void emitirBoletos(){
        for(Lote l:inmueble){
            System.out.println("El padron es "+l.idPadron);
            System.out.println("La superficie es "+l.superficie);
            System.out.println("EL domicilio es "+l.getDomicilio());
            System.out.println("El avaluo por metro es "+l.getAvaluoxmt());
        }
    }
*/

//emitirBoletos()implementado con ArrayList y for simple.
/*
    public void emitirBoletos(){
        for(int i=0;i<inmueble.size();i++){
            System.out.println("El padron es "+inmueble.get(i).idPadron);
            System.out.println("La superficie es "+inmueble.get(i).superficie);
            System.out.println("EL domicilio es "+inmueble.get(i).getDomicilio());
            System.out.println("El avaluo por metro es "+inmueble.get(i).getAvaluoxmt());
        }
    }
*/
    
    //emitirBoletos()implementado con ArrayList y for-each.
/*
    public void emitirBoletos(){
        for(Lote l:inmueble){
            System.out.println("El padron es "+l.idPadron);
            System.out.println("La superficie es "+l.superficie);
            System.out.println("EL domicilio es "+l.getDomicilio());
            System.out.println("El avaluo por metro es "+l.getAvaluoxmt());
        }
    }
*/
    
//emitirBoletos()implementado con HashMap y for simple.
    //No se puede ya que se recorre por clave no por indice, el ciclo for each sirve ya que no maneja indice

//emitirBoletos()implementado con HashMap y for each.
/*
    public void emitirBoletos(){
        for(Lote l: inmueble.values()){
            System.out.println("El padron es "+l.idPadron);
            System.out.println("La superficie es "+l.superficie);
            System.out.println("EL domicilio es "+l.getDomicilio());
            System.out.println("El avaluo por metro es "+l.getAvaluoxmt());
        }
    }
*/
    
    public void Guardar(){}
    
    public void Recuperar(){}
    
    public float getTasa() {
        return tasa;
    }
    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
    
}
