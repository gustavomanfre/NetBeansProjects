/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ej_1_2021;

/**
 *
 * @author Gustavo
 */
public class Escritura {
    
    /*Los atributos final inicializados en la declararacion, deben declararse como static, 
    Se debe incluir un campo static en su declaración, al ser final su valor ya no puede cambiar. 
    Por lo tanto, no es necesario tener una copia separada del campo para cada objeto de la clase. 
    Al hacer a ese campo static, se permite que todos los objetos de la clase compartan el campo final.*/
    public final Integer numero;
    public final int superficie;
    
    private String domicilio;
 
    public Escritura(Integer n, int s, String d){
         this.numero= n;
         this.superficie= s;
         this.domicilio= d;         
    }
    
    /*Los atributos final, se pueden inicializar en su declaracion, si tienen el mismo
    valor para todas los objetos, o en su constructor si difieren entre los distintos objetos
    Recordando que para ambos casos no se pueden cambiar el valor una vez inicializados, y no tendran
    metodos 
    */
    
    //Constructor de Copia
    public Escritura (Escritura e1){
        this.domicilio=e1.domicilio;
        this.numero=e1.numero;
        this.superficie=e1.superficie;
    }
    
   /*No tenemos metodos set de los atributos final, ya que una vez inicializados
    su valor no puede cambiar*/
    
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
    
    /*Podemos acceder directamente a los atributos, pues los atributos son privados y publicos
    es decir los publicos son accesible por el objeto que pertenece y por otros, y los privados
    son accesibles solo por el objeto que pertenece
    */
    public void MostrarDatosEscritura(){
        System.out.println("EL domicilio es "+ this.domicilio);
        System.out.println("La superficie es"+ this.superficie);
        System.out.println("El numero es "+ this.numero);
    }
            
    
    
    
}

