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
    public static void main(String[] args) {
        Escritura e = new Escritura(44039953,500,"Rio Diamante 4004");
        Escritura e1 = new Escritura (e);
        e.MostrarEscritura();
        e1.MostrarEscritura();
        Lote l = new Lote (78789955,800,"Rio Diamante 4001",(float)1.08);
        l.MostrarDatos();
        
        Registro r = new Registro((float)0.6,"Las Heras",(float)4.1);
        r.valuar();
        r.emitirBoletos();
        r.registrar(l);
    }
    
    
}
