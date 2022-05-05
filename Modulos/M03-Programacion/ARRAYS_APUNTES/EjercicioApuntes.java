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
public class EjercicioApuntes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] valres = new double[10];
        for (int i = 0; i < valres.length; i++) {
            valres[i] = entrada.nextDouble();
        }
        
        double suma = 0;
        double mayor = valres[0];
        double menor = valres[0];
        for (double valre : valres) {
            suma+= valre;
            if (valre > mayor) mayor = valre;
            if (valre < menor) menor = valre;
        }
        System.out.printf("%.5f%n",suma/valres.length);
        System.out.printf("%.0f%n",mayor);
        System.out.printf("%.0f%n",menor);
        System.out.printf("%.0f%n",suma);
    }
}
