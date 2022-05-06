/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public class R1 {
    protected R2 r2;
    protected static Integer x = 0;
    
    public R1(Integer x){
        this.r2 = new R2(x);
        while(R1.x <102){
            R1.x++;
        }
    }
}
