/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;
import Componentes.*;
import Vehiculos.*;

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica f = new Fabrica("Ford");
        Fabrica f1 = new Fabrica("Kia");
        Fabrica f2 = new Fabrica("Renault");
        Fabrica f3 = new Fabrica("Toyota");
        Fabrica f4 = new Fabrica("Mercedes Benz");
        Fabrica f5 = new Fabrica("Iveco");
        Fabrica f6 = new Fabrica("Scania");
        
        Chasis c = new Chasis(3500000,"400f");
        Chasis c1 = new Chasis(3600000,"401f");
        Chasis c2 = new Chasis(3400000,"402f");
        Chasis c3 = new Chasis(3400000,"403f");
        Chasis c4 = new Chasis(3200000,"404f");
      
        Vehiculo v = f.Crear(c,f,40000.00f,400);
        Vehiculo v1 = f.Crear(f1,c1,2000.00f);
        
        Rueda r = new Rueda(50000f,"Pirelli");
        Rueda r1 = new Rueda(50000f,"Goodyear");
        
        v.ponerRueda(r,8);
        v1.ponerRueda(r1,4);
        
        Motor m = new Motor(150000f,"1.6A2");
        Motor m1 = new Motor(140000f,"1.7f");
        
        v.ponerMotor(m);
        v1.ponerMotor(m1);
        
        ((Producto)v).verDatos();
        ((Producto)v1).verDatos();
        
    }
    
}
