/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;
import Principal.*;
import Componentes.*;

/**
 *
 * @author Gustavo
 */
public abstract class Producto implements Vehiculo{
    protected float precio;

    protected Chasis Compuesto;
    protected Motor impulsado;
    protected Rueda usa[];
    public Fabrica ConstruidoPor;
    
    public Producto(float p){
        this.precio = p;
    }
    
    public abstract void verDatos();
    
}
