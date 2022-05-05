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
public class Tablas_Multiplicar {

    public static void main(String[] args) {
        System.out.println("¿Cuántas tablas de multiplicar quieres mostrar?");
        Scanner entrada = new Scanner(System.in);

        int numeros = entrada.nextInt();
        mostrarBlocPantalla(1, numeros);

    }

    // Mostra una línia d’una taula de multiplicar
    static String muntarLiniaTaulaMultiplicar(int n, int taula) {
        return String.format("%d x %2d = %2d", taula, n, n * taula);
                
    }

    // Mostra una línia d’una sèrie de taules de multiplicar, començant per taulaInicial i acabant per taulaFinal.
    static String muntarLiniaPantalla(int n, int taulaInicial, int taulaFinal) {
        String linea = "";
        for (int i = taulaInicial; i <= taulaFinal; i++) {
            linea += muntarLiniaTaulaMultiplicar(n, i) + " \t";
        }
        return linea;
    }

    // Mostra un bloc de taules per pantalla des de taulaInicial fins taulaFinal.
    static void mostrarBlocPantalla(int taulaInicial, int taulaFinal) {
        final int TABLAS_POR_BLOQUE = 4;
        for (int tabla = 1; tabla <= taulaFinal; tabla+=TABLAS_POR_BLOQUE) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(muntarLiniaPantalla(i,tabla, Math.min(tabla+TABLAS_POR_BLOQUE-1, taulaFinal)));
            }
            if(tabla!= taulaFinal) System.out.println("");
        }
    }
}
