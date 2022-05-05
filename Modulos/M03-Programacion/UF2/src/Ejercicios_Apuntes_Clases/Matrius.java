/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Apuntes_Clases;

/**
 *
 * @author Cole
 */
public class Matrius {

    public static void main(String[] args) {
        final int ELEMENTS = 10;
        // A[]
        int[] a = generarMatriz(ELEMENTS,0,9);

        // B[]
        int[] b = generarMatriz(ELEMENTS,100,999);

        // C[]
        int[] c = intercalarMatrices(a,b);

        // Mostrar resultats A[], B[] i C[]
        imprimirMatriz(a,"A");
        
        imprimirMatriz(b,"B");;

        imprimirMatriz(c,"C");
    }
    
    static int [] generarMatriz(int elementos, int min, int max){
        int[] array = new int[elementos];
        for (int i = 0; i < elementos; i++) {
            array[i] = (int) (Math.random() * (max+1-min))+min;
        }
        return array;
    }
    
    static void imprimirMatriz(int []matriz, String nombre){
        System.out.printf("%s[] = ",nombre);
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + " ");
        }
        System.out.println();
    };
    
    static int [] intercalarMatrices(int []matriz1,int []matriz2){
        int longitudMatriz = matriz1.length*2;
        int[] matrizIntercalada = new int[longitudMatriz];
        
        for (int i = 0; i < longitudMatriz; i++)
            matrizIntercalada[i] = (i%2 == 0) ? matriz1[i/2] : matriz2[i/2];
            
        return matrizIntercalada;
    }
}
