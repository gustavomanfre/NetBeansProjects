/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Principal1.Casa;
import Principal1.Departamento;
import Principal1.PH;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Gustavo
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws CloneNotSupportedException {
      Escritura e1= new Escritura(4444,434,"dkfndkfn");
      Escritura e2= new Escritura(e1);
      e1.MostrarEscritura();
      e2.MostrarEscritura();
      
      Lote l1 = new Lote("Las Heras",12,656,(float)12.0);
      l1.valuar();
      l1.MostrarLote();
    
      Lote CopiaLote=(Lote)l1.clone();//Constructor de Copia
      CopiaLote.valuar();
      CopiaLote.MostrarLote();
      
      Registro r=new Registro((float) 0.4);
      r.Registrar(l1);
      r.Valuar();
      r.emitirBoletos();
      
      try { 
      FileOutputStream Fs=new FileOutputStream("Escritura");
      ObjectOutputStream Os= new ObjectOutputStream(Fs);
      Os.writeObject(e1);
      Os.close();
      
      } catch( IOException a){
          a.printStackTrace();
       }
      
      Casa c = new Casa (false,400,2);
      c.Valuar();
      
      PH ph=new PH((byte)8,(float)2);
      Departamento d=new Departamento((byte)2,'A',200);
      ph.AgregarDepartamento(d);
      ph.Valuar();
      
      
      
      
      
      
      
     
      
      
    }
    
}
