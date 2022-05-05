/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ARRAYS_APUNTES;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Buscaminas_1D {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String linia = entrada.nextLine();
        char[] minaArray = linia.toCharArray();
        int[] bombas = new int[linia.length()];
        
        for (int i = 0; i < minaArray.length; i++) {
            if (i == 0){
                if (minaArray[i+1] == '*') bombas[i]++;
            }
            else if (i == minaArray.length-1){
                if (minaArray[i-1] == '*') bombas[i]++;
            }
            else{
                if (minaArray[i+1] == '*') bombas[i]++;
                if (minaArray[i-1] == '*') bombas[i]++;
            }
        }
        
        for (int i = 0; i < bombas.length; i++) {
            System.out.println("Posición " +i+" : " + bombas[i]);
            
        }
        
        
        
        // Version 2
        char[] array = linia.toCharArray();
        System.out.println("Contenido del Buscaminas:");
        for (int i = 0; i < array.length; i++) {
        
            if(array[i]!='*'){
                int contador = 0;
                // Forma 1:
                //if(i>0 && array[i-1] == '*') contador++;
                //if(i < (array.length-1) && array[i+1] == '*') contador++;
                
                //Forma 2: Mejor
                for (int d = -1; d <=1; d++) {
                    if((i+d)>0 && (i+d) < (array.length-1) && array[i+d] == '*')
                        contador++;
                }
                if (contador > 0)
                    System.out.println(i+" : "+contador);
            }
        }
    }
}
