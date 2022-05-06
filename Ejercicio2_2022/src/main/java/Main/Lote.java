/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */

//Implementamos la interface Cloneable (No define metodos)
public class Lote implements Cloneable{
   public final Integer idPadron;
   public final int superficie;
   private String domicilio;
   private float avaluoxmt;
   
   public Lote(Integer id,int s,String d,float a){
       this.idPadron = id;
       this.superficie = s;
       this.domicilio = d;
       this.avaluoxmt = a;
   }

   public Object clone() throws CloneNotSupportedException{
       Object obj = null;
       try{
           obj=super.clone();
       }catch(CloneNotSupportedException ex ){
           System.out.println("No se puede duplicar");
       }
       return obj;
   }

    public Integer getIdPadron() {
        return idPadron;
    }

    public int getSuperficie() {
        return superficie;
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
    
    private void AuxilarValuar(){
        System.out.println("La valuacion del Lote es "+ avaluoxmt * superficie);
        
    }
    public void valuar(){
        this.AuxilarValuar();
    }
   
    
    
}
