/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
//Implementamos la Interface Cloneable 
public class Lote implements Cloneable {
    public final Integer idPadron;
    public final int superficie;
    private String domicilio;
    private float avaluoxmt;
    
     /*Si una clase no implementa esta interface Cloneable,e intenta hacer una duplicación del objeto 
     a través de la llamada al método clone de la clase base Object, 
     da como resultado una excepción del tipo CloneNotSupportedException. */
    
    /*La clase base Object de todas las clases en el lenguaje Java, tiene una función miembro denominada
     clone,que se redefine en la clase derivada(Lote) para realizar una duplicación de un objeto de dicha
     clase.*/
    public Object clone() throws CloneNotSupportedException{
        
    /*En la redefinición de clone aca , se llama a la versión clone de la clase
    base con super. Esta llamada se ha de hacer forzosamente dentro de
    un bloque try/catch, para capturar la excepción CloneNotSuportedException 
    que nunca se producirá si la clase implementa el interface Cloneable.*/
    
        Object obj = null;
        try{
            obj = super.clone();//Creo una referencia a la Interfaz Cloneable
            
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        return obj;
    /*Como vemos la llamada a la versión clone de la clase devuelve un objeto 
    de la clase base Object, que es a su vez devuelto por la versión clone de la clase derivada*/
        
    }
    
    public Lote(Integer id,int s,String d,float a){
        this.idPadron = id;
        this.superficie = s;
        this.domicilio = d;
        this.avaluoxmt = a;
    }
    
    public void setdomicilio(String d){
        this.domicilio = d;
    }
    public void setavaluoxmt(float a){
        this.avaluoxmt = a;
    }
    
    public String getdomicilio(){
        return this.domicilio;
    }
    
    public float getavaluoxmt(){
        return this.avaluoxmt;
    }
    
    public float valuar (){
       return this.metodoauxiliar();
    }
    private float metodoauxiliar(){
        return this.superficie*this.avaluoxmt;
    }
    
    public void MostrarDatos(){
        System.out.println("El id del padron es " + this.idPadron);
        System.out.println("La superficie es " + this.superficie);
        System.out.println("El domicilio es " + this.domicilio);
        System.out.println("El avaluoxmt es " + this.avaluoxmt);
        System.out.println("La valuacion es " + this.valuar());
    
    }
}
