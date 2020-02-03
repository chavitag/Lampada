package luces.lampada;

import java.util.Scanner;

/**
 *
 * https://github.com/chavitag/Lampada.git
 * @author desarrollo
 */
public class LucesLampada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        // Crea unha lámpada de 100w de consumo con luminosidade mínima 1 e máxima de 7000
        Lampada luzsalon;
        int b=0;
        int luminosidad;
        
        try {
            luzsalon = new Lampada(100,1,7000);
            do {
                System.out.println("Control de la luz");
                System.out.println("1.Encender lampara");
                System.out.println("2.Aumentar lumenes lampara");
                System.out.println("3.Apagar lampara");
                System.out.println("4.Saír");
                System.out.println("Introduzca una opción ");
                try {
                    b = sc.nextInt();
                    switch (b) {
                        case 1:
                            luzsalon.encenderse();
                            break;
                        case 2:
                            System.out.println("Incremente  los lumenes de la luz del salón");
                            luminosidad = sc.nextInt();
                            luzsalon.incrementar(luminosidad);
                            break;
                        case 3:
                            luzsalon.apagarse();
                            break;
                    }
                } catch(Exception e) {
                    System.out.println("ERROR: "+e.getMessage());
                }
            } while (b != 4);
            System.out.println("Saliendo del programa.  ");
        } catch(Exception e) {
            System.out.println("Error creando lámpada: "+e.getMessage());
        }
    }

}
