/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Vehiculos.*;
import Componentes.*;

/**
 *
 * @author Gustavo
 */
public class Fabrica {
    public String nombre;
    
    public Fabrica(String n){
        this.nombre=n;
    }
    
    public Vehiculo Crear(Chasis c,Fabrica f){
        Vehiculo v= new Auto(583000,c,f);
        return v;
    }
    public Vehiculo Crear(Fabrica f,Chasis c){
        Vehiculo v=new Camion(1283000,f,c,500);
        return v;
    }
    
    
}
