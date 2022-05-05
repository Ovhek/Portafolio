/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_uf2a1_02;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Ej_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num = entrada.nextInt();
        entrada.nextLine();
        
        double[] paises = pedirPaises(num, entrada);
        
        int pasos = ordenarSeleccion(paises);
        
        imprimirMatriz(paises);
        System.out.println("Total passades: "+pasos);
    }
    
    public static void imprimirMatriz(double[] arr){
        for (double num : arr) {
            System.out.print(num+ " ");
        }
        System.out.println("");
    }
    
    public static int ordenarSeleccion(double[] arr) {
        int pasos = 0;
        int n = arr.length;
  
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            
            for (int j = i+1; j < n; j++){
                pasos++;
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
        }
        return pasos;
    }

    static double[] pedirPaises(int num, Scanner entrada) {
        double[] numeros = new double[num];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextDouble();
            
        }
        return numeros;
    }
}
