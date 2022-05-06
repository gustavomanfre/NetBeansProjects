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
public class Registro {
    
    public final static float coefAvaluoEdificio= 2;
    public final static String municipio="Las Heras";
    
    private float tasa;
    
    public Lote [] inmueble= new Lote[100];
    
    public Registro(float t){
        this.tasa=t;
    }
    public void Registrar(Lote l){
        for(int i=0;i<100;i++){     
            if(inmueble[i]==null){  
                inmueble[i]=l;      
                l.inscripto=this;                     
                break;             
            
            }
        }
    }
    
    
    
    public void Valuar(){
        for(Lote l:this.inmueble){  
            if(l!=null){            
                l.valuar();        
            }
       }
    }
    
    public void emitirBoletos(){
        for(Lote l:this.inmueble){
            if(l!=null){
                l.MostrarLote();
    
            }
        
        }
    
    }
    
    public float getCoefAvaluoEdificio() {
        return coefAvaluoEdificio;
    }

    public String getMunicipio() {
        return municipio;
    }
    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
    
    public void Guardar(){}
    public void Recuperar(){}
    
    
    
    
}
