/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;
import Vehiculos.*;

/**
 *
 * @author Gustavo
 */
public class Motor extends Producto{
    public final String numero;
    private Producto instalado;
    
    
    public Motor(float p,String n){
        super(p);
        this.numero = n;
    }

    public Producto getInstalado() {
        return instalado;
    }

    public void setInstalado(Producto instalado) {
        this.instalado = instalado;
    }

    public Motor getMotor() {
        return impulsado;
    }
    
    public Chasis getChasis() {
        return Compuesto;
    }
    
    public Rueda[] getRuedas() {
        return usa;
    }

    @Override
    public void ponerRueda(Rueda r, int cnt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ponerMotor(Motor m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void verDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
