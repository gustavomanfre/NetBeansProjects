/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public class TP1 {
    
    private Integer s;
    private Integer p;
    
    public TP1(){}
    
    public void algoritmo(Integer n){
        s = 0;
        p = 1;
        do{ 
            if(n % 2 == 0){
                p*=n;
            }else {
                s+=n;
            }
            --n;
        }while(n!=0);
        System.out.println("El resultado es "+(p-s));
    }

    
}
