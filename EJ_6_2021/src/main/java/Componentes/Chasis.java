/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;
import Vehiculos.*;

/**
 *
 * @author Gustavo
 */
public class Chasis {
    public String numero;
    private Producto Pertenece;
    
    public Chasis(String n){
        this.numero=n;
    }

    public void setPertenece(Producto Pertenece) {
        this.Pertenece = Pertenece;
    }
    
    
    
}
