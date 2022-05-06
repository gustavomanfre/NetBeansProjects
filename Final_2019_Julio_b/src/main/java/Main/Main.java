/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<? extends Number> obj;
        obj = new ArrayList<Number>();
        //Tipos incompatibles: CAP#1 no se puede convertir a entero donde CAP#1 es una nueva variable de tipo: CAP#1 extiende Número, desde la captura de ? extiende número
            //Integer y = obj.get(0);
            //Al asignar una referencia del tipo number sus elemento van a ser del tipo number por eso larga error
            Number y = obj.get(0);
        
        
        
    }
    
}
