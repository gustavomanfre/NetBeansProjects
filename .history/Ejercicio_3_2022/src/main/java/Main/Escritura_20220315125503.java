/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public class Escritura implements {
    public final Integer numero;
    public final int superficie;
    private String domicilio;
    
    public Escritura(Integer n,int s,String d){
        this.numero = n;
        this.superficie = s;
        this.domicilio = d;
    }
    
    //Constructor de Copia
    public Escritura(Escritura e){
        this.numero = e.numero;
        this.superficie = e.superficie;
        this.domicilio = e.domicilio;
    
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
    public void setdomicilio(String d){
        this.domicilio = d;
    }
    
    public void MostrarEscritura(){
        System.out.println("El domicilio de la escritura es " + this.domicilio);
        System.out.println("El numero de escritura es " + this.numero);
        System.out.println("La superficie de la escritura es " + this.superficie);
    }
}
