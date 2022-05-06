/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Escritura e = new Escritura(403203,2022,"Las Leñas");
        Escritura e1 = new Escritura(e);
        e.MostrarEscritura();
        e1.MostrarEscritura();
        
        Lote l = new Lote(434,400,"Las Leñas",(float)0.7);
        l.valuar();
        Lote CopiaLote=(Lote)l.clone();
        CopiaLote.valuar();
    }
    
}
