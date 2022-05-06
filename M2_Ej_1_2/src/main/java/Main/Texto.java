/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.util.StringTokenizer;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Texto {
    private Integer acumulador;
    
    public void cuentaPalabra( String frase,String palabra){
        acumulador = 0;
        String[] p = frase.split(" ");
        
        for (String f : p){
            System.out.println(f);
            if(f.equals(palabra)){
                acumulador+=1;
            }  
        }
        System.out.println("La cantidad de veces que aparece la frase es "+this.acumulador);
    }
    
/*  Version Beta
    public void cuentaPalabra(String frase,String palabra){
	acumulador = 0;

	while (frase.indexOf(palabra) > -1) {
            frase = frase.substring(frase.indexOf(palabra)+palabra.length(),frase.length());
	    acumulador++; 
	}
	 System.out.println (acumulador);
    }
    
*/
}
