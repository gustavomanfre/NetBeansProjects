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
 
public class Lote implements Cloneable{
    public final Integer idPadron;
    private String domicilio;
    private float avaluoxmt;
    public final int superficie;
    public Registro inscripto;
     
   
    public Object clone()throws CloneNotSupportedException{   
        Object obj=null;
        try{
            obj=super.clone();
            
        }catch(CloneNotSupportedException ex){
            System.out.println(" no se puede duplicar");
        }
        return obj;
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
    public void MostrarLote(){
        System.out.println("El padron es"+this.idPadron);
        System.out.println("El domicilio es"+ this.domicilio);
        System.out.println("El avaluo por metro es"+this.avaluoxmt);
        System.out.println("La superficie es"+this.superficie);
    
    }
   
  
    
}
