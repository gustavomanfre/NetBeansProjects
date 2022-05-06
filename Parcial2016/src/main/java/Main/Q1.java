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
public class Q1 extends R1 implements I2 {
    private Integer x;
    public Q2 q2;

    public Q1(Integer x,Integer y){
        super(x);
        this.x = y;
        q2 = new Q2(x,this);
        
        
    }
  
    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getX() {
        return x;
    }
    
    public void mostrar(){
        System.out.println("La salida es:"+" Q1 :"+this.x+" R1 :"+R1.x+" R2 :"+super.r2.getX());
    
    }
    
}
