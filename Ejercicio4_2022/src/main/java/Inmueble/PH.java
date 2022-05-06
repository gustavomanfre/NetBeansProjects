/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmueble;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class PH extends Edificio{
    public final byte cantPisos;
    private ArrayList <Departamento> unidad;
    
    public PH(byte cp,float a){
        super(a);
        this.cantPisos = cp;
        this.unidad = new ArrayList <Departamento>();
    }
    
    public float getAvaluoXmtr() {
        return avaluoXmtr;
    }
    
    public void valuar(){
        for(Departamento d:unidad){
            System.out.println("En el dpto "+d.piso+d.dpto);
            System.out.println("El avaluo por dpto es "+avaluoXmtr*d.superficie);
        }
    }
        
    public void setAvaluoXmtr(float avaluoXmtr) {
        this.avaluoXmtr = avaluoXmtr;
    }
    
    public void AgregarDepartamento(Departamento d){
        this.unidad.add(d);
    }
    public byte getCantPisos() {
        return cantPisos;
    }
        
    
    
}
