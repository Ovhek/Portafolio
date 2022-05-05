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
public class Ej6_Matrices {
    static Scanner entrada;
    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        System.out.println("Introduce un numero de filas:");
        int files = entrada.nextInt();
        
        System.out.println("Introduce el numero de columnas:");
        int columnas = entrada.nextInt();
        
        int[][] matriz = pedirMatriz(files, columnas);
        
        mostrarMatriz(matriz);
        System.out.println("");
        
        int[][] matriz2 = generarMatriz(files, columnas, 3, 9);
        mostrarMatriz(matriz2);
    }
    
    public static void mostrarMatriz(int[][] matriz){
        for (int[] fila : matriz) {
            for (int columna : fila) {
                System.out.print(columna+" ");
            }
            System.out.println("");
        }
    }
    
    public static int[][] pedirMatriz(int filas, int columnas){
        System.out.println("Introduce el valor minimo:");
        int min = entrada.nextInt();
        System.out.println("Introduce el valor maximo:");
        int max = entrada.nextInt();
        
        int[][] matriz = generarMatriz(filas, columnas, min, max);
        
        return matriz;
    }
    
    public static int[][] generarMatriz(int filas, int columnas, int min, int max){
        int matriz[][] = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //Max y Min Inclusivo
                matriz[i][j] = (int) (Math.random() * (max+1 - min)) + min;
            }
        }
        return matriz;
    }
            
}
