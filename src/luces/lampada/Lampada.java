package luces.lampada;

/*
Exercicio a Entregar 1
Escribir unha clase Java que defina unha clase Lampada coas seguintes características:
Ten un consumo en Watios, que é un número enteiro entre 0 e 250
Ten unha luminosidade máxima en lúmenes, que é un número entre 0 e 100.000
Ten unha luminosidade mínima en lúmenes que é un número entre 1 e 100.000
A luminosidade actual da lámpada en lúmenes
As lámpadas desta clase deben poder:

Encenderse. Cando se encenden, se poñen á luminosidade mínima e visualizan unha mensaxe indicando que están 
encendidas e a súa luminosidade entre paréntese ( On(1) )
Apagarse. Cando se apagan, poñen a luminosidade 0 e visualizan unha mensaxe indicando que están apagadas (Off())
Cambiar a luminosidade indicando a luminosidade desexada,
e si é admisible pola lámpada se establecerá e se visualizará unha mensaxe On(luminosidade actual).
Si a luminosidade é excesiva se lanzará unha Exception indicando a circunstancia. 
Si a lámpada está apagada, non ten efecto.
Incrementar/Decrementar a luminosidade indicando o incremento/decremento 
desexado mediante un número positivo ou negativo. Se visualizará unha mensaxe  On (luminosidade actual). 
Si a lámpada está apagada, non ten efecto. Si a luminosidade resultante excede o límite debe lanzar unha 
Exception notificando ese feito.
Se Pide:
 O código fonte Java coa implementación desta clase.
 */
/**
 * @author desarrollo
 */
public class Lampada {

    float luminosidad;
    int consumo;               //Ten un consumo en Watios, que é un número enteiro entre 0 e 250
    float luminosidademaxima; //Ten unha luminosidade máxima en lúmenes, que é un número entre 0 e 100.000
    float luminosidademinima;  //Ten unha luminosidade mínima en lúmenes que é un número entre 1 e 100.000

    public Lampada(int consumo,float lmin,float lmax) throws Exception {
        this.luminosidad = 0;
        if ((consumo<=0)||(consumo >250)) throw new Exception("Consumo non admitido");
        if ((lmin<1)||(lmin>100000)) throw new Exception("Luminoisidade mínima non admitida");
        if ((lmax<lmin)||(lmax > 100000)) throw new Exception ("Luminosidade máxima non admitida");
        this.consumo = consumo;
        this.luminosidademaxima = lmax;
        this.luminosidademinima = lmin;
    }

    void encenderse() {
        /**
         * Encenderse. Cando se encenden, se poñen á luminosidade mínima e
         * visualizan unha mensaxe indicando que están encendidas e a súa
         * luminosidade entre paréntese ( On(1) )*
         */
        luminosidad = luminosidademinima;
        System.out.println("On(1)");
    }

    void apagarse() {
        /* Apagarse. Cando se apagan, poñen a luminosidade 0 e visualizan unha mensaxe indicando que están apagadas (Off())
       Cambiar a luminosidade indicando a luminosidade desexada,*/

        luminosidad = 0;
        System.out.println("Off(0)");
    }

      void incrementar(int luminosidad) throws Exception {
//Ten unha luminosidade máxima en lúmenes, que é un número entre 0 e 100.000
//Ten unha luminosidade mínima en lúmenes que é un número entre 1 e 100.000
//Comprobar valores introducidos llamar a la función controlluminosidad
if (this.luminosidad>0) {
        float lum=this.luminosidad+luminosidad;
        if ((lum<this.luminosidademinima)||(lum>this.luminosidademaxima)) throw new Exception("Luminosidade non admitida");
        this.luminosidad=lum;
        System.out.println("On(" + luminosidad + ")");
    }
      }

}
