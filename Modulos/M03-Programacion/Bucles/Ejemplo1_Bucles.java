/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Ejemplo1_Bucles {
    public static void main(String[] args) {
        //Tabla del 5 hasta que i sea 10 (incluyente)
        int valor = 5;
        System.out.println("5 x " + 1 + " = " + 5*1);
        System.out.println("5 x " + 2 + " = " + 5*2);
        System.out.println("5 x " + 3 + " = " + 5*3);                                                                                                                
        for (int i = 0; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + 5*i);
        }
        Scanner entrada = new Scanner(System.in);
        
    }
}
