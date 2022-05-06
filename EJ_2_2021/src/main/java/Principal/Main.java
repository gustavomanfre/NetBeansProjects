/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

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
      
    /*Constructor Copia
    /*El casteo es necesario ya que clone devuelve, un objeto de la clase base Object que ha de ser promocionado 
      a la clase Punto. Lote CopiaLote=(Lote)l1.clone(); */
    
      Lote CopiaLote=(Lote)l1.clone();//Constructor de Copia
      CopiaLote.valuar();
      CopiaLote.MostrarLote();
      
      
      
     
      
      
    }
    
}
