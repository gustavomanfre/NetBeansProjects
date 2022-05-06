/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Principal.*;
import Componentes.*;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public abstract class Producto implements Vehiculo {
    protected float precio;
    public Fabrica ConstruidoPor;
    protected Chasis Compuesto;
    protected Motor Impulsado;
    protected ArrayList <Rueda> Usa=new ArrayList <Rueda>();
    
    public Producto(float p){
        this.precio=p;
    }
    
    public abstract void setprecio();
    public abstract float getprecio();
    
    public abstract void VerDatos();
    public abstract Motor getMotor();
    public abstract Chasis getChasis();
    public abstract Rueda getRuedas();
    public abstract void PonerMotor(Motor m);
    public abstract void PonerRueda(int n,Rueda r);
    
    
}
