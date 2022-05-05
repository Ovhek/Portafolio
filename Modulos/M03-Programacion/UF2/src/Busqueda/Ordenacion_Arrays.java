/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busqueda;

import Ordenacion.OrdenaVector;

/**
 *
 * @author Cole
 */

/**
 
 * {1,2,4,5,8,10,13,15,19}
 * X = 13? --> (indice_primero + indice_ultimo)/2
 * ((0+8)/2) --> Buscamos el numero en este indice (indice = 4)
 * Hacemos lo mismo en sucesión hasta encontrar la posicion
 * 
 * como en la posicion 4 hay un 8
 * 
 * tomamos la siguiente posicion como valor inicial
 * (5+8)/2 --> 6 en la posicion 6 hay un 13 --> lo encontramos
 * 
 * en caso de (indice_primer = indice_ultimo) y no encontrar el numero en esa posicion, es que el numero no está en el array
 * 
 **/
public class Ordenacion_Arrays {
    public static void main(String[] args) {
        
        
        //int[] arrayAleatorio = generaVectorAleatorio(1000);
        
        //int[] arrayOrdenado = {1,2,3,4,5,6,7,8,9,10};
        
        int indice = 0;
        
        //indice = indexOfSequencial(arrayAleatorio, 5);
        System.out.println("------- ORDENAR VECTOR -------");
        
        int[] arrayOrdenado = generaVectorAleatorio(100000);
        long tiempoInicial = System.currentTimeMillis();
        OrdenaVector.ordenarSeleccion(arrayOrdenado);
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("TIEMPO TOTAL (ms) = " + (tiempoFinal-tiempoInicial));
        
        
        tiempoInicial = System.currentTimeMillis();
        indice = indexOfSequencial(arrayOrdenado, 100);
        tiempoFinal = System.currentTimeMillis();
        System.out.println("TIEMPO TOTAL (ms) = " + (tiempoFinal-tiempoInicial));
        
        tiempoInicial = System.currentTimeMillis();
        indice = indexOfBinario(arrayOrdenado, 100);
        tiempoFinal = System.currentTimeMillis();
        System.out.println("TIEMPO TOTAL (ms) = " + (tiempoFinal-tiempoInicial));

    }
    
    
    static int[] generaVectorAleatorio(int numElementos) {
        int[] numeros = new int[numElementos];
        for (int i = 0; i < numeros.length; i++ ) {
            numeros[i] = (int)((Math.random()*numElementos)+1);
        }
        return numeros;
    }
    
    
    /*static int [] generaVectorOrdenado(int numElementos){
        int[] vector = new int[numElementos];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i+1;
        }
        
        return vector;
    }*/
    
    static int indexOfSequencial(int [] array, int num){
        System.out.println("---------- BUSQUEDA SECUENCIAL --------");
        int pasos = 0;
        for (int i = 0; i < array.length; i++) {
            pasos++;
            if(array[i] == num){
                System.out.println("Pasos = " + pasos);
                System.out.println("Indice = " + i);
                return i;
            }
            
        }
        System.out.println("Pasos = " + pasos);
        System.out.println("Indice = NO EXISTE");
        return -1;
    }
    /*Busqueda binaria*/
    static int indexOfBinario(int [] array, int num)
    {
        System.out.println("---------- BUSQUEDA BINARIA --------");
        int pasos = 0;
        
        int valorI = 0;
        int valorF = array.length-1;
        
        int indice = 0;
        while (valorI <= valorF){
            pasos++;
            indice = (valorI + valorF)/2;
            
            if (array[indice] == num)
                break;
            
            if (valorI == valorF){
                System.out.println("Indice = NO EXISTE");
                System.out.println("Pasos = " + pasos);
                return -1;
            }
            
            if(array[indice] < num)
                valorI = indice+1;
            else
                valorF = indice - 1;
            
            
        }
        System.out.println("Indice = " + indice);
        System.out.println("Pasos = " + pasos);
        return indice;
    }
}
