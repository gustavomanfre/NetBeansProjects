/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal1;

import Principal.Edificio;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class PH extends Edificio{
    public byte cantPisos;
    public ArrayList <Departamento> unidad;
    
    public PH(byte c,float a){
        super(a);
        this.cantPisos=c;
        /*Compocision, tiene que ser creado en el constructor,
          ya que si se destruye propiedad horizontal se destruyen los departamento*/
        unidad=new ArrayList();
    }
    
    public void AgregarDepartamento(Departamento d){
        unidad.add(d);
    }
    
    public void Valuar(){
        //Accedemos directamente ya que es un atributo de PH, unidad
        //Accedemos directamente ya que es un atributo protected de Edificio avaluo y Ph es hereda de Edificio
        for(Departamento u:this.unidad){
            if(u!= null){
                System.out.println("El Avaluo pr departamento es"+u.superficie*this.avaluoXmtr);   
            }
        
        }
    
    }

     public void setAvaluo(float a) {
       this.avaluoXmtr=a;
    }

    public float getAvaluo() {
        return this.avaluoXmtr;
    }
    
    @Override
    public void Demoler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
   
    
    
}
