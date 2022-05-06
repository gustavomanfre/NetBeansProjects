/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

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
      
      //Objetos Escritura persisten usando Serializable
      try { 
      //FileOutputStream Fs = Flujo de Salida
      FileOutputStream Fs=new FileOutputStream("Escritura");//creamos el archivo
      ObjectOutputStream Os= new ObjectOutputStream(Fs);//objeto que gestione el archivo tiene el metodo que me permite escribir writeObject
      Os.writeObject(e1);//tranforma en un flujo de bytes ese objeto y lo guarda en el archivo apuntado por ese objeto
      Os.close();//cierro el flujo
      
      } catch( IOException a){//se produce error de entrada salida se crea automaticamente un objeto de tipo IOException se recibe el objeto en la varable a
          a.printStackTrace();//y ejecuta este metodo que me dice en que linea sucedio el error
       }
      
      
      
      
      
      
      
     
      
      
    }
    
}
