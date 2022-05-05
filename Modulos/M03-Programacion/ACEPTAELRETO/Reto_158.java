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
public class Reto_158 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int iteraciones = entrada.nextInt();
        for (int i = 0; i < iteraciones; i++) {
            int saltosArriba = 0;
            int saltosAbajo = 0;
            int saltos = entrada.nextInt();
            if (saltos > 0){
                int primerSalto = entrada.nextInt();
                for (int j = 1; j < saltos; j++) {
                    int saltoActual = entrada.nextInt();
                    if (saltoActual > primerSalto) saltosArriba++;
                    else if (saltoActual < primerSalto) saltosAbajo++;
                    primerSalto = saltoActual;
                }
            }
            System.out.println(saltosArriba + " " + saltosAbajo);
        }
    }
}
