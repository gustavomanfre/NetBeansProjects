/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Gustavo
 */

//Implementamos la Interface Cloneable  
public class Lote implements Cloneable{
    public final Integer idPadron;
    private String domicilio;
    private float avaluoxmt;
    public final int superficie;
     
    /*Si una clase no implementa esta interface Cloneable,e intenta hacer una duplicación del objeto 
     a través de la llamada al método clone de la clase base Object, 
     da como resultado una excepción del tipo CloneNotSupportedException. */
    
    /*La clase base Object de todas las clases en el lenguaje Java, tiene una función miembro denominada
     clone,que se redefine en la clase derivada(Lote) para realizar una duplicación de un objeto de dicha
     clase.*/
    public Object clone()throws CloneNotSupportedException{
        
    /*En la redefinición de clone aca , se llama a la versión clone de la clase
    base con super. Esta llamada se ha de hacer forzosamente dentro de
    un bloque try/catch, para capturar la excepción CloneNotSuportedException 
    que nunca se producirá si la clase implementa el interface Cloneable.*/
    
        Object obj=null;
        try{
            obj=super.clone();//Creo una referencia a la Interfaz Cloneable
            
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        return obj;
    /*Como vemos la llamada a la versión clone de la clase devuelve un objeto 
    de la clase base Object, que es a su vez devuelto por la versión clone de la clase derivada*/
        
    }
    
     public Lote (String d,int s,Integer idpadron,float a){
        this.idPadron=new Integer(56544);//new integer xq es un objeto de tipo de dato,su principal ventaja es la conversion de string a int
        this.superficie=s;
        this.domicilio=d;
        this.avaluoxmt=a;
   }
    
    private float calcula(){
        return this.avaluoxmt*this.superficie;
    }
      
    public void valuar (){
        System.out.println("El avaluo de la propiedad es"+this.calcula());
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public float getAvaluoxmt() {
        return avaluoxmt;
    }

    public void setAvaluoxmt(float avaluoxmt) {
        this.avaluoxmt = avaluoxmt;
    }
    /*Podemos acceder directamente a los atributos, pues los atributos son privados y publicos
    es decir los publicos son accesible por el objeto que pertenece y por otros, y los privados
    son accesibles solo por el objeto que pertenece
    */
    public void MostrarLote(){
        System.out.println("El padron es"+this.idPadron);
        System.out.println("El domicilio es"+ this.domicilio);
        System.out.println("El avaluo por metro es"+this.avaluoxmt);
        System.out.println("La superficie es"+this.superficie);
    
    }
   
  
    
}
