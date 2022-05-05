package practica_uf2a1_02;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cole
 */
public class Ej_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num = entrada.nextInt();
        entrada.nextLine();
        
        String[] paises = pedirPaises(num, entrada);
        
        ordenarBotella(paises);
        
        System.out.println("Països ordenats:");
        imprimirMatriz(paises);
    }
    
    public static void imprimirMatriz(String[] arr){
        for (String string : arr) {
            System.out.println(string);
        }
    }
    
    public static String[] ordenarBotella(String[] arr) {
        
        int n = arr.length;
        String temp = "";
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    
                }

            }
        }
        
        return arr;
    }

    static String[] pedirPaises(int num, Scanner entrada) {
        String[] paises = new String[num];
        for (int i = 0; i < paises.length; i++) {
            paises[i] = entrada.nextLine();
            
        }
        return paises;
    }
}
