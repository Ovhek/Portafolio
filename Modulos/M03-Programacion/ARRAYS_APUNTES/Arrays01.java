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
public class Arrays01 {
    public static void main(String[] args) {
        int edad0 = 18;
        int edad1 = 18;
        int edad2 = 17;
        int edad3 = 20;
        // int mitja = edat0+edat+edat2+... / total;
        
        int[] edades;

        
        edades = new int[3];
        
        int[] edats2 = new int[20];
        
        boolean[] resultats = new boolean[20];
        resultats[2] = true;
        
        String [] paisos = new String[3];
        paisos[0] = "España";
        paisos[1] = "Francia";
        paisos[2] = "Italia";
        
        String[] paisos2 = {"España","Francia","Italia"};
        
        //2 dimensiones
        int[][] valors = {{4,-1,2},{-3,5,10}};
        
        
        //Matriz de indices
        double[][] matriu2D = new double[2][3];
        int[][] m = {{3,2,1},{5,2,6}};
        //El numero de filas y columnas
        int files = matriu2D.length;
        int columnes = matriu2D[0].length;
        System.out.println(files);
        System.out.println(columnes);
        
        //Calcular media con vectores
        int[] valores = {2,-5,6,8,-3,9,-1,6,-2,0};
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valor "+i+": "+ valores[i]);
            
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número de temperaturas");
        int iteraciones = entrada.nextInt();
        double[] temperatures = new double[iteraciones];
        for (int i = 0; i < iteraciones; i++) {
            System.out.println("Temperatura "+i+":");
            temperatures[i] = entrada.nextDouble();
        }
        System.out.println("Temperaturas: ");
        double media = 0;
        for (double temperatura : temperatures) {
            media+=temperatura;
        }
        System.out.printf("Media = %.2f%n",media/iteraciones);

        
    }
}
