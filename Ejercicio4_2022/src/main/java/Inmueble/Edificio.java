/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

/**
 *
 * @author Gustavo
 */
public abstract class Edificio {
    protected float avaluoXmtr;
    
    public Edificio(float a){
        this.avaluoXmtr = a;
    }
    
    public abstract float getAvaluoXmtr();
    public abstract void setAvaluoXmtr(float avaluoXmtr);
    public abstract void valuar();
    public void demoler(){}
    
    
}

    

