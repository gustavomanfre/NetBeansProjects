/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        Fabrica f=new Fabrica("Ford");
        
        Chasis c=new Chasis("85785");
        
        Vehiculo v=f.Crear(c, f);
        Vehiculo v1=f.Crear(f, c);
        
        Motor m=new Motor("1v",(Producto)v);
        Motor m1=new Motor("4v",(Producto)v1);
        
        v.PonerMotor(m);
        v1.PonerMotor(m);
        
        Rueda r=new Rueda("Goodyear");
        
        v.PonerRueda(4,r);
        v1.PonerRueda(8,r);
        
        c.setPertenece((Producto)v);
        c.setPertenece((Producto)v1);
        
        ((Producto)v).VerDatos();
        ((Producto)v1).VerDatos();
        
        
        
        
        
        
        
        
    }
    
}
