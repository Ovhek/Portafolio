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
public class Escacs {
    public static void main(String[] args) {
        boolean blanco = true;
        Scanner entrada = new Scanner(System.in);
        int longitud = entrada.nextInt();
        
        System.out.print("|");
        for (int i = 0; i < longitud*8; i++) {
                System.out.print("-");
        }
        System.out.println("|");
        for (int fila = 1; fila <= 8; fila++) {
            for (int alcada = 1; alcada <= longitud; alcada++) {
                System.out.print("|");
                for (int columna = 1; columna <= 8; columna++) {
                    for (int i = 1; i <= longitud; i++) {
                        if((fila+columna)%2 == 0) System.out.print(" ");
                        else System.out.print("#");  
                    }     
                }
                System.out.println("|");
            }
        }
        System.out.print("|");
        for (int i = 0; i < longitud*8; i++) {
                System.out.print("-");
        }
        System.out.println("|");
    }
}
