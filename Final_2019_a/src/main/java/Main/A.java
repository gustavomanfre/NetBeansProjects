/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public class A {
    private int a = 10;
    private static int b = 8;
    
    //Clase Local, ya que esta dentro de un metodo/bloque.
        //Fuera de método nadie debe conocer los detalles de implementación de B y acceder a su uso.
    public void metodo(){
        final int x = 0;
        //Las clases locales B tienen acceso además de a las variables de instancia de la clase externa, a las locales al método donde se definió.
        class B{
            public void metodo(){
                System.out.println(a);
                System.out.println(b);
                System.out.println(x);
            }
        }
    //Las clases local B es completamente oculta, sólo desde el interior del método donde fueron declaradas se pueden instanciar objetos.
        B obj = new B();
        obj.metodo();
    }   
}

/*
Que ocurre al ejecutar el siguiente codigo?
//Creo objeto de la clase externa.
A x = new A();
//Llamo a metodo de A.
x.metodo();

//Las clases locales B tienen acceso además de a las variables de instancia de la clase externa, a las locales al método donde se definió.
(1)System.out.println(a); Muestra 10
(2)System.out.println(b); Muestra 8
(3)System.out.println(x); Muestra 0

Indicar como activar metodo de B desde afuera del contexto de A o explicar por que no seria posible
    //Fuera de método nadie debe conocer los detalles de implementación de B y acceder a su uso.
    //Las clases local B es completamente oculta, sólo desde el interior del método donde fueron declaradas se pueden instanciar objetos.
      
    //Entonces desde fuera del contexto de A, no puedo acceder, sólo desde el interior del método donde fueron declaradas se pueden instanciar objetos.
*/
