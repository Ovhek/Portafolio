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
public class Reto_117 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int iteraciones = entrada.nextInt();

        for (int i = 0; i < iteraciones; i++) {
            entrada.next();
            String nombre = entrada.nextLine().trim();
            System.out.println("Hola, " + nombre+".");
        }
    }
}
