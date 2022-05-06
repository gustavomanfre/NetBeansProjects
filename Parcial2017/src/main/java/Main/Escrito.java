/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public abstract class Escrito implements Publicacion {
    private int cantPags;
    //Agregacion
    public Imprenta quien;
    
    public Escrito(int cnt,Imprenta imp){
        this.cantPags = cnt;
        this.quien = imp;

    }
    public Escrito(Imprenta imp){
        this.quien = imp;
    }
    
    public int getCantPags(){
        return cantPags;
    }
    public abstract int cuantasPags();
    public abstract String getDatos();

    
}
