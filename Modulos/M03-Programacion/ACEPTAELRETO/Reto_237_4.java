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
public class Reto_237_4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        /*long numero = 0;
        while (entrada.hasNextLong()) {
            numero = entrada.nextLong();
            boolean condicion1 = false;
            boolean condicion2 = false;
            boolean polidivisible = false;
            if (numero < 10) {
                polidivisible = true;
            } else {
                while (String.valueOf(numero).length() > 1) {
                    condicion1 = numero % String.valueOf(numero).length() == 0;

                    numero /= 10;
                    condicion2 = numero % String.valueOf(numero).length() == 0;
                    if (condicion1 && condicion2) {
                        polidivisible = true;
                    } else {
                        polidivisible = false;
                        break;
                    }
                }
            }
            if (polidivisible) System.out.println("POLIDIVISIBLE");
            else System.out.println("NO POLIDIVISIBLE");


        }
        */
        while(entrada.hasNextLong()){
            long numero = entrada.nextLong();
            int longitud = String.valueOf(numero).length();
            
            boolean polidivisible = true;
            while(longitud > 1 && polidivisible){
                if (numero % longitud == 0){
                    numero /= 10;
                    --longitud;
                    
                }
                else polidivisible = false;
            }
            System.out.println(polidivisible? "POLIDIVISBLE" : "NO POLIDIVISBLE");
        }

    }
}
