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
public class MiDato implements Datos {
    private ArrayList cont = new ArrayList();
    
    @Override
    public boolean text(T obj) {
        for(Object o:cont){
            if(o != obj){
                return false;
            }
        }
    }
    
}
