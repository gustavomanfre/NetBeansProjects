/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Gustavo
 */
public class Registro {
    public final float coefAvaluoEdificio;
    public final String municipio;
    private float tasa;
    
    //public Lote inmueble[] = new Lote[100];
    public ArrayList <Lote> inmueble = new ArrayList();

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
    
    public void registrar(Lote l1){
        



        //ARREGLO SIMPLE
/*
        for(int i=0;i<inmueble.length;i++){
            if(inmueble[i]==null){
                inmueble[i] = l1;
                l1.inscripto=this;
            }
        }
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
