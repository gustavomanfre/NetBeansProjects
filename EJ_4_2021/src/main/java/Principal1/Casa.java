/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal1;

import Principal.Edificio;

/**
 *
 * @author Gustavo
 */
public class Casa extends Edificio{
    private boolean plantaAlta;
    private int superficie;
    
    public Casa(boolean p,int s,float a){
        //Avaluo se inicializa con el constructor de la superclass edificio
        super(a);
        this.plantaAlta=p;
        this.superficie=s;
    }
    
    public void Valuar(){
        //Avaluo es accesible al ser declarado protected en la superclass
        System.out.println("El avaluo de la casa es"+this.superficie*this.avaluoXmtr);
    }

    
    public void setAvaluo(float a) {
       this.avaluoXmtr=a;
    }

    public float getAvaluo() {
        return this.avaluoXmtr;
    }

    public boolean isPlantaAlta() {
        return plantaAlta;
    }

    public void setPlantaAlta(boolean plantaAlta) {
        this.plantaAlta = plantaAlta;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    @Override
    public void Demoler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
