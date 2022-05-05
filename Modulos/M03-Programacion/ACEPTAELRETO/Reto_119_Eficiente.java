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
public class Reto_119_Eficiente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        int escudos = 0;
        do {
            n = -1;
            escudos = 0;
            if (entrada.hasNextInt()) n = entrada.nextInt();
            else entrada.next();
            if (n==0) break;
            while (n > 0) {
                if (n < 4) {
                    escudos += 5;
                    n--;
                } else {
                    int cuadrado = (int) Math.sqrt(n);
                    int legionarios = (int) Math.pow(cuadrado, 2);
                    n -= legionarios;

                    int restantes = legionarios - 4;
                    escudos += 12;

                    if (restantes > 0) {
                        int calculo = (int) (Math.sqrt(legionarios) - 2) * 4;
                        restantes -= calculo;
                        escudos += calculo * 2;

                        if (restantes > 0) {
                            escudos += restantes;
                        }
                    }
                }
            }
            if (escudos > 0) System.out.println(escudos);
        } while (true);

    }
}
