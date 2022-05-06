/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Registro {
    public final float coefAvaluoEdificio;
    public final String municipio;
    private float tasa;
    
    public Lote inmueble[] = new Lote[100];
    //public ArrayList <Lote> inmueble = new ArrayList();

    public Registro (float coefAvaluoEdificio, String municipio, float tasa) {
        this.coefAvaluoEdificio = coefAvaluoEdificio;
        this.municipio = municipio;
        this.tasa = tasa;
    }
    
    
    public void valuar(){
        for(Lote l:inmueble){
            if(l!=null){
                l.valuar();
            }
        }
    }


    //NO APLICO BUCLE FOR EACH (MEJORADO) Y ARREGLO, POR QUE SE USA EL FOR-EACH SOLO PARA LECTURA DE DATOS, NO TE PERMITE OBTENER EL INDICE
    
    public void registrar(Lote l){
     
        //ARREGLO SIMPLE - FOR SIMPLE.

        for(int i=0;i<inmueble.length;i++){
            if(inmueble[i]==null){
                inmueble[i] = l;
                l.inscripto=this;
                break;
            }
        }

        //ARREGLO SIMPLE-FOR EACH(MEJORADO)
        // NO APLICA YA QUE EL BUCLE FOR EACH ES SOLO DE LECTURA NO MODIFICA EL ARREGLO
        //ADEMAS  PARA ACCEDER AL ARREGLO SIMPLE NECESITAMOS EL INDICE, QUE NO UTILIZA EL CICLO FOR EACH

        //ARRAYLIST - FOR SIMPLE

        //ARRAYLIST
    
        //ARRAYLIST - SIN FOR SIMPLE/MEJORADO
    /*
                inmueble.add(l);
                l.inscripto=this;
                break;
    */
     

    }

    
    public void emitirBoletos(){
        for(Lote l:inmueble){
            if(l!=null){
                System.out.println("El id del padron es "+l.idPadron);
                System.out.println("La superfice "+l.superficie);
                System.out.println("El domicilio es "+l.getdomicilio());
                System.out.println("El avaluo por metro es "+l.getavaluoxmt());
            }
        }
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public float getCoefAvaluoEdificio() {
        return coefAvaluoEdificio;
    }

    public String getMunicipio() {
        return municipio;
    }
    
    public void guardar(){}

    public void recuperar(){}
    
    
}
