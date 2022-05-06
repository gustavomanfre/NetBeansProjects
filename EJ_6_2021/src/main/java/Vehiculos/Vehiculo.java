/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Componentes.Chasis;
import Componentes.Motor;
import Componentes.Rueda;

/**
 *
 * @author Gustavo
 */
public interface Vehiculo {
    public abstract Motor getMotor();
    public abstract Chasis getChasis();
    public abstract Rueda getRuedas();
    public abstract void PonerMotor(Motor m);
    public abstract void PonerRueda(int n,Rueda r);
    
    
}
