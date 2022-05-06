/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.io.Serializable;

/**
 *
 * @author Gustavo
 */
//Objetos Escritura persisten usando Serializable
public class Escritura implements Serializable{
    public Integer numero;
    public int superficie;
    private String domicilio;
 
    public Escritura(Integer n, int s, String d){
         this.numero= n;
         this.superficie= s;
         this.domicilio= d;         
    }
    public Escritura (Escritura e1){
        this.domicilio=e1.domicilio;
        this.numero=e1.numero;
        this.superficie=e1.superficie;
    
    }
    public void setnumero(Integer n){
        this.numero=n;
    }
    public void setsuperficie (int s){
        this.superficie=s;
    }
    public void setdomicilio(String d){
        this.domicilio=d;
    }
    
    public Integer getnumero(){
        return numero;
    }
    public int getsuperficie(){
        return superficie;
    }
    
    public String getdomicilio(){
        return domicilio;
    }
    
    public void MostrarEscritura(){
        System.out.println("EL domicilio es "+ this.domicilio);
        System.out.println("La superficie es"+ this.superficie);
        System.out.println("El numero es "+ this.numero);
    }
            
    
    
    
}

