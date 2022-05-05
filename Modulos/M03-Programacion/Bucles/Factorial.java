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
public class Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int factorial = num;
        for (int i = 1; i < num; i++) factorial = factorial * i;
        
        System.out.println("Factorial: " + factorial);
    }
}
