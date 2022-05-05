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
public class EJ2_Rectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = 0;
        int y = 0;
        //(0,0) --> (x,y)
        int perimetro = 0;
        while (true){
            x = entrada.nextInt();
            y = entrada.nextInt();
            if (x < 0 || y <0 ) break;
            perimetro = x*2+y*2;
            System.out.println(perimetro);
        }
    }
}
