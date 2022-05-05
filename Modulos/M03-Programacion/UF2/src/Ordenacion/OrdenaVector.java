/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenacion;

import java.util.Arrays;

/**
 *
 * @author Cole
 */
public class OrdenaVector {

    public static void main(String[] args) {
        int[] numeros = generaVector(100);
        //mostrarVector(numeros);
        /*System.out.println("---------------------");
        numeros = generaVector(99999);
        ordenarSeleccion(numeros);
        mostrarVector(numeros);*/
        
        /*System.out.println("");
        System.out.println("---------------------");
        numeros = generaVector(99999);
        ordenarBotella(numeros);
        mostrarVector(numeros);*/
        
        System.out.println("");
        //Array Sort | Collection Sort
        System.out.println("---------------------");
        numeros = generaVector(99999);
        Arrays.sort(numeros);
        mostrarVector(numeros);
    }

    public static int[] generaVector(int numElementos) {
        int[] numeros = new int[numElementos];
        for (int i = 0; i < numeros.length; i++ ) {
            numeros[i] = (int)((Math.random()*numElementos)+1);
        }
        return numeros;
    }

    public static void mostrarVector(int[] vector) {
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void ordenarSeleccion(int[] arr) {
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

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            
        }
    }

    public static void ordenarBotella(int[] arr) {
        int pasos = 0;
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    pasos++;
                    
                }

            }
        }

    }
}
