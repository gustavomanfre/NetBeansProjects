/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

/**
 *
 * @author Gustavo
 */
public class Casa extends Edificio {
    private boolean plantaAlta;
    private int superficie;
    
    public Casa(boolean pa,int s,float a){
        super(a);
        this.plantaAlta = pa;
        this.superficie = s;
    }
    
    public float getAvaluoXmtr() {
        return avaluoXmtr;
    }

    public void setAvaluoXmtr(float avaluoXmtr) {
        this.avaluoXmtr = avaluoXmtr;
    }
    
    public void valuar(){
        System.out.println("La valuacion de casa "+avaluoXmtr*superficie);
    }
    
    
}
