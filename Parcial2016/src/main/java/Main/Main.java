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
        Q1 obj = new Q1(5,9);
        obj.mostrar();
    } 
}

/*
La salida es: Q1:9,R1:101,R2:5;
*/

/*
ENUNCIADO
    LA RELACION ENTRE R1 Y R2 SE ESTABLECE EN EL CONSTRUCTOR DE R1 A AL QUE SE LE PASA EL VALOR PARA INICIALIZAR R2.
    LA RELACION ENTRE Q1 Y Q2 SE ESTABLECE EN EL CONSTRUCTOR DE Q1.
    EL METODO MOSTRARX() ENVIA A LA SALIDA LOS VALORES DEL ATRIBUTO X DE CADA CLASE.
    ANALIZAR CON ATENCION EL EJEMPLO DE USO EN UU, YA QUE LA IMPLEMENTACION DEL MODELO DEBE CORRESPONDERSE CON EL EL EJEMPLO.

*/
