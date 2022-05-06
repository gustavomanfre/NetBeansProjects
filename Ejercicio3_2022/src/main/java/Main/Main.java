/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

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
    public static void main(String[] args) throws CloneNotSupportedException {
        Escritura e = new Escritura(403203,2022,"Las Leñas");
        Escritura e1 = new Escritura(e);
        e.MostrarEscritura();
        e1.MostrarEscritura();
        
        Lote l = new Lote(434,400,"Las Leñas",(float)0.7);
        Lote l1 = new Lote(433,401,"Las Leñas",(float)0.8);
        l.valuar();
        Lote CopiaLote=(Lote)l.clone();
        CopiaLote.valuar();
        
        Registro r = new Registro(3.8f,"El challao",1.5f);
        r.registrar(l);
        r.registrar(l1);
        r.emitirBoletos();
        r.valuar();
        
      //Objetos Escritura persisten usando Serializable
      //La operación de enviar una serie de objetos a un archivo persistente recibe el nombre de serialización.
      try { 
      //1)FileOutputStream(String name):Crea un flujo de salida de archivo para escribir en el archivo con el nombre especificado.
      FileOutputStream Fs = new FileOutputStream("Escritura");
      //2)Un ObjectOutputStream un objeto que gestione el archivo tiene el metodo que me permite escribir writeObject.
      ObjectOutputStream Os = new ObjectOutputStream(Fs);
      //3)El método writeObject se usa para escribir un objeto en la secuencia. Cualquier objeto, incluidas cadenas y matrices, se escribe con writeObject.
      //4)Tranforma en un flujo de bytes ese objeto y lo guarda en el archivo apuntado por ese objeto
      Os.writeObject(e1);
      //5)Cerramos el flujo
      Os.close();
      //6)Si se produce error de entrada salida se crea automaticamente un objeto de tipo IOException se recibe el objeto en la varable a.
      //7)y ejecuta este metodo que me dice en que linea sucedio el error
      } catch( IOException a){
          a.printStackTrace();
       }
        

      
      
      
        
       
        

    }
    
}
