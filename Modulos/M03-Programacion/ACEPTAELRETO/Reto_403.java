/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACEPTAELRETO;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Reto_403 {
    public static void main(String[] args) {
        //largo --> 90 y 120m
        //ancho 45 y 90m
        final int MAX = 90*120;
        final int MIN = 45*90;
        Scanner entrada = new Scanner(System.in);
        double i = 0;
        if(entrada.hasNextDouble()) i = entrada.nextDouble();
        int contador = 0;
        
        while (contador < i){
            double metros = 0;
            if(entrada.hasNextDouble()) metros = entrada.nextDouble();
            double campos = 0;
            if(entrada.hasNextDouble()) campos = entrada.nextDouble();
            if(metros != 0 && campos != 0){
                if ((metros/campos) >= MIN && (metros/campos) <= MAX ) System.out.println("SI");
                else System.out.println("NO");
                contador++;
            }
        }
    }
}
