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
public abstract class Edificio {
  
    // Atributo protected es accesible, por la misma rama de herencia y mismo paquete
    protected float avaluoXmtr;
    
    public Edificio(float a){
        this.avaluoXmtr=a;
    }
    /*Clase abstracta tiene uno o mas metodos abstractos, es decir no cuenta con la informacion,
    suficiente para implementarla,contener metodos no abstractos, las clases que hereden de ella
    deberan declararse como abstracta si no pueden implementar algun metodo abstract, la clase abtsracta
    sirve para poner la firma de la operacines pero no su implmentacion,y los atributos comenes a un conj de objetos
    */
    public abstract void Demoler();
    public abstract void Valuar();
    public abstract void setAvaluo(float a);
    public abstract float getAvaluo();
  
    
}
