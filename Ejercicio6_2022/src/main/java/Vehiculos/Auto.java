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
public class Auto extends Producto{
    
    public Auto(Fabrica f,Chasis c,float p){
        super(p);
        this.ConstruidoPor = f;
        this.Compuesto = c;
        c.setPertenece(this);
    }
   
    public void ponerRueda(Rueda r,int cnt) {
        this.usa = new Rueda[cnt];
        for(int i=0;i<usa.length;i++){
            this.usa[i] = r;
        }
    }
    
    public void ponerMotor(Motor m) {
        this.impulsado = m;
        m.setInstalado(this);
    }
    
    public void verDatos() {
        System.out.println("La fabrica del Auto es "+this.ConstruidoPor.nombre);
        System.out.println("El precio del Auto es "+this.precio);
        System.out.println("El numero del Motor es "+this.impulsado.numero);
        System.out.println("EL numero de Chasis es "+this.Compuesto.numero);
        for(Rueda r:this.usa){
            System.out.println("La marca de las Rueda del Camion es "+r.marca);
        }       
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
   
}
