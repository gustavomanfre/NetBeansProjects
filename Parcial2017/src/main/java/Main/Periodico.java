/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public abstract class Periodico extends Escrito implements Publicacion{
    public final static int dias = 7;
 
    public Periodico(int cnt,Imprenta imp){
        super(cnt,imp);
    }
    
    public abstract String getDatos();
    
    
}
