/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public class My_class {
    class Inner extends My_class{
        private String s ="InnerClass";
        public String method(){
            return("1");
        }
    }
    
    public String displayMessage(Message m){
        return ("2");
    }

    
}
