/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Teclado {
    
    private Integer numeroTeclado;
    private ArrayList <Integer> acumulador;
    private Integer contador;
    private boolean b;
  
    public void ingreseTeclado(){
        contador = 0;
        numeroTeclado = 0;
        System.out.println("Desea ingresar un numero");
        Scanner reader1 = new Scanner(System.in);
        b = reader1.hasNextBoolean();    
        while(b == true){
       
            Scanner reader = new Scanner(System.in);
            numeroTeclado = reader.nextInt();

            acumulador.add(numeroTeclado);
            contador = acumulador.size();
            System.out.println("Desea ingresar otro numero");
            b = reader1.hasNextBoolean();
        } 
        System.out.println("El valor del acumulador es "+this.contador);
        for(Integer a:acumulador){
            System.out.println("El valor del acumulador es "+a);
        }   
    }
    
  
 
}



