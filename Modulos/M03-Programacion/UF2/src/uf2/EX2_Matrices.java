/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class EX2_Matrices {

    static final int DIMENSIO = 4;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int DIMENSIO = 4;
        int[][] matriu = new int[DIMENSIO][DIMENSIO];
        int[][] transposada = new int[DIMENSIO][DIMENSIO];


        for (int i = 0; i < DIMENSIO; i++) {
            for (int j = 0; j < DIMENSIO; j++) {
                matriu[i][j] = entrada.nextInt();
                transposada[j][i] = matriu[i][j];
            }
        }

        //Metodo con return
        int traca = calcularTraza(matriu);
        entrada.close();

        MostrarMatriz(matriu);

        System.out.println("");
        System.out.println("Traça: " + traca);
        System.out.println("");
        System.out.println("Matriu transposada:");
        MostrarMatriz(transposada);

    }

    //Metodo
    public static void MostrarMatriz(int[][] matriz) {
        for (int i = 0; i < DIMENSIO; ++i) {
            for (int j = 0; j < DIMENSIO; ++j) {
                System.out.print(matriz[i][j]);
                if (j < DIMENSIO - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }

    //Metodo que devuelve int
    public static int calcularTraza(int[][] matriz) {
        int traca = 0;
        for (int i = 0; i < DIMENSIO; i++) {
            for (int j = 0; j < DIMENSIO; j++) {
                if (i == j) {
                    traca += matriz[i][j];
                }
            }
        }
        return traca;
    }
}
