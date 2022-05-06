/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import Vehiculos.*;
import Componentes.*;

/**
 *
 * @author Gustavo
 */
public class Fabrica {
    public final String nombre;
   
    
    public Fabrica(String n){
        this.nombre = n;
    }
    
    public Vehiculo Crear(Chasis c,Fabrica f,float p,int Cc){
        Vehiculo v = new Camion(c,f,p,Cc);
        return v;
    }
    public Vehiculo Crear(Fabrica f,Chasis c,float p){
        Vehiculo v1 = new Auto(f,c,p);
        return v1 ;
        
    }
    
    
}
