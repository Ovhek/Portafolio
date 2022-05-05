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
public class Ej7_ContadorDeMinas {

    static Scanner entrada;

    public static void main(String[] args) {
        entrada = new Scanner(System.in);

        int[][] campo = Ej6_Matrices.generarMatriz(3, 3, -1, 0);

        Ej6_Matrices.mostrarMatriz(campo);

        System.out.println("");

        int[][] resultado = contarMinas(campo);

        Ej6_Matrices.mostrarMatriz(resultado);
    }

    public static int[][] contarMinas(int[][] campo) {
        int[][] resultado = new int[campo.length][campo[0].length];

        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo[i].length; j++) {
                resultado[i][j] = (campo[i][j] == -1) ? -1 : sumarMinas2(campo, i, j);
            }
        }

        return resultado;
    }

    public static int sumarMinas2(int[][] campoMinas, int fila, int columna) {
        int suma = 0;
        for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
                if ((fila + k >= 0 && fila + k <= campoMinas.length - 1) 
                        && ((columna + l >= 0 && columna + l <= campoMinas[fila].length - 1)))
                    if (campoMinas[fila + k][columna + l] == -1)
                        suma++;
            }
        }
        return suma;
    }
}
