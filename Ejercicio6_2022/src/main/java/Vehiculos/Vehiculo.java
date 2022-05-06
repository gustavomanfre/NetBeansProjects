/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;
import Componentes.*;
import Principal.*;

/**
 *
 * @author Gustavo
 */
public interface Vehiculo {
    public abstract Motor getMotor();
    public abstract Chasis getChasis();
    public abstract Rueda[] getRuedas();
    public abstract void ponerMotor(Motor m);
    public abstract void ponerRueda(Rueda r,int cnt);  
}
