/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public class Revista extends Periodico {
    
    public Revista(int cnt,Imprenta imp){
        super(cnt,imp);
        imp.cual.add(this);
    }
    
    public String getDatos(){
        return this.dias +"," +this.getCantPags();
    };
    
    public int cuantasPags(){
        return this.getCantPags();
        //return super.getCantPags();
    };


}
