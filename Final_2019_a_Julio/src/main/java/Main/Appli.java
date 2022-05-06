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
public class Appli {
    
    public static void main(String[] args) {
        D x = new D();                      /*[2]*/
        x.metodo(new ArrayList());
    }
    
}
//a)En [1] cuales no son clase validas de objetos para pasar como arguento.
    //A,B,C puede pasar cualquiera
//b)En [2] cuales son clases validas de objetos para pasar como argumento.
    // NO SE
//c)En [3] completar la delaracion para un tipo ArrayList parametrizado con cualquier clase que sea padre de IP.
    //ArrayList<? super IP> q
//d)En [0] completar la parametrizacion para operar.
    //T extends B
