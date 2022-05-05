/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACEPTAELRETO;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Reto_471 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*int iteraciones = entrada.nextInt();
        for (int j = 0; j < iteraciones; j++) {
          int puntoInicial = entrada.nextInt();
          int posicionPichazo = entrada.nextInt();
          if (posicionPichazo == puntoInicial || posicionPichazo == puntoInicial+180 || posicionPichazo == puntoInicial + 360) System.out.println("DA IGUAL");
          else if(puntoInicial+180-posicionPichazo > 0) System.out.println("ASCENDENTE");
          else System.out.println("DESCENDENTE");
        }*/
        for (int i = 0; i <= 360; i++) {
            for (int j = 0; j <= 360; j++) {
                int puntoInicial = i;
                int posicionPichazo = j;
                int test = puntoInicial+180 >= 360 ? puntoInicial+180-360 : puntoInicial+180;
                
                if (posicionPichazo == puntoInicial || posicionPichazo == test || posicionPichazo == puntoInicial + 360) System.out.printf("(%d,%d) DA IGUAL%n",i,j);
                else if(puntoInicial+180 >= 360 ? ((puntoInicial < posicionPichazo)||(posicionPichazo < puntoInicial+180-360)) : ((puntoInicial+180 > posicionPichazo)&&(posicionPichazo > puntoInicial))) System.out.printf("(%d,%d) ASCENDENTE%n",i,j);
                else System.out.printf("(%d,%d) DESCENDENTE%n",i,j);
            }
        }
    }
}
