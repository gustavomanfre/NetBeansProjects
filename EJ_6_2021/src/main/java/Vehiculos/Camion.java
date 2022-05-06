/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Componentes.Chasis;
import Componentes.Motor;
import Componentes.Rueda;
import Principal.Fabrica;

/**
 *
 * @author Gustavo
 */
public class Camion extends Producto{
    private int capcarga;
    
    public Camion(float p,Fabrica f,Chasis c,int cap){
        super(p);
        this.capcarga=cap;
        this.ConstruidoPor=f;
        this.Compuesto=c;
    }
    
    public void PonerMotor(Motor m) {
        this.Impulsado=m;
    }
  
    public void PonerRueda(int n,Rueda r) {
        for(int i=0;i<=n;i++){
            this.Usa.add(r);
        }
    }
    
   
    public void VerDatos() {
        System.out.println("El fabricante es"+this.ConstruidoPor.nombre);
        System.out.println("El precio es"+this.precio);
        System.out.println("El numero de motor es"+this.Impulsado.numero);
        System.out.println("El numero de chasis es"+this.Compuesto.numero);
        for(Rueda u:this.Usa){
            System.out.println("Las marcas de rueda son"+u.marca);
        }
        System.out.println("La capacidad de carga es"+this.capcarga);
        
    }
    

    @Override
    public void setprecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getprecio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Motor getMotor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Chasis getChasis() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rueda getRuedas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
}
