/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Imprenta {
    public ArrayList <Escrito> cual = new ArrayList <Escrito>();
    
    public Imprenta(){}
    
    //imprimir: Muestra en pantalla una cadena con los datos de un publicacion.
    public void imprimir(){
            for(Object obj:this.cual){
                System.out.println(obj.getClass().getName()+"->"+(Escrito)obj.getDatos());
            }
    }
       
}


