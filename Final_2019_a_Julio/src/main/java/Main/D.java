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
public class D <T extends B >{                             /*[0]*/
    T obj;
    
    public D(T p){
        obj = p;
    }
 
    public void metodo(ArrayList<? super IP> q){          /*[3]*/  
        q.add();                                          /*[1]*/
    }   
}
