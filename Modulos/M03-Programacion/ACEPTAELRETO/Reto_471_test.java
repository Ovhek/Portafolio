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
public class Reto_471_test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int iteraciones = entrada.nextInt();
        for (int j = 0; j < iteraciones; j++) {
            int puntoInicial = entrada.nextInt();
            int posicionPichazo = entrada.nextInt();
            int test = puntoInicial+180 >= 360 ? puntoInicial+180-360 : puntoInicial+180;
                
            if (posicionPichazo == puntoInicial || posicionPichazo == test || posicionPichazo == puntoInicial + 360) System.out.printf("DA IGUAL%n");
            else if(puntoInicial+180 >= 360 ? ((puntoInicial < posicionPichazo)||(posicionPichazo < puntoInicial+180-360)) : ((puntoInicial+180 > posicionPichazo)&&(posicionPichazo > puntoInicial))) System.out.printf("ASCENDENTE%n");
            else System.out.printf("DESCENDENTE%n");
        }
    }
}
