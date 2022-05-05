/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.pa2.alexandrucruceat;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Encadenades {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix una llista de paraules encadenades");
        String[] palabras = entrada.nextLine().split(" ");
        boolean encadenada = true;
        for (int i = 0; i < palabras.length; i++) {
            if (i != palabras.length - 1) {
                if (!(palabras[i].substring(palabras[i].length() - 1, palabras[i].length()).equals(palabras[i + 1].substring(0, 1)))) {
                    encadenada = false;
                    break;
                }
            }

        }
        System.out.println((encadenada ? "Sí és una llista de paraules encadenades" : "No és una llista de paraules encadenades"));
    }
}
