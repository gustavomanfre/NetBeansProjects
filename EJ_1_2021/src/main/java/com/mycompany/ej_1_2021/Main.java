/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ej_1_2021;

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Escritura e1= new Escritura(4444,434,"dkfndkfn");
      Escritura e2= new Escritura(e1);
      e1.MostrarDatosEscritura();
      e2.MostrarDatosEscritura();
    }
    
}
