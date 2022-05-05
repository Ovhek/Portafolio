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
public class Reto_390 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int iteraciones = entrada.nextInt();
        for (int j = 0; j < iteraciones; j++) {
            int magenta = entrada.nextInt();
            int amarillo = entrada.nextInt();
            int cian = entrada.nextInt();
            //magenta (M), amarillo (A), cian (C), rojo (R), negro (N), verde (V), violeta (L) y blanco (B).
            String pixeles = entrada.nextLine().trim();
            char[] pixelesIndividuales = pixeles.toCharArray();
            for (char pixel : pixelesIndividuales) {
                switch (pixel) {
                    case 'A':
                        amarillo--;
                        break;
                    case 'C':
                        cian--;
                        break;
                    case 'R':
                        amarillo--;
                        magenta--;
                        break;
                    case 'N':
                        amarillo--;
                        magenta--;
                        cian--;
                        break;
                    case 'V':
                        amarillo--;
                        cian--;
                        break;
                    case 'L':
                        cian--;
                        magenta--;
                        break;
                    case 'M':
                        magenta--;
                        break;
                }
            }
            if(magenta < 0 || cian < 0 || amarillo < 0) System.out.println("NO");
            else System.out.printf("SI %d %d %d%n",magenta,amarillo,cian);
        }
    }
}
