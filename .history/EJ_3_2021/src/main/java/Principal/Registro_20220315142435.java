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
public class Registro {
    /*Probamos inicializando los atributos en su declaracion en vez de su constructor, al ser
    inicializada en la declaracion deben ser static y esto hace que tengon el mismo valor para 
    todos los objetos*/
    public final static float coefAvaluoEdificio= 2;
    public final static String municipio="Las Heras";
    
    private float tasa;
    
    /* tipo nombre []=new tipo [tamaño]*/
    /* Vble de ref.recibe una ref. de esp de memoria=new reserva esp en memoria, en este caso para 100 lotes*/
    public Lote [] inmueble= new Lote[100];
    
    public Registro(float t){
        this.tasa=t;
    }
    public void Registrar(Lote l){
        /* 1ra parte int i=0 solo se ejecuta una vez cuando comienza el ciclo, ademas la vble solo se puede dentro del ciclo for*/
        /* 2da parte luego condicion para finalizar el bucle*/
        /* 3ra parte indica cuanto incrementa o decrementa en este caso como es post ejecuta el bloque interno y luego incrementa*/
        
        /* El indice de la vble i,inicializa i=0 y mira condicion i<100,ejecuta bloque interno y incrementa en 1
           i entonces el indice sera de 0 a 99, la condicion es solo menor, si fuera menor e igual seria 0 a 100*/
        
        //Si condicion i<100 (Indice 0 a 99 es decir 100 objetos contendra)
        //Si condicion i=< 100 (Indice de 0 100 es decir 101 objetos contendra)
        
        for(int i=0;i<100;i++){     /*Recorrera el indice de 0 a 99*/
            if(inmueble[i]==null){  /*Para en el indice igual a nulo*/
                inmueble[i]=l;      /*Para asignarle el lote pasado a la funcion*/
                l.inscripto=this;   /*Con el lote pasado uso inscripto de tipo registro, 
                                      para asignarle el objeto registro que llamo al metodo*/
                break;              /* Cuando haga asignacion corte en esa misma ejecuccion*/
            
            }
        }
    }
    
    /*Usar el Valuar de lote,llamamos con registro a este valuar y valuamos todos los lotes
    con la variable de registro inmueble de tipo lote que contiene todos los lotes y con ese objeto
    llamamos al valuar de lote*/
    
    public void Valuar(){
    /*Bucle for-Each -->(Variable iteradora:Variable contenedora de los objetos)
      Declaramos una variable iteradora en cual se le pasara un objeto y se ejecutara el bloque interno
      ciclicamente un objeto por vez este bucle for evita definir un contador de bucle de especificar valor inicial, final
      e indexar manualmente la matriz*/
        
        for(Lote l:this.inmueble){  //Pasamos los objetos a l
            if(l!=null){            //Si l se le paso un objeto, si se le pasa null no llama a valuar
                l.valuar();         //llama a valuar y realiza una valuaciom
            }
       }
    }
    
    public void emitirBoletos(){
        for(Lote l:this.inmueble){
            if(l!=null){
                l.MostrarLote();
/*Tambien podriamos, pero para ahorrar codigo
   System.out.println("El id del padron es"+ l.idPadron);
   System.out.println("El domicilio es"+l.getDomicilio());
   System.out.println("El avaluo por metro es"+l.getAvaluoxmt());
   System.out.println("La superficie es"+l.superficie);            
*/    
            }
        
        }
    
    }
    
    public float getCoefAvaluoEdificio() {
        return coefAvaluoEdificio;
    }

    public String getMunicipio() {
        return municipio;
    }
    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }
    
    public void Guardar(){}
    public void Recuperar(){}
    
    
    
    
}
