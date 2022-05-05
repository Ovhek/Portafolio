/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicis_UF2;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class NPrimerosPrimeros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int TOTAL_PRIMERS = scan.nextInt();
        int[] vectorPrimos = new int[TOTAL_PRIMERS];
        int contador = 0;
        int valor = 2;
        while (contador < TOTAL_PRIMERS) {
            if (esNombrePrimer(valor)) {
                vectorPrimos[contador] = valor;
                contador++;
            }
            valor++;

        }
        mostrarVector(vectorPrimos);
    }

    static boolean esNombrePrimer(int nombre) {
        boolean primer = true;
        for (int i = 2; i <= Math.sqrt(nombre); ++i) {
            if (nombre % i == 0) {
                primer = false;
                break;
            }
        }
        return primer;
    }

    static void mostrarVector(int[] primers) {
        System.out.printf("%d", primers[0]);
        for (int i = 1; i < primers.length; i++) {
            if (i == 1) System.out.print(", ");
            System.out.printf("%d", primers[i]);
            if (i < primers.length - 1) {
                System.out.print(", ");
            }
            if ((i + 1) % 10 == 0 && i < primers.length - 1) {
                System.out.println("");
            }
        }

        System.out.println(".");
    }
}
