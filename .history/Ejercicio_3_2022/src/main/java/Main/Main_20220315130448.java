/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Escritura e = new Escritura(44039953,500,"Rio Diamante 4004");
        Escritura e1 = new Escritura (e);
        e.MostrarEscritura();
        e1.MostrarEscritura();
        Lote l = new Lote (78789955,800,"Rio Diamante 4001",(float)1.08);
        l.MostrarDatos();
        
        Registro r = new Registro((float)0.6,"Las Heras",(float)4.1);
        r.valuar();
        r.emitirBoletos();
        r.registrar(l);
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
