/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Apuntes_Clases;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Ej5_Primers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int TOTAL_PRIMERS = scan.nextInt();
        int[] vectorPrimos = new int[TOTAL_PRIMERS];
        int contador = 0;
        boolean primer = true;
        int valor = 2;
        if (TOTAL_PRIMERS > 0) {
            while (contador < TOTAL_PRIMERS) {
                if (esNombrePrimer(valor)) {
                    vectorPrimos[contador] = valor;
                    contador++;
                }
                valor++;

            }
            System.out.printf("%d, ", vectorPrimos[0]);
            for (int i = 1; i < TOTAL_PRIMERS; i++) {
                System.out.printf("%s", vectorPrimos[i]);
                if (i < TOTAL_PRIMERS - 1 && TOTAL_PRIMERS > 1) {
                    System.out.print(", ");
                }
                if ((i + 1) % 10 == 0 && i < TOTAL_PRIMERS - 1) {
                    System.out.println("");
                }
            }

            System.out.println(".");
        }

    }

    static boolean esNombrePrimer(int valor) {
        boolean primer = true;
        for (int i = 2; i <= Math.sqrt(valor); ++i) {
            if (valor % i == 0) {
                primer = false;
                break;
            }
        }
        return primer;
    }
}
