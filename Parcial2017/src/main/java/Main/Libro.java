/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public class Libro extends Escrito{
    private String autor;
    
    public Libro(String autor,int cnt,Imprenta imp){
        super(cnt,imp);
        this.autor = autor;
        //Agregamos al ArrayList que acepta objetos imprenta una instancia de libro.
        imp.cual.add(this);
    }
    
    public int cuantasPags() {
        return this.getCantPags();
      //return super.getCantPags();
        
    }

    public String getDatos() {
        return this.autor+","+getCantPags();
        
    }
 
}
