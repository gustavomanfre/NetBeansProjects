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
        Imprenta p = new Imprenta();
        
        Escrito  a = new Libro("Juan",423,p);
        Escrito  b = new Revista(23,p);
        Escrito  c = new Diario(23,p);
        
        p.imprimir();
    
/* SALIDA
        Publicaciones.Libro --> Juan,423
        Publicaciones.Libro --> 23,7
        Publicaciones.Diario --> www.com,7,23
*/ 

/* METODOS
imprimir: Muestra en pantalla una cadena con los datos de un publicacion.
cuantasPags: Regresa la cantidad de paginas de una publicacion
*/
    }
    
 /*   ver herencia multiple 
    ver atributos final static
    ver ++ post
    interface multiple
    atributos en interface
    instaceof
    Como llamar atributos estaticos o finales cuando la clase no es estatica
    como llamar atributos estaticos cuando esten en iu
*/
}
