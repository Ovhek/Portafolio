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
public class Reto_119 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        long n = -1;
        
        salir:while(true){
            n = -1;
            do {
                if (entrada.hasNextLong()) n = entrada.nextLong();
                else entrada.nextLine();
                if (n == 0) break salir;
            } while (n < 0);
            int escudos = 0;
            
            while (n > 0 || escudos < 1) {
                int cuadrado = (int)Math.sqrt(n);
                n -= Math.pow(cuadrado, 2);
                for (int i = 0; i < cuadrado; i++) {
                    for (int j = 0; j < cuadrado; j++) {
                        if ((i == 0 && j == 0) || (i == 0 && j == (cuadrado-1)) || (i == (cuadrado-1) && j == 0) || (i == (cuadrado-1) && j == (cuadrado-1))) escudos +=3;
                        else if((i >= 0 && j == 0) || (i == 0 && j >= 0) || (i == (cuadrado-1) && j >= 0) || (i >= 0 && j == (cuadrado-1))) escudos+=2;
                        else escudos++;
                        if (cuadrado == 1) escudos+=2;
                    }
                }
            }
            
            System.out.println(escudos);
        }
       
    }
}
