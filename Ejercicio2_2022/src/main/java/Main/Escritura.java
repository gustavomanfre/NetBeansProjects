/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public class Escritura {
    public final Integer numero;
    public final int superficie;
    private String domicilio;
    
    public Escritura(Integer n,int s,String d){
        this.numero = n;
        this.superficie = s;
        this.domicilio = d;
    }
    //Constructor de Copia
    public Escritura (Escritura e){
        this.numero = e.numero;
        this.superficie = e.superficie;
        this.domicilio = e.domicilio;
    }
    
    public Integer getnumero(){
        return numero;
    }
    
    public int getsuperfice(){
        return superficie;
    }
    
    public String getdomicilio(){
        return domicilio;
    }
    //Los atributos numero y superficie no tienen metodos set ya que son final y no se puede volver 
    //a asignar valores, los atributos final se inician en la declaracion(todas las clases el mismo valor
    //cte) o en el constructor(un valor distinto constante en cada instancia).
    
    public void setdomicilio(String d){
        this.domicilio = d;
    }
    
    //this trae la referencia al objeto llamador del objeto/atributo
    public void MostrarEscritura(){
        System.out.println("El numero de la Escritura es "+this.numero);
        System.out.println("El domicilio de la Escritua es "+this.domicilio);
        System.out.println("La superfice de la Escritura es "+this.superficie);
    }
    
}
